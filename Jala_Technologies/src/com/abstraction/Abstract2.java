package com.abstraction;

abstract class AbstractSample{
	
	abstract void sample();
	
}

class Sampler extends AbstractSample{
	
	class Sampling extends Sampler{
		 
		void sample() {
			
			System.out.println("This is child in child");
		}
	}

	@Override
	void sample() {
		// TODO Auto-generated method stub
		
		System.out.println("This is child");
		
	}
	
}
public class Abstract2 {

	public static void main(String[] args) {

		Sampler samplerObject=new Sampler();
		
		samplerObject.sample();

	}

}
