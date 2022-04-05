package com.designpattern;



class SingleTonInstance{
	private int data = 10;
	private static SingleTonInstance instance = null;
	
	private SingleTonInstance() {
		
	}

	@Override
	public String toString() {
		return "SingleTonInstance [data=" + data + "]";
	}
	
	public static SingleTonInstance getinstance() {
		
		if(instance == null) {
			
			 instance = new SingleTonInstance();
		}
		
		return instance;
	}
	
}


public class SingleTon 
{

	public static void main(String[] args) {
		
		System.out.println("Single Ton MEthod");
		
		SingleTonInstance singletonObj1 = SingleTonInstance.getinstance();
		SingleTonInstance singletonObj2 = SingleTonInstance.getinstance();
		
		System.out.println(singletonObj1.getinstance().hashCode());
		System.out.println(singletonObj2.getinstance().hashCode());
	}
	
	
	
}
