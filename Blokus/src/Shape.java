import java.io.Serializable;
import java.util.ArrayList;


public class Shape implements Serializable {
	
	public enum ShapeType {
		OneLong, /* 0 */
		
		TwoLong, /* 00 */
		
		ThreeL, /* 00 */
				/*  0 */
		
		ThreeLong, /* 000 */
		
		FourSquare, /* 00 */
					/* 00 */
		
		FourT,		/*  0  */
					/* 000 */
		
		FourLong,	/* 0000 */
		
		FourL,		/*   0 */
					/* 000 */
		
		FourZ,		/*  00 */
					/* 00  */
		
		FiveL,		/* 0    */
					/* 0000 */
		
		FiveT,		/*  0  */
					/*  0  */
					/* 000 */
		
		FiveRightAngle, /* 0   */
						/* 0   */
						/* 000 */
		
		FiveLongZ, /*  000 */
				   /* 00   */
		
		FiveZ, /*   0 */
			   /* 000 */
			   /* 0   */
		
		FiveLong, /* 00000 */
		
		FiveSquare, /* 0  */
				    /* 00 */
				    /* 00 */
		
		FiveZigZag, /*  00 */
					/* 00  */
					/* 0   */
		
		FiveC, /* 00 */
			   /* 0  */
			   /* 00 */
		
		FiveTL, /*  00 */
				/* 00  */
				/*  0  */
		
		FiveX, /*  0  */
			   /* 000 */
			   /*  0  */
		
		FiveLongT, /*  0   */
				   /* 0000 */
		
	}
	public ArrayList<Coordinate> myCoordinates;
	public Coordinate myOrigin;
	
	public Shape(ArrayList<Coordinate> coordinates, Coordinate origin){
		
		initialize(coordinates,origin);
	}
	
	public Shape(ArrayList<Coordinate> coordinates) {
		
		this(coordinates, new Coordinate(0,0));
	}
	
	public Shape(ShapeType type, Color color) {
		ArrayList<Coordinate> coordinates;
	
		switch(type){
		case OneLong:
			coordinates = listForOneLong(color);
			initialize(coordinates, new Coordinate(0,0));
			break;
		case TwoLong:
			coordinates = listForTwoLong(color);
			initialize(coordinates, new Coordinate(0,0));
			break;
		case ThreeL:
			coordinates = listForThreeL(color);
			initialize(coordinates, new Coordinate(0,0));
			break;
		case ThreeLong:
			coordinates = listForThreeLong(color);
			initialize(coordinates, new Coordinate(0,0));
			break;
		case FourSquare:
			coordinates = listForFourSquare(color);
			initialize(coordinates, new Coordinate(0,0));
			break;
		case FourT:
			coordinates = listForFourT(color);
			initialize(coordinates, new Coordinate(0,0));
			break;
		case FourLong:
			coordinates = listForFourLong(color);
			initialize(coordinates, new Coordinate(0,0));
			break;
		case FourL:
			coordinates = listForFourL(color);
			initialize(coordinates, new Coordinate(0,0));
			break;
		case FourZ:
			coordinates = listForFourZ(color);
			initialize(coordinates, new Coordinate(0,0));
			break;
		case FiveL:
			coordinates = listForFiveL(color);
			initialize(coordinates, new Coordinate(0,0));
			break;
		case FiveT:
			coordinates = listForFiveT(color);
			initialize(coordinates, new Coordinate(0,0));
			break;
		case FiveRightAngle:
			coordinates = listForFiveRightAngle(color);
			initialize(coordinates, new Coordinate(0,0));
			break;
		case FiveLongZ:
			coordinates = listForFiveLongZ(color);
			initialize(coordinates, new Coordinate(0,0));
			break;
		case FiveZ:
			coordinates = listForFiveZ(color);
			initialize(coordinates, new Coordinate(0,0));
			break;
		case FiveLong:
			coordinates = listForFiveLong(color);
			initialize(coordinates, new Coordinate(0,0));
			break;
		case FiveSquare:
			coordinates = listForFiveSquare(color);
			initialize(coordinates, new Coordinate(0,0));
			break;
		case FiveZigZag:
			coordinates = listForFiveZigZag(color);
			initialize(coordinates, new Coordinate(0,0));
			break;
		case FiveC:
			coordinates = listForFiveC(color);
			initialize(coordinates, new Coordinate(0,0));
			break;
		case FiveTL:
			coordinates = listForFiveTL(color);
			initialize(coordinates, new Coordinate(0,0));
			break;
		case FiveX:
			coordinates = listForFiveX(color);
			initialize(coordinates, new Coordinate(0,0));
			break;
		case FiveLongT:
			coordinates = listForFiveLongT(color);
			initialize(coordinates, new Coordinate(0,0));
			break;
		default:
			initialize(new ArrayList<Coordinate>(), new Coordinate(0,0));
		}
	}
	
