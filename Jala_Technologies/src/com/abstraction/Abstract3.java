package com.abstraction;

abstract class NoNAbstractSample{
	
	void sample() {
		
		System.out.println("Thid is Parent Class Method");
	}
	
}

class NonSampler extends NoNAbstractSample{
	
	class Sampling extends NonSampler{
		 
		void sample() {
			
			NonSampler nonSampler=new NonSampler();
			
			nonSampler.sample();
			
			System.out.println("This is child in child");
		}
	}

	@Override
	void sample() {
		// TODO Auto-generated method stub
		
		System.out.println("This is child");
		
	}
	
}
public class Abstract3 {

	public static void main(String[] args) {

		NonSampler samplerObject=new NonSampler();
		
		samplerObject.sample();

	}

}
