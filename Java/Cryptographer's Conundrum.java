
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
        String q = a.next();
        char[] qwe = q.toCharArray();
        int counter = 0;
        for (int i = 0; i < q.length(); i++) {
            switch ((i+1)%3) {
                case 1:
                    if (qwe[i] != 'P') {
                        counter++;
                    }
                    break;
                case 2:
                    if (qwe[i] != 'E') {
                        counter++;
                    }
                    break;
                default:
                     if (qwe[i] != 'R') {
                        counter++;
                    }
                    break;
            }
        }
        System.out.println(counter);
    }
}
