
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
public class NewClass {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        char b[][] = new char[8][8];
        String valid = "valid";
        int banyak = 0;
        for (int i = 0; i < 8; i++) {
            b[i] = a.nextLine().toCharArray();
        }
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (b[i][j] == '*') {
                    banyak++;
                    for (int o = j + 1; o < 8; o++) {
                        if (b[i][o] == '*') {
                            valid = "invalid";
                            break;
                        }
                    }
                    for (int o = i + 1; o < 8; o++) {
                        if (b[o][j] == '*') {
                            valid = "invalid";
                            break;
                        }
                    }
                    try {
                        for (int l = 1; l <= 8; l++) {
                            if (b[i + l][j + l] == '*') {
                                valid = "invalid";
                                break;
                            }
                        }
                    } catch (Exception e) {
                    }
                    try {
                        for (int l = 1; l <= 8; l++) {
                            if (b[i + l][j - l] == '*') {
                                valid = "invalid";
                                break;
                            }
                        }
                    } catch (Exception e) {
                    }
                }
            }
        }
        if (banyak!=8) {
            valid = "invalid";
        }
        System.out.println(valid);
    }
}
