package sequencial;

import java.util.ArrayList;
import java.util.List;

public class Exercicio20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> arr = new ArrayList<>();
		List <Integer> linha1 = new ArrayList<>();
		List <Integer> linha2 = new ArrayList<>();
		List <Integer> linha3 = new ArrayList<>();
		int tamanho;
		
		int diagonal1 =0, diagonal2 = 0, diferenca;
		
		/*linha1.add(1);
		linha1.add(2);
		linha1.add(3);
		
		linha2.add(4);
		linha2.add(5);
		linha2.add(6);
		
		linha3.add(9);
		linha3.add(8);
		linha3.add(9);*/
		
		linha1.add(11);
		linha1.add(2);
		linha1.add(4);
		
		linha2.add(4);
		linha2.add(5);
		linha2.add(6);
		
		linha3.add(10);
		linha3.add(8);
		linha3.add(-12);
		
		arr.add(linha1);
		arr.add(linha2);
		arr.add(linha3);
		
		for(List item : arr) {
			
			System.out.println(item);
		}
		
		System.out.println("-----");
		for(int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
			
				diagonal1 += arr.get(i).get(i);
				tamanho = arr.get(i).size();
				diagonal2 += arr.get(i).get(tamanho-1-i);

		}
		
		diferenca = Math.abs(diagonal1 - diagonal2);
		
		System.out.println("\n" + diferenca);
		System.out.println("\n" + arr);
		System.out.println("\n" + arr.size());
	}

}

/*
 Given a square matrix, calculate the absolute difference between the sums of its diagonals.

For example, the square matrix  is shown below:

1 2 3
4 5 6
9 8 9  
The left-to-right diagonal = .
The right-to-left diagonal = .
Their absolute difference is .

Function description

Complete the  function with the following parameter:

: a 2-D array of integers
Return

: the absolute difference in sums along the diagonals
Input Format

The first line contains a single integer, , the number of rows and columns in the square matrix .
Each of the next  lines describes a row, , and consists of  space-separated integers .

Constraints

Sample Input

STDIN      Function
-----      --------
3           arr[][] sizes n = 3, m = 3
11 2 4     arr = [[11, 2, 4], [4, 5, 6], [10, 8, -12]]
4 5 6
10 8 -12
Sample Output

15
Explanation

The primary diagonal is:

11
   5
     -12
Sum across the primary diagonal: .

The secondary diagonal is:

     4
   5
10
Sum across the secondary diagonal: 
Difference: 

Note: |x| is the absolute value of x.
*/
