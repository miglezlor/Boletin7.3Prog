
package boletin73;

import javax.swing.JOptionPane;

/**
 *
 * @author miglezlor
 */
public class PosNeg {
    
    public int pedirNumero(){
        int num;
        String res = JOptionPane.showInputDialog("Introduce o número: ");
        num = Integer.parseInt(res);
        return num;
    }
    public void positivoNegativo(int num){
        if (num>0)
            System.out.println("O número é +");
        else if (num<0)
            System.out.println("O número é -");
          else
            System.out.println("O número é 0");
                    
    }
}
