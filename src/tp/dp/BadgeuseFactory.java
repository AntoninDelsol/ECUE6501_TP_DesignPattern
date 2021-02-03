package tp.dp;

public class BadgeuseFactory {
	private static final int badgeuseA = 0 ;
	private static final int badgeuseB = 1;
	
	public static Badgeuse create(int type) {
		switch (type) {
			case badgeuseA : 
				return new BadgeuseA();
			case badgeuseB :
				return new BadgeuseB();
			default: 
				return null;
				
		}
	}
}
