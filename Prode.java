import java.util.HashMap;

public class Prode {

	private Integer totalScore = 0;
	private HashMap<Integer,Match> matches;
	private String champion;
	private String third;


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
			default:
				if (prodeMatch.getWinner().equals(realMatch.getWinner())) {
					totalScore += 1;
				}
		}
	}

	public Integer getTotalScore() {
		return totalScore;
	}

	public HashMap<Integer, Match> getMatches() {
		return matches;
	}

	public void setChampion(String champion) {
		this.champion = champion;
	}

	public void setThird(String third) {
		this.third = third;
	}

	public String getChampion() {
		return champion;
	}

	public String getThird() {
		return third;
	}

	public void updateScoreForChampion(String realChamp) {
		if( this.champion.equals(realChamp)) {
			totalScore += 20;
		}
	}

	public void updateScoreForThird(String realThird) {
		if( this.champion.equals(realThird)) {
			totalScore += 20;
		}
	}

	public void addMatch(Match m) {
		this.matches.put(m.getMatchNumber(),m);
	}

	public void print() {
		for(Integer i: matches.keySet()) {
			matches.get(i).printMatch();
		}
		System.out.println("");
		System.out.println("Tercero: " + third);
		System.out.println("Campeon: " + champion);

	}
}
