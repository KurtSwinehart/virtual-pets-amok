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

	public void remove(String petName) {
		pets.remove(petName);

	}

	public void playWithPet(String petName) {
		pets.get(petName).playWithPet(5);
	}

	public void walkAllDogs() {
		for (VirtualPet pets : pets.values()) {
			if (pets instanceof Dog) {
				((Dog) pets).walk();
			}

		}

	}

	public VirtualPet getPetClass() {
		return findPet(pets.getClass().getSuperclass().toString());
	}

	public void oilAllRoboticPets() {
		for (VirtualPet pets : pets.values()) {
			if (pets instanceof RoboticFeature) {
				((RoboticFeature) pets).giveOil(5);
			}
		}

	}

	public void waterAllOrganicPets() {
		for (VirtualPet pets : pets.values()) {
			if (pets instanceof OrganicFeature) {
				((OrganicFeature) pets).giveWater(5);
			}
		}
	}

	public void cleanAllCages() {
		for (VirtualPet pets : pets.values()) {
			if (pets instanceof OrganicDog) {
				((OrganicDog) pets).cleanCage(5);
			}
		}
	}

	public void feedAllOrganicPets() {
		for (VirtualPet pets : pets.values()) {
			if (pets instanceof OrganicPet) {
				((OrganicPet) pets).giveFood(5);
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
}
