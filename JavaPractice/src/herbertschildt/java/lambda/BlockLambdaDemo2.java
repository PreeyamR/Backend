package herbertschildt.java.lambda;

interface StringFunc {
	String func(String n);
}
public class BlockLambdaDemo2 {
	public static void main(String[] args) {
		StringFunc reverse = (str) -> {
			String result = "";
			int i;
			System.out.println(str);
			for(i = str.length()-1; i >= 0; i++)
				result += str.charAt(i);
			
			return result;
		};
		
		
		System.out.println("racecar reverse :"+ reverse.func("racecar"));
	}

}
