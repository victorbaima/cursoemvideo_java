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
public class TestCalc {
    public static void main(String[] args){
        Calculadora c1 = new Calculadora();
        try{
            System.out.println(c1.somar(2, 3));
            System.out.println(c1.dividir(6, 3));
            System.out.println(c1.dividir(6, 0));
        }catch(ErroCalc e){
            System.out.println(e.getMessage());
    }
    
  }
    
}
