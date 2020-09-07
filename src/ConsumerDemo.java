import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class ConsumerDemo {
//    @Override
//    public void accept(Integer t) {
//        System.out.println("printing T "+t);
//    }

    public static void main(String[] args) {
        System.out.println();
        ConsumerDemo consumerDemo=new ConsumerDemo();
        Consumer<Integer> consumer=t-> System.out.println("printing t :"+t);
        consumer.accept(5);


        List<Integer>list= Arrays.asList(1,2,3,4,5);

        list.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });

        list.forEach((Integer integer)  ->
                System.out.println(integer)
        );

        list.forEach((integer)  ->
                System.out.println(integer)
        );

        list.forEach((integer)  -> System.out.println(integer));
        list.forEach(integer  -> System.out.println(integer));

        list.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);//step 1
                String str = fun(integer);
                System.out.println("str => "+str);
                System.out.println("hello");//step 2
            }
        });

        list.forEach((it) -> {
            System.out.println(it);
            System.out.println("hello");
        });

        HashMap<String, Integer> hash_map = new HashMap<String, Integer>();
        hash_map.put("Geeks", 10);
        hash_map.put("4", 15);
        hash_map.put("Geeks", 20);
        hash_map.put("Welcomes", 25);
        hash_map.put("You", 30);
        Set<Map.Entry<String, Integer>> entrySet = hash_map.entrySet();


        hash_map.entrySet().stream().forEach(e-> System.out.println(e.getKey()+" : "+ e.getValue()));






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

        Stream<String>stream=list1.stream().filter(ele->!ele.contains("d"));
        System.out.println(stream);

        stream.forEach(e->{
            System.out.println("e= >"+e);
        });
    }

    public static String fun(Integer i) {
        int i1 = i + 10;
        return String.valueOf(i1);

    }





}
