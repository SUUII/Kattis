
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
public class testing3 {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int b = a.nextInt();
        int c = a.nextInt();
        int hasil;
        if (b < c) {
            hasil = c - b;
            if (hasil == 1) {
                System.out.println("Dr. Chaz will have " + hasil + " piece of chicken left over!");
            } else {
                System.out.println("Dr. Chaz will have " + hasil + " pieces of chicken left over!");
            }

        } else {
            hasil = b - c;
            if (hasil == 1) {
                System.out.println("Dr. Chaz needs " + hasil + " more piece of chicken!");
            } else {
                System.out.println("Dr. Chaz needs " + hasil + " more pieces of chicken!");
            }

        }
    }
}
