public class DataTypes {
    public static void main(String[] args) 
    {
        // Primitive Data Types
        int SmallIntegers = 10;
        float smatllDecimalNumbers = 20.55465f;
        double LargeDecimalNumbers = 30.5648643513515;
        long LargeIntegers = 1000000654564560L;
        char letter = 'A';
        boolean check = true;

        //Wrapper Class
        Integer smallIntegers = 135465;
        System.out.println(smallIntegers.byteValue());

        System.out.println(smallIntegers.shortValue());
        System.out.println(smallIntegers.intValue());
        System.out.println(smallIntegers.longValue());
        System.out.println(smallIntegers.floatValue());
        System.out.println(smallIntegers.doubleValue());




        // Autoboxing and Unboxing
        int x = 10;

        Integer obj = x; // Autoboxing

        int y = obj;     // Unboxing

        // Java automatically converts between int and Integer.
    }
}
