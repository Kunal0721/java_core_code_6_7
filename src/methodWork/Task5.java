package methodWork;

public class Task5 {

	public static void print(int start, int end){
		if(start == end){
			System.out.println(start);
			return ; 
		} 
		else{
			System.out.println(start);
			print(start+1, end);
		} 
	} 
	
	// 1 2 3 4 
	
	// print(1, 5) :
	//		print(2, 5) : 
	//			print(3, 5) : 
	//				print(4, 5) : 
	//					print(5, 5) 

	public static void main(String[] args) {
		print(1, 5);
	}
}