	/* 0 */
	static public ArrayList<Coordinate> listForOneLong(Color color){
		
		ArrayList<Coordinate> coordinates = new ArrayList<Coordinate>();
		
		coordinates.add(new Coordinate(0,0,color));
		
		return coordinates;
	}
	
	
	/* 00 */
	static public ArrayList<Coordinate> listForTwoLong(Color color) {
		
		ArrayList<Coordinate> coordinates = new ArrayList<Coordinate>();
		
		coordinates.add(new Coordinate(0,0,color));
		coordinates.add(new Coordinate(1,0,color));
		
		return coordinates;
	}
	
	
	static public ArrayList<Coordinate> listForThreeL(Color color) {
		
		ArrayList<Coordinate> coordinates = new ArrayList<Coordinate>();
		
		coordinates.add(new Coordinate(0,0,color));
		coordinates.add(new Coordinate(1,0,color));
		coordinates.add(new Coordinate(1,1,color));
	
		return coordinates;
	}
	
	static public ArrayList<Coordinate> listForThreeLong(Color color) {
		
		ArrayList<Coordinate> coordinates = new ArrayList<Coordinate>();
		
		coordinates.add(new Coordinate(0,0,color));
		coordinates.add(new Coordinate(1,0,color));
		coordinates.add(new Coordinate(2,0,color));
		
		return coordinates;
	}
	
	static public ArrayList<Coordinate> listForFourSquare(Color color) {
		
		ArrayList<Coordinate> coordinates = new ArrayList<Coordinate>();
		
		coordinates.add(new Coordinate(0,0,color));
		coordinates.add(new Coordinate(1,0,color));
		coordinates.add(new Coordinate(0,1,color));
		coordinates.add(new Coordinate(1,1,color));
		
		return coordinates;
	}
	
	static public ArrayList<Coordinate> listForFourT(Color color) {
		
		ArrayList<Coordinate> coordinates = new ArrayList<Coordinate>();
		
		coordinates.add(new Coordinate(1,0,color));
		coordinates.add(new Coordinate(0,1,color));
		coordinates.add(new Coordinate(1,1,color));
		coordinates.add(new Coordinate(2,1,color));
		
		return coordinates;
	}
	
	static public ArrayList<Coordinate> listForFourLong(Color color) {
		
		ArrayList<Coordinate> coordinates = new ArrayList<Coordinate>();
		
		coordinates.add(new Coordinate(0,0,color));
		coordinates.add(new Coordinate(1,0,color));
		coordinates.add(new Coordinate(2,0,color));
		coordinates.add(new Coordinate(3,0,color));
		
		return coordinates;
	}
	
	static public ArrayList<Coordinate> listForFourL(Color color) {
		
		ArrayList<Coordinate> coordinates = new ArrayList<Coordinate>();
		
		coordinates.add(new Coordinate(2,0,color));
		coordinates.add(new Coordinate(0,1,color));
		coordinates.add(new Coordinate(1,1,color));
		coordinates.add(new Coordinate(2,1,color));
		
		return coordinates;
	}
	
	static public ArrayList<Coordinate> listForFourZ(Color color) {
		
		ArrayList<Coordinate> coordinates = new ArrayList<Coordinate>();
		
		coordinates.add(new Coordinate(1,0,color));
		coordinates.add(new Coordinate(2,0,color));
		coordinates.add(new Coordinate(0,1,color));
		coordinates.add(new Coordinate(1,1,color));
		
		return coordinates;
	}
	
