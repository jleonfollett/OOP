import java.util.ArrayList;

public class MakePlayers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int numbPlayers = 0;
			Players John = new Players(76, "John", "Leon");
			Players Luke = new Players(75, "Luke", "Leon");
			Players Mike = new Players(50, "Mike", "Leon");
			ArrayList<Players> playerList = new ArrayList<Players>();
			playerList.add(John);
			playerList.add(Luke);
			playerList.add(Mike);
			playerList.trimToSize();
			for (int i = 0; i < playerList.size(); i++) {
				System.out.print(playerList.get(i).getLast() + ", ");
				System.out.print(playerList.get(i).getFirst() + ": ");
				System.out.println(playerList.get(i).getHeight());
				numbPlayers++;

			}
			System.out.println("There are " + numbPlayers + " players.");
			
	}

}
