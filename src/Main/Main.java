/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Abstract.Pizza;
import Abstract.Pizzaria;
import PizzariaBaggio.PizzariaBaggio;
import PizzariaHappen.PizzariaHappen;

/**
 *
 * @author Aluno
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pizzaria pizzaria = new PizzariaHappen();
        Pizza pizzaHQ = pizzaria.pedirPizza("queijo");
        System.out.println("***********************");
        Pizza pizzaHB = pizzaria.pedirPizza("banana");
        System.out.println("***********************");
        Pizza pizzaHF = pizzaria.pedirPizza("Frango");
        System.out.println("***********************");
        pizzaria = new PizzariaBaggio();
        Pizza pizzaBM = pizzaria.pedirPizza("marguerita");
        System.out.println("***********************");
        Pizza pizzaBS = pizzaria.pedirPizza("strogonoff");
        System.out.println("***********************");
        Pizza pizzaBQ = pizzaria.pedirPizza("queijo");
        System.out.println("***********************");
        
    }
    
}
