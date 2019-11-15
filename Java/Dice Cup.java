
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
public class testing4 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int x = a.nextInt();
        int y = a.nextInt();
        int z =0;
        int besar = Math.max(x, y);
        int kecil = Math.min(x, y);
        for (int i = kecil; i < besar+1; i++) {
            kecil++;
                System.out.println(kecil);
        }
        
    }
}
