import java.util.Scanner;

public class ShelterApp {

	private static String userChoice;
	private static String petToPlayWith;
	private static String petToAdopt;

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Shelter myShelter = new Shelter();

		myShelter.add(new OrganicDog("Chewie", 5, 1, 8, 6, 3, 2));
		myShelter.add(new OrganicDog("Ralph", 10, 3, 2, 9, 2, 4));
		myShelter.add(new OrganicCat("Cleo", 1, 2, 3, 4, 5));
		myShelter.add(new OrganicCat("Jerry", 5, 4, 3, 2, 1));
		myShelter.add(new RoboticDog("Max", 4, 10, 14, 1));
		myShelter.add(new RoboticDog("Fido", 6, 3, 2, 7));
		myShelter.add(new RoboticCat("Belle", 1, 6, 4, 8));
		myShelter.add(new RoboticCat("Ariel", 4, 7, 1, 10));

		System.out.println(
				"Welcome to Kurt's Krazy Shelter...the pets are starting to run amok! Please adopt one today!");
		System.out.println("");

		menuOptions(input);

		while (!userChoice.equals("0")) {

			if (userChoice.equals("1")) {
				System.out.println("Thanks for feeding all the organic pets! They are much happier now.");
				myShelter.feedAllOrganicPets();
				System.out.println("What would you like to do next?");
				userChoice = input.nextLine();
			} else if (userChoice.equals("2")) {
				System.out.println(
						"Thanks for giving all of the organic pets water, they were getting pretty thirsty. What else would you like to do?");
				myShelter.waterAllOrganicPets();
				userChoice = input.nextLine();
			} else if (userChoice.equals("3")) {
				System.out.println(
						"Thanks for charging the robotic pets, they're pretty drained by this point in the day.");
				myShelter.chargeAllRoboticPets();
				System.out.println("What would you like to do next?");
				userChoice = input.nextLine();
			} else if (userChoice.equals("4")) {
				System.out.println(
						"Thanks for oiling the robotic pets, they get kinda rusty when the humidity level is high.");
				myShelter.chargeAllRoboticPets();
				System.out.println("What would you like to do next?");
				userChoice = input.nextLine();
			} else if (userChoice.equals("5")) {
				System.out.println("Which pet would you like to play with?");
				petToPlayWith = input.nextLine();
				myShelter.playWithPet(petToPlayWith);
				System.out.println(petToPlayWith + " is much happier now, thanks!");
				menuOptions(input);
//				userChoice = input.nextLine();
			} else if (userChoice.equals("6")) {
				System.out.println("Great, they love going for long walks! Don't forget to take some poop bags.");
				myShelter.walkAllDogs();
				menuOptions(input);
//				userChoice = input.nextLine();
			} else if (userChoice.equals("7")) {
				System.out.println("Which pet would you like to adopt?");
				petToAdopt = input.nextLine();
				myShelter.pets.remove(petToAdopt);
				System.out.println("Please take great care of " + petToAdopt + ".");
				menuOptions(input);
			} else if (userChoice.equals("8")) {
				System.out.println("Is the pet a [OrganicDog], [OrganicCat], [RoboticDog], or [RoboticCat]?");
				String newPetType = input.nextLine();
				if (newPetType.equals("OrganicDog")) {
					System.out.println("Enter pet's name: ");
					String petName = input.nextLine();
					System.out.println("Enter pet's happiness level: ");
					int happinessLevel = input.nextInt();
					System.out.println("Enter pet's health level: ");
					int healthLevel = input.nextInt();
					System.out.println("Enter pet's food level: ");
					int foodLevel = input.nextInt();
					System.out.println("Enter pet's water level: ");
					int waterLevel = input.nextInt();
					System.out.println("Enter pet's waste level: ");
					int wasteLevel = input.nextInt();
					System.out.println("Enter pet's cleanliness level: ");
					int cleanlinessLevel = input.nextInt();
					myShelter.add(new OrganicDog(petName, happinessLevel, healthLevel, foodLevel, waterLevel,
							wasteLevel, cleanlinessLevel));
					menuOptions(input);
					userChoice = input.nextLine();
				} else if (newPetType.equals("OrganicCat")) {
					System.out.println("Enter pet's name: ");
					String petName = input.nextLine();
					System.out.println("Enter pet's happiness level: ");
					int happinessLevel = input.nextInt();
					System.out.println("Enter pet's health level: ");
					int healthLevel = input.nextInt();
					System.out.println("Enter pet's food level: ");
					int foodLevel = input.nextInt();
					System.out.println("Enter pet's water level: ");
					int waterLevel = input.nextInt();
					System.out.println("Enter pet's waste level: ");
					int wasteLevel = input.nextInt();
					myShelter.add(
							new OrganicCat(petName, happinessLevel, healthLevel, foodLevel, waterLevel, wasteLevel));
					menuOptions(input);
					userChoice = input.nextLine();
				} else if (newPetType.equals("RoboticDog")) {
					System.out.println("Enter pet's name: ");
					String petName = input.nextLine();
					System.out.println("Enter pet's happiness level: ");
					int happinessLevel = input.nextInt();
					System.out.println("Enter pet's health level: ");
					int healthLevel = input.nextInt();
					System.out.println("Enter pet's charge level: ");
					int chargeLevel = input.nextInt();
					System.out.println("Enter pet's oil level: ");
					int oilLevel = input.nextInt();
					myShelter.add(new RoboticDog(petName, happinessLevel, healthLevel, chargeLevel, oilLevel));
					menuOptions(input);
					userChoice = input.nextLine();
				} else if (newPetType.equals("RoboticCat")) {
					System.out.println("Enter pet's name: ");
					String petName = input.nextLine();
					System.out.println("Enter pet's happiness level: ");
					int happinessLevel = input.nextInt();
					System.out.println("Enter pet's health level: ");
					int healthLevel = input.nextInt();
					System.out.println("Enter pet's charge level: ");
					int chargeLevel = input.nextInt();
					System.out.println("Enter pet's oil level: ");
					int oilLevel = input.nextInt();
					myShelter.add(new RoboticCat(petName, happinessLevel, healthLevel, chargeLevel, oilLevel));
					menuOptions(input);
					userChoice = input.nextLine();
				}
			} else if (userChoice.equals("9")) {
				System.out.println("Yes, please...this place reeks! What's next?");
				myShelter.cleanAllCages();
//				menuOptions(input);
				userChoice = input.nextLine();
			} else if (userChoice.equals("10")) {
				System.out.println("The litterbox level is " + myShelter.getLitterBoxLevel() + ".");
				System.out.println("What else would you like to do?");
				userChoice = input.nextLine();
			} else if (userChoice.equals("11")) {
				System.out.println("Yes, please...this place reeks!");
				myShelter.cleanLitterBox();
				System.out.println("What else would you like to do?");
				userChoice = input.nextLine();
			} else if (userChoice.equals("12")) {
				System.out.println("Here are the OrganicDogs statistics: ");
				myShelter.showAllOrganicDogs();
				userChoice = input.nextLine();
			} else if (userChoice.equals("13")) {
				System.out.println("Here are the Organicats statistics: ");
				myShelter.showAllOrganicCats();
				userChoice = input.nextLine();
			} else if (userChoice.equals("14")) {
				System.out.println("Here are the RoboticDogs statistics: ");
				myShelter.showAllRoboticDogs();
				userChoice = input.nextLine();
			} else if (userChoice.equals("15")) {
				System.out.println("Here are the RoboticCats statistics: ");
				myShelter.showAllRoboticCats();
				userChoice = input.nextLine();
			}
			myShelter.tick();
		}

		System.out.println("Goodbye. Thanks for visiting Kurt's Krazy Shelter!");
		input.close();
		System.exit(0);
	}

	static void menuOptions(Scanner input) {
		System.out.println("What would you like to do next?");
		System.out.println("Press 1 to feed the organic pets.");
		System.out.println("Press 2 to water the organic pets.");
		System.out.println("Press 3 to charge the robotic pets.");
		System.out.println("Press 4 to oil the robotic pets.");
		System.out.println("Press 5 to play with a pet.");
		System.out.println("Press 6 to walk the dogs.");
		System.out.println("Press 7 to adopt a pet.");
		System.out.println("Press 8 to admit a pet.");
		System.out.println("Press 9 to clean all the cages.");
		System.out.println("Press 10 to check litterbox level.");
		System.out.println("Press 11 to empty they communal litter box.");
		System.out.println("Press 12 to get updated status for all organic dogs.");
		System.out.println("Press 13 to get updated status for all organic cats.");
		System.out.println("Press 14 to get updated status for all robotic dogs.");
		System.out.println("Press 15 to get updated status for all robotic cats.");
		System.out.println("Press 0 to quit.");
		userChoice = input.nextLine();
	}
}
