package org.hollydayProject.game;

import java.util.Scanner;
import static java.lang.System.out;

public class GamerMunuViewer {
	public final Scanner scans = new Scanner(System.in);
	public final Scanner scani = new Scanner(System.in);
	public void GamerMenu(){
		menu("선택해 주세요");
		out.println("1.게이머 정보입력\t2.게이머 통계");
		out.println("3.게임협회 등록명부\t4.게이머 정보수정");
		out.println("5.종족별 보기\t6.프로그램 종료");
	}
	public void noOne() {
		out.println("해당선수를 찾지 못했습니다.");
	}
	public void menu(String s) {
		out.println("=========="+s+"==========");
	}
	
}
