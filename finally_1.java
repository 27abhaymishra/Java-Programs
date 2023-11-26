public class finally_1 {
    public static int greet(){
        try {
            int a = 50;
            int b=10;
            int c=a/b;
            return c;

        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("Cleanming up the resoureces.... This is the end of this function");
        }
        return -1;
    }

    public static void main(String[] args) {
        int k = greet();
        System.out.println(k);
        int a=6;
        int b=2;
        while (true){
            try {
                System.out.println(a/b);
            }
            catch (Exception e){
                System.out.println(e);
                break;
            }
            finally {
                System.out.println("I am finally for the value of b=" +b);
            }
            b--;

        }
        try {
            System.out.println(50/3);
        }
        finally {
            System.out.println("Yes this is a finally");
        }
    }
}
