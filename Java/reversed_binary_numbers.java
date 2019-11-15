
import java.util.Scanner;

public class reversed_binary_numbers {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int q = a.nextInt();
        String hehe = Integer.toBinaryString(q);
        StringBuilder gg = new StringBuilder(hehe).reverse();
        String haha = gg.toString();
        System.out.println(Integer.parseInt(haha, 2));
    }
}
