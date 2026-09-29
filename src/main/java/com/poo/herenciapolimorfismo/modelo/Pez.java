/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poo.herenciapolimorfismo.modelo;

/**
 *
 * @author Estudiante
 */
public class Pez extends Animal {

    public Pez(String nombre) {
        super(nombre);
    }
    
    public Pez() {
        super("Pecesito");
    }
    
    @Override
      public void hacerSonido() {
    System.out.println(super.getNombre()+ " hace glu glu!");
      }
    
}
