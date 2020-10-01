package herbertschildt.java.classes;

class Box5{
	double width;
	double height;
	double depth;
	
	Box5(double w, double h, double d){
		width = w;
		height = h;
		depth = d;
	}
	
	double volume() {
		return width * height * depth;
	}
}
public class BoxDemo5 {

	public static void main(String[] args) {
		Box5 box1 = new Box5(10,20,15);
		Box5 box2 = new Box5(3,6,9);
		
		double volume;
		
		volume = box1.volume();
		System.out.println("Volume is "+volume);
		
		volume = box2.volume();
		System.out.println("Volume is "+volume);
	}

}
