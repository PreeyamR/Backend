package herbertschildt.java.classes;

class Box2{
	double width;
	double height;
	double depth;
	
	void volume() {
		System.out.println("Volume is ");
		System.out.println(width * height * depth);
	}
}
public class BoxDemo2 {
	public static void main(String[] args) {
		Box2 box1 = new Box2();
		Box2 box2 = new Box2();
		
		//assign values to box1
		box1.width = 10;
		box1.height = 20;
		box1.depth = 15;
		
		//assign values to box2
		box2.width = 3;
		box2.height = 6;
		box2.depth = 9;
		
		//volume of first box
		box1.volume();
		
		//volume of second box
		box2.volume();
	}

}
