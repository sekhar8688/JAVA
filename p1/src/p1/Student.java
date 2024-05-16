package p1;

import java.util.ArrayList;
import java.util.Collections;

class people implements Comparable<people>
{
	 private int id;
	 private String name;
	 private float height;
	 public people() {
		// TODO Auto-generated constructor stub
	}
	public people(int id, String name, float height) {
		super();
		this.id = id;
		this.name = name;
		this.height = height;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	 
	 @Override
	public String toString() {
	  return id + " "+name+" "+height;
	}
	 @Override
	public int compareTo(people p2) {
	 people p1 =this;
	  Integer i1 = p1.id;
	  Integer i2= p2.id;
	   int n =  i1.compareTo(i2);
	   return n; 
	}
}
public class Student {

	public static void main(String[] args) {
		 people p1= new people(2,"sekhar",5.4f);
		 people p2= new people(3,"setty",5.7f);
		 people p3 = new people(1,"rassol",5.8f);
		  ArrayList<people>  al= new ArrayList<people>();
         al.add(p1);
         al.add(p2);
         al.add(p3);
         System.out.println(al);
         Collections.sort(al);
         System.out.println(al);
         
	}

}
