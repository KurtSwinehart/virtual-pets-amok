
public class OrganicDog extends OrganicPet implements OrganicFeature, Dog {

	public int cageWasteLevel;

	public OrganicDog(String petName, int happinessLevel, int healthLevel, int foodLevel, int waterLevel,
			int wasteLevel, int cleanlinessLevel) {
		super(petName, happinessLevel, healthLevel, foodLevel, waterLevel, wasteLevel);
		this.cageWasteLevel = cleanlinessLevel;
	}

	public int getCageWasteLevel() {
		return cageWasteLevel;
	}

	public void cleanCage() {
		cageWasteLevel = 0;
	}

	public void tick() {
		happinessLevel -= 5;
		cageWasteLevel += 5;
		foodLevel -= 5;
		waterLevel -= 5;
	}

	@Override
	public void giveFood(int amount) {
		foodLevel += 5;
		healthLevel += 2;
		happinessLevel += 3;
		cageWasteLevel += 8;
	}

	@Override
	public void walk() {
		wasteLevel = 0;
		happinessLevel += 5;
		healthLevel += 2;
	}
}
