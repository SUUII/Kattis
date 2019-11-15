
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Rere
 */
public class kattis {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int q = a.nextInt();
        for (int i = 0; i < q; i++) {
            char[] w = a.next().toCharArray();
            char[] e = a.next().toCharArray();
            System.out.println(w);
            System.out.println(e);
            for (int j = 0; j < w.length; j++) {
                if(w[j]!=e[j]){
                    System.out.print("*");
                }else{
                    System.out.print(".");
                }
            }
            System.out.println("\n");
        }
    }
}
