/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

/**
 *
 * @author Victor
 */
public class ErroCalc extends Exception{
    
    public ErroCalc(int a, int b){
        super("Erro com os numeros "+a+" e "+b);
        
    }
    
}
