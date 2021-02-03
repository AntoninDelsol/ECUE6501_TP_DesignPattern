package tp.dp;

import java.util.ArrayList;

public class BDD {
	private static BDD bdd = null;
	private ArrayList<Badge> autorize= new ArrayList<Badge>();
	private BDD() {
		
	}
	public static BDD getIntance () {
		if (bdd==null) {
			bdd= new BDD();
		}
		return bdd;
	}
	
	public void Autorized(Badge unBadge) {
		autorize.add(unBadge);
	}
	public void UnAutorize(Badge unBadge) {
		autorize.remove(unBadge);
	}
	public boolean isAutorize(Badge unBadge) {
		return autorize.contains(unBadge);
	}
}
