
import java.util.ArrayList;
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
 * @author RERE
 */
public class icpcawards_fail {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int q = a.nextInt();
        String gggg[] = new String[q];
        String ggwp[] = new String[q];
        String ggwpwp[] = new String[q];
        ArrayList<String> list = new ArrayList<>();
        HashMap<String,String> ulti = new HashMap<>();
        for (int i = 0; i < q; i++) {
            gggg[i] = a.next();
            ggwp[i] = a.next();
        if (!list.contains(gggg[i])) {
           list.add(gggg[i]);
           ulti.put(gggg[i], ggwp[i]);
        }
}
        for (int i = 0; i < 12; i++) {
            System.out.print(list.get(i)+" ");
            System.out.println(ulti.get(list.get(i)));
        }
    }

}
