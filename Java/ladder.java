
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
public class ladder {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int q = a.nextInt();
        int e = a.nextInt();

        int tinggi = (int) Math.ceil(q / Math.sin(Math.toRadians(e)));
        System.out.println(tinggi);
    }
}
