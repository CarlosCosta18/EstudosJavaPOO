/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herança01;

/**
 *
 * @author Carlos
 */
public class Herança01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Pessoas p1 = new Pessoas();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionarios p4 = new Funcionarios();
        
        p1.setNome("Pedrao");
        p2.setNome("Maria");
        p3.setNome("Claudio");
        p4.setNome("Fabiana");
        
        p1.setSexo("Macho");
        p2.setSexo("Femea");
        p3.setSexo("Macho Alpha");
        p4.setSexo("Femea beta");
        
        p1.setIdade(18);
        p2.setIdade(15);
        p3.setIdade(60);
        p4.setIdade(31);
        
        p2.setCurso("informatica");
        
        p1.fazerNiver();
        
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        
    }
    
}
