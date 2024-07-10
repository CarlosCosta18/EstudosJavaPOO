/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aulabanco;

import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class AulaBanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ContaBanco p1 = new ContaBanco();
       p1.setNumConta(11111);
       p1.setDono("Jubileu");
       p1.AbrirConta("cc");
       
       
       ContaBanco p2 = new ContaBanco();
       p2.setNumConta(22222);
       p2.setDono("Cleuza");
       p2.AbrirConta("cp");
       
       
       p1.depositar(100);
       p2.depositar(500);
       p2.sacar(100);
       
       
       p1.estadoAtual();
       p2.estadoAtual();
    
}
}

