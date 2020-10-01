package herbertschildt.java.classes;

class Box3 {
	double width;
	double height;
	double depth;
	
	double volume() {
		return width * height * depth;
	}
}
public class BoxDemo3 {

	public static void main(String[] args) {
		Box3 box1 = new Box3();
		Box3 box2 = new Box3();
		double volume;
		
		box1.width = 10;
		box1.height = 20;
		box1.depth = 15;
		
		box2.width = 3;
		box2.height = 6;
		box2.depth = 9;
		
		volume = box1.volume();
		System.out.println("Volume is "+volume);
		
		volume = box2.volume();
		System.out.println("Volume is "+volume);

	}

}
