package fr.iutvalence.info.dut.m3105.tenniskata.tdd;


import org.junit.Assert;
import org.junit.Test;

public class TennisGameTest
{
	@Test
	public void WatchTheScoreOfTheBeginingOfTheGameExpectedLoveAllAsResult()
	{
		TennisGame gameTest = new TennisGame();
		Assert.assertEquals(gameTest.getScore(),"Love-all");
	}
	
	@Test
	public void WatchTheScoreAfterOnePointForTheServer(){
		TennisGame gameTest = new TennisGame();
		gameTest.ServerScoredAPoint();
		Assert.assertEquals(gameTest.getScore(),"Fifteen-love");
	}

}
