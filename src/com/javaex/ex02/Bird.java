package com.javaex.ex02;

public abstract class Bird {
    protected String name;

    public Bird(){     
		
	}


   
    public abstract void sing();
    public abstract void fly();
    public abstract void setName(String name);
    public abstract void showName();
    
}
