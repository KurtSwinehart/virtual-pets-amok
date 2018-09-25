
public class RoboticCat extends RoboticPet implements RoboticFeature {

	public RoboticCat(String petName, int happinessLevel, int healthLevel, int chargeLevel, int oilLevel) {
		super(petName, happinessLevel, healthLevel, chargeLevel, oilLevel);
	}

	public void tick() {
		happinessLevel -= 2;
		chargeLevel -= 3;
		oilLevel -= 2;
	}
}
