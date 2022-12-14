package whatenum.remakeProject;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import whatenum.main.Wipia;

@Getter
@RequiredArgsConstructor
public enum PckgEnum {
	SpcPckg("SpcPckg"), TrvPckg("TrvPckg"), NtcVo("NtcVo"), Not("notting");
	
	private final String pckgName;
	
	static PckgEnum getRootDirList(List<? extends BaseVo> list) throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		Class<?> returnList = Class.forName(list.get(0).getClass().getName());
		Object newObj = returnList.getInterfaces();
		Method m = returnList.getDeclaredMethod("show", boolean.class);
		System.out.println(m.invoke(newObj, true).getClass().getName()); 
		System.out.println(newObj.getClass().getName());
		
		return Arrays.stream(PckgEnum.values())
				.filter(r -> r.getPckgName().equals(list.get(0).getClass().getSimpleName())) 
				.findAny()
				.orElse(Not);
	}
}
