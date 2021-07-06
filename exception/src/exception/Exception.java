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
public class Exception {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] a = {4, 8, 16, 32, 64, 128};
        int[] b = {2, 0, 4, 8, 0};
        
        for(int i=0; i<a.length;i++){
            try{
                System.out.println(a[i]+ " / " + b[i] + " = " + (a[i]/b[i]) );
            }
            catch(ArithmeticException e1){
                System.out.println("Erro ao dividir por zero");
            }
            catch(ArrayIndexOutOfBoundsException e2){
                System.out.println("Erro na localização do array");
            }
    }
    
  }
    
}
