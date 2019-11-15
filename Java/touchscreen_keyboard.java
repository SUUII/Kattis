
import java.util.Arrays;
import java.util.HashMap;
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
public class touchscreen_keyboard {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        HashMap<Character,Integer> x = new HashMap<>();
        HashMap<Character,Integer> y = new HashMap<>();
        x.put('q', 0);y.put('q', 0);
        x.put('w', 1);y.put('w', 0);
        x.put('e', 2);y.put('e', 0);
        x.put('r', 3);y.put('r', 0);
        x.put('t', 4);y.put('t', 0);
        x.put('y', 5);y.put('y', 0);
        x.put('u', 6);y.put('u', 0);
        x.put('i', 7);y.put('i', 0);
        x.put('o', 8);y.put('o', 0);
        x.put('p', 9);y.put('p', 0);
        
        x.put('a', 0);y.put('a', 1);
        x.put('s', 1);y.put('s', 1);
        x.put('d', 2);y.put('d', 1);
        x.put('f', 3);y.put('f', 1);
        x.put('g', 4);y.put('g', 1);
        x.put('h', 5);y.put('h', 1);
        x.put('j', 6);y.put('j', 1);
        x.put('k', 7);y.put('k', 1);
        x.put('l', 8);y.put('l', 1);
       
        x.put('z', 0);y.put('z', 2);
        x.put('x', 1);y.put('x', 2);
        x.put('c', 2);y.put('c', 2);
        x.put('v', 3);y.put('v', 2);
        x.put('b', 4);y.put('b', 2);
        x.put('n', 5);y.put('n', 2);
        x.put('m', 6);y.put('m', 2);
        int q = a.nextInt();
        for (int i = 0; i < q; i++) {
                  String w = a.next();
            int qwe[][] = new int[w.length()][2];
            for (int j = 0; j < w.length(); j++) {
                qwe[j][0] = x.get(w.charAt(j));
                qwe[j][1] = y.get(w.charAt(j));
            }
            int e = a.nextInt();
            String ingat[] = new String[e];
            for (int j = 0; j < e; j++) {
                ingat[j] = a.next();
                int total = 0;
                for (int k = 0; k < ingat[j].length(); k++) {
                    total += Math.abs(qwe[k][0]-x.get(ingat[j].charAt(k)));
                    total += Math.abs(qwe[k][1]-y.get(ingat[j].charAt(k)));
                }
                ingat[j] += " "+Integer.toString(total);
            }
            Arrays.sort(ingat, (z, c) -> {
                int b = Integer.parseInt(z.split(" ")[1]);
                int n = Integer.parseInt(c.split(" ")[1]);
                return b == n ? z.compareTo(c) : b - n;
            });
            for (int j = 0; j < e; j++) {
                System.out.println(ingat[j]);
            }
        }
        
    }
}
