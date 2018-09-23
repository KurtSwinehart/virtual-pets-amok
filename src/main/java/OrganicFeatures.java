
public interface OrganicFeatures {

	int getFoodLevel();

	int getWaterLevel();

	int getWasteLevel();

	void giveFood(int amount);

	void giveWater(int amount);

	void letEliminateWaste(int amount);

}