

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
        char[] qwe = new char[5];
        for (int i = 0; i < 5; i++) {
            qwe[i] = a.next().charAt(0);
        }
        int biggest = 0;
        for (int i = 0; i < 5; i++) {
            int big = 0;
            for (int j = 0; j < 5; j++) {
                if(qwe[i]==qwe[j]){
                    big++;
                }
            }
            if(biggest<big){
                biggest = big;
            }
        }
        System.out.println(biggest);
    }
}
