
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
public class testing3 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int b = a.nextInt();
        int c = b%2;
        if (c==1) {
            System.out.println("Alice");
        }
        else{
            System.out.println("Bob");
        }
    }
}
