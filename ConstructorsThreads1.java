//class Thread {
//    public Thread(String name){
//
//    }
//}

class MyThr extends  Thread{
    public MyThr(String name){
//        super(name);
    }
    public void run(){
        int i=34;
        System.out.println("Thank You");
    }
}


public class ConstructorsThreads1 {
    public static void main(String[] args) {
        MyThr t1= new MyThr("Ayush");
        MyThr t2= new MyThr("Ravi");
//        t1.start();
//        t2.start();
    }
}
