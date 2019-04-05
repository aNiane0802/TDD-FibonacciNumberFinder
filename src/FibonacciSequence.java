import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class FibonacciSequence {

    private Map<Integer, BigInteger> computedNumbers = new HashMap<>();

    public BigInteger numberAtOrder(int order) {
        if(order==2)
            return BigInteger.valueOf(1);
        if(order>2)
            return fetchOrCalculateNumberAtOrder(order-2).add(fetchOrCalculateNumberAtOrder(order-1));
        return BigInteger.valueOf(order);
    }

    public BigInteger fetchOrCalculateNumberAtOrder(int order){
        if(computedNumbers.containsKey(order))
            return computedNumbers.get(order) ;
        else{
            BigInteger numberAtOrder = numberAtOrder(order) ;
            removePreviousComputedFibonacciNumbers(order) ;
            computedNumbers.put(order,numberAtOrder);
            return numberAtOrder;
        }
    }

    private void removePreviousComputedFibonacciNumbers(int order) {
        if(order>2)
            computedNumbers.remove(order-3) ;
    }

    public int numberOfDigits(BigInteger number) {
        return String.valueOf(number).length();
    }

    public BigInteger firstNumberWith(int numberOfDigits) {
        int order=0;
        while(true){
            BigInteger fibonacciNumberAtOrder = fetchOrCalculateNumberAtOrder(order);
            if(numberOfDigits(fibonacciNumberAtOrder)==numberOfDigits){
                System.out.println(order);
                return fibonacciNumberAtOrder;
            }
            order++;
        }
    }
}
