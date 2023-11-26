class InvalidInputException extends Exception{
    @Override
    public String toString(){
        return  "Cannot add 8 and 9";
    }
    @Override
    public String getMessage(){
        return "I am getMessage()";

    }
        }
class MaxInputException extends Exception{
    @Override
    public String toString(){
        return "Input cant be greater than 100000";
    }
    @Override
    public String getMessage(){
        return "I am getMessage()";
    }
}
class  CannotDivideByZeroException extends  Exception{
    @Override
    public String toString(){
        return "Cannot divide by 0";

    }
    @Override
    public String getMessage(){
        return "I am getMessage()";
    }
}

class MaxMultiplyInputException extends Exception{
    @Override
    public String toString(){
        return "Input cant be grater than 7000 while multiplying";

    }
    @Override
    public String getMessage(){
        return "I am getMessage()";
    }
}
class CustomCalculator{
    double add(double a, double b )throws InvalidInputException,MaxInputException{
        if (a>=100000||b>100000){
            throw new InvalidInputException();
        }
        return  a+b;

    }
    double subtract (double a ,double b) throws MaxInputException{
        if (a>=100000||b>100000){
            throw new MaxInputException();
        }
        return  a-b;
    }
    double mutiply (double a, double b) throws MaxInputException, MaxMultiplyInputException{
        if (a>=100000||b>100000){
            throw new MaxInputException();
        }
        else if (a>7000|| b>7000){
            throw new MaxMultiplyInputException();
        }
        return  a*b;
    }
    double divide(double a, double b)throws CannotDivideByZeroException,MaxMultiplyInputException{
//        if (a>100000|| b>100000){
//            throw new MaxInputException();
//        }
        if (b==0){
            throw new CannotDivideByZeroException();
        }
        return a/b;
    }
}
public class CustomCalculator1 {
    public static void main(String[] args)  throws InvalidInputException,CannotDivideByZeroException,MaxMultiplyInputException,MaxInputException{
CustomCalculator c = new CustomCalculator();
//c.add(8,9);
        c.divide(6,0);
        c.subtract(534323,534525);
        c.mutiply(5000000,999);
    }
}
