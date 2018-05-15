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
public abstract class Pizza {
    protected String nome;
    protected Double valor;
    protected String opcional;
    
    public abstract void cobrar();
    public abstract void preparar();
    public abstract void solicitarEntrega();
}
