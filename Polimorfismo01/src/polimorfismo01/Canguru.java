/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismo01;

/**
 *
 * @author Carlos
 */
public class Canguru extends Mamifero{
    
    
    public void Usarbolsa(){
        System.out.println("Guardando Filhote");
    }
    
    @Override
    public void locomover(){
        System.out.println("Pulando feito um doido");   
    }
}
