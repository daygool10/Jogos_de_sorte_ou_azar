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
public class Dado extends Jogo {
    
    @Override
     public void setAposta(int aposta){
            if(aposta > 6 || aposta < 1)
                System.out.println("Valor invalido para o dado!");
            else
                super.setAposta(aposta);
    }
     
     @Override
     public void setResultado(int resultado){
        System.out.println("Nao pode roubar no dado..."); 
    }
    
    
    @Override
    public void jogaJogo() {
       int resultado; 
        
        Random dado = new Random();
        resultado = dado.nextInt(6)+1;
        
        super.setResultado(resultado);
    }
}
