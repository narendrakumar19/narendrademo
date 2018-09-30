package com.ref;

import java.lang.reflect.Method;

public class Reflection {
	
public static void main(String[] args)
{
	Class c=String.class;
	Method[] methods=c.getDeclaredMethods();
	for(Method method:methods)
	{
		System.out.println(method.getName());
	}
	
	
}
}
