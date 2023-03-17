package edu.sulima;

public class Task3 {
    public static Integer digital_root(Integer n){
        Integer sum = 0;
        while(n != 0){
            sum += n % 10;
            n /= 10;
        }
        if (sum < 10){
            return sum;
        }
        return digital_root(sum);
    }
}
