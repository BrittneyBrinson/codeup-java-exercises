import static java.lang.Integer.parseInt;
public class MethodsExercises {
    public static int basicAddition(int x, int y){
        return  x + y;
    }
    public static int basicSubtraction(int x , int y){
        return x - y;
    }
    public static int basicMultiplication(int x , int y){
        return x * y;
    }
    public static int basicDiv(int x, int y){
        return x / y;
    }
    public static int modulo(int x , int y){
        return x % y;
    }
    public static void main(String[] args) {
        System.out.println(basicAddition(3,5));

        System.out.println(basicSubtraction(12,6));

        System.out.println(basicMultiplication(9,10));


    }
}

