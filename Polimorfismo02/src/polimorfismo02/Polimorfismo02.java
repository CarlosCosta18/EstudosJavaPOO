/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polimorfismo02;

/**
 *
 * @author Carlos
 */
public class Polimorfismo02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lobo m = new Lobo();
        Cachorro c = new Cachorro();
        
        c.emitirSom();
        m.emitirSom();
    }
    
}
