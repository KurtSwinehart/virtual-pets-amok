
public class RoboticPet extends VirtualPet implements RoboticFeature {

	protected int chargeLevel;
	protected int oilLevel;

	public RoboticPet(String petName, int happinessLevel, int healthLevel, int chargeLevel, int oilLevel) {
		super(petName, happinessLevel, healthLevel);
		this.chargeLevel = chargeLevel;
		this.oilLevel = oilLevel;
	}

	public int getHappinessLevel() {
		return happinessLevel;
	}

	public int getHealthLevel() {
		return healthLevel;
	}

	@Override
	public int getChargeLevel() {
		return chargeLevel;
	}

	@Override
	public int getOilLevel() {
		return oilLevel;
	}

	@Override
	public void giveCharge(int amount) {
		chargeLevel += amount;
		healthLevel += 2;
	}

	@Override
	public void giveOil(int amount) {
		oilLevel += amount;
		healthLevel += 2;
	}

	@Override
	public void playWithPet(int amount) {
		happinessLevel += amount;
		oilLevel -= 3;
		chargeLevel -= 5;
		healthLevel += 2;
	}

}