package hw4;

public class No_3 {

	public static void main(String[] args) {
		
		String[] star = {"mercury","venus","earth","mars","jupiter","saturn","uranus","neptune"};
		String[] match = {"a","e","i","o","u"};
		
		int total = 0;
		
		String bigString = "";
		for(int i = 0;i<star.length;i++) {
			bigString += star[i];
		}
		
		for(int i = 0;i < match.length;i++) {
			for(int j = 0;j < bigString.length();j++) {
				if(match[i].equals(String.valueOf(bigString.charAt(j)))) {
					total++;
				}
			}
		}
		
		
		
		
		
		System.out.println(total);
		
		

	}

}
