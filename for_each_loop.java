public class for_each_loop {
    public static void main(String[] args) {
//        float [] marks ={ 98.3f,43.5f, 43.24f,43.234f,24.23f};
//        String [] students = {"Ayu","Ris","Bad"};
//        System.out.println(students.length);

        int [] marks ={54,35,45};
        //dispaying an array
        System.out.println("Printing in the naive way");
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);

        //dispaying the array(for loop)
        System.out.println("Printing using the loop");
        for (int i = 0; i <marks.length ; i++) {
            System.out.println(marks[i]);
        }

        //displaying the array in reverse order
        System.out.println("Printing using for loop in reverse order");
        for (int i = marks.length-1; i >=0 ; i--) {
            System.out.println(marks[i]);
        }

        //diplaying the array (for-each loop)
        System.out.println("Printing using for-each  loop");
        for (int element:marks) {
            System.out.println(element);
        }
    }
}
