
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
public class testing2 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int x = a.nextInt();
        int y = a.nextInt();
        int hasil = 0;
        int hasil2 = 0;
        if (x != 0&&y<45) {
            hasil = x-1;
            hasil2 = 60+y-45;
             System.out.println(hasil+ " " + hasil2);
        }
        if (x!= 0 && y>45) {
            hasil = x;
            hasil2 = y-45;
            System.out.println(hasil+ " " + hasil2);
        }
        if (x==0&&y<45) {
             hasil = 23;
             hasil2 = 60+y-45;
             System.out.println(hasil+ " " + hasil2);
        }
        if (x==0&&y>45) {
            hasil = 0;
            hasil2 = y-45;
            System.out.println(hasil+ " " + hasil2);
        }
        }
    }

