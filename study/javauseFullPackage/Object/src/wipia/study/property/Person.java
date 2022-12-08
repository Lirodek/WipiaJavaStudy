package wipia.study.property;

import java.util.Objects;

public class Person implements Cloneable{
	private long id;
	private String name;
	private Person parents;
	@Override
	public int hashCode() {
		int hash = 7;
		
	    hash = 31 * hash + name.hashCode();
	    hash = 31 * hash + (name == null ? 0 : name.hashCode());
	    return hash + (int)id;
		
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
		int other =  obj.hashCode();
		int thisClass = this.hashCode();
		return other == thisClass;
//		return Objects.equals(name, other.name);
	}

	

	public Person getParents() {
		return parents;
	}

	public void setParents(Person parents) {
		this.parents = parents;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}

	public Person(String name, long id) {
		super();
		this.name = name;
		this.id   = id;
	}
	
	

	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Object obj = null;
	    obj = super.clone();
	    return obj;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println(name + "에 있는 finalize()실행");
	}
	
	
	
}