
public class OrganicDog extends OrganicPet implements OrganicFeatures, Dog {

	public int cleanlinessLevel;

	public OrganicDog(String petName, int happinessLevel, int healthLevel, int foodLevel, int waterLevel,
			int wasteLevel, int cleanlinessLevel) {
		super(petName, happinessLevel, healthLevel, foodLevel, waterLevel, wasteLevel);
		this.cleanlinessLevel = cleanlinessLevel;
	}

	public void cleanCage(int i) {
		cleanlinessLevel += 5;
	}

	public int getCleanlinessLevel() {
		return cleanlinessLevel;
	}

	public void takeForWalk() {
		happinessLevel += 5;
	}

	public void tick() {
		cleanlinessLevel -= 2;
	}
}
