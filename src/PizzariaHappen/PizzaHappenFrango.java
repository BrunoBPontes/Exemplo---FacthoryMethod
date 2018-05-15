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
public class PizzaHappenFrango extends Pizza {

    public PizzaHappenFrango() {
        this.nome = "Pizza Happen Frango";
        this.valor = 12.00;
        this.opcional = "Não Informado";
    }

    @Override
    public void cobrar() {
        System.out.println("Cobrado valor de R$"+ this.valor+" pela Pizza Happen Frango!");
    }

    @Override
    public void preparar() {
        System.out.println("Preparando Pizza Happen Frango");
    }

    @Override
    public void solicitarEntrega() {
        System.out.println("Entrega Pizza Happen Frango Solicitada");
    }
    
}
