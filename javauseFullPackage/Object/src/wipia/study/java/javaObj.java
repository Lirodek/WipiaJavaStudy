package wipia.study.java;

import java.util.Objects;

public class javaObj {
	public static void main(String[] args) {
		//getClassEx(new Minwoo());
		hashCodeEx();
	}
	
	private static void getClassEx(Object obj) {
		GwangMin lirodek = new GwangMin();
		System.out.println(lirodek.getClass());
		System.out.println(obj.getClass());
	}
	
	private static void hashCodeEx() {
//		String hello = "안녕하세요	";
//		String hellokr = "안녕하세요";
//		System.out.println(hello.hashCode());
//		System.out.println(hellokr.hashCode());
		
		System.out.println(new Person("배광민").hashCode());
		System.out.println(new Person("배광민").hashCode());
	}


}
class Person{
	private long id;
	private String name;
	@Override
	public int hashCode() {
		int hash = 7;
	    hash = 31 * hash + name.hashCode();
	    hash = 31 * hash + (name == null ? 0 : name.hashCode());
	    return hash;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}

	public Person(String name) {
		super();
		this.name = name;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
class Minwoo{
	
}

class GwangMin{
	
}
