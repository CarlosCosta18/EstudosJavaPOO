/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula02;


public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampa;
    
    void status(){
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Está tampada?" + this.tampa);
        System.out.println("ponta: " + this.ponta);
        System.out.println("O modelo " + this.modelo);
        System.out.println("Carga: " + this.carga);
    }
    
    void rabiscar(){
        if (this.tampa == true){
            System.out.println("Caneta tampada, destampe para rasbiscar");
        } else {
            System.out.println("Rabiscando...");
        }
        
    }
    
    void tampar (){
        this.tampa = true;
    }
    
    void destampar (){
        this.tampa = false;
    }

}
