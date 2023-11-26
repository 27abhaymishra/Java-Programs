import java.util.Scanner;

public class eroor_demo {
    public static void main(String[] args) {
        for (int i = 1; i <5 ; i++) {
            System.out.println(2*i+1);
        }

        Scanner sc =new Scanner(System.in);
        int k = sc.nextInt();
        System.out.println("Integer part of 1000 divided by k is " + 1000/k);
    }
}
