
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
public class fizzbuzz {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int q = a.nextInt();
        int w = a.nextInt();
        int e = a.nextInt();
        for (int i = 1; i <= e; i++) {
            if (i%q==0&&i%w==0) {
                System.out.println("FizzBuzz");
            }
            else if (i%q==0){
                System.out.println("Fizz");
            }else if (i%w==0) {
                System.out.println("Buzz");
            }else{
                System.out.println(i);
            }
        }
    }
}
