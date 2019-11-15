
import java.util.ArrayList;
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
        int counter = 1;
        int q = a.nextInt();
        while (q != 0) {
            String[] qwe = new String[q];
            int head = 0;
            int tail = q - 1;
            for (int i = 0; i < q; i++) {
                if (i % 2 == 0) {
                    qwe[head] = a.next();
                    head++;
                } else {
                    qwe[tail] = a.next();
                    tail--;
                }
            }
            System.out.println("SET " + counter);
            counter++;
            for (String string : qwe) {
                System.out.println(string);
            }
            q = a.nextInt();
        }
    }
}
