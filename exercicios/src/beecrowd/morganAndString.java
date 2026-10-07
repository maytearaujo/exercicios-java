package beecrowd;

public class morganAndString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "JACK", b = "DAJNIEL", c1, c2, c1reserva, c2reserva;
		String result = "";
		int i = 0, j = 0;

		while (result.length() < (a.length() + b.length())) {

			if (i < a.length() && j < b.length()) {
				c1 = Character.toString(a.charAt(i));
				c2 = Character.toString(b.charAt(j));
				
				if (c1.compareTo(c2) == 0) {
					if(i < a.length() && j < b.length() && !(i == a.length()) && !(j == b.length()) ) {
						c1reserva = Character.toString(a.charAt(i+1));
						c2reserva = Character.toString(b.charAt(j+1));
					
						if ((c1reserva.compareTo(c2reserva) < 0) ) {
							result += a.charAt(i) ;
							i++;
							
						}
						
						if ((c2reserva.compareTo(c1reserva) < 0)  ){
							result += b.charAt(j);
							j++;
							
						}
					}
					
				}
				
				if ((c1.compareTo(c2) < 0) ) {
					result += a.charAt(i);
					i++;
					
				}
				
				if ((c2.compareTo(c1) < 0)  ){
					result += b.charAt(j);
					j++;
					
				}
				
			} else if(i == a.length()  || j == b.length()) {
				if(i == a.length()) {
					result += b.substring(j);
					
				} else if (j == b.length()) {
					result += a.substring(i);
					
				}
			}

		}
		System.out.println(result);
		//DAJACKNIEL
		//AABABACABACABA
	}

}
