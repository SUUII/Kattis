
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
public class planina {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int kodok = a.nextInt();
        int ha = (int) Math.pow(2, kodok) + 1;
        System.out.println(ha * ha);
    }
}
