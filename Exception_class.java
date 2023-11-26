import java.util.Scanner;

class MyExcwption extends  Exception{
    @Override
    public  String toString(){
        return "I am toString()";
    }
    @Override
    public String getMessage(){
        return "I am getMessage()";

    }
}
class MaxAgeException extends Exception{
    @Override
    public String toString(){
        return "Age cannot be greater than 125";
    }
    @Override
    public  String getMessage(){
        return "Make sure that the value of the age entered is correct";
    }
}
public class Exception_class {
    public static void main(String[] args) {
        int a;
        Scanner sc= new Scanner(System.in);
        a= sc.nextInt();
        if(a<9){
            try {
                // throw my Exception
throw  new ArithmeticException("This is an Exception ");
            }
            catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                e.printStackTrace();
                System.out.println("Finished");
            }
            System.out.println("Yes Finished!");
        }
    }
}
