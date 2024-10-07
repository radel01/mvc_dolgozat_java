/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modell;


public class Auto {
    private String rendszam;
    private String szin;
    private String extra;
    
    public Auto( String rendszam, String szin){
        this(rendszam, szin, "nincs");
        
    }
    public Auto( String rendszam, String szin, String extra){
        this.rendszam=rendszam;
        this.szin=szin;
        this.extra=extra;
        
    }

    public void atfest(String ujSzin){
        szin=ujSzin;
    }
    
    public void SetExtra(String ujExtra){
        extra=ujExtra;
    }
    
    public String getRendszam() {
        return rendszam;
    }

    public String getSzin() {
        return szin;
    }

    public String getExtra() {
        return extra;
    }
    
    
    
}
