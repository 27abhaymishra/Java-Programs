import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.util.Scanner;

public class file_handling {
    public static void main(String[] args) {
        //code to create a new file

//        File myFile= new File("Thid.txt");
//        try{
//            myFile.createNewFile();
//
//        }
//        catch(IOException e){
//            System.out.println("Unable to crate thid file ");
//            e.printStackTrace();


        //Code to write in a file
//        try {
//            FileWriter fileWriter= new FileWriter("this.txt");
//            fileWriter.write("This is our first file from this java course\n okay now bye");
//        fileWriter.close();
//
//        }catch (IOException e){
//            e.printStackTrace();
//        }

        //Reading a file
//        File myFile= new File("this.txt");
//        try {
//            Scanner sc= new Scanner(myFile);
//            while (sc.hasNextLine()){
//                String line= sc.nextLine();
//                System.out.println(line);
//
//            }
//            sc.close();
//        }
//        catch (FileNotFoundException e){
//            e.printStackTrace();
//        }
//    Delting a file
        File myFile = new File("this.txt");
        if (myFile.delete()){
            System.out.println("I have deleted :"+ myFile.getName());

        }
        else {
            System.out.println("some problem occured while deleting the file ");
        }
    }
}
