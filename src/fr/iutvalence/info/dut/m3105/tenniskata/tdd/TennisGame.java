package fr.iutvalence.info.dut.m3105.tenniskata.tdd;
public class TennisGame
{
	
	private String score;
	public static final String LOVE_ALL="Love-all";
	public static final String FIFTEEN_LOVE="Fifteen-love";
	public static final String LOVE_FIFTEEN="Love-fifteen";
	public static final String FIFTEEN_ALL = "Fifteen-all";
	
	public String getScore() {
		return score;
	}

	public void ServerScoredAPoint() {
		this.score = FIFTEEN_LOVE;
		
	}

	public TennisGame() {

		this.score=LOVE_ALL;
	}

	public void ReceiverScoredAPoint() {
		this.score = LOVE_FIFTEEN;
		
	}

	public void BothPlayerScoredAPointServerThanReceiver() {
		
		this.score = FIFTEEN_ALL;
		
	}
	
}
