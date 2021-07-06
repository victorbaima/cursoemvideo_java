/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resolucaotela;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author Victor
 */
public class ResolucaoTela {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dimension resolucao = Toolkit.getDefaultToolkit().getScreenSize();
        int larg = (int) resolucao.getWidth();
        int alt = (int) resolucao.getHeight();
        System.out.println("A resolução da tela é de "+larg+" x "+alt);
        
    }
    
}
