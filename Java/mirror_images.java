
import java.util.ArrayList;
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
public class mirror_images {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int q = a.nextInt();

        for (int k = 0; k < q; k++) {
            System.out.println("TEST "+(k+1));
            int w = a.nextInt();
            int e = a.nextInt();
            ArrayList<String> ewq = new ArrayList<>();
            for (int i = 0; i < w; i++) {
                String qwe = new StringBuilder(a.next()).reverse().toString();
                ewq.add(0, qwe);
            }
            for (int i = 0; i < ewq.size(); i++) {
                System.out.println(ewq.get(i));
            }
        }

    }
}
