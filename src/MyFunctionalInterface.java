public interface MyFunctionalInterface {

    void m1();

    default void m2(){
        System.out.println("method 2 ==");
    }

    default void m3(){
        System.out.println("method 4 ==");
    }
    static void m4(){
        System.out.println("method 1");
    }
}
