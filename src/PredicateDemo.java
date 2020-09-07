import javax.crypto.spec.PSource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PredicateDemo implements Predicate<Integer> {
    @Override
    public boolean test(Integer t) {
        if(t%2==0)
            return true;
        else
        return false;
    }

    public static void main(String[] args) {
       // Predicate<Integer>predicate=new PredicateDemo();
       // predicate.test(4);


        Predicate<Integer>predicate=  ( t)-> {
            if(t%2==0)
                return true;
            else
                return false;
        };

        Predicate<Integer>predicate1=t-> t%2==0;
        System.out.println(predicate1.test(5));


        ArrayList<String> list1 = new ArrayList<>();
        list1.add("One");
        list1.add("OneAndOnly");
        list1.add("Derek");
        list1.add("Change");
        list1.add("factory");
        list1.add("justBefore");
        list1.add("Italy");
        list1.add("Italy");
        list1.add("Thursday");
        list1.add("");
        list1.add("");


        //filter in stream api is predicate
        Stream<String> stream=list1.stream().filter(ele->!ele.contains("d"));
        System.out.println(stream);

        stream.forEach(e->{
            System.out.println("e= >"+e);
        });


        List<Integer> list=Arrays.asList(1,2,3,5,6);
            list.stream().filter(t->t%2==0).forEach(e-> System.out.println(" nums is "+ e));

        List<Integer>collect=list.stream().filter(t->t%2==0).collect(Collectors.toList());
        System.out.println("collect "+collect);

        boolean collect1=list.stream().anyMatch(t->t==3);
        System.out.println("is t present =" + collect1);

    }
}
