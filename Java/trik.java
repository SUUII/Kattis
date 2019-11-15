
import java.util.Arrays;
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
public class trik {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int[] pos = {1, 0, 0};
        int akhir = 0;
        char[] haha = a.next().toCharArray();
        for (int i = 0; i < haha.length; i++) {
            if (haha[i] == 'A') {
                if (pos[0] == 1) {
                    pos[0] = 0;
                    pos[1] = 1;
                    akhir = 2;
                } else if (pos[1] == 1) {
                    pos[0] = 1;
                    pos[1] = 0;
                    akhir = 1;
                }
            } else if (haha[i] == 'B') {
                if (pos[2] == 1) {
                    pos[2] = 0;
                    pos[1] = 1;
                    akhir = 2;
                } else if (pos[1] == 1) {
                    pos[2] = 1;
                    pos[1] = 0;
                    akhir = 3;
                }
            } else if (haha[i] == 'C') {
                if (pos[2] == 1) {
                    pos[0] = 1;
                    pos[2] = 0;
                    akhir = 1;
                } else if (pos[0] == 1) {
                    pos[2] = 1;
                    pos[0] = 0;
                    akhir = 3;
                }
            }
        }
        System.out.println(akhir);
    }
}
