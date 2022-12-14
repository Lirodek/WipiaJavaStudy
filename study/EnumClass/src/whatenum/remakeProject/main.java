package whatenum.remakeProject;

import java.util.ArrayList;
import java.util.List;

public class main {
	public static void main(String[] args) throws Exception {
		NtcVo vo = new NtcVo();
		List<NtcVo> list = new ArrayList<NtcVo>();
		list.add(vo);
		PckgEnum pckg = PckgEnum.getRootDirList(list);
		
		
		
		
	}
}
