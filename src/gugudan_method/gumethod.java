package gugudan_method;

public class gumethod {

//	public static int[] calculate(int times) {
//		int [] result = new int[9];
//		for(int i=0 ; i < result.length ; i++) {
//			result[i] = times*(i+1);
//		}
//		return result;
//	}
//	
//	public static void printimes(int[] result) {
//		System.out.println(result[0]+"´Ü");
//		for(int i = 0 ; i < result.length ; i++) {
//			System.out.println(result[0]+"*"+(i+1)+"="+result[i]);
//		}
//	}
//	
//	
//	public static void main(String[] args) {
//		for(int i = 2 ; i < 10 ; i++) {
//			int [] result = calculate(i);
//			printimes(result);
//			System.out.println("");
//		}
//	}
	public static void main(String[] args) {
		//guguclass dan = new guguclass();
		for (int i = 2 ; i < 10 ; i++ ) {
			int[] result = guguclass.calculate(i);
			guguclass.printimes(result);
		}
	}
}
