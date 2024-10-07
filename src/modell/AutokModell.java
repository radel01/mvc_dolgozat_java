/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modell;


public class AutokModell {
    private final Auto[] autok;
    
    public AutokModell(){
        autok = new Auto[3];
        autok[0] = new Auto("ABC-123", "piros");
        autok[1] = new Auto("CBA-321", "fekete");
        autok[2] = new Auto("XYZ-567", "piros", "tetőablak");
        autok[1].SetExtra("ülésfűtés");
        autok[2].atfest("kék");
    }
    

    public String bemutato() {
        String s = "Autók:\n";
        int i = 1;
        for (Auto auto : autok) {
            String a = auto.getRendszam();
            String sz = auto.getSzin();
            String e = auto.getExtra();
            s += i++ + ". "+"autó\n" +"rendszám: "+ a + " szín: " + sz + " Extra: "+ e +"\n";
        }
        return s;
    }

}