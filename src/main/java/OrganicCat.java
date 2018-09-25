
public class OrganicCat extends OrganicPet implements OrganicFeature {

	public OrganicCat(String petName, int happinessLevel, int healthLevel, int foodLevel, int waterLevel,
			int wasteLevel) {
		super(petName, happinessLevel, healthLevel, foodLevel, waterLevel, healthLevel);
	}

}
