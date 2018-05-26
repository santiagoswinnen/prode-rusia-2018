public class Match {

	private String t1;
	private Integer t1Goals;
	private String t2;
	private Integer t2Goals;
	private Integer matchNumber;
	private Integer roundOf;

	public Match(String t1, Integer t1Goals, String t2, Integer t2Goals, Integer matchNumber, Integer roundOf) {
		this.t1 = t1;
		this.t1Goals = t1Goals;
		this.t2 = t2;
		this.t2Goals = t2Goals;
		this.matchNumber = matchNumber;
		this.roundOf = roundOf;
	}

	@Override
	public int hashCode() {
		return matchNumber;
	}

	public String getWinner() {
		if(t1Goals > t2Goals) {
			return t1;
		} else if (t2Goals > t1Goals) {
			return t2;
		}
		return "Empate";
	}

	public String getT1() {
		return t1;
	}

	public Integer getT1Goals() {
		return t1Goals;
	}

	public String getT2() {
		return t2;
	}

	public Integer getT2Goals() {
		return t2Goals;
	}

	public Integer getMatchNumber() {
		return matchNumber;
	}

	public Integer getRoundOf() {
		return roundOf;
	}

	public void printMatch() {
		System.out.println(t1 + " " + t1Goals + " " + t2Goals + " " + t2);
	}
}
