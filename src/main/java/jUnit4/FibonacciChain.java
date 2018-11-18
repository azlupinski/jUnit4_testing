package jUnit4;

public class FibonacciChain {

    public int calculate(int n){
        if(n < 0){
            throw new UnsupportedOperationException();
        } else if (n == 0){
            return 0;
        }
        else if(n == 1){
            return 1;
        }else{
            return calculate(n-1 )+ calculate(n-2);
        }
    }


}
