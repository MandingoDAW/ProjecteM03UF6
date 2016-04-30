/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectem03uf6;

/**
 *
 * @author usuario
 */
public class Principal {
    
     public static void main(String[] args) {
        
        Jugador persona1 = new Jugador("Oriol","pene","pene para todos"); 
        System.out.println(persona1);
        Personatge personatge1 = new Personatge("Madara",10,10,"Uchiha","Foc");
        Personatge personatge2 = new Personatge("Sakura",4,8,"Uchiha","Viento");
        System.out.println(personatge1);
        System.out.println(personatge2);
        Combat combat1 = new Combat(persona1,personatge1,personatge2);
        System.out.println(combat1);
        combat1.Resolucio();
        
        
    }
    
}
