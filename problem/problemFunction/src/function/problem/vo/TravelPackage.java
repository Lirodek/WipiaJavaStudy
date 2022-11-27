package function.problem.vo;

import java.util.Objects;

public class TravelPackage extends BaseVo{
	private String addr;
	private String nm;
	private String extn;
	
	
	
	/**
	 * 
	 */
	public TravelPackage() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param title
	 * @param attrPath
	 * @param addr
	 * @param nm
	 * @param extn
	 */
	public TravelPackage(String title, String attrPath, String addr, String nm, String extn) {
		super(title, attrPath);
		this.addr = addr;
		this.nm = nm;
		this.extn = extn;
	}
	
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getNm() {
		return nm;
	}
	public void setNm(String nm) {
		this.nm = nm;
	}
	public String getExtn() {
		return extn;
	}
	public void setExtn(String extn) {
		this.extn = extn;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(addr, extn, nm);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		TravelPackage other = (TravelPackage) obj;
		return Objects.equals(addr, other.addr) && Objects.equals(extn, other.extn) && Objects.equals(nm, other.nm);
	}
	@Override
	public String toString() {
		return "SpecialPackage [addr=" + addr + ", nm=" + nm + ", extn=" + extn + "]";
	}
}
