import java.util.HashMap;

public class Main {
	public static void main(String[] args) {
		HashMap<Person, Prode> allProdes = new HashMap<>();
		Person sswinnen = new Person("Santiago Swinnen", 40010300);
		try {
			Prode sswinnenProde = ExcelReader.readProde("./Fixture-Mundial-Rusia-2018-3.xlsx");
			sswinnenProde.print();
			allProdes.put(sswinnen,sswinnenProde);

			Updater.updateAll(allProdes, new Match("Rusia", 4, "Arabia Saudita", 0, 1, 0));


		} catch (Exception e) { e.printStackTrace(); }




	}
}
