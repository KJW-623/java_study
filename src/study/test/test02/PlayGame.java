package study.test.test02;

public class PlayGame {
	private int opportunityLeft;
	private int totalPoints;
	private int successCount;
	private int failCount;
	private int totalRevenue;

	public void PlayGame() {
		this.opportunityLeft=0;
		this.totalPoints=0;
		this.successCount=0;
		this.failCount=0;
		this.totalRevenue=0;
	}

	public int getOpportunityLeft() {
		return opportunityLeft;
	}

	public void setOpportunityLeft(int opportunityLeft) {
		this.opportunityLeft = opportunityLeft;
	}

	public int getTotalPoints() {
		return totalPoints;
	}

	public void addPoints(int points) {
		this.totalPoints += points;
	}

	public int getSuccessCount() {
		return successCount;
	}

	public void incrementSuccessCount() {
		this.successCount++;
	}

	public int getFailCount() {
		return failCount;
	}

	public void incrementFailCount() {
		this.failCount++;
	}

	public int getTotalRevenue() {
		return totalRevenue;
	}

	public void addRevenue(int revenue) {
		this.totalRevenue += revenue;
	}

	public void decrementOpportunity() {
		this.opportunityLeft--;
	}

	public void resetGameData() {
		this.totalPoints=0;
		this.successCount=0;
		this.failCount=0;
		this.opportunityLeft=0;
	}
}
