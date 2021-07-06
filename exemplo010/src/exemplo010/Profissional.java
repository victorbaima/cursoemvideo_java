/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo010;

/**
 *
 * @author Victor
 */
public class Profissional extends Pessoa{
    private String profissao;
    public Profissional(String nome, String telefone, String profissao){
        super(nome, telefone);
        this.profissao = profissao;
    }
    @Override
    public void exibir(){
        super.exibir();
        //Chama o exibir de Pessoa, imprimindo nome e telefone
        System.out.println("\tTrabalha como "+profissao);
        //Complementa a informação acerca da profissão
        
    }
}
