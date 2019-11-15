
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
       int Emma=0,Gunnar=0;
        int[] b = new int[4];
        int[] c = new int[4];
        for (int i = 0; i < 4; i++) {
            b[i] = a.nextInt();
            Emma += b[i];
        }
        for (int i = 0; i < 4; i++) {
            c[i] = a.nextInt();
            Gunnar += c[i];
        }
        String x= (Emma==Gunnar)? "Tie": (Emma<Gunnar)?"Emma":"Gunnar";
        System.out.println(x);
                
        
    }
    }


