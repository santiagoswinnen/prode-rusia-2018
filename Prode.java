import java.util.HashMap;

public class Prode {

	private Integer totalScore = 0;
	private HashMap<Integer,Match> matches;
	String champion;

	public Prode() {
		this.matches = new HashMap<>();
	}

	public void updatePoints(Match realMatch) {
		Match prodeMatch = matches.get(realMatch.getMatchNumber());

		if(prodeMatch.getT1Goals().equals(realMatch.getT1Goals()) &&
				prodeMatch.getT2Goals().equals(realMatch.getT2Goals())) {
			totalScore +=2;
		}

		boolean t1Guessed = prodeMatch.getT1().equals(realMatch.getT1());
		boolean t2Guessed = prodeMatch.getT2().equals(realMatch.getT2());

		switch (realMatch.getRoundOf()) {
			case 16:
				if (t1Guessed) {
					totalScore += 1;
				}
				if (t2Guessed) {
					totalScore += 1;
				}
				break;
			case 8:
				if (t1Guessed) {
					totalScore += 2;
				}
				if (t2Guessed) {
					totalScore += 2;
				}
				break;
			case 4:
				if (t1Guessed) {
					totalScore += 4;
				}
				if (t2Guessed) {
					totalScore += 4;
				}
				break;
			case 2:
				if (t1Guessed) {
					totalScore += 8;
				}
				if (t2Guessed) {
					totalScore += 8;
				}
				break;
			case 1:
				if (t1Guessed) {
					totalScore += 16;
				}
				break;
			default:
				if (prodeMatch.getWinner().equals(realMatch.getWinner())) {
					totalScore += 1;
				}
		}
	}

	public Integer getTotalScore() {
		return totalScore;
	}

	public void compareChampion(String realChamp) {
		if( this.champion.equals(realChamp)) {
			totalScore += 20;
		}
	}

	public void addMatch(Match m) {
		this.matches.put(m.getMatchNumber(),m);
	}
}
