class Base1{
    Base1(){
        System.out.println("I am a construtor");
    }
    Base1(int x){
        System.out.println("I am overloaded construtor with value of x as :" +x );
    }
}
class Derived1 extends Base1{
    Derived1(){
        super(0);
        System.out.println("I am an overloaded construtor of Derived ");
    }
    Derived1(int x,int y ){
        super(x);
        System.out.println("I am an overloaded constrrutor of Derived with the value of y as :"+ y);
    }
}
class ChildofDerived1 extends Derived1{
    ChildofDerived1(){
        System.out.println("I am a child of derived derived construtor");
    }
    ChildofDerived1(int x, int y ,int z){
        super(x,y);
        System.out.println("I am overloaded cosntructor of Derived with the value of z is:"+z);
    }
}
public class Constructors {
    public static void main(String[] args) {
//        Base1 a=new Base1(34);
//Derived1 d= new Derived1();
//Derived1 d11= new Derived1(2,34);
//ChildofDerived1 cd= new ChildofDerived1();
ChildofDerived1 cd= new ChildofDerived1(1,3,32);
    }
}
