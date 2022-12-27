package kr.co.defanotation;


public class PeopleVo {
	private String name;
	private String hope;
	private Integer age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHope() {
		return hope;
	}
	public void setHope(String hope) {
		this.hope = hope;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	
	@SuppressWarnings(value = { "" })
	public void getExection() {
		int excetion[] = new int[2];
		excetion[3] = 4;
	}
}
