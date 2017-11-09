
public class challenge1 { 
	
	public static void main (String [] args) {
		int [] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int store = 0;
		int marker= array1. length; 
		for (int i = 1; 0 < marker/ 2; i++) {
			store = array1[array1.length-1]; 
			array1 [array1.length-i] = array1[i -1];
			array1 [i-1]= store; 
			marker-=2;
		}
		for (int i = 0; i< array1. length; i++) {
			System.out.print(array1 [i]); 
			                                  
		}
	} 
}
			                        
		


