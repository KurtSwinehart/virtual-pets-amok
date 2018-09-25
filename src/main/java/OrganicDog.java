
public class OrganicDog extends OrganicPet implements OrganicFeature, Dog {

	public int cleanlinessLevel;

	public OrganicDog(String petName, int happinessLevel, int healthLevel, int foodLevel, int waterLevel,
			int wasteLevel, int cleanlinessLevel) {
		super(petName, happinessLevel, healthLevel, foodLevel, waterLevel, wasteLevel);
		this.cleanlinessLevel = cleanlinessLevel;
	}

	public int getCleanlinessLevel() {
		return cleanlinessLevel;
	}

	public void cleanCage(int i) {
		cleanlinessLevel += 5;
	}

	public void tick() {
		cleanlinessLevel -= 2;
	}

	@Override
	public void walk() {
		wasteLevel -= 10;
		happinessLevel += 5;
		healthLevel += 2;

	}
}
