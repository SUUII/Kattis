
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
public class testing2 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int x = a.nextInt();
        int y = a.nextInt();
        if (y > 0 && x > 0) {
            System.out.println("1");
        }
        else if (y < 0 && x > 0) {
            System.out.println("4");
        }
        else if (y > 0 && x < 0) {
            System.out.println("2");
        }
        else{
            System.out.println("3");
        }
    }
}
