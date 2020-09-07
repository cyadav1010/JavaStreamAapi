
interface Calculator{
    void switchOn();
}

public class CalulatorImp implements  Calculator{

    @Override
    public void switchOn() {
        System.out.println("switch on");
    }

    public static void main(String[] args) {
        //Calcutor calcutor= ()->System.out.println("switch on");
        Calculator calcutor=new CalulatorImp();
        calcutor.switchOn();

    }
}


//with lambda expression
class CalculatorHelper{
    public static void main(String[] args) {
        Calculator calculator=()-> System.out.println("switch on");
        calculator.switchOn();
        CalculatorExp calculatorExp=(t)-> System.out.println("sum "+ t);
        calculatorExp.sum(5);
    }
}


interface  CalculatorExp{
    void sum(int num);
}