/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ufcnerd;

/**
 *
 * @author Carlos
 */
public class UfcNerd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lutadores l[] = new Lutadores[6];
        
        l[0] = new Lutadores("Pretty Boy", "Brasileiro", 31, 1.75f, 68.9f, 11, 4, 5);
        l[1] = new Lutadores("PutScrip", "Argentina", 21, 1.35f, 78.9f, 02, 4, 8);
        l[2] = new Lutadores("PythonScri", "Grego", 11, 1.20f, 75.9f, 7, 2, 1);
        l[3] = new Lutadores("Iron Fist", "Americano", 28, 1.80f, 80.0f, 12, 3, 2);
        l[4] = new Lutadores("Dragon Slayer", "Chinês", 25, 1.70f, 75.0f, 10, 2, 4);
        l[5] = new Lutadores("Shadow Ninja", "Japonês", 30, 1.65f, 80.0f, 15, 5, 0);
        
        Luta UEC0 = new Luta();
        UEC0.marcarLuta(l[3], l[5]);
        UEC0.lutar();
    }
    
}
