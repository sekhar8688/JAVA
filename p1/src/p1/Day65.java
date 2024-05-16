package p1;

import java.util.ArrayList;
import java.util.Collections;

class King implements Comparable<King>
{
	 private int id;
	 private String name;
	 private float height;
	 
	 public King() {
		// TODO Auto-generated constructor stub
	}

	public King(int id, String name, float height) {
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
		return id+" "+name+" "+height;
	}
	public int compareTo(King s2) {
       King s1 = this;
       Integer i1 = s1.id;
       Integer i2 = s2.id;
       return i1.compareTo(i2);
	}
	 
}

public class Day65 {

	public static void main(String[] args) {
	King s1 = new King(2,"rakesh",5.6f);
	King s2 = new King(1,"kuintessg",5.6f);
	King s3 = new King(4,"abisheik",5.6f);
	King s4 = new King(3,"basha",5.6f);
	ArrayList<King> al = new ArrayList<King>();
	al.add(s1);
	al.add(s2);
	al.add(s3);
	al.add(s4);
	System.out.println(al);
	Collections.sort(al);
	System.out.println(al);

	}

}
