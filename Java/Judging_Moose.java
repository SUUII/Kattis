
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
public class Judging_Moose {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int q = a.nextInt();
        int w = a.nextInt();
        int e = Math.max(q, w);
        if (q == 0 && w == 0) {
            System.out.println("Not a moose");
        } else if (q == w) {
            System.out.println("Even " + (q + w));
        } else if (q != w) {
            System.out.println("Odd " + (e * 2));
        }
    }
}
