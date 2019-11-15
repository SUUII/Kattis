
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
public class Testing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        char b[][] = new char[5][5];
        String valid = "valid";
        int banyak = 0;
        for (int i = 0; i < 5; i++) {
            b[i] = a.nextLine().toCharArray();
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (b[i][j] == 'k') {
                    banyak++;
                    try {
                        if (b[i - 1][j - 2] == 'k') {
                            valid = "invalid";
                        }
                    } catch (Exception e) {
                    }

                    try {
                        if (b[i - 2][j - 1] == 'k') {
                            valid = "invalid";
                        }
                    } catch (Exception e) {
                    }

                    try {
                        if (b[i + 2][j + 1] == 'k') {
                            valid = "invalid";
                        }
                    } catch (Exception e) {
                    }

                    try {
                        if (b[i + 1][j + 2] == 'k') {
                            valid = "invalid";
                        }
                    } catch (Exception e) {

                    }

                    try {
                        if (b[i + 2][j - 1] == 'k') {
                            valid = "invalid";
                        }
                    } catch (Exception e) {
                    }

                    try {
                        if (b[i - 2][j + 1] == 'k') {
                            valid = "invalid";
                        }
                    } catch (Exception e) {

                    }

                    try {
                        if (b[i + 1][j - 2] == 'k') {
                            valid = "invalid";
                        }
                    } catch (Exception e) {

                    }

                    try {
                        if (b[i - 1][j + 2] == 'k') {
                            valid = "invalid";
                        }
                    } catch (Exception e) {
                    }
                }
            }
        }if (banyak != 9) {
            valid = "invalid";
        }
        System.out.println(valid);
    }
}
