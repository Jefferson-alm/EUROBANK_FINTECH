package org.example;

import java.security.SecureRandom;
import java.sql.Time;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class GestionarClientes {

    Scanner sc = new Scanner(System.in);


    String codigo_mi_pais = "51";
    String codigo_mi_banco = "9876";
    String codigo_mi_pais_internacional = "123456";

    ArrayList<Cliente> lista_clientes = new ArrayList<>();

    public Cliente crear_cliente(){

        System.out.println("Crear Cliente");

        System.out.println("DNI: ");
        String dni_cliente = sc.next();

        System.out.println("Nombre: ");
        String nombre_cliente = sc.next();

        System.out.println("Apellidos: ");
        String apellido_cliente = sc.next();

        System.out.println("Telefono: ");
        String telefono_cliente = sc.next();

        System.out.println("Correo Electronico: ");
        String correo_cliente = sc.next();


        LocalDate fecha_creacion = LocalDate.now();
        System.out.println("Fecha Creacion: " + fecha_creacion);

        SecureRandom r = new SecureRandom();

        String cuenta_cliente = codigo_mi_pais + " - " + codigo_mi_banco + " - " +r.nextInt(1000);
        System.out.println("Nro de Cuenta: "+ cuenta_cliente);

        String cci_cliente = codigo_mi_pais_internacional + " - "  + codigo_mi_pais + " - " + codigo_mi_banco + " - "  + r.nextInt(1000);
        System.out.println("CCI: " + cci_cliente);

        Cliente cliente = new Cliente(dni_cliente, nombre_cliente, apellido_cliente, telefono_cliente, correo_cliente, fecha_creacion, cuenta_cliente, cci_cliente);

        lista_clientes.add(cliente);

        return cliente;

    }


}
