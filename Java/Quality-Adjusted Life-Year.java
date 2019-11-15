import java.text.DecimalFormat;
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
        int q = a.nextInt();
        double hasil = 0;
        for (int i = 0; i < q; i++) {
            double w = a.nextDouble();
            double e = a.nextDouble();
            hasil += w*e;
        }
        DecimalFormat numberFormat = new DecimalFormat("#.000");
        System.out.println(numberFormat.format(hasil));
    }
}
