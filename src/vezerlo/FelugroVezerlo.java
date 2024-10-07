/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vezerlo;

import modell.AutokModell;
import nezet.FelugroNezet;

public class FelugroVezerlo {
    private final AutokModell modell;
    private final FelugroNezet nezet;
    
    public FelugroVezerlo(AutokModell modell, FelugroNezet nezet) {
        this.modell = modell;
        this.nezet = nezet;
        start(); 
    }

    private void start() {
        nezet.megjelenit(modell.bemutato());
    }
}
