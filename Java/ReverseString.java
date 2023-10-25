public class ReverseString {
	
	public static void main(String[] args) {
		String S = "NEHA";
		String gs = "";
		reverse(S,gs);
		
	}
	
	public static void reverse(String S,String gs) {
		if(S.length()==0) {
			System.out.print(gs);
			return;
		}
		char last = S.charAt(S.length()-1);
		gs+=last;
		String S1 = S.substring(0,S.length()-1);
		reverse(S1,gs);
		
		
	}
}
