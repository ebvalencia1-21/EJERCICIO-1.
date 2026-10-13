/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package EJERCICIO2;

import java.util.Scanner;

public class EJERCICIO2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int op;
        int n = 0;
        Vehiculo[] vehiculos = null;

        do {
            System.out.println("== SISTEMA DE MATRICULACION VEHICULAR ==");
            System.out.println("1. Ingresar Vehiculos.");
            System.out.println("2. Revision Vehicular.");
            System.out.println("3. Matricular.");
            System.out.println("4. Mostrar Datos.");
            System.out.println("5. Salir.");
            System.out.print("Ingrese una opcion: ");

            op = sc.nextInt();
            sc.nextLine();

            switch (op) {

                case 1:
                    System.out.print("Cuantos vehiculos desea matricular: ");
                    n = sc.nextInt();
                    sc.nextLine();

                    if (n <= 0) {
                        System.out.println("Ingrese una cantidad mayor que cero.");
                        n = 0;
                        break;
                    }

                    vehiculos = new Vehiculo[n];

                    for (int i = 0; i < n; i++) {
                        System.out.println("Datos del vehiculo N° " + (i + 1));

                        System.out.print("Marca: ");
                        String marca = sc.nextLine();

                        System.out.print("Modelo: ");
                        String modelo = sc.nextLine();

                        System.out.print("Anio de fabricacion: ");
                        int anio = sc.nextInt();
                        sc.nextLine();

                        vehiculos[i] = new Vehiculo(
                                marca, modelo, "", anio
                        );
                    }

                    System.out.println("Vehiculos ingresados correctamente.");
                    break;

                case 2:
                    if (vehiculos == null) {
                        System.out.println("Primero debe ingresar los vehiculos.");
                        break;
                    }

                    for (int i = 0; i < n; i++) {
                        vehiculos[i].revisionVehicular();
                    }

                    System.out.println("Revision vehicular completada.");
                    break;

                case 3:
                    if (vehiculos == null) {
                        System.out.println("Primero debe ingresar los vehiculos.");
                        break;
                    }

                    for (int i = 0; i < n; i++) {
                        vehiculos[i].matricular();
                    }
                    break;

                case 4:
                    if (vehiculos == null) {
                        System.out.println("Primero debe ingresar los vehiculos.");
                        break;
                    }

                    for (int i = 0; i < n; i++) {
                        vehiculos[i].mostrarDatos();
                    }
                    break;

                case 5:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opcion no valida.");
                    break;
            }

        } while (op != 5);

        sc.close();
    }
}
