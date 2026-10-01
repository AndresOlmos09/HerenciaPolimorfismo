/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poo.herenciapolimorfismo.modelo;

/**
 *
 * @author Estudiante
 */
public class Pajaro extends Animal {
    
    private int altura;

    public Pajaro(int altura, String nombre) {
        super(nombre);
        this.altura = 0;
    }

    public int getAltura() {
        return altura;
    }
    
    public Pajaro() {
        super("Pajarito");
    }
    
    public void volar(){
        altura+=10;
        System.out.println(super.getNombre()+ " esta volando a " + altura + " metros de altura");
    }

    @Override
    public void hacerSonido() {
        System.out.println(super.getNombre()+ " hace pio pio"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
    
    
}
