package Abstract;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aluno
 */
public abstract class Pizzaria {
    
    public abstract Pizza criarPizza(String sabor);
    
    public Pizza pedirPizza(String sabor){
        Pizza pizza;
        pizza = criarPizza(sabor);
        
        pizza.cobrar();
        pizza.preparar();
        pizza.solicitarEntrega();
        
        return pizza;
    }
}
