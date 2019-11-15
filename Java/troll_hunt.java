
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
public class troll_hunt {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int q = a.nextInt()-1;
        int w = a.nextInt();
        int e = a.nextInt();
        int tim = w/e;
        int lama = q/tim;
        if (q%tim==0) {
            System.out.println(lama);
        }else System.out.println((lama+1));
    }
}