	static public ArrayList<Coordinate> listForFiveL(Color color) {
		
		ArrayList<Coordinate> coordinates = new ArrayList<Coordinate>();
		
		coordinates.add(new Coordinate(0,0,color));
		coordinates.add(new Coordinate(0,1,color));
		coordinates.add(new Coordinate(1,1,color));
		coordinates.add(new Coordinate(2,1,color));
		coordinates.add(new Coordinate(3,1,color));
		
		return coordinates;
	}
	
	static public ArrayList<Coordinate> listForFiveT(Color color) {
		
		ArrayList<Coordinate> coordinates = new ArrayList<Coordinate>();
		
		coordinates.add(new Coordinate(1,0,color));
		coordinates.add(new Coordinate(1,1,color));
		coordinates.add(new Coordinate(0,2,color));
		coordinates.add(new Coordinate(1,2,color));
		coordinates.add(new Coordinate(2,2,color));
		
		return coordinates;
	}
	
	static public ArrayList<Coordinate> listForFiveRightAngle(Color color) {
		
		ArrayList<Coordinate> coordinates = new ArrayList<Coordinate>();
		
		coordinates.add(new Coordinate(0,0,color));
		coordinates.add(new Coordinate(0,1,color));
		coordinates.add(new Coordinate(0,2,color));
		coordinates.add(new Coordinate(1,2,color));
		coordinates.add(new Coordinate(2,2,color));
		
		return coordinates;
	}
	
	static public ArrayList<Coordinate> listForFiveLongZ(Color color) {
		
		ArrayList<Coordinate> coordinates = new ArrayList<Coordinate>();
		
		coordinates.add(new Coordinate(1,0,color));
		coordinates.add(new Coordinate(2,0,color));
		coordinates.add(new Coordinate(3,0,color));
		coordinates.add(new Coordinate(0,1,color));
		coordinates.add(new Coordinate(1,1,color));
		
		return coordinates;
	}
	
	static public ArrayList<Coordinate> listForFiveZ(Color color) {
		
		ArrayList<Coordinate> coordinates = new ArrayList<Coordinate>();
		
		coordinates.add(new Coordinate(2,0,color));
		coordinates.add(new Coordinate(0,1,color));
		coordinates.add(new Coordinate(1,1,color));
		coordinates.add(new Coordinate(2,1,color));
		coordinates.add(new Coordinate(0,2,color));
		
		return coordinates;
	}
	
	static public ArrayList<Coordinate> listForFiveLong(Color color) {
		
		ArrayList<Coordinate> coordinates = new ArrayList<Coordinate>();
		
		coordinates.add(new Coordinate(0,0,color));
		coordinates.add(new Coordinate(1,0,color));
		coordinates.add(new Coordinate(2,0,color));
		coordinates.add(new Coordinate(3,0,color));
		coordinates.add(new Coordinate(4,0,color));
		
		return coordinates;
	}
	
	static public ArrayList<Coordinate> listForFiveSquare(Color color) {
		
		ArrayList<Coordinate> coordinates = new ArrayList<Coordinate>();
		
		coordinates.add(new Coordinate(0,0,color));
		coordinates.add(new Coordinate(0,1,color));
		coordinates.add(new Coordinate(1,1,color));
		coordinates.add(new Coordinate(0,2,color));
		coordinates.add(new Coordinate(1,2,color));
		
		return coordinates;
	}
	
	static public ArrayList<Coordinate> listForFiveZigZag(Color color) {
		
		ArrayList<Coordinate> coordinates = new ArrayList<Coordinate>();
		
		coordinates.add(new Coordinate(1,0,color));
		coordinates.add(new Coordinate(2,0,color));
		coordinates.add(new Coordinate(0,1,color));
		coordinates.add(new Coordinate(1,1,color));
		coordinates.add(new Coordinate(0,2,color));
		
		return coordinates;
	}
	
	static public ArrayList<Coordinate> listForFiveC(Color color) {
		
		ArrayList<Coordinate> coordinates = new ArrayList<Coordinate>();
		
		coordinates.add(new Coordinate(0,0,color));
		coordinates.add(new Coordinate(1,0,color));
		coordinates.add(new Coordinate(0,1,color));
		coordinates.add(new Coordinate(0,2,color));
		coordinates.add(new Coordinate(1,2,color));
		
		return coordinates;
		
	}
	
