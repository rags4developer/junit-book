package com.practicalunittesting.chp04;

public class FootballTeam implements Comparable<FootballTeam> {

	private int gamesWon;

	public FootballTeam(int i) {
		if (i >= 0) {
			gamesWon = i;
		} else {
			throw new IllegalArgumentException(i
					+ " is not a valid value for games won by a team");
		}
	}

	public int getGamesWon() {
		return gamesWon;
	}

	public int compareTo(FootballTeam o) {
		return gamesWon - o.getGamesWon();
	}

}
