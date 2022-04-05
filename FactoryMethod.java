package com.designpattern;


interface DataTypeInterface{
	public void dataType();
}


class TypeInteger implements DataTypeInterface{
	@Override
	public void dataType() {
		System.out.println("User Data Type is Integer!");
	}
}

class TypeCharacter implements DataTypeInterface{
	@Override
	public void dataType() {
		System.out.println("User Data Type is Character!");
	}
}

class TypeString implements DataTypeInterface{
	@Override
	public void dataType() {
		System.out.println("User Data Type is String!");
	}
}

class TypeDouble implements DataTypeInterface{
	@Override
	public void dataType() {
		System.out.println("User Data Type is Double!");
	}
}

class TypeBoolean implements DataTypeInterface{
	@Override
	public void dataType() {
		System.out.println("User Data Type is Boolean!");
	}
}


class objectFactory{
	
	public DataTypeInterface createDatatype(String input)
	{
		DataTypeInterface dataType = null;
		
		if(input.isEmpty() || input.isBlank())
		{
			dataType = null;
			
		}else if(input.length()==0 && Character.isLetter(input.charAt(0)))
		{
			dataType = new TypeCharacter();
			
		}else if(input.equalsIgnoreCase("true") || input.equalsIgnoreCase("false")) {
			
			dataType = new TypeBoolean();
		}else if(CheckInteger(input)) {
			
			dataType = new TypeInteger();
		}else if(CheckDouble(input)) {
			
			dataType = new TypeDouble();
		}else if(CheckString(input)) {
			dataType = new TypeString();
		}else {
			System.out.println("Invalid Input Data Type"); 
		}

		return dataType;
	}
	
	public boolean CheckInteger(String input) {
		boolean results = false;
		try {
			int i = Integer.parseInt(input);
			results = true;
		} catch (Exception ex) {
			results = false;
		}
		return results;
	}
	
	public boolean CheckDouble(String input) {
		boolean results = false;
		try {
			Double i = Double.valueOf(input);
			results = true;
		} catch (Exception ex) {
			results = false;
		}
		return results;
	}
	
	public boolean CheckString(String input) {
		boolean results = false;
		try {
			for (int i = 0; i < input.length(); i++) {
				if(Character.isLetter(input.indexOf(i))) {
					results=   true;
				}
			}
			results = true;
		} catch (Exception ex) {
			results = false;
		}
		return results;
	}
}







public class FactoryMethod {

	public static void main(String[] args) {
		
		
		objectFactory objfactory = new objectFactory();
		
		DataTypeInterface myWrap = objfactory.createDatatype("1232");
	
		
		
	}

}
