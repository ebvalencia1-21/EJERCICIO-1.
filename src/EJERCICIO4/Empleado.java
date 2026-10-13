/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIO4;

import java.util.Scanner;

/**
 *
 * @author PILARHUILCA
 */
public class Empleado {
        // ATRIBUTOS
        String nombre;
        double salarioBase;
        int horasExtras;

        public Empleado() {
        }

        public Empleado(String nombre, double salarioBase, int horasExtras) {
            this.nombre = nombre;
            this.salarioBase = salarioBase;
            this.horasExtras = horasExtras;
        }


        // METODOS
        public void ingresarDatos(Scanner sc) {
            System.out.print("Nombre del empleado: ");
            this.nombre = sc.nextLine();

            System.out.print("Horas extras trabajadas: ");
            this.horasExtras = sc.nextInt();
            sc.nextLine(); 
        }

        public double calcularSalarioTotal() {
            // Cada hora extra tiene un valor de $10
            double valorHorasExtras = this.horasExtras * 10.0;
            return this.salarioBase + valorHorasExtras;
        }

        public void mostrarDatos() {
            System.out.println("\n--- INFORMACION DEL EMPLEADO ---");
            System.out.println("Nombre: " + this.nombre);
            System.out.println("Salario base: $" + this.salarioBase);
            System.out.println("Horas extras: " + this.horasExtras);
            System.out.println("Salario total calculado: $" + calcularSalarioTotal());
            System.out.println("--------------------------------");
        }
    }

