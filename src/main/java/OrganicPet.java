
public class OrganicPet extends VirtualPet implements OrganicFeature {

	public int foodLevel;
	public int waterLevel;
	public int wasteLevel;

	public OrganicPet(String petName, int happinessLevel, int healthLevel, int foodLevel, int waterLevel,
			int wasteLevel) {
		super(petName, happinessLevel, healthLevel);
		this.foodLevel = foodLevel;
		this.waterLevel = waterLevel;
		this.wasteLevel = wasteLevel;

	}

	@Override
	public int getFoodLevel() {
		return foodLevel;
	}

	@Override
	public int getWaterLevel() {
		return waterLevel;
	}

	@Override
	public int getWasteLevel() {
		return wasteLevel;
	}

	@Override
	public void giveFood(int amount) {
		foodLevel += amount;
		healthLevel += 2;
	}

	@Override
	public void giveWater(int amount) {
		waterLevel += amount;
		healthLevel += 2;
	}

	@Override
	public void letEliminateWaste(int amount) {
		wasteLevel -= amount;
		healthLevel += 2;
	}

	public void tick() {
		foodLevel -= 2;
		waterLevel -= 2;
		wasteLevel += 2;
	}
}