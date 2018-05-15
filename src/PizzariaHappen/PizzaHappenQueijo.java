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
public class PizzaHappenQueijo extends Pizza {

    public PizzaHappenQueijo() {
        this.nome = "Pizza Happen Queijo";
        this.valor = 10.00;
        this.opcional = "Não Informado";
    }

    @Override
    public void cobrar() {
        System.out.println("Cobrado valor de R$"+ this.valor+" pela Pizza Happen Queijo!");
    }

    @Override
    public void preparar() {
        System.out.println("Preparando Pizza Happen Queijo");
    }

    @Override
    public void solicitarEntrega() {
        System.out.println("Entrega Pizza Happen Queijo Solicitada");
    }
    
}
