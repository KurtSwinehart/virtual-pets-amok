import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertThat;

import java.util.Collection;

import org.junit.Before;
import org.junit.Test;

public class ShelterTest {

	Shelter underTest = new Shelter();
	OrganicDog pet1 = new OrganicDog("Chewie", 10, 10, 10, 10, 10, 10);
	OrganicCat pet2 = new OrganicCat("Cleo", 10, 10, 10, 10, 10);
	RoboticDog pet3 = new RoboticDog("Max", 10, 10, 10, 10);
	RoboticCat pet4 = new RoboticCat("Belle", 10, 10, 10, 10);
//	OrganicDog pet1;
//	OrganicCat pet2;

	@Before
	public void setUp() {
		underTest = new Shelter();
	}

	@Test
	public void shouldIncreasePetTotalFromZeroToOneWhenAdmittingPet() {
		underTest.add(pet1);
		VirtualPet retrievedPet = underTest.findPet("Chewie");
		assertThat(retrievedPet, is(pet1));
	}

	@Test
	public void shouldIncreasePetTotalFromZeroToTwoWhenAdmitting2Pets() {
		underTest.add(pet1);
		underTest.add(pet2);
		Collection<VirtualPet> retrievedPet = underTest.getAllPets();
		assertThat(retrievedPet, containsInAnyOrder(pet1, pet2));
	}

	@Test
	public void shouldBeAbleToAdoptAPet() {
		underTest.add(pet1);
		underTest.remove("Chewie");
		VirtualPet adoptedPet = underTest.findPet("Chewie");
		assertThat(adoptedPet, is(nullValue()));
	}

	@Test
	public void shouldBeAbleToPlayWithAPet() {
		underTest.add(pet1);
		underTest.playWithPet(pet1.getPetName());
		VirtualPet petToPlayWith = underTest.findPet("Chewie");
		assertThat(petToPlayWith.getPetName(), is("Chewie"));
		assertThat(petToPlayWith.getHappinessLevel(), is(15));
	}

	@Test
	public void shouldBeAbleToWalkAllDogs() {
		underTest.add(pet1);
		underTest.add(pet3);
		VirtualPet walkAllDogs = underTest.instanceof(Dog);
	}
}
