package primitiveDataTYpes;

public class dataTypes {
    public static void main(String[] args) {
        //Difference between the float and double is Precision of Assigned value
        int myValue = 10000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        byte byteValue = 10;
        short shortValue = 20;
        int intValue = 50;
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("float Minimum Value = " + myMinFloatValue);
        System.out.println("float Maximum Value = " + myMaxFloatValue);
        float myFloatValue = (float)5.25;
        double myDoubleValue = 5.20;
        System.out.println(myFloatValue);
        System.out.println(myDoubleValue);
        int myIntValue = 5;
        float myFloatValue1 = 5f;
        double myDoubleValue1 = 5d;

        //Converting Pounds to Kilograms
        double noOfPound = 200d;
        double convertedKg = noOfPound * 0.45359237f;

        System.out.println(convertedKg);

        //Char and Boolean data type
        char MyChar = '\u0069';
        System.out.println(MyChar);

        boolean isCustomerIsOverTwentyOne = true;




    }

}
