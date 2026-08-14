package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Cliente {

    Scanner sc = new Scanner(System.in);

    String dni_cliente;
    String nombre_cliente;
    String apellido_cliente;
    String telefono_cliente;
    String correo_electronico;
    String fecha_creacion;
    String nro_cuenta_cliente;
    String cci_cliente;

    ArrayList<Cliente> listaClientes = new ArrayList<>();

    public Cliente() {

    }

    public Cliente(String dni_cliente, String nombre_cliente, String apellido_cliente, String telefono_cliente, String correo_electronico, String fecha_creacion, String nro_cuenta_cliente, String cci_cliente) {
        this.dni_cliente = dni_cliente;
        this.nombre_cliente = nombre_cliente;
        this.apellido_cliente = apellido_cliente;
        this.telefono_cliente = telefono_cliente;
        this.correo_electronico = correo_electronico;
        this.fecha_creacion = fecha_creacion;
        this.nro_cuenta_cliente = nro_cuenta_cliente;
        this.cci_cliente = cci_cliente;
    }

    public Cliente CrearCliente() {
        System.out.println("Crear cliente");
        System.out.println("DNI: ");
        String dni_cliente = sc.next();
        System.out.println("Nombre: ");
        String nombre_cliente = sc.next();
        System.out.println("Apellido: ");
        String apellido_cliente = sc.next();
        System.out.println("Telefono: ");
        String telefono_cliente = sc.next();
        System.out.println("Correo Electronico: ");
        String correo_electronico = sc.next();
        System.out.println("Fecha de Creacion: ");
        String fecha_creacion = sc.next();
        System.out.println("Nro Cuenta: ");
        String nro_cuenta_cliente = sc.next();
        System.out.println("CCI: ");
        String cci_cliente = sc.next();

        Cliente cliente = new Cliente(dni_cliente, nombre_cliente, apellido_cliente, telefono_cliente, correo_electronico, fecha_creacion, nro_cuenta_cliente, cci_cliente);

        listaClientes.add(cliente);
        return cliente;
    }

    public void mostrarClientes(ArrayList<Cliente> clientes) {

        for (Cliente cliente : clientes) {
            System.out.println(cliente.toString());
        }
    }

    @Override
    public String toString(){
        return "Cliente{" +
                "DNI='" + dni_cliente + '\'' +
                ", Nombre='" + nombre_cliente + '\'' +
                ", Apellido='" + apellido_cliente + '\'' +
                ", Telefono='" + telefono_cliente + '\'' +
                ", Correo='" + correo_electronico + '\'' +
                ", Fecha de Creacion='" + fecha_creacion + '\'' +
                ", Nro Cuenta='" + nro_cuenta_cliente + '\'' +
                ", CCI='" + cci_cliente + '\'' +
                '}';
    }



}
