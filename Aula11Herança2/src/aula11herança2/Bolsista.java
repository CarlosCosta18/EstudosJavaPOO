/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula11herança2;

/**
 *
 * @author Carlos
 */
public class Bolsista extends Aluno{
    private Float bolsa;
    
    public void renovarBolsa(){
        System.out.println("Bolsa Renovada de " + this.nome);
    }
    
    @Override
    public void pagarMensalidade(){
        System.out.println( this.nome + " É bolsista, pagamento facilitado");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
    
    
}


