
public class RoboticDog extends RoboticPet implements Dog, RoboticFeature {

	public RoboticDog(String petName, int happinessLevel, int healthLevel, int chargeLevel, int oilLevel) {

		super(petName, happinessLevel, healthLevel, chargeLevel, oilLevel);
	}

	public void tick() {
		happinessLevel -= 5;
		chargeLevel -= 3;
		oilLevel -= 2;
	}

	@Override
	public void walk() {
		super.happinessLevel += 5;
		healthLevel += 2;

	}
}
