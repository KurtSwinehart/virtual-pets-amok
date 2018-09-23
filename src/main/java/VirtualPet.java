
public class VirtualPet {

	public String petName;
	public int happinessLevel;
	public int healthLevel;

	public VirtualPet(String petName, int happinessLevel, int healthLevel) {
		this.petName = petName;
		this.happinessLevel = happinessLevel;
		this.healthLevel = healthLevel;
	}

	public int getHappinessLevel() {
		return happinessLevel;
	}

	public int getHealthLevel() {
		return healthLevel;
	}

	public void playWithPet(int amount) {
		happinessLevel += amount;
		healthLevel += 2;
	}

	public String getPetName() {
		return petName;
	}

}