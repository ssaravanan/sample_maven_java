package com.sample;

import java.util.UUID;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        App obj = new App();
        System.out.println("Unique ID : " + obj.generateUniqueKey());
    }

	
    public String generateUniqueKey(){

    	String id = UUID.randomUUID().toString();
	id = UUID.randomUUID().toString();
	id = UUID.randomUUID().toString();
    	return id;
	

    }

    public String generateUniqueKey2(){

    	String id = UUID.randomUUID().toString();
    	return id;

    }
}
