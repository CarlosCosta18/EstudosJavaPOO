/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ufcnerd;

import java.util.Random;

/**
 *
 * @author Carlos
 */
public class Luta {
    private Lutadores desafiado;
    private Lutadores desafiante;
    private int rounds;
    private boolean aprovado;
    
    public void marcarLuta(Lutadores l1, Lutadores l2){
        if (l1.getCategoria().equals(l2.getCategoria()) &&
                 l1 != l2){
            this.aprovado = true;
            this.desafiado = l1;
            this.desafiante = l2;
            
        } else {
            this.aprovado = false;
            this.desafiado = null;
            this.desafiante = null;
        }
        
    }
    
    public void lutar(){
        if (this.aprovado){
            System.out.println("### DESAFIADO ###");
            this.desafiado.apresentarLuta();
            System.out.println("### DESAFIANTE ###");
            this.desafiante.apresentarLuta();
            
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3); // 0 1 2
            switch (vencedor){
                case 0: //empate
                    System.out.println("EMPATADO");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1: // desafiado vence
                    System.out.println("VENCEU " + this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2: // desafiante perde
                    System.out.println("VENCEU " + this.desafiante.getNome());
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
            }
        } else{
            System.out.println("A luta não pode acontecer!");
        }
    }
    
    //getter e setters

    public Lutadores getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutadores desafiado) {
        this.desafiado = desafiado;
    }

    public Lutadores getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutadores desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }

    
    
}
