/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package biblioteca;

/**
 *
 * @author Carlos
 */
public class Biblioteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Pessoa[] p = new Pessoa[2];
        Livro [] l = new Livro[3];
        
        p[0] = new Pessoa("Pedro", 22, "M");
        p[1] = new Pessoa("Maria", 14, "F");
        
        l[0] = new Livro("Como treinar um mamao", "Solucia", 300, p[1]);
        l[1] = new Livro("50 tons de azul", "Sacha", 420, p[0]);
        l[2] = new Livro("Chatamente", "Disni", 100, p[0]);
        
        
        l[0].abrir();
        l[0].folhear(200);
        System.out.println(l[0].detalhes());
        
    }
    
}
