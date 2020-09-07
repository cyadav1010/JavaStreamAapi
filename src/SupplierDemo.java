import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo implements  Supplier<String> {

    @Override
    public String get() {
        return "Hi dustin her code red";
    }

    public static void main(String[] args) {
        Supplier<String>supplier=new SupplierDemo();
        System.out.println(supplier.get());

        //used in  return some meaning ful data or dummy data
        Supplier<String>supplier1= ()->"Hi dustin her code red :::";
        System.out.println(supplier1.get());

        List<String>list1= Arrays.asList();
        System.out.println(list1.stream().findAny().orElseGet(()->"Hi dustinbun"));
    }
}
