import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Shelter {

	Map<String, VirtualPet> pets = new HashMap<>();

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

	public Collection<VirtualPet> getAllDogs(){  //need to be able to walk all Dogs
		return pets.
	}

	// need to be able to feed & water all organicPets
}
