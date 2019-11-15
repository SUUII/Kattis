
import java.util.Scanner;
import javax.xml.bind.DatatypeConverter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author RERE
 */
public class pot {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int banyak = a.nextInt();
        int total = 0;
        
        for (int i = 0; i < banyak; i++) {
            int  angka = a.nextInt();
     total += Math.pow(angka/10, angka%10);
        }
        System.out.println(total);
    }

}
