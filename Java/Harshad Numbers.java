
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
        char[] qwe = Integer.toString(q).toCharArray();
        int w = 0;
        for (char c : qwe) {
            w += Integer.parseInt(String.valueOf(c));
        }
        while(q%w!=0){
         q++;
        qwe = Integer.toString(q).toCharArray();
        w=0;
        for (char c : qwe) {
            w += Integer.parseInt(String.valueOf(c));
        } 
        }
        System.out.println(q);
    }
}
