import java.io.Serializable;


public class Coordinate implements Serializable {
	public int myX;
	public int myY;
	public Color myColor;

	public Coordinate(int x, int y, Color color) {
		myX = x;
		myY = y;
		myColor = color;
	}
	
	public Coordinate(int x, int y) {
		
		this(x,y,Color.NONE);
	}
	
	public Coordinate(Coordinate origin) {
		
		this(origin.myX,origin.myY,origin.myColor);
	}
	
	public Coordinate(Coordinate origin, int offsetX, int offsetY) {
		
		this(origin.myX+offsetX,origin.myY+offsetY,origin.myColor);
	}

	static boolean colorsEqual(Coordinate coord1, Coordinate coord2) {
		
		return coord1.myColor == coord2.myColor;
	}
	
	static boolean coordinatesEqual(Coordinate coord1, Coordinate coord2) {
		if ( (coord1.myX == coord2.myX) &&
				(coord1.myY == coord2.myY) &&
				(coord1.myColor == coord2.myColor) )
			return true;
		
		else
			return false;
	}
	
	public boolean sameColor(Coordinate otherCoord) {
		
		return myColor == otherCoord.myColor;
	}
	
	public boolean sameCoordinate(Coordinate otherCoord) {
		
		if ( (myX == otherCoord.myX) &&
				(myY == otherCoord.myY) &&
				(myColor == otherCoord.myColor) )
			return true;
		
		else
			return false;
	}
	
	public void addOffset(Coordinate offset) {
		myX += offset.myX;
		myY += offset.myY;
	}
	
	public void addOffset(int x, int y) {
		myX += x;
		myY += y;
	}
	
}