
public class OrganicCat extends OrganicPet implements OrganicFeature {

	public OrganicCat(String petName, int happinessLevel, int healthLevel, int foodLevel, int waterLevel,
			int wasteLevel) {
		super(petName, happinessLevel, healthLevel, foodLevel, waterLevel, healthLevel);
	}

	public void tick() {
		happinessLevel -= 2;
		foodLevel -= 4;
		waterLevel -= 3;
	}
}
