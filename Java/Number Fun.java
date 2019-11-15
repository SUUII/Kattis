
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
        int z = a.nextInt();
        for (int i = 0; i < z; i++) {
            boolean cek = false;
            Double q = a.nextDouble();
            Double w = a.nextDouble();
            Double e = a.nextDouble();
            cek = (q + w == e);
            if (q + w == e) {
                cek = true;
            } else if (q - w == e) {
                cek = true;
            } else if (q * w == e) {
                cek = true;
            } else if (q / w == e) {
                cek = true;
            } else if (w + q == e) {
                cek = true;
            } else if (w - q == e) {
                cek = true;
            } else if (w * q == e) {
                cek = true;
            } else if (w / q == e) {
                cek = true;
            }
            if (cek) {
                System.out.println("Possible");
            } else {
                System.out.println("Impossible");
            }
        }
    }
}
