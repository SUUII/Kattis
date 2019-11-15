
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
public class Grass_Seed_Inc {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        double z = 0;
        double q = a.nextDouble();
        int w = a.nextInt();
        for (int i = 0; i < w; i++) {
            double e = a.nextDouble();
            double r = a.nextDouble();
            double zxc = e * r * q;

            z += zxc;
        }
        System.out.println(z);
    }
}
