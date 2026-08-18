package org.example;

import java.net.StandardSocketOptions;
import java.security.SecureRandom;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class GestionarClientes {

    Scanner sc = new Scanner(System.in);
    ArrayList<Cliente> listaClientes = new ArrayList<>();
    Cliente nuevo_cliente;

    String cod_country = "1234";
    String cod_bank = "9876";
    String cod_international = "000456";

    public Cliente create_customer(){

        System.out.println("DNI: ");
        String dni_cliente= sc.next();

        System.out.println("Nombre: ");
        String nombre_liente  = sc.next();

        System.out.println("Apellido: ");
        String apellido_cliente = sc.next();

        System.out.println("Telefono: ");
        String telefono_cliente = sc.next();

        System.out.println("Correo Electornico: ");
        String correo_cliente= sc.next();

        System.out.println("Correo Electornico: ");
        String password= sc.next();

        LocalDateTime fecha_creacion_cliente = LocalDateTime.now();
        System.out.println("Fecha Creacion: " + fecha_creacion_cliente);

        nuevo_cliente = new Cliente(dni_cliente, nombre_liente, apellido_cliente, telefono_cliente, correo_cliente, fecha_creacion_cliente, password);
        listaClientes.add(nuevo_cliente);
        return nuevo_cliente;

    }

    public Cliente update_customer(){

        System.out.println("BUSCAR POR DNI: ");
        String buscar_dni = sc.next();
        int posicion = 0;
        for (Cliente clientes:listaClientes){
            if(clientes.getDni_cliente().equals(buscar_dni)) {
                System.out.println("DNI ENCONTRADO LISTO PARA MODIFICAR");
                int opcion;
                do{
                    System.out.println("[1] MODIFICAR NOMBRE: ");
                    System.out.println("[2] MODIFICAR APELLIDO: ");
                    System.out.println("[3] MODIFICAR TELEFONO: ");
                    System.out.println("[4] MODIFICAR CORREO: ");
                    System.out.println("[5] SALIR: ");
                    System.out.print("Elige Opcion: ");
                    opcion = sc.nextInt();
                    switch (opcion) {
                        case 1:
                            System.out.println("Nuevo Nombre: ");
                            String update_nombre = sc.next();
                            listaClientes.get(posicion).setNombre_cliente(update_nombre);
                            System.out.println(listaClientes.get(posicion));

                            break;
                        case 2:
                            System.out.println("Nuevo Apellido: ");
                            String update_surname = sc.next();
                            listaClientes.get(posicion).setApellido_cliente(update_surname);
                            System.out.println(listaClientes.get(posicion));

                            break;
                        case 3:
                            System.out.println("Nuevo Telefono: ");
                            String update_phone = sc.next();
                            listaClientes.get(posicion).setTelefono_cliente(update_phone);
                            System.out.println(listaClientes.get(posicion));

                            break;
                        case 4:
                            System.out.println("Nuevo Correo: ");
                            String update_mail = sc.next();
                            listaClientes.get(posicion).setCorreo_electronico(update_mail);
                            System.out.println(listaClientes.get(posicion));

                            break;
                        case 5:
                            break;
                        default:
                            break;
                    }
                }while(opcion != 5);
                System.out.println("---------ACTUALIZADO");

            }else{
                posicion++;
            }
        }

        return nuevo_cliente;

    }

    public void delete_customer(){

        System.out.println("ELIMINAR CLIENTE");
        System.out.println("DNI: ");
        String search_dni = sc.next();

        boolean eliminado = listaClientes.removeIf(
                cliente -> cliente.getDni_cliente().equals(search_dni)
        );

        if (eliminado) {
            System.out.println("CLIENTE ELIMINADO");
        } else {
            System.out.println("NO SE ENCONTRO EL CLIENTE");
        }
    }

    public Cliente create_account(){
        //primero busco cliente
        //luego en ese cliente agrego la cuenta y el cci

        System.out.println("Buscar Cliente");
        System.out.print("DNI: ");
        String search_dni = sc.next();

        int position = 0;
        boolean encontrado = false;
        for(Cliente cliente: listaClientes){
            if(listaClientes.get(position).getDni_cliente().equals(search_dni)){
                encontrado = true;
            }

            if(encontrado){
                System.out.println("CLIENTE ENCONTRADO");
                SecureRandom r = new SecureRandom();

                String nro_account_customer = cod_country + "-" + cod_bank + "-" + r.nextInt(1000);
                String cci_account_customer = cod_international + "-" + cod_country + "-" + cod_bank + "-" + r.nextInt(1000);
                double balance = 10;
                Cuenta cuenta = new Cuenta(nro_account_customer, cci_account_customer, balance);

                cliente.setCuenta(cuenta);

                System.out.println("CUENTA CREADA");
                System.out.println(cliente);
                break;

            }else {
                position++;
                encontrado = false;
            }

        }
        if (!encontrado){
            System.out.println("NO EXISTE EL CLIENTE");
        }
        return nuevo_cliente;
    }


    public void deposit_cash() {

        System.out.println("Depostitar a cuenta: ");

        System.out.println("Tipo de deposito: ");
        System.out.println("[1] Mismo banco");
        System.out.println("[2] Interbancario");
        System.out.print("Opcion: ");
        int opcion = sc.nextByte();

        if(opcion == 1){
            System.out.println("Ingresar Nro Cuenta: ");
            String search_account = sc.next();
            boolean account_found = false;

            for(Cliente cliente: listaClientes){
                if(cliente.getCuenta().getNro_cuenta().equals(search_account)){
                    account_found = true;
                    System.out.println("Cantidad a Depositar: ");
                    double mount_deposit = sc.nextDouble();

                    cliente.getCuenta().setSaldo(cliente.getCuenta().getSaldo()+ mount_deposit);

                }
                if(account_found){
                    return;
                }
            }

        }else{
            System.out.println("Ingresar CCI: ");
            String search_cci_account = sc.next();
            boolean cci_account_found = false;

            for(Cliente cliente: listaClientes){
                if(cliente.getCuenta().getNro_cci().equals(search_cci_account)){
                    cci_account_found = true;
                    System.out.println("Cantidad a Depositar: ");
                    double mount_deposit = sc.nextDouble();
                    cliente.getCuenta().setSaldo(cliente.getCuenta().getSaldo()+ mount_deposit);
                }
                if(cci_account_found){
                    return;
                }
            }
        }
    }

    public void withdraw_money(){



    }



    @Override
    public String toString(){

        return listaClientes.toString();

    }


}
