package herbertschildt.java.classes;

class Box4{
	double width;
	double height;
	double depth;
	
	Box4(){
		System.out.println("Constructing Box");
		width = 10;
		height = 20;
		depth = 15;
	}
	
	double volume() {
		return width * height * depth;
	}
}
public class BoxDemo4 {

	public static void main(String[] args) {
		Box4 box1 = new Box4();
		Box4 box2 = new Box4();
		
		double volume;
		
		volume = box1.volume();
		System.out.println("Volume is "+volume);
		
		volume = box2.volume();
		System.out.println("Volume is "+volume);
	}

}
