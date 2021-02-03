package tp.dp;

public class BadgeFactory {
	private static final int badgeEtu = 0 ;
	private static final int badgeProf = 1;
	
	public static Badge create(int type, String login) {
		switch (type) {
			case badgeEtu : 
				return new BadgeEtudiant(login);
			case badgeProf :
				return new BadgeProf(login);
			default: 
				return null;
				
		}
	}
	
}
