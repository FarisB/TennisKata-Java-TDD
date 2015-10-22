package fr.iutvalence.info.dut.m3105.tenniskata.tdd;
public class TennisGame
{
	
	private String score;
	public final static String LOVE_ALL="Love-all";
	public final static String FIFTEEN_LOVE="Fifteen-love";
	public final static String LOVE_FIFTEEN="Love-fifteen";
	
	public String getScore() {
		return score;
	}

	public void ServerScoredAPoint() {
		score = FIFTEEN_LOVE;
		
	}

	public TennisGame() {

		this.score=LOVE_ALL;
	}

	public void ReceiverScoredAPoint() {
		score = LOVE_FIFTEEN;
		
	}
}
