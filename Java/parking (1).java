
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
public class parking {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int harga[] = new int[4];
        for (int i = 1; i <= 3; i++) {
            harga[i] = a.nextInt();
        }
        int qwe[] = new int[4];
        int qwee[] = new int[4];
        for (int i = 0; i < 3; i++) {
            qwe[i] = a.nextInt();
            qwee[i] = a.nextInt();
        }
        int total = 0;
        for (int i = 0; i < 100; i++) {
            int mobil = 0;
            for (int j = 0; j < 3; j++) {
                if (i >= qwe[j] && i < qwee[j] ) {
                    mobil++;
                }
            }
            total += mobil * harga[mobil];
        }
        System.out.println(total);
    }
}
