package com.practicalunittesting.chp04;

import static junitparams.JUnitParamsRunner.$;
import static org.junit.Assert.*;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class FootballTeamTest {

	private static final int ANY_NUMBER = 123; 
	
	@Test
	@Parameters(method ="nbOfGamesWon")
	public void constructorShouldSetGamesWon(int nbOfGamesWon) {
		FootballTeam team = new FootballTeam(nbOfGamesWon);
		assertEquals(nbOfGamesWon, team.getGamesWon());
	}
	
	@Test(expected = IllegalArgumentException.class)
	@Parameters(method = "illegalNbOfGamesWon")
	public void constructorShouldThrowExceptionForIllegalNbOfGames(int illegalNbOfGames){
		new FootballTeam(illegalNbOfGames);
	}
	
	@Test
	public void teamsShouldBeComparable(){
		FootballTeam team = new FootballTeam(ANY_NUMBER);
		assertTrue("FootballTeam should implement Comparable", team instanceof Comparable);
	}
	
	@Test
	public void teamsWithMoreMatchesShouldBeGreater(){
		FootballTeam team_1 = new FootballTeam(2);
		FootballTeam team_2 = new FootballTeam(3);
		assertTrue(team_2.compareTo(team_1) > 0);
		
	}

	@Test
	public void teamsWithLesserMatchesShouldBeLesser(){
		FootballTeam team_1 = new FootballTeam(2);
		FootballTeam team_2 = new FootballTeam(3);
		assertTrue(team_1.compareTo(team_2) < 0);
		
	}

	@Test
	public void teamsWithEqualMatchesShouldBeEqual(){
		FootballTeam team_1 = new FootballTeam(2);
		FootballTeam team_2 = new FootballTeam(2);
		assertTrue(team_1.compareTo(team_2) == 0);
		
	}
	
	public Object[] illegalNbOfGamesWon(){
		return $(-10, -1);
	}
	
	public Object[] nbOfGamesWon(){
		return $(0,1,2);
	}
	
}
