package function.problem.vo;

import java.util.Objects;

public class BaseVo {
	private String title;
	private String attrPath;
	
	public BaseVo() {
		super();
	}
	public BaseVo(String title, String attrPath) {
		super();
		this.title = title;
		this.attrPath = attrPath;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAttrPath() {
		return attrPath;
	}
	public void setAttrPath(String attrPath) {
		this.attrPath = attrPath;
	}
	@Override
	public int hashCode() {
		return Objects.hash(attrPath, title);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BaseVo other = (BaseVo) obj;
		return Objects.equals(attrPath, other.attrPath) && Objects.equals(title, other.title);
	}
	@Override
	public String toString() {
		return "BaseVo [title=" + title + ", attrPath=" + attrPath + "]";
	}
	
}
