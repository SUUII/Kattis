
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
public class Faktor {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int v = a.nextInt();
        int q = a.nextInt();
        int hasil = ((v*q)-v)+1;
        System.out.println(hasil);
    }
}
