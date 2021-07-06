/*
 * Exercício para exibir os primeiros 10 números primos após o número 1.
 */
package exemplo009;

/**
 *
 * @author Victor
 */
public class Exemplo009 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int contagem = 0;
        int atual = 1;
        while(contagem < 10){
            atual++;
            boolean ePrimo = true;
            for(int i=2; i<atual; i++)
                if(atual%i==0)
                    ePrimo = false;
            if(ePrimo){
                contagem++;
                System.out.println(atual);
            }
        }
        // TODO code application logic here
    }
    
}
