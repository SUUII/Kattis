
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
        DecimalFormat numberFormat = new DecimalFormat("#.0000");
        int q = a.nextInt();
        for (int i = 0; i < q; i++) {
            int w = a.nextInt();
            double e = a.nextDouble();
            double tes = 60/e;
            System.out.println(numberFormat.format(tes*(w-1))+" "+numberFormat.format(tes*(w))+" "+numberFormat.format(tes*(w+1)));
        }
    }
}
