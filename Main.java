import java.util.HashMap;

public class Main {
	public static void main(String[] args) {
		HashMap<Person, Prode> allProdes = new HashMap<>();
		Person sswinnen = new Person("Santiago Swinnen", 40010300);
		Prode sswinnenProde = new Prode();
		allProdes.put(sswinnen,sswinnenProde);


		Updater.updateAll(allProdes, new Match("Rusia", 3, "Arabia Saudita", 2, 1, null));


	}
}
