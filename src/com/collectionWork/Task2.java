package com.collectionWork;

class Simple<T>{
	T a;
	Simple(){
		
	}
	Simple(T a){
		this.a = a;
	}
	void display() {
		System.out.println("Your data : " + a);
	}
}

public class Task2 {
	public static void main(String[] args) {
		Simple<int[]> s = new Simple<int[]>()  ;
		s.display();
		
		Simple<Double> s2 = new Simple<>(9.56);
		s2.display();
		
		Simple<Boolean> s3 = new Simple<>(true);
		s3.display();
		
		Simple<String> s4 = new Simple<>("Hello world");
		s4.display();
		
		Simple<String> s5 = new Simple<>("Roshini");
		s5.display();
	}
}
