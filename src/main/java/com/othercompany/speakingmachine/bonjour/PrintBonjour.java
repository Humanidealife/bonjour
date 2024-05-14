/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.othercompany.speakingmachine.bonjour;

import com.mycompany.testlibrairiepremier.module1.Bonjour;

/**
 *
 * @author wangq
 */
public class PrintBonjour {

    public static void main(String[] args) {
        //On va instancier notre Class "Bonjour", 
        //  le "Bonjour" du package "com.mycompany.testlibrairiepremier.module1"
        Bonjour bonjour1 = new Bonjour();
        //Et on va invoquer sa méthode printGreetings"
        bonjour1.printGreetings("Aubois", "Anatole");
        //On peut faire un "Clean and Build" du projet "bonjour" ou directement un "Run File" de la Class "PrintBonjour.java"
        
    }
}
