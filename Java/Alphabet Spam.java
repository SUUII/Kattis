
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
        DecimalFormat numberFormat = new DecimalFormat("#0.0000000000000000");

        String q = a.next();
        int w = 0;
        int e = 0;
        int r = 0;
        int t = 0;
        for (char c : q.toCharArray()) {
            if (c == '_') {
                w++;
            } else if (Character.isLowerCase(c)) {
                e++;
            } else if (Character.isUpperCase(c)) {
                r++;
            }else{
                t++;
            }
        }
        int total = w+e+r+t;
        System.out.println(numberFormat.format(Double.valueOf(Integer.toString(w))/total));
        System.out.println(numberFormat.format(Double.valueOf(Integer.toString(e))/total));
        System.out.println(numberFormat.format(Double.valueOf(Integer.toString(r))/total));
        System.out.println(numberFormat.format(Double.valueOf(Integer.toString(t))/total));
    }
}
