/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo006;

/**
 *
 * @author Victor
 */
public class Exemplo006 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double soma = 0.0;
        for(int x=1; x <=5; x++)
            soma += Math.pow(x, 2);
        System.out.println(soma/5);
        
    }
    
}
