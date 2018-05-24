import java.util.HashMap;

public class Updater {

	public static void updateAll(HashMap<Person,Prode> prodes, Match realMatch) {
		for(Person p: prodes.keySet()) {
			Prode current = prodes.get(p);
			current.updatePoints(realMatch);
		}
		printAll(prodes);
	}

	public static void printAll(HashMap<Person,Prode> prodes) {
		for(Person p: prodes.keySet()) {
			Prode current = prodes.get(p);
			System.out.print(p.getName());
			System.out.print("\t\t\t\t\t");
			System.out.print(p.getDni());
			System.out.print("\t\t\t\t\t");
			System.out.println(current.getTotalScore());
		}
	}
}
