/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula02;


public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampa;
    
    void status(){
        System.out.println("Uma caneta " + this.cor);
        System.out.println("O modelo " + this.modelo);
        System.out.println("Está tampada? " + this.tampa);
        System.out.println("ponta: " + this.ponta);      
        System.out.println("Carga: " + this.carga);
    }
    
    public void rabiscar(){
        if (this.tampa == true){
            System.out.println("Caneta tampada, destampe para rasbiscar");
        } else {
            System.out.println("Rabiscando...");
        }
        
    }
    
    public void tampar (){
        this.tampa = true;
    }
    
    public void destampar (){
        this.tampa = false;
    }

}
