/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PizzariaBaggio;

import Abstract.Pizza;

/**
 *
 * @author Aluno
 */
public class PizzaBaggioMarguerita extends Pizza {

    public PizzaBaggioMarguerita() {
        this.nome = "Pizza Baggio Marguerita";
        this.valor = 30.00;
        this.opcional = "Não Informado";
    }

    @Override
    public void cobrar() {
        System.out.println("Cobrado valor de R$"+ this.valor+" pela Pizza Baggio Marguerita!");
    }

    @Override
    public void preparar() {
        System.out.println("Preparando Pizza Baggio Marguerita");
    }

    @Override
    public void solicitarEntrega() {
        System.out.println("Entrega Pizza Baggio Marguerita Solicitada");
    }
    
}
