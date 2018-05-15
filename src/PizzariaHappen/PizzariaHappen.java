package PizzariaHappen;

import Abstract.Pizzaria;
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
public class PizzariaHappen extends Pizzaria{

    @Override
    public Pizza criarPizza(String sabor) {
        sabor = sabor.toLowerCase();
        Pizza pizza = null;
        if(sabor.equals("queijo")){
            pizza = new PizzaHappenQueijo();
        }
        else if(sabor.equals("banana")){
            pizza = new PizzaHappenBanana();
        }
        else if(sabor.equals("frango")){
            pizza = new PizzaHappenFrango();
        }
        
        return pizza;
    }
    
}
