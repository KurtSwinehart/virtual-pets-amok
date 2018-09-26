import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Shelter {

	Map<String, VirtualPet> pets = new HashMap<>();
	private int litterBoxLevel = 10;

	public void add(VirtualPet pet) {
		pets.put(pet.getPetName(), pet);
	}

	public VirtualPet findPet(String petName) {
		return pets.get(petName);
	}

	public Collection<VirtualPet> getAllPets() {
		return pets.values();
	}

	public void showAllOrganicPets() {
		for (VirtualPet pet : pets.values()) {
			if (pet instanceof OrganicPet) {
				System.out.println(pet.getPetName());
			}
		}

	}

	public void showAllOrganicDogs() {
		for (VirtualPet pet : pets.values()) {
			if (pet instanceof OrganicDog) {
				System.out.println("Pet name: " + pet.getPetName() + ", Happiness Level: " + pet.getHappinessLevel()
						+ ", Health Level: " + pet.getHealthLevel() + ", Food Level: "
						+ ((OrganicDog) pet).getFoodLevel() + ", Water Level: " + ((OrganicDog) pet).getWaterLevel()
						+ ", Waste Level: " + ((OrganicDog) pet).getWasteLevel() + ", Cage Waste Level: "
						+ ((OrganicDog) pet).getCageWasteLevel());
			}
		}

	}

	public void showAllOrganicCats() {
		for (VirtualPet pet : pets.values()) {
			if (pet instanceof OrganicCat) {
				System.out.println("Pet name: " + pet.getPetName() + ", Happiness Level: " + pet.getHappinessLevel()
						+ ", Health Level: " + pet.getHealthLevel() + ", Food Level: "
						+ ((OrganicCat) pet).getFoodLevel() + ", Water Level: " + ((OrganicCat) pet).getWaterLevel()
						+ ", Waste Level: " + ((OrganicCat) pet).getWasteLevel());
			}
		}

	}

	public void showAllRoboticPets() {
		for (VirtualPet pet : pets.values()) {
			if (pet instanceof RoboticPet) {
				System.out.println(pet.getPetName());
			}
		}
	}

	public void showAllRoboticDogs() {
		for (VirtualPet pet : pets.values()) {
			if (pet instanceof RoboticDog) {
				System.out.println("Pet name: " + pet.getPetName() + ", Happiness Level: " + pet.getHappinessLevel()
						+ ", Health Level: " + pet.getHealthLevel() + ", Charge Level: "
						+ ((RoboticPet) pet).getChargeLevel() + ", Oil Level: " + ((RoboticPet) pet).getOilLevel());
			}
		}
	}

	public void showAllRoboticCats() {
		for (VirtualPet pet : pets.values()) {
			if (pet instanceof RoboticCat) {
				System.out.println("Pet name: " + pet.getPetName() + ", Happiness Level: " + pet.getHappinessLevel()
						+ ", Health Level: " + pet.getHealthLevel() + ", Charge Level: "
						+ ((RoboticPet) pet).getChargeLevel() + ", Oil Level: " + ((RoboticPet) pet).getOilLevel());
			}
		}
	}

	public void remove(String petName) {
		pets.remove(petName);

	}

	public void playWithPet(String petName) {
		pets.get(petName).playWithPet(5);
	}

	public void walkAllDogs() {
		for (VirtualPet pet : pets.values()) {
			if (pet instanceof Dog) {
				((Dog) pet).walk();
			}

		}

	}

//	public VirtualPet getPetClass() {
//		return findPet(pets.getClass().getSuperclass().toString());
//	}

	public void oilAllRoboticPets() {
		for (VirtualPet pet : pets.values()) {
			if (pet instanceof RoboticFeature) {
				((RoboticFeature) pet).giveOil(5);
			}
		}
	}

	public void chargeAllRoboticPets() {
		for (VirtualPet pet : pets.values()) {
			if (pet instanceof RoboticPet) {
				((RoboticFeature) pet).giveCharge(5);
			}
		}
	}

	public void waterAllOrganicPets() {
		for (VirtualPet pet : pets.values()) {
			if (pet instanceof OrganicFeature) {
				((OrganicFeature) pet).giveWater(5);
			}
		}
	}

	public void cleanAllCages() {
		for (VirtualPet pet : pets.values()) {
			if (pet instanceof OrganicDog) {
				((OrganicDog) pet).cleanCage();
			}
		}
	}

	public void feedAllOrganicPets() {
		for (VirtualPet pet : pets.values()) {
			if (pet instanceof OrganicPet) {
				((OrganicPet) pet).giveFood(5);
			}

		}

	}

	public void cleanLitterBox() {
		litterBoxLevel = 0;

	}

	public int getLitterBoxLevel() {
		return litterBoxLevel;
	}

	public void increaseOrganicCatPoop() {
		litterBoxLevel += 10;
	}

	public void tick() {
		litterBoxLevel += 3;
	}

}
