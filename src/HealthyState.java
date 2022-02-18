public class HealthyState implements PlayerState {

	public void action(Player p) {
		p.attack();
		p.fireBumb();
		p.fireGunblade();
		p.firePistol();
	}
}