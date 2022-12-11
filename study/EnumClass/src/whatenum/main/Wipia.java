package whatenum.main;

import java.util.Arrays;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Wipia {
	배광민("광민", "광민주임 입니다"),
	박범진("범진", "범진대리 입니다"),
	지민우("민우", "민우주임 입니다"),
	김선경("선경", "대장주임 입니다"),
	정수진("힘수진", "힘주임 입니다"),
	주수진("수진", "수진주임 입니다"),
	김홍배("부사장님", "부사장님입니다"),
	틀렸어("이거는", "틀린검색결과야");
	
	private final String name;
	private final String description;
	
	
	
	public static Wipia of (String code) {
		return Arrays.stream(Wipia.values())
				.filter(r -> r.getName().equals(code)) 
				.findAny()
				.orElse(틀렸어);
	}
	
}
