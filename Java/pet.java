
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
public class pet {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int hitung = 0;
        int besar = 0;
        int qwe = 0;
        int ewq = 0;
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < 4; j++) {
                int q = a.nextInt();
                hitung += q;
            }
            if (besar <= hitung) {
                qwe = i;
                ewq = hitung;
                besar = hitung;
            }
            hitung = 0;
        }
        System.out.println(qwe + " " + ewq);
    }
}
