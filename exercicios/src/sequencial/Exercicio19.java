package sequencial;

import java.util.ArrayList;
import java.util.List;

public class Exercicio19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arr = new ArrayList<>();
	    
		Long min = 0L, max = 0L, sum = 0L;

		for (int i = 0; i < 5; i++) {
	
			arr.add(i+1);
		}
        
        for(int i = 0; i < arr.size(); i++){
            for(int j = 0; j < arr.size(); j++){
                sum += arr.get(j);
            }
            sum -= arr.get(i);
            
            if (i == 0){
                min= sum;
                max = sum;  
            } else {
                if (sum > max){
                    max = sum;
                } else if (sum < min){
                    min = sum;
                }
            } 
            sum = 0L;
        }
        System.out.println(min + " " + max);
	}

}
/* Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers. Then print the respective minimum and maximum values as a single line of two space-separated long integers.

Example

The minimum sum is  and the maximum sum is . The function prints

16 24
Function Description

Complete the  function with the following parameter(s):

: an array of  integers
Print

Print two space-separated integers on one line: the minimum sum and the maximum sum of  of  elements.No value should be returned.

Note For some languages, like C, C++, and Java, the sums may require that you use a long integer due to their size.

Input Format

A single line of five space-separated integers.

Constraints


Sample Input

1 2 3 4 5
Sample Output

10 14
Explanation

The numbers are , , , , and . Calculate the following sums using four of the five integers:

Sum everything except , the sum is .
Sum everything except , the sum is .
Sum everything except , the sum is .
Sum everything except , the sum is .
Sum everything except , the sum is .
Hints: Beware of integer overflow! Use a 64-bit integer to store the sums.

*/