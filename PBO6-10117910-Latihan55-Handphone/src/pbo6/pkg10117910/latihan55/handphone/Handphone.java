/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6.pkg10117910.latihan55.handphone;

/**
 *
 * @author User
 */
public class Handphone {
    protected String manufacture, operatingSystem, model;
    protected int harga;
    
    public Handphone(String man, String os, String model, int harga){
        this.manufacture=man;
        this.operatingSystem=os;
        this.model=model;
        this.harga=harga;
        
    }
    public void displayProduct(){
        System.out.println("Manufaktur : "+harga);
        System.out.println("os : "+manufacture);
        System.out.println("Model : "+operatingSystem);
        System.out.println("Harga : "+model);
    }
}
