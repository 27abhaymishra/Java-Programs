public class continue_and_break {
    public static void main(String[] args) {
        //break statement
        for (int i = 10; i >0 ; i--) {
            if (i==7){
                break;
            }
            System.out.println(i);
        }

        //continue statement
        for (int i = 7; i >0 ; i--) {
            if (i==3){
                continue;
            }
            System.out.println(i);
        }
    }
}
