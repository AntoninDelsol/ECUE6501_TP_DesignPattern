package tp.dp;

public class BadgeuseB implements Badgeuse {

	@Override
	public Boolean detectBadge(Badge unBadge) {
		BDD bdd = BDD.getIntance();
		return bdd.isAutorize(unBadge);
	}

}
