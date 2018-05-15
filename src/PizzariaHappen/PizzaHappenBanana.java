package PizzariaHappen;

import Abstract.Pizza;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aluno
 */
public class PizzaHappenBanana extends Pizza {

    public PizzaHappenBanana() {
        this.nome = "Pizza Happen Banana";
        this.valor = 15.00;
        this.opcional = "Não Informado";
    }

    @Override
    public void cobrar() {
        System.out.println("Cobrado valor de R$"+ this.valor+" pela Pizza Happen Banana!");
    }

    @Override
    public void preparar() {
        System.out.println("Preparando Pizza Happen Banana");
    }

    @Override
    public void solicitarEntrega() {
        System.out.println("Entrega Pizza Happen Banana Solicitada");
    }
    
}
