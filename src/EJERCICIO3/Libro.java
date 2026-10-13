/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EJERCICIO3;

/**
 *
 * @author PILARHUILCA
 */
public class Libro {

    //ATRIBUTOS 
    String titulo;
    String autor;
    String estado;
    int paginas;

    
    public Libro() {
    }
    
    public Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.estado = "disponible";
    }
        
    //MÉTODOS
    public void prestar() {
        if (this.estado.equalsIgnoreCase("disponible")) {
            this.estado = "prestado";
            System.out.println("Exito: El libro '" + titulo + "' ahora esta PRESTADO.");
        } else {
            System.out.println("Error: No se puede prestar. El libro esta: " + estado);
        }
    }

    
    public void devolver() {
        if (this.estado.equalsIgnoreCase("prestado")) {
            this.estado = "disponible";
            System.out.println("Exito: El libro '" + titulo + "' ha sido devuelto (DISPONIBLE).");
        } else {
            System.out.println("Error: No se puede devolver. El libro no estaba prestado (Estado: " + this.estado + ")");
        }
    }

    public void mostrarInfo() {
        System.out.println("--- DETALLES DEL LIBRO ---");
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Paginas: " + paginas);
        System.out.println("Estado: " + estado);
        System.out.println("--------------------------");
    }
    
} 
