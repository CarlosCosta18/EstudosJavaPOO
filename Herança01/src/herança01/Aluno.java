/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herança01;

/**
 *
 * @author Carlos
 */
public class Aluno extends Pessoas{
    private int mat;
    private String curso;
    
    public void cancelarMat(){
        System.out.println("#####################");
        System.out.println("MATRICULA CANCELADA");
    }

    public int getMat() {
        return mat;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    
}
