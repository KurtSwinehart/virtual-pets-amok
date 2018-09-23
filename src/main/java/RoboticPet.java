
public class RoboticPet {

	protected String petName;
	protected int chargeLevel;
	protected int oilLevel;
	protected int happinessLevel;
	protected int healthLevel;

	public RoboticPet() {
		super();
	}

	public int getChargeLevel() {
		return chargeLevel;
	}

	public int getOilLevel() {
		return oilLevel;
	}

	public int getHappinessLevel() {
		return happinessLevel;
	}

	public int getHealthLevel() {
		return healthLevel;
	}

	public void giveCharge(int amount) {
		chargeLevel += amount;
		healthLevel += 2;
	}

	public void giveOil(int amount) {
		oilLevel += amount;
		healthLevel += 2;
	}

	public void playWithPet(int amount) {
		happinessLevel += amount;
		oilLevel -= 2;
		healthLevel += 2;
	}

}