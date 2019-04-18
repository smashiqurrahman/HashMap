package com.ashiqur.rahman.generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.print.attribute.Size2DSyntax;

public class App{
	HashMap<Integer,String> list = new HashMap<Integer,String>();
	
	public static void main(String[] args) {
		
		App a = new App();
		a.add(1,"Rakib");
		a.add(2,"Mehedi");
		System.out.println(a.list);
		a.delete(2);
		System.out.println(a.list);
		
		
	}
	
	int add(int id,String Name)
	{
		list.put(id,Name);
		return list.size();
	}
	
	void show() {
		System.out.println(list);
	}
	
	int delete(int i) {
		list.remove(i);
		
		return list.size();
	}
	int clear() {
		list.clear();
		
		return list.size();
	}
}