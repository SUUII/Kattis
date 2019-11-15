
import static java.lang.Integer.parseInt;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author RERE
 */
public class Testing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Scanner a = new Scanner(System.in);
        int hasil=0;
        int qwer = 0;
      int q = a.nextInt();
        for (int i = 0; i < q; i++) {
           String w = a.next();
            
            if (w.equals("P=NP")) {
                System.out.println("skipped");
            }else{
                hasil = 0;
              String[] hoho =  w.split("\\+");
                for (String s : hoho) {
                    int f = parseInt(s);
                     qwer = hasil += f;
                     
                }
                System.out.println(qwer);
                
            
              
            }
        }
    }
    
}
