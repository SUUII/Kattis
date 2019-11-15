
import java.util.ArrayList;
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
public class free_food {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int q = a.nextInt();
        ArrayList<Integer> qwe = new ArrayList<>();
        for (int i = 0; i < q; i++) {
            int w = a.nextInt();
            int e = a.nextInt();
            for (int j = w; j <= e; j++) {
                if(!qwe.contains(j)){
                    qwe.add(j);
                }
            }
        }
        System.out.println(qwe.size());
    }
}
