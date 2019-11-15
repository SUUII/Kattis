
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
public class statistics {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int i = 1;
        while (a.hasNextInt()) {
            int max = -999999;
            int min = 999999;
            int haha = a.nextInt();
            for (int j = 0; j < haha; j++) {
                int hehe = a.nextInt();
                if (hehe < min) {
                    min = hehe;
                }
                if (hehe > max) {
                    max = hehe;
                }
            }
            int hitung = max - min;
            System.out.println("Case " + i + ": " + min + " " + max + " " + hitung);
            i++;
        }
    }
}
