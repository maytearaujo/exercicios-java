package decisao;

public class ContinueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		
		while (num < 10) {
			num++;
			if (num == 5) {
				continue;
			}
			System.out.println(num);
		}

	}

}
