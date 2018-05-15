/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PizzariaBaggio;

import Abstract.Pizza;
import Abstract.Pizzaria;

/**
 *
 * @author Aluno
 */
public class PizzariaBaggio extends Pizzaria{
    @Override
    public Pizza criarPizza(String sabor) {
        sabor = sabor.toLowerCase();
        Pizza pizza = null;
        if(sabor.equals("queijo")){
            pizza = new PizzaBaggioQueijo();
        }
        else if(sabor.equals("strogonoff")){
            pizza = new PizzaBaggioStrogonoff();
        }
        else if(sabor.equals("marguerita")){
            pizza = new PizzaBaggioMarguerita();
        }
        
        return pizza;
    }
}
