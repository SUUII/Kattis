
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
public class testing3 {

    public static int coba() {
        Scanner a = new Scanner(System.in);
        int b = a.nextInt();
        
        while (b != -1) {
            
            int jam = 0;
            int hasil = 0;
            for (int i = 0; i < b; i++) {
               int miles2 = a.nextInt();
               int jam2 = a.nextInt();
                hasil += miles2*(jam2-jam);
                jam =jam2;
            }
            System.out.println(hasil + " miles");
            b = a.nextInt();
        }
        return 0;
    }


    public static void main(String[] args) {
        coba();
    }
}
