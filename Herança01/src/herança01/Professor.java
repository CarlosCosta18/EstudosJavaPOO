/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herança01;

/**
 *
 * @author Carlos
 */
public class Professor extends Pessoas{
    private String especialidade;
    private int salario;
    
    public void receberAum(){
        this.salario =+ 500;
    }
    
    //metodos especiais 

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    
}
