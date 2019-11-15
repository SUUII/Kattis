
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
public class ive_been_everywhere_man {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int banyak = a.nextInt();
        for (int i = 0; i < banyak; i++) {
            int banyak2 = a.nextInt();
            ArrayList<String> ha = new ArrayList<>();
            for (int j = 0; j < banyak2; j++) {
                String nama = a.next();
                if (!ha.contains(nama)) {
                    ha.add(nama);
                }
            }
            System.out.println(ha.size());
        }
    }
}
