package fr.iutvalence.info.dut.m3105.tenniskata.tdd;


import org.junit.Assert;
import org.junit.Test;

public class TennisGameTest
{
	@Test
	public void WatchTheScoreOfTheBeginingOfTheGameExpectedLoveAllAsResult()
	{
		TennisGame gameTest = new TennisGame();
		Assert.equals(gameTest.getScore(),"Love-all");
		
	}

}
