
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 672017066
 */
public class NewClass {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        String line;
        while (a.hasNextLine()) {
            line = a.nextLine();
            if (line.equals("B")) {
                break;
            }
            
            for (String kodok : line.split(" ")) {
                list.add(kodok);
            }
        }

                Set<String> set = new HashSet<>();
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                String hehe = list.get(i) + list.get(j);
                if (i!=j) {
                    set.add(hehe);
                }
            }
        }
        String[] arr = set.toArray(new String[set.size()]);
        Arrays.sort(arr);
        for (String bebek : arr) {
            System.out.println(bebek);
        }
    }
}
