import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class OrganicCatTest {

	OrganicPet underTest = new OrganicCat("name", 0, 0, 0, 0, 0);

	@Test
	public void shouldIncreaseFoodAmtFrom0To10ByFeedingIt() {
		underTest.giveFood(10);
		int check = underTest.getFoodLevel();
		assertThat(check, is(10));
	}

	@Test
	public void shouldIncreaseWaterLevelFrom0To10ByGivingWater() {
		underTest.giveWater(10);
		int check = underTest.getWaterLevel();
		assertThat(check, is(10));
	}

	@Test
	public void shouldIncreaseHappinessFrom0To10ByPlaying() {
		underTest.playWithPet(10);
		int check = underTest.getHappinessLevel();
		assertThat(check, is(10));
	}

}
