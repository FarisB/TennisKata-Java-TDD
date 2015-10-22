package fr.iutvalence.info.dut.m3105.tenniskata.tdd;


import static org.junit.Assert.*;
import org.junit.Test;

public class TennisGameTest
{
	@Test
	public void WatchTheScoreOfTheBeginingOfTheGameExpectedLoveAllAsResult()
	{
		TennisGame gameTest = new TennisGame();
		assertEquals(gameTest.getScore(),TennisGame.LOVE_ALL);
	}
	@Test
	public void WatchTheScoreAfterOnePointForTheServerOnTheFirstPointOfTheSet(){
		TennisGame gameTest = new TennisGame();
		gameTest.ServerScoredAPoint();
		assertEquals(gameTest.getScore(),TennisGame.FIFTEEN_LOVE);
	}
	
	@Test
	public void WatchTheScoreAfterOnePointForTheReceiverOnTheFirstPointOfTheSet(){
		TennisGame gameTest = new TennisGame();
		gameTest.ReceiverScoredAPoint();
		assertEquals(gameTest.getScore(),TennisGame.LOVE_FIFTEEN);
	}
	
	@Test
	public void WatchTheScoreAfterSecondPointAndTheTwoPlayerScoredServerThanReceiver(){
		TennisGame gameTest = new TennisGame();
		gameTest.BothPlayerScoredAPointServerThanReceiver();
		assertEquals(gameTest.getScore(),TennisGame.FIFTEEN_ALL);
	}

}
