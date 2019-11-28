package me.leonadel.retosjava;

public class Matcher {

	public static void main(String[] args) {
		String text = "sometext!";
		String subtext = "1";
		System.out.println(match(text, subtext));
	}
	
	public static int match(String str, String substr) {
		int i,j,matchindex=-1;
		if(str.isEmpty()||substr.isEmpty()) return -1;

		for(i=0; i<=str.length()-substr.length(); i++) {
			if(str.charAt(i)==substr.charAt(0)) {
				matchindex=i;
				for(j=0; j<substr.length(); j++)
					if(str.charAt(i+j)!=substr.charAt(j)) {
						matchindex=-1;
						break;
					}
			}
		}
		return matchindex;
		
		//Compact form
//		String compared;
//		for(i=0; i<=str.length()-substr.length(); i++) {
//			if(str.charAt(i)==substr.charAt(0)) {
//				compared = str.substring(i, i+substr.length());
//				if(compared.equals(substr)) return i;
//			}
//		}
//		return -1;
		
	}
}
