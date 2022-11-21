package org.hollydayProject.game;
import static java.lang.System.out;

public class GamerInfo {
	private String name, tribe, grade;
	private int vz, vt, vp, all,rank;
	public String getTribe() {
		return tribe;
	}
	public void setTribe(String tribe) {
		this.tribe = tribe;
	}
	public int getVz() {
		return vz;
	}
	public void setVz(int vz) {
		this.vz = vz;
	}
	public int getVt() {
		return vt;
	}
	public void setVt(int vt) {
		this.vt = vt;
	}
	public int getVp() {
		return vp;
	}
	public void setVp(int vp) {
		this.vp = vp;
	}
	private double avg;
	public GamerInfo() {}
	public GamerInfo(String name, String tribe, int vz, int vt, int vp) {
		this.name = name;
		this.tribe = tribe;
		this.vz = vz;
		this.vt = vt;
		this.vp = vp;
		this.all = vz+vt+vp;
		this.avg = all/3;
		setAvg();
		getGrade();
	}
	public String getName() {
		return name;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(){
		avg*=100;
		avg=(int)avg;
		avg/=100;
	}
	public void setRank(int rank) {
		this.rank=rank;
	}
	public int getRank() {
		return rank;
	}
	public void GamerShow() {
		out.printf("%d위 %s\t [%s] 선수의 종족은[%s]이고 승률은 %.0f %% 입니다.\n",rank,grade,name,tribe,avg);
	}
	public void tribeShow(int i) {
		out.printf("%d위 %s\t [%s] 선수의 승률은 %.0f %% 입니다.\n",i,grade,name,avg);
	}
	public void GamerDeepShow() {
		out.printf("%d위 %s\t [%s] 선수의 \n종족은[%s]이고 승률은 %.0f %% 입니다.\n",rank,grade,name,tribe,avg);
		out.println("========================");
		out.println("저그전 : "+vz+"%");
		
		out.println("테란전 : "+vt+"%");
		out.println("토스전 : "+vp+"%");
	}
	private void getGrade() {
		if(avg>65) {
			grade= "S급";
		}
		else if(avg>60) {
			grade= "A급";
		}
		else if(avg>55) {
			grade= "B급";
		}
		else if(avg>50) {
			grade= "C급";
		}
		else {
			grade = "아마추어 급";
		}
	}
}
