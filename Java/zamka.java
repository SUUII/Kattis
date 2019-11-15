
import java.util.ArrayList;
import java.util.Arrays;
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
public class zamka {

    public static int sumDigits(int in) {
        int sum = 0;
        while (in != 0) {
            sum += (in % 10);
            in /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        ArrayList<Integer> ha = new ArrayList<>();
        int q = a.nextInt();
        int w = a.nextInt();
        int e = a.nextInt();
        int max = 0;
        int min = 0;
        for (int i = q; i <= w; i++) {
            if (sumDigits(i) == e) {
                min = i;
                break;
            }
        }
        for (int i = w; i >= q; i--) {
            if (sumDigits(i) == e) {
                max = i;
                break;
            }
        }

        System.out.println(min);
        System.out.println(max);
    }

}
