

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
public class hissing_microphone {
    public static void main(String[] args) {
 
        Scanner a = new Scanner(System.in);
        String hehe = a.next();
        String hasil = "no hiss";
        char[] hua = hehe.toCharArray();
        for (int i = 0; i < hua.length-1; i++) {
            if (hua[i]=='s') {
                if (hua[i+1]=='s') {
                    hasil = "hiss";
                }
            }
        }
        System.out.println(hasil);
    }
   
}
