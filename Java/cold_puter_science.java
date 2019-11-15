
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
public class cold_puter_science {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
    int ha = a.nextInt();
    int hasil = 0;
        for (int i = 0; i < ha; i++) {
            int haha = a.nextInt();
            if (haha<0) {
                hasil++;
            }
        }
        System.out.println(hasil);
    }
}
