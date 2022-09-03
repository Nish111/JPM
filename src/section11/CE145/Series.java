package section11.CE145;

public class Series {
    public static long nSum(int n){
        long sum = 0;
        for(int i=1; i<=n; i++){
            sum+=i;
        }
        // return (n * (n + 1)) /2;
        return sum;
    }
    public static long factorial(int n){
        long product = 1; // 0! is 1 and we are returning 1 for it
        // for 1 to n we are calculating
        for(int i=1; i<=n; i++){
            product*=i;
        }
        return product;
    }
    public static long fibonacci(int n){
        long first = 0;
        long second = 1;
        long nth = 0;
        if(n==0){
            return first;
        }
        else if(n==1){
            return second;
        } else {
            for(int i=1; i<n; i++){
                nth = second + first;
                first = second;
                second = nth;
            }
        }
        return nth;
    }
    /*
    package com.timbuchalka.mylibrary;

    public class Series {

        public static long nSum(int n) {
            return (n * (n + 1)) /2;
        }

        public static long factorial(int n) {
            if(n == 0) {
                return 1;
            }
            long fact = 1;
            for (int i=1; i <= n; i++) {
                fact *= i;
            }

            return fact;
        }

        public static long fibonacci(int n) {
            if(n == 0) {
                return 0;
            } else if(n == 1) {
                return 1;
            }
            long nMinus1 = 1;
            long nMinus2 = 0;
            long fib = 0;
            for(int i= 1; i<n; i++) {
                fib = (nMinus2 + nMinus1);
                nMinus2 = nMinus1;
                nMinus1 = fib;
            }
            return fib;
        }
    }

     */
}
