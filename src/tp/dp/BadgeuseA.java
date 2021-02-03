package tp.dp;

public class BadgeuseA implements Badgeuse {

	@Override
	public Boolean detectBadge(Badge unBadge) {
		BDD bdd = BDD.getIntance();
		return bdd.isAutorize(unBadge);
	}

}
