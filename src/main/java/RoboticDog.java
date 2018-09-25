
public class RoboticDog extends RoboticPet implements Dog, RoboticFeature {

	public RoboticDog(String petName, int happinessLevel, int healthLevel, int chargeLevel, int oilLevel) {

		super(petName, happinessLevel, healthLevel, chargeLevel, oilLevel);

	}

	@Override
	public void walk() {
		super.happinessLevel += 5;
		healthLevel += 2;

	}
}
