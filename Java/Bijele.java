
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
       
        int[] b = {1,1,2,2,2,8};
        for (int i = 0; i < 6; i++) {
            int t = a.nextInt();
           int hasil = b[i]-t;
            System.out.print(hasil+" ");
            
        }
    }
    }


