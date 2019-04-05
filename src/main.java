import java.sql.Time;

public class main {
    public static void main(String[] args){
        FibonacciSequence fibonacciSequence = new FibonacciSequence();
        long start = System.currentTimeMillis();
        System.out.println("First Fibonnaci number With more than a 1000 digits: "+
                fibonacciSequence.firstNumberWith(1001));
        long end = System.currentTimeMillis();
        long elapsedTime = end-start ;
        System.out.println(elapsedTime +" ms");
    }
}
