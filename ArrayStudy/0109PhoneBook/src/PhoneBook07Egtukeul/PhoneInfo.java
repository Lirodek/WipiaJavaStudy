package PhoneBook07Egtukeul;

import java.io.Serializable;
import java.util.Objects;

public class PhoneInfo implements Serializable{
	String name;
	String PhoneNumber;
	
	public PhoneInfo() {
		this("","");
	}
	
	public PhoneInfo(String name, String phone) {
		this.name = name;
		this.PhoneNumber = phone;
	}

	@Override
	public String toString() {
		return "name : " + name + "\nphone : " + PhoneNumber + "\n";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}
	
	@Override
	public boolean equals(Object obj) {
		PhoneInfo cmp = (PhoneInfo)obj;
		if(name.compareTo(cmp.name)==0)
			return true;
		else
			return false;
	}
	
}
class PhoneUnivInfo extends PhoneInfo{
	String major;
	int year;
	
	public PhoneUnivInfo() {
		this("","","",0);
	}

	public PhoneUnivInfo(String name, String phone, String major, int year) {
		super(name,phone);
		this.major = major;
		this.year = year;
	}
	@Override
	public String toString() {
		return super.toString()+"major : "+ major +"\nyear : "+ year + "\n";
	}
}
class PhoneCompanyInfo extends PhoneInfo{
	String company;
	
	public PhoneCompanyInfo() {
		this("","","");
	}

	public PhoneCompanyInfo(String name, String phone, String company) {
		super(name,phone);
		this.company = company;
	}
	@Override
	public String toString() {
		return super.toString()+"company : "+ company +"\n";
	}
}
