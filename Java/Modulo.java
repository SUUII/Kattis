
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
public class modulo {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
   ArrayList<Integer> list = new ArrayList<>();
        int counter = 0;
        for (int i = 0; i < 10; i++) {
            counter = a.nextInt()%42;
            if (!list.contains(counter)) {
                list.add(counter);
            }
        }
        System.out.println(list.size());
    }
}
