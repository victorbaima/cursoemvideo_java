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
public class Calculadora {
    public int somar(int a, int b){
        return a+b;
    }
    
    public int dividir(int a, int b) throws ErroCalc{
        if(b==0)
            throw new ErroCalc(a, b);
        return a/b;
    }
}
