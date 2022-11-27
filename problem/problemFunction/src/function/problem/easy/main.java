package function.problem.easy;

import java.util.ArrayList;
import java.util.List;

import function.problem.vo.SpecialPackage;
import function.problem.vo.TravelPackage;

public class main {
	private static List<TravelPackage> travelPackageList = new ArrayList<TravelPackage>();
	private static List<SpecialPackage> speicalPackageList = new ArrayList<SpecialPackage>();
	static {
		travelPackageList.add(new TravelPackage("title1", null, "/hanil_upfile/travelpckg/title1/", "trv1", ".jpg"));
		travelPackageList.add(new TravelPackage("title1", null, "/hanil_upfile/travelpckg/title1/", "trv2", ".jpg"));
		travelPackageList.add(new TravelPackage("title1", null, "/hanil_upfile/travelpckg/title1/", "trv3", ".jpg"));
		travelPackageList.add(new TravelPackage("title2", null, "/hanil_upfile/travelpckg/title2/", "trv4", ".jpg"));
		travelPackageList.add(new TravelPackage("title3", null, "/hanil_upfile/travelpckg/title3/", "trv5", ".jpg"));
		travelPackageList.add(new TravelPackage("title4", null, "/hanil_upfile/travelpckg/title4/", "trv6", ".jpg"));
		travelPackageList.add(new TravelPackage("title5", null, "/hanil_upfile/travelpckg/title5/", "trv7", ".jpg"));
		travelPackageList.add(new TravelPackage("title6", null, "/hanil_upfile/travelpckg/title6/", "trv8", ".jpg"));
		travelPackageList.add(new TravelPackage("title7", null, "/hanil_upfile/travelpckg/title7/", "trv9", ".jpg"));
		for(int i=0;i<10;i++) {
			speicalPackageList.add(new SpecialPackage("title"+i, null, "/hanil_upfile/travelpckg/title"+i+"/", "trv"+i, ".jpg"));
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=0;
		travelPackageList.get(i++).setAttrPath( "c:/travelPath/"+travelPackageList.get(i).getAddr() + travelPackageList.get(i).getNm() + travelPackageList.get(i).getExtn() );
		travelPackageList.get(i++).setAttrPath( "c:/travelPath/"+travelPackageList.get(i).getAddr() + travelPackageList.get(i).getNm() + travelPackageList.get(i).getExtn() );
		travelPackageList.get(i++).setAttrPath( "c:/travelPath/"+travelPackageList.get(i).getAddr() + travelPackageList.get(i).getNm() + travelPackageList.get(i).getExtn() );
		travelPackageList.get(i++).setAttrPath( "c:/travelPath/"+travelPackageList.get(i).getAddr() + travelPackageList.get(i).getNm() + travelPackageList.get(i).getExtn() );
		travelPackageList.get(i++).setAttrPath( "c:/travelPath/"+travelPackageList.get(i).getAddr() + travelPackageList.get(i).getNm() + travelPackageList.get(i).getExtn() );
		travelPackageList.get(i++).setAttrPath( "c:/travelPath/"+travelPackageList.get(i).getAddr() + travelPackageList.get(i).getNm() + travelPackageList.get(i).getExtn() );
		travelPackageList.get(i++).setAttrPath( "c:/travelPath/"+travelPackageList.get(i).getAddr() + travelPackageList.get(i).getNm() + travelPackageList.get(i).getExtn() );
		travelPackageList.get(i++).setAttrPath( "c:/travelPath/"+travelPackageList.get(i).getAddr() + travelPackageList.get(i).getNm() + travelPackageList.get(i).getExtn() );
		//travelPackageList.get(i++).setAttrPath( travelPackageList.get(i).getAddr() + travelPackageList.get(i).getNm() + travelPackageList.get(i).getExtn() );
		
		i=0;
		speicalPackageList.get(i++).setAttrPath( "c:/specialPath/"+speicalPackageList.get(i).getAddr() + speicalPackageList.get(i).getNm() + speicalPackageList.get(i).getExtn() );
		speicalPackageList.get(i++).setAttrPath( "c:/specialPath/"+speicalPackageList.get(i).getAddr() + speicalPackageList.get(i).getNm() + speicalPackageList.get(i).getExtn() );
		speicalPackageList.get(i++).setAttrPath( "c:/specialPath/"+speicalPackageList.get(i).getAddr() + speicalPackageList.get(i).getNm() + speicalPackageList.get(i).getExtn() );
		speicalPackageList.get(i++).setAttrPath( "c:/specialPath/"+speicalPackageList.get(i).getAddr() + speicalPackageList.get(i).getNm() + speicalPackageList.get(i).getExtn() );
		speicalPackageList.get(i++).setAttrPath( "c:/specialPath/"+speicalPackageList.get(i).getAddr() + speicalPackageList.get(i).getNm() + speicalPackageList.get(i).getExtn() );
		speicalPackageList.get(i++).setAttrPath( "c:/specialPath/"+speicalPackageList.get(i).getAddr() + speicalPackageList.get(i).getNm() + speicalPackageList.get(i).getExtn() );
		speicalPackageList.get(i++).setAttrPath( "c:/specialPath/"+speicalPackageList.get(i).getAddr() + speicalPackageList.get(i).getNm() + speicalPackageList.get(i).getExtn() );
		speicalPackageList.get(i++).setAttrPath( "c:/specialPath/"+speicalPackageList.get(i).getAddr() + speicalPackageList.get(i).getNm() + speicalPackageList.get(i).getExtn() );
		speicalPackageList.get(i++).setAttrPath( "c:/specialPath/"+speicalPackageList.get(i).getAddr() + speicalPackageList.get(i).getNm() + speicalPackageList.get(i).getExtn() );
		
		
		System.out.println("========== travelpckg ==========");
		for(TravelPackage tpckg : travelPackageList) 
			System.out.println(tpckg.getAttrPath());
		System.out.println("========== specialpckg ==========");
		for(SpecialPackage spckg : speicalPackageList) 
			System.out.println(spckg.getAttrPath());
		
		
	}

}
