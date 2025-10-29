
public class Operation {

	public static void main(String[] args) {
	
		System.out.println(add(5,2));
		System.out.println(sub(5,2));
		System.out.println(mul(5,2));
		System.out.println(div(5,0));
		
		triangle();
		
		int [] intArray = {78, 6,-250, 2, 12, 9};
		System.out.println(getSumTwoHighestNumbers(intArray));
	}
	
	public static int add(int a,int b) {
		int result = a + b;
		return result;
	}
	
	public static int sub(int a,int b) {
		int result = a - b;
		return result;
	}
	
	public static int mul(int a,int b) {
		int result = a * b;
		return result;
	}
	
	public static float div(int a,int b) {
		if(b != 0) {
			float result = a / b;
			return result;
		} else {
			float result = 0;
			System.out.println("erreur");
			return result;
		}
	}
	
	public static void triangle() {
		int triangleHeight = 6;
		int triangleMaxWidth = 13;
		int [] triangleWidth = {1,3,5,7,9,11,13};
		for (int i = 0; i < triangleHeight;i++ ) {
			
			for (int k=1;k<(triangleMaxWidth-i)+1 /2;k++) {
				System.out.print(" ");
			}
			for (int j=0; j<triangleWidth[i];j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
	}
	
	public static int getSumTwoHighestNumbers(int [] intArray){
		int firstHighestNumber = 0;
		int secondHighestNumber = 0;
		for (int i=0;i<intArray.length;i++) {
			if(intArray[i]>=firstHighestNumber) {
				
				secondHighestNumber = firstHighestNumber;	
				firstHighestNumber = intArray[i];
			} else if (intArray[i]>=secondHighestNumber) {
				secondHighestNumber = intArray[i]; ;
			}
		}
		return firstHighestNumber + secondHighestNumber ;
	}
}