	static public ArrayList<Coordinate> listForFiveTL(Color color) {
		
		ArrayList<Coordinate> coordinates = new ArrayList<Coordinate>();
		
		coordinates.add(new Coordinate(1,0,color));
		coordinates.add(new Coordinate(2,0,color));
		coordinates.add(new Coordinate(0,1,color));
		coordinates.add(new Coordinate(1,1,color));
		coordinates.add(new Coordinate(1,2,color));
		
		return coordinates;
	}
	
	static public ArrayList<Coordinate> listForFiveX(Color color) {
		
		ArrayList<Coordinate> coordinates = new ArrayList<Coordinate>();
		
		coordinates.add(new Coordinate(1,0,color));
		coordinates.add(new Coordinate(0,1,color));
		coordinates.add(new Coordinate(1,1,color));
		coordinates.add(new Coordinate(2,1,color));
		coordinates.add(new Coordinate(1,2,color));
		
		return coordinates;
	}
	
	static public ArrayList<Coordinate> listForFiveLongT(Color color) {
		
		ArrayList<Coordinate> coordinates = new ArrayList<Coordinate>();
		
		coordinates.add(new Coordinate(1,0,color));
		coordinates.add(new Coordinate(0,1,color));
		coordinates.add(new Coordinate(1,1,color));
		coordinates.add(new Coordinate(2,1,color));
		coordinates.add(new Coordinate(3,1,color));
		
		return coordinates;
	}
	private void initialize(ArrayList<Coordinate> coordinates, Coordinate origin) {
		
		myCoordinates = new ArrayList<Coordinate>();
		
		for (Coordinate coordinate: coordinates) {
			myCoordinates.add(coordinate);
		}
		
		myOrigin = new Coordinate(origin);
	}
	
	/*
	 * Name:	rotateClockwise
	 * 
	 * Description:	rotates the shape 90 degrees clockwise about the origin
	 */
	public void rotateClockwise() {
		
		for ( Coordinate coordinate : myCoordinates ) {
			
			int tempX = coordinate.myX;
			coordinate.myX = -1 * coordinate.myY;
			coordinate.myY = tempX;
		}
	}
	
	/*
	 * Name:	rotateCounterClockwise
	 * 
	 * Description:	rotates the shape 90 degrees counter clockwise
	 */
	public void rotateCounterClockwise() {
	
	}
	
	/*
	 * Name:	flip
	 * 
	 * Description: Flips the shape across a vertical line coming down
	 * from the origin
	 */
	public void flip() {
		
		for ( Coordinate coordinate : myCoordinates ) {
			
			coordinate.myX = -1 * coordinate.myX;
		}
	}
	
	public void setOrigin( Coordinate newOrigin ) {
		
		myOrigin = newOrigin;
	}
	
	public void changeOrigin( Coordinate newOrigin ) {
		
		Coordinate absoluteCoordinate = new Coordinate(0,0);
		
		for ( Coordinate coordinate : myCoordinates ) {
			
			absoluteCoordinate.myX = coordinate.myX + myOrigin.myX;
			absoluteCoordinate.myY = coordinate.myY + myOrigin.myY;
			
			coordinate.myX = absoluteCoordinate.myX - newOrigin.myX;
			coordinate.myY = absoluteCoordinate.myY - newOrigin.myY;
		}
		
		myOrigin = new Coordinate(newOrigin);
		
		return;
	}
	
	public void moveOriginToTopLeftCorner() {
		
		/* Record the top most square and left most square of this shape. */
		int topValue = 100;
		int leftValue = 100;
		
		for ( Coordinate coordinate : myCoordinates ) {
			
			if ( coordinate.myX < leftValue ) {
				leftValue = coordinate.myX;
			}
			
			if ( coordinate.myY < topValue ) {
				topValue = coordinate.myY;
			}
			
		}
		
		changeOrigin( new Coordinate( leftValue, topValue ) );
		myOrigin = new Coordinate(0,0);
		
		return;
	}
	
}

