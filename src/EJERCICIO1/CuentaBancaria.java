/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIO1;

/**
 *
 * @author PILARHUILCA
 */
public class CuentaBancaria {
    
    //Atributos
        String nombre, apellido, tipocuenta;
        Double saldo;

    public CuentaBancaria() {
    }

    public CuentaBancaria(String nombre, String apellido, String tipocuenta, Double saldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipocuenta = tipocuenta;
        this.saldo = saldo;
    }
    
        
    
    //Metodos
    public void depositar (double monto){
        saldo = saldo + monto;
        System.out.println("Retiro Exitoso, Nuevo saldo $" + saldo);
    }
        public void retirar (double monto){
            if (monto<=saldo){
                saldo = saldo - monto;
            }else{
                System.out.println("Saldo Insuficiente!!");
            }
    }
        public void mostrarSaldo (){
            System.out.println("===CUENTA BANCARIA===");
            System.out.println("Nombre del titular: " + nombre + " " + apellido);
            System.out.println("Tipo de Cuenta: " + tipocuenta);
            System.out.println("Saldo: " + saldo);
    }
}