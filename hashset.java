import java.util.HashSet;

public class hashset
{
    public static void main(String[] args) {
        HashSet<Integer> myHahSet= new HashSet<>(6,0.5f);
        myHahSet.add(6);
        myHahSet.add(8);
        myHahSet.add(3);
        myHahSet.add(11);
        myHahSet.add(11);
        System.out.println(myHahSet);
    }
}
