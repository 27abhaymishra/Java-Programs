import java.util.Scanner;

public class Handling_Exception {
    public static void main(String[] args) {
        int[] marks =new int[3];
        marks[0]= 7;
        marks[1]=233;
        marks[2]= 2;
        Scanner sc =new Scanner(System.in);
       boolean flag=true;
       while (flag){
           System.out.println("Enter the value of index");
       }

//        int ind =sc.nextInt();
//       try {
//            System.out.println("welcome to the code ");
//            try {
//                System.out.println(marks[ind]);
//                flag = false;
//            } catch (ArrayIndexOutOfBoundsException e) {
//                System.out.println("Sorry this index does not exits");
//                System.out.println("Exception level 2");
//            } catch (Exception e) {
//                System.out.println("Exception level 1");
//            }
//        }
    }
}
