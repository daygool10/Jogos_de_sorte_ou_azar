/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemploaula09;

/**
 *
 * @author daiane.rocha2
 */
public abstract class Jogo {
    
    private int aposta; 
    private int resultado; 
    
    public void setAposta(int aposta){
        this.aposta = aposta; 
    }
    
    public void setResultado(int resultado){
        this.resultado = resultado; 
    }
    
    public abstract void jogaJogo();
    
    public void mostraResultado(){
        System.out.println("Aposta: " + this.aposta);
        System.out.println("Resultado: " + this.resultado);
        
        if(this.aposta == this.resultado){
            System.out.println("Voce venceu!");
        }else {
            System.out.println("Tente novamente...");
        }
    }
}
