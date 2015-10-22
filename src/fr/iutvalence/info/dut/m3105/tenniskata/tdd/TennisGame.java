package fr.iutvalence.info.dut.m3105.tenniskata.tdd;
public class TennisGame
{
	
	private String score;
	
	public String getScore() {
		return score;
	}

	public void ServerScoredAPoint() {
		score = "Fifteen-love";
		
	}

	public TennisGame() {

		this.score ="Love-all";
	}
}
