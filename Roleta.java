/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemploaula09;
import java.util.Random;

/**
 *
 * @author daiane.rocha2
 */
public class Roleta extends Jogo{

     @Override
     public void setAposta(int aposta){
            if(aposta > 36 || aposta < 1)
                System.out.println("Valor invalido para a roleta!");
            else
                super.setAposta(aposta);
    }
    
     @Override
     public void setResultado(int resultado){
        System.out.println("Nao pode roubar na roleta..."); 
    }
    
    
    @Override
    public void jogaJogo() {
        int resultado; 
        
        Random roleta = new Random();
        
        resultado = roleta.nextInt(36)+1;
        super.setResultado(resultado);
    
    }
    
    
}
