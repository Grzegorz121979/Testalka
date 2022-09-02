public class Main {

    public static void main(String[] args) {

        int primitive = 100;
         // boxing

       // Integer reference = Integer.valueOf(primitive);

        // unboxing

       // int anotherPrimitive = reference.intValue();

        //auto-boxing
        Integer reference = primitive;
        //auto-unboxing
        int anotherPrimitive = reference;
    }
}
