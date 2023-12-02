package src.main.java;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Logger;

/**
 * Given an array of integers, calculate the ratios of its elements that are positive, negative, and zero. Print the decimal value of each fraction on a new line with  places after the decimal.
 *
 * Note: This challenge introduces precision problems. The test cases are scaled to six decimal places, though answers with absolute error of up to  are acceptable.
 *
 * Example
 *
 * There are  elements, two positive, two negative and one zero. Their ratios are ,  and . Results are printed as:
 *
 * 0.400000
 * 0.400000
 * 0.200000
 *
 * There are  positive numbers,  negative numbers, and  zero in the array.
 * The proportions of occurrence are positive: , negative:  and zeros: .
 *
 * Language
 * @author pankaj rana
 */
public class PlusMinus {
    static Logger logger = Logger.getLogger("INFO");
    public static void plusMinus(List<Integer> arr) {
        if(!arr.isEmpty()  && arr.size() <= 100){
            int size= arr.size();
            AtomicInteger countPlus = new AtomicInteger();
            AtomicInteger countMinus = new AtomicInteger();
            AtomicInteger countZero = new AtomicInteger();
            arr.forEach(e->{
                if(e > 0 ) {
                    countPlus.getAndIncrement();
                }
               else if(e < 0 ) {
                    countMinus.getAndIncrement();
                }
                else{
                    countZero.getAndIncrement();
                }
            });
            logger.info(String.format("%f",countPlus.doubleValue()/size ));
            logger.info(String.format("%f",countMinus.doubleValue()/size ));
            logger.info(String.format("%f",countZero.doubleValue()/size ));
        }
    }

    public static void main(String[] args) {
        plusMinus(Arrays.asList(-4 ,3 ,-9, 0, 4, 1));
    }
}
