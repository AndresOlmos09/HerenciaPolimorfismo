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
    
    private int profundidad;

    public Pez(int profundidad, String nombre) {
        super(nombre);
        this.profundidad = profundidad;
    }
    
    
    public Pez() {
        super("Pecesito");
    }
    
    public void nadar(){
        System.out.println(getNombre()+ "nada a "+ profundidad + " metros de profundidad.");
    }
    
    @Override
      public void hacerSonido() {
    System.out.println(getNombre()+ " hace glu glu!");
      }
    
    public void comer(int hojuelas) {
    System.out.println(getNombre() + " come " + hojuelas + " de alimento");
  }  
}
