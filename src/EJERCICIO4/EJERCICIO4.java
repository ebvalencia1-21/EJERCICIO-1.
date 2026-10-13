/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EJERCICIO4;

import java.util.Scanner;

/**
 *
 * @author PILARHUILCA
 */
public class EJERCICIO4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;
        int n = 0;
        Empleado[] listaEmpleados = null; 

        do {
            System.out.println("== MENU DE CONTROL DE SALARIOS ==");
            System.out.println("1.- Registrar empleados");
            System.out.println("2.- Mostrar reporte de salarios totales");
            System.out.println("3.- Salir");
            System.out.print("Ingrese una opcion: ");
            op = sc.nextInt();
            sc.nextLine(); 

            switch (op) {
                case 1:
                    System.out.print("Cuntos empleados (N) deseas registrar: ");
                    n = sc.nextInt();
                    sc.nextLine(); 
                    
                    listaEmpleados = new Empleado[n]; 
                    
                    for (int i = 0; i < n; i++) {
                        System.out.println("Registro del Empleado #" + (i + 1) + " ---");
                        System.out.print("Ingrese el nombre del empleado: ");
                        String nombre = sc.nextLine();
                        
                        System.out.print("Ingrese las horas extras trabajadas: ");
                        int horasExtras = sc.nextInt();
                        sc.nextLine(); 
                       
                        listaEmpleados[i] = new Empleado(nombre, horasExtras);
                    }break;
        
                case 2:
                    if (listaEmpleados == null || n == 0) {
                        System.out.println("¡Error! Primero debe registrar empleados en la opción 1.");
                    } else {
                        System.out.println("====== REPORTES DE SALARIOS TOTALES ======");
                        for (int i = 0; i < listaEmpleados.length; i++) {
                            listaEmpleados[i].mostrarDatos();
                        }
                    }
                    break;

                case 3:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (op != 3);

        System.out.println("¡Programa finalizado con éxito!");
        sc.close();
    }
}
