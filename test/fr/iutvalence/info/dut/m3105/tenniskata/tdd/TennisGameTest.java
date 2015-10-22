package fr.iutvalence.info.dut.m3105.tenniskata.tdd;


import static org.junit.Assert.*;
import org.junit.Test;

public class TennisGameTest
{
	@Test
	public void WatchTheScoreOfTheBeginingOfTheGameExpectedLoveAllAsResult()
	{
		TennisGame gameTest = new TennisGame();
		assertEquals(gameTest.getScore(),gameTest.LOVE_ALL);
	}
	
	@Test
	public void WatchTheScoreAfterOnePointForTheServerOnTheFirstPointOfTheSet(){
		TennisGame gameTest = new TennisGame();
		gameTest.ServerScoredAPoint();
		assertEquals(gameTest.getScore(),gameTest.FIFTEEN_LOVE);
	}
	
	@Test
	public void WatchTheScoreAfterOnePointForTheReceiverOnTheFirstPointOfTheSet(){
		TennisGame gameTest = new TennisGame();
		gameTest.ReceiverScoredAPoint();
		assertEquals(gameTest.getScore(),gameTest.LOVE_FIFTEEN);
	}
	
	/*public void WatchTheScoreAfterSecondPointAndTheTwoPlayerScored(){
		TennisGame gameTest = new TennisGame();
		gameTest.ReceiverScoredAPoint();
		Assert.assertEquals(gameTest.getScore(),"Love-fifteen");
	}*/

}
