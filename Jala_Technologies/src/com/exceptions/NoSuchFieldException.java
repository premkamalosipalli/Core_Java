package com.exceptions;    

public class NoSuchFieldException {

	private Object obj;
	  
	NoSuchFieldException()
    {
  
        class Arr {
        };
  
        obj = new Arr();
    }
    
	public static void main(String[] args) {

		NoSuchFieldException t = new NoSuchFieldException();
		  
        // returns the Class object
        Class myClass = t.obj.getClass();
  
        String fieldName = "obj";
  
        try {
            // Get the field of myClass
            // using getField() method
            System.out.println(
                fieldName + " Field of myClass: "
                + myClass.getField(fieldName));
        }
        catch (Exception e) {
            System.out.println(e);
        }
    
	}

}
