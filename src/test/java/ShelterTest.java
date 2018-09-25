import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.Collection;

import org.junit.Before;
import org.junit.Test;

public class ShelterTest {

	Shelter underTest = new Shelter();
	OrganicDog pet1 = new OrganicDog("Chewie", 10, 10, 10, 10, 10, 10);
	OrganicCat pet2 = new OrganicCat("Cleo", 10, 10, 10, 10, 10);
	RoboticDog pet3 = new RoboticDog("Max", 10, 10, 10, 10);
	RoboticCat pet4 = new RoboticCat("Belle", 10, 10, 10, 10);
	private int litterBoxLevelAfter;

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
		underTest.add(pet4);
		underTest.playWithPet(pet4.getPetName());
		VirtualPet petToPlayWith = underTest.findPet("Belle");
		assertThat(petToPlayWith.getPetName(), is("Belle"));
		assertThat(petToPlayWith.getHappinessLevel(), is(15));
	}

	@Test
	public void shouldBeAbleToGetPetClassOfOrganicDog() {
		assertThat(pet1, instanceOf(OrganicPet.class));
	}

	@Test
	public void shouldBeAbleToWalkAllDogs() {
		underTest.add(pet1);
		underTest.add(pet2);
		underTest.add(pet3);
		underTest.add(pet4);
		underTest.walkAllDogs();
		assertThat(pet1.getHappinessLevel(), is(15));
		assertThat(pet2.getHappinessLevel(), is(10));
		assertThat(pet3.getHappinessLevel(), is(15));
		assertThat(pet4.getHappinessLevel(), is(10));
	}

	@Test
	public void shouldBeAbleToOilAllRoboticPets() {
		underTest.add(pet1);
		underTest.add(pet2);
		underTest.add(pet3);
		underTest.add(pet4);
		underTest.oilAllRoboticPets();
		assertThat(pet1.getHealthLevel(), is(10));
		assertThat(pet2.getHealthLevel(), is(10));
		assertThat(pet3.getHealthLevel(), is(12));
		assertThat(pet4.getHealthLevel(), is(12));
	}

	@Test
	public void shouldBeAbleToChargeAllRoboticPets() {
		underTest.add(pet1);
		underTest.add(pet2);
		underTest.add(pet3);
		underTest.add(pet4);
		underTest.oilAllRoboticPets();
		assertThat(pet1.getHealthLevel(), is(10));
		assertThat(pet2.getHealthLevel(), is(10));
		assertThat(pet3.getHealthLevel(), is(12));
		assertThat(pet4.getHealthLevel(), is(12));
	}

	@Test
	public void shouldBeAbleToWaterAllOrganicPets() {
		underTest.add(pet1);
		underTest.add(pet2);
		underTest.add(pet3);
		underTest.add(pet4);
		underTest.waterAllOrganicPets();
		assertThat(pet1.getHealthLevel(), is(12));
		assertThat(pet2.getHealthLevel(), is(12));
		assertThat(pet3.getHealthLevel(), is(10));
		assertThat(pet4.getHealthLevel(), is(10));
	}

	@Test
	public void shouldBeAbleToFeedAllOrganicPets() {
		underTest.add(pet1);
		underTest.add(pet2);
		underTest.add(pet3);
		underTest.add(pet4);
		underTest.feedAllOrganicPets();
		assertThat(pet1.getHealthLevel(), is(12));
		assertThat(pet2.getHealthLevel(), is(12));
		assertThat(pet3.getHealthLevel(), is(10));
		assertThat(pet4.getHealthLevel(), is(10));
	}

	@Test
	public void shouldBeAbleToCleanAllCages() {
		underTest.add(pet1);
		underTest.add(pet1);
		underTest.add(pet3);
		underTest.cleanAllCages();
		assertThat(pet1.getCleanlinessLevel(), is(15));
	}

	@Test
	public void shouldIncreaseLitterBoxLevel() {
		underTest.add(pet2);
		int litterBoxLevelBefore = underTest.getLitterBoxLevel();
		underTest.increaseOrganicCatPoop();
		int litterBoxLevelAfter = underTest.getLitterBoxLevel();
		assertTrue(litterBoxLevelAfter > litterBoxLevelBefore);
	}

	@Test
	public void shouldBeAbleToCleanLitterBox() {
		underTest.add(pet2);
		litterBoxLevelAfter = underTest.getLitterBoxLevel();
		underTest.cleanLitterBox();
		litterBoxLevelAfter = underTest.getLitterBoxLevel();
		assertThat(litterBoxLevelAfter, is(0));
	}

	@Test
	public void shouldBeAbleToCleanLitterBoxTestingMultipleCats() {
		underTest.add(pet2);
		underTest.add(pet2);
		underTest.add(pet2);
		underTest.cleanLitterBox();
		litterBoxLevelAfter = underTest.getLitterBoxLevel();
		assertThat(litterBoxLevelAfter, is(0));
	}
}
