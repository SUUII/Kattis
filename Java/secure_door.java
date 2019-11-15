
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
public class secure_door {

    public static void main(String[] args) {
        ArrayList<String> qwe = new ArrayList<>();
        Scanner a = new Scanner(System.in);
        int q = a.nextInt();
        a.nextLine();
        for (int i = 0; i < q; i++) {
            String w[] = a.nextLine().split(" ");
            if (w[0].equals("entry")) {
                if (!qwe.contains(w[1])) {
                    System.out.println(w[1] + " entered");
                    qwe.add(w[1]);
                } else {
                    System.out.println(w[1] + " entered (ANOMALY)");
                }
            } else {
                if (qwe.contains(w[1])) {
                    System.out.println(w[1] + " exited");
                    qwe.remove(w[1]);
                } else {
                    System.out.println(w[1] + " exited (ANOMALY)");
                }
            }
        }
    }
}
