package Assignment3;

public class IPL {
	Stadium stadium;

	public IPL(Stadium stadium) {
		this.stadium = stadium;
	}

	void homeTeamStadium(Stadium stadium) {
		switch (stadium) {
		case EDEN_GARDENS_STADIUM:
			System.out.println("This is the home ground of KKR");
			break;
		case WANKHEDE_STADIUM:
			System.out.println("This is the home ground of Mumbai Indians");
			break;
		case CHIDAMBARAM_STADIUM:
			System.out.println("This is the home ground of CSK");
			break;
		case M_CHINNASWAMY_STADIUM:
			System.out.println("This is the home ground of RCB");
			break;
		default:
			break;
		}

	}

	public static void main(String[] args) {
		IPL st1 = new IPL(Stadium.EDEN_GARDENS_STADIUM);
		IPL st2 = new IPL(Stadium.WANKHEDE_STADIUM);
		IPL st3 = new IPL(Stadium.CHIDAMBARAM_STADIUM);
		IPL st4 = new IPL(Stadium.M_CHINNASWAMY_STADIUM);

		st1.homeTeamStadium(st1.stadium);
		st2.homeTeamStadium(st2.stadium);
		st3.homeTeamStadium(st3.stadium);
		st4.homeTeamStadium(st4.stadium);
	}

}
