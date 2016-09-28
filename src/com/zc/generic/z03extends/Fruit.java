package com.zc.generic.z03extends;

public class Fruit {  
    private String name;  
  
    public String getName() {  
        return name;  
    }  
    public void setName(String name) {  
        this.name = name;  
    }  
    public static <T extends Fruit> String getFruitName(T t){  
        return t.getName();  
    }  
    
    public static void main(String[] args) {
		Fruit fruit=new Fruit();
		getFruitName(fruit);
		
		Fruit bana=new Banana();
		//限定传入的泛型参数的类型必须是Fruit或其子类型
		getFruitName(bana);
	}
}  

class Banana extends Fruit{  
    public Banana(){  
        setName("bababa");  
    }  
}  

class Apple extends Fruit{  
    public Apple(){  
        setName("apple");  
    }  
}  