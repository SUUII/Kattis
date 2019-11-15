
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
public class Oddities {
    public static void main(String[] args) {
        Scanner a= new Scanner(System.in);
     int q = a.nextInt();
        for (int i = 0; i < q; i++) {
            int w = a.nextInt();
            if (w%2==0) {
                System.out.println(w+" is even");
            }else{
                System.out.println(w+" is odd");
            }
        }
    }
}
