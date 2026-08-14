package org.example;

import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        ArrayList<Cliente> clientes = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        Cliente newCliente = new Cliente();

        System.out.println("BIENVENIDO A EUROBANK");

        int opcion;

        do {

            System.out.println("================================");
            System.out.println("        MENÚ BANCARIO");
            System.out.println("================================");
            System.out.println(" 1. Crear cliente");
            System.out.println(" 2. Consultar cliente");
            System.out.println(" 3. Modificar cliente");
            System.out.println(" 4. Eliminar cliente");
            System.out.println(" 5. Crear cuenta");
            System.out.println(" 6. Depositar dinero");
            System.out.println(" 7. Retirar dinero");
            System.out.println(" 8. Consultar saldo");
            System.out.println(" 9. Ver movimientos");
            System.out.println("10. Consultar cuentas");
            System.out.println("11. Salir");
            System.out.println("================================");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            switch(opcion){
                case 1:
                    newCliente.CrearCliente();

                    break;
                case 2 :
                    newCliente.mostrarClientes(clientes);
                    System.out.println(newCliente);
                    break;
                case 3:
                    System.out.println("Crear cliente");
                    break;
                case 4 :
                    System.out.println("Hola mundo");
                    break;
                case 5:
                    System.out.println("Crear cliente");
                    break;
                case 6 :
                    System.out.println("Depositar Dinero");
                    break;
                case 7:
                    System.out.println("Retirar Dinero");
                    break;
                case 8 :
                    System.out.println("Consultar Saldo");
                    break;
                case 9:
                    System.out.println("Ver Movimientos");
                    break;
                case 10 :
                    System.out.println("Consultar Cuentas");
                    break;
                case 11 :
                    System.out.println("Salir");
                    System.out.println("Gracias por su visita");
                    break;
                default:
                    System.out.println("Opcion Erronea");
                    break;
            }

        }while(opcion != 11);

    }
}
