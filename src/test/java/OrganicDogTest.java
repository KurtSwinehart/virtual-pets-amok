import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class OrganicDogTest {

	OrganicDog underTest = new OrganicDog("name", 0, 0, 0, 0, 0, 0);

	@Test
	public void shouldIncreaseFoodAmtFrom0To5ByFeedingIt() {
		underTest.giveFood(5);
		int check = underTest.getFoodLevel();
		assertThat(check, is(5));
	}

	@Test
	public void shouldIncreaseWaterLevelFrom0To10ByGivingWater() {
		underTest.giveWater(10);
		int check = underTest.getWaterLevel();
		assertThat(check, is(10));
	}

	@Test
	public void shouldIncreaseHappinessFrom0To5ByPlaying() {
		underTest.playWithPet(5);
		int check = underTest.getHappinessLevel();
		assertThat(check, is(5));
	}

	@Test
	public void shouldDecreaseWasteLevelFrom10To0WhenLetEliminateWaste() {
		underTest.letEliminateWaste(10);
		int check = underTest.getWasteLevel();
		assertThat(check, is(-10));
	}

	@Test
	public void shouldIncreaseHealthLevelFrom0To2WhenFeeding() {
		underTest.giveFood(5);
		int check = underTest.getHealthLevel();
		assertThat(check, is(2));
	}

	@Test
	public void shouldIncreaseHealthLevelFrom0To2WhenGiveWater() {
		underTest.giveWater(5);
		int check = underTest.getHealthLevel();
		assertThat(check, is(2));
	}

	@Test
	public void shouldIncreaseCleanlinessWhenCleanCage() {
		underTest.cleanCage();
		int check = underTest.getCageWasteLevel();
		assertThat(check, is(0));
	}

}
