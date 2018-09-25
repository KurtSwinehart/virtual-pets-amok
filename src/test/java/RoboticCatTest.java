import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class RoboticCatTest {

	RoboticCat underTest = new RoboticCat("name", 0, 0, 0, 0);

	@Test
	public void shouldIncreaseChargeLevelFrom0To5WhenCharging() {
		underTest.giveCharge(5);
		int check = underTest.getChargeLevel();
		assertThat(check, is(5));
	}

	@Test
	public void shouldIncreaseOilLevelFrom0To5WhenOiled() {
		underTest.giveOil(5);
		int check = underTest.getOilLevel();
		assertThat(check, is(5));
	}

	@Test
	public void shouldIncreaseHappinessWhenPlayedWith() {
		underTest.playWithPet(5);
		int check = underTest.getHappinessLevel();
		assertThat(check, is(5));
	}

	@Test
	public void shouldIncreaseHealthLevelWhenCharged() {
		underTest.giveCharge(5);
		int check = underTest.getHealthLevel();
		assertThat(check, is(2));
	}
}
