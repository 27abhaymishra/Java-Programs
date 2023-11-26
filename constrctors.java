class MyMainEmployee{
    private int id;
    private String name;
    public MyMainEmployee(){
        id=0;
        name="Your_Name_Here";
    }
    public MyMainEmployee(String myName,int myId){
        id=myId;
        name= myName;

    }
    public MyMainEmployee(String myName){
        id=1;
        name= myName;

    }

    public String getName() {
        return name;
    }

    public void setId(int i) {
        this.id = i;
    }

    public void setName(String n) {
        this.name = n;
    }

    public int getId() {
        return id;
    }
}

public class constrctors {
    public static void main(String[] args) {
        MyMainEmployee Ayush =new MyMainEmployee("Ayush_Verma", 24);
//        Ayush.setId(31);
//        Ayush.setName("Java Developer");
        System.out.println(Ayush.getId());
        System.out.println(Ayush.getName());
    }
}
