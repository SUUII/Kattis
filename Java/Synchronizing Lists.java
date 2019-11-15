
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
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
public class NewClass2 {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int kodok = a.nextInt();
        while (kodok != 0) {
            HashMap<Integer, Integer> bebek = new HashMap<>();
            ArrayList<Integer> q = new ArrayList<>();
            ArrayList<Integer> w = new ArrayList<>();
            ArrayList<Integer> e = new ArrayList<>();
            ArrayList<Integer> r = new ArrayList<>();
            for (int i = 0; i < kodok; i++) {
                int ayam = a.nextInt();
                q.add(ayam);
                e.add(ayam);
            }
            for (int i = 0; i < kodok; i++) {
                int ayam2 = a.nextInt();
                w.add(ayam2);
                r.add(ayam2);
            }

            Collections.sort(e);
            Collections.sort(r);

            for (int i = 0; i < e.size(); i++) {
                bebek.put(e.get(i), r.get(i));
            }
            for (int i = 0; i < q.size(); i++) {
                System.out.println(bebek.get(q.get(i)));
            }
            kodok = a.nextInt();
            System.out.println("");
        }

    }
}
