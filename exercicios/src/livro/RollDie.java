package livro;
import java.security.SecureRandom;

public class RollDie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SecureRandom randomNumbers = new SecureRandom();
		
		int [] frequency = new int[6];
		int face;
		
		for (int i = 0; i < 6000000; i++) {
			face =  1 + randomNumbers.nextInt(6);
			
			switch (face){
				case 1:
					frequency[0]++;
					break;
				case 2:
					frequency[1]++;
					break;
				case 3:
					frequency[2]++;
					break;
				case 4:
					frequency[3]++;
					break;
				case 5:
					frequency[4]++;
					break;
				case 6:
					frequency[5]++;
					break;
			}
			
	}
		System.out.println("Face\tFrequency");
		System.out.printf("1\t%d%n2\t%d%n3\t%d%n4\t%d%n5\t%d%n6\t%d%n", 
				frequency[0], frequency[1], frequency[2], frequency[3], frequency[4], frequency[5]);
		
	}

}
