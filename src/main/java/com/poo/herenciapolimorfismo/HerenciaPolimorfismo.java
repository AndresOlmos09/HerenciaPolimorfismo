/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.poo.herenciapolimorfismo;

import com.poo.herenciapolimorfismo.modelo.Animal;
import com.poo.herenciapolimorfismo.modelo.Gato;
import com.poo.herenciapolimorfismo.modelo.Perro;
import com.poo.herenciapolimorfismo.modelo.Pez;
import com.poo.herenciapolimorfismo.modelo.PerroGrande;
import com.poo.herenciapolimorfismo.modelo.Pajaro;

/**
 *
 * @author taidy
 */
public class HerenciaPolimorfismo {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        // Variable de tipo Animal (padre)
// Pero objeto real de tipo Perro (hijo)
Animal mascota1 = new Perro();
Animal mascota2 = new Gato();
Animal mascota3 = new Pez();
Animal mascota4 = new Pajaro();
Animal mascota5 = new PerroGrande();


// El método ejecutado depende del 
// tipo REAL del objeto, no de Animal
mascota1.hacerSonido();  
  //Imprime: ¡Guau guau! (es Perro)
mascota2.hacerSonido();
  //Imprime: ¡Miau miau! (es Gato)
// Mismo mensaje, DIFERENTES resultados
mascota3.hacerSonido();

mascota4.hacerSonido();

mascota5.hacerSonido();


Animal[] animales = {
  new Perro(3,"Labrador","Rex"),
  new Gato("Silvestre"),
  new Pajaro(3,"Bartolito"),
  new Animal("Piolin"),
  new Pez(2,"Doris"),
  new PerroGrande(5, 3, "Labrador", "Max")
};

for (Animal animal : animales) {
  animal.hacerSonido(); // Polimorfismo
}

    }
}
