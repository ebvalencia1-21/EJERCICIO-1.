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
        
        System.out.print("Cuantos empleados deseas registrar: ");
        int n = sc.nextInt();
        sc.nextLine(); 
     
        Empleado[] listaEmpleados = new Empleado[n];

        for (int i = 0; i < n; i++) {
            System.out.println("--- Registro del Empleado #" + (i + 1) + " ---");
            listaEmpleados[i] = new Empleado();
            listaEmpleados[i].ingresarDatos(sc);
        }

        System.out.println("====== REPORTES DE SALARIOS TOTALES ======");
        for (int i = 0; i < listaEmpleados.length; i++) {
            listaEmpleados[i].mostrarDatos();
        }

        System.out.println("Programa finalizado con exito!");
        sc.close();
    
    }
    
}
