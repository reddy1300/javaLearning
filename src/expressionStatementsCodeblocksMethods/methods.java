package expressionStatementsCodeblocksMethods;

public class methods {
    /* Method with an integer return type and no arguments */
    public int CompareNum(int initialValue, int secondValue)    {
        int x = initialValue;
        int y = secondValue;
        System.out.println("x = " + x + "\ny = " + y);
        if(x>y)
            return x;
        else
            return y;
    }

    /* Driver Code */
    public static void main(String ar[])
    {
        methods obj = new methods();
        int result = obj.CompareNum(4,10);
        System.out.println("The greater number among x and y is: " + result);
    }
}
