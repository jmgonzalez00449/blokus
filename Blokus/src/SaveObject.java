import java.io.Serializable;


public class SaveObject implements Serializable {

	Player blue;
	Player yellow;
	Player red;
	Player green;
	
	Board board;
	int turnCounter;
}
