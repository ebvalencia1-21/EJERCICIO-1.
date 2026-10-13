/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EJERCICIO3;

import java.util.Scanner;

/**
 *
 * @author PILARHUILCA
 */
public class EJERCICIO3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Cuantos libros deseas registrar: ");
        int n = sc.nextInt();
        sc.nextLine();

        Libro[] listaLibros = new Libro[n];

        for (int i = 0; i < n; i++) {
            System.out.println("--- Registro del Libro #" + (i + 1) + " ---");
            System.out.print("Titulo: ");
            String t = sc.nextLine();
            System.out.print("Autor: ");
            String a = sc.nextLine();
            System.out.print("Numero de paginas: ");
            int p = sc.nextInt();
            sc.nextLine(); 

            listaLibros[i] = new Libro(t, a, p);
        }

        int op = 0;
        do {
            System.out.println("======== MENU DE BIBLIOTECA ========");
            System.out.println("1. Mostrar todos los libros");
            System.out.println("2. Prestar un libro");
            System.out.println("3. Devolver un libro");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opcion: ");
            op = sc.nextInt();

            if (op >= 1 && op <= 3) {
                if (op == 1) {
                    System.out.println("Selecciona el libro que deseas consultar:");
                } else if (op == 2) {
                    System.out.println("Selecciona el libro que deseas prestar:");
                } else if (op == 3) {
                    System.out.println("Selecciona el libro que deseas devolver:");
                }
                
                for (int i = 0; i < listaLibros.length; i++) {
                    System.out.println((i + 1) + ". " + listaLibros[i].titulo + " (" + listaLibros[i].estado + ")");
                }
                System.out.print("Numero de libro: ");
                int indiceLibro = sc.nextInt() - 1;

                if (indiceLibro >= 0 && indiceLibro < listaLibros.length) {
                    if (op == 1) listaLibros[indiceLibro].mostrarInfo();
                    if (op == 2) listaLibros[indiceLibro].prestar();
                    if (op == 3) listaLibros[indiceLibro].devolver();
                } else {
                    System.out.println("Numero de libro invalido.");
                }
            }
        } while (op != 4);

        System.out.println("Programa finalizado con exito!");
        sc.close();
    }
}