import java.util.ArrayList;

class MyGenric<T1,T2>{
    int val;
    private T1 t1;
    private T2 t2;

    public  MyGenric(int val, T1 t1, T2 t2){
        this.val= val;
        this.t1=t1;
        this.t2= t2;

    }
    public void setT2(T2 t2){
        this.t2=t2;

    }
    public int getVal(){
        return val;

    }
    public void setVal(int val){
        this.val =val;

    }
    public T1 getT1(){
        return t1;

    }
    public void setT1(T1 t1){
        this.t1=t1;

    }
}


public class genrics {
    public static void main(String[] args) {
//        Array_List<> arrayList= new Array_List();
//
//        arrayList.add(54);
//
//        int a = (int )arrayList.get(0);
//        MyGenric<String, Integer> g1= new MyGenric(23,"MyString is my string",45);
//        String str =g1.getT1();
//        Integer int1= g2.getT2();
//        System.out.println(str+int1);

    }
}
