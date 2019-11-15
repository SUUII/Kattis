
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author 672017066
 */
public class Testing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        String c = a.nextLine();
        int ha=0;
        int ha2=0;
        int hi2=0;
        int ho2=0;
        int hi=0;
        int ho=0;
    
        int bonus=0;
        for (int i = 0; i < c.length(); i++) {
            if (c.charAt(i)=='T'||c.charAt(i)=='t') {
                ha++;  
            }
            if (c.charAt(i)=='G'||c.charAt(i)=='g') {
                hi++;
            }
            if (c.charAt(i)=='C'||c.charAt(i)=='c') {
                ho++;
            }
        }
        ha2=ha*ha;
        hi2=hi*hi;
        ho2=ho*ho;
        int min = Math.min(ha, Math.min(hi, ho));
        bonus = min*7;
        System.out.println(ha2+hi2+ho2+bonus);
        
    }
    
}
