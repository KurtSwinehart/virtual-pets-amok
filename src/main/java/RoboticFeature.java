
public interface RoboticFeature {

	int getChargeLevel();

	int getOilLevel();

	void giveCharge(int amount);

	void giveOil(int amount);

}