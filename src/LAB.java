//var 10
import java.util.Scanner;

public class LAB {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number");
        double num=in.nextDouble();
        double x1 = 1;
        double x2 = 1;
        for(int i = 0; i <= 64; i++) {
            if ((i % 2) ==1 ){
                x1 *= (num - i);
            }
            else {
                x2 *= (num - i);
            }
            }
        System.out.println("Ответ: " + (x1/x2) );
        in.close();
    }
}

