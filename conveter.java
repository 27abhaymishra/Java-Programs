import java.util.Scanner;

public class conveter {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the units to convert kilometer to miles  :");
       int num= sc.nextInt();
       float  miles = num *0.621371f;
       float  km = (num*1.60934f);
        System.out.println(miles);

    }
}
