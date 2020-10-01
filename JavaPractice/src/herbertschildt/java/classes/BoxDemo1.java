package herbertschildt.java.classes;

class Box1 {
	double width;
	double height;
	double depth;
}

public class BoxDemo1{
	public static void main(String[] args) {
		Box1 box1 = new Box1();
		Box1 box2;
		box2 = new Box1();
		double volume;
		
		//assign values
		box1.width = 10;
		box1.height = 20;
		box1.depth = 15;
		
		box2.width = 3;
		box2.height = 6;
		box2.depth = 9;
		
		//box1 volume
		volume = box1.width * box1.height * box1.depth;
		System.out.println("Volume is "+volume);
		
		//box2 volume
		volume = box2.width * box2.height * box2.depth;
		System.out.println("Volume is "+volume);
	}
}

