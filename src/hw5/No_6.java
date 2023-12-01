package hw5;

public class No_6 {

	public static void main(String[] args) {
		
		genAuthCode();
	}
	
	public static void genAuthCode() {
		String[] alphabet1 = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
		String[] alphabet2 = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		String[] number = {"0","1","2","3","4","5","6","7","8","9"};
		
		String[] random = new String[8];
		
		for(int i = 0;i < random.length;i++) {
			int r = (int)((Math.random() * 3) + 1);
			
			switch(r) {
			case 1:
				random[i] = alphabet1[(int)(Math.random() * 26)];
				System.out.print(random[i]);
				break;
			case 2:
				random[i] = alphabet2[(int)(Math.random() * 26)];
				System.out.print(random[i]);
				break;
			case 3:
				random[i] = number[(int)(Math.random() * 9)];
				System.out.print(random[i]);
				break;
			}
		}
	}

}
