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
        String nombre;
        double salarioBase;
        int horasExtras;
        double salarioTotal;

        
        public Empleado(String nombre, int horasExtras) {
            this.nombre = nombre;
            this.horasExtras = horasExtras;
            this.salarioBase = 460.00; 
            calcularSalarioTotal();   
        }

        public void calcularSalarioTotal() {
            double valorHorasExtras = this.horasExtras * 10.0;
            this.salarioTotal = this.salarioBase + valorHorasExtras;
        }

        public void mostrarDatos() {
            System.out.println("----------------------------------------");
            System.out.println("Nombre: " + this.nombre);
            System.out.println("Salario Base: $" + this.salarioBase);
            System.out.println("Horas Extras: " + this.horasExtras);
            System.out.println("Salario Total Calculado: $" + this.salarioTotal);
        }
    }