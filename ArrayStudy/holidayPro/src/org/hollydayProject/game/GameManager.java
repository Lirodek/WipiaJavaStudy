package org.hollydayProject.game;
import static java.lang.System.out;
public class GameManager {
	private final int MAX = 100;
	GameMethodGather gm = new GameMethodGather();
	GamerMunuViewer mv = new GamerMunuViewer();
	private final GamerInfo[] gInfo = new GamerInfo[MAX];
	public static int curCnt=0;
	{                                         //     저그 테란 토스
		gInfo[curCnt++] = new GamerInfo("염보성","테란",59,62,55);
		gInfo[curCnt++] = new GamerInfo("전상욱","테란",63,55,58);
		gInfo[curCnt++] = new GamerInfo("이윤열","테란",62,61,59);
		gInfo[curCnt++] = new GamerInfo("정명훈","테란",61,60,65);
		gInfo[curCnt++] = new GamerInfo("매정우","저그",60,63,64);
		gInfo[curCnt++] = new GamerInfo("송병구","토스",59,67,61);
		gInfo[curCnt++] = new GamerInfo("최연성","테란",69,60,63);
		gInfo[curCnt++] = new GamerInfo("김택신","토스",70,65,64);
		gInfo[curCnt++] = new GamerInfo("이제동","저그",73,63,69);
		gInfo[curCnt++] = new GamerInfo("허영무","토스",57,63,57);
		gInfo[curCnt++] = new GamerInfo("김윤환","저그",61,48,54);
		gInfo[curCnt++] = new GamerInfo("박정석","토스",47,58,48);
		gInfo[curCnt++] = new GamerInfo("임요환","테란",65,54,53);
		setting();
	}
	private void setting(){
		gm.BubleStrime(gInfo,curCnt);
	}
	private String getString(String s) {
		out.print(s);
		String getString =mv.scans.nextLine();
		return getString;
	}
	private int getChoice() {
		out.print("선택 : ");
		int Choice =mv.scani.nextInt();
		return Choice;
	}
	private int getScore(String s) {
		out.print(s);
		int getScore =mv.scani.nextInt();
		return getScore;
	}
	private void gameInput() {
		mv.menu("게이머 정보등록");
		String name = getString("이름 : ");
		String tribe = getString("종족 : ");
		int vz = getScore("저그전 : ");
		int vt = getScore("테란전 : ");
		int vp = getScore("토스전 : ");
		gInfo[curCnt++] = new GamerInfo(name,tribe,vz,vt,vp);
		out.println("게이머 정보 입력이 완료되었습니다.");
		setting();
		
	}
	private void gameStat() {
		if(curCnt<1)out.println("등록된 선수가 없습니다.");
		else {
			for(int idx=0;idx<curCnt;idx++) {
				gInfo[idx].GamerShow();
			}
		}
	}
	private void proView() {
		mv.menu("게이머 상세정보");
		String name = getString("이름 : ");
		int idx = search(name);
		if(idx<0) mv.noOne();
		else gInfo[idx].GamerDeepShow();
	}
	private void gameModi() {
		mv.menu("게이머 데이터관리");
		out.println("1.삭제\t2.수정");
		int choice = getChoice();
		switch(choice) {
		case MODI_MENU.DELET:
			delet();
			break;
		case MODI_MENU.MODI:
			moid();
			break;
		}
	}
	private void moid() {
		mv.menu("종족, 승률관리");
		String name = getString("이름 : ");
		int idx = search(name);
		if(idx<0) mv.noOne();
		else {
			out.println("1.저그 2.프로토스 3.테란 4.종족");
			int choice = getChoice();
			switch(choice) {
			case GAMEDATA_MENU.ZERG:
				zergModi(name,idx);
				break;
			case GAMEDATA_MENU.PROTOSS:
				tossModi(name,idx);
				break;
			case GAMEDATA_MENU.TERRAN:
				terranModi(name,idx);
				break;
			case GAMEDATA_MENU.TRIBE:
				triModi(name,idx);
				break;
			}
			setting();
		}
		
	}
	public void tossModi(String name,int idx) {
		mv.menu("토스전 승률관리");
		int vp = getScore("토스전 : ");
		gInfo[idx] = new GamerInfo(name,gInfo[idx].getTribe(),gInfo[idx].getVz(),gInfo[idx].getVt(),vp);
		out.println("게이머 종족수정이 완료되었습니다.");
	}
	public void terranModi(String name,int idx) {
		mv.menu("테란전 승률관리");
		int vt = getScore("테란전 : ");
		gInfo[idx] = new GamerInfo(name,gInfo[idx].getTribe(),gInfo[idx].getVz(),vt,gInfo[idx].getVp());
		out.println("게이머 종족수정이 완료되었습니다.");
	}
	public void zergModi(String name,int idx) {
		mv.menu("저그전 승률관리");
		int vz = getScore("저그전 : ");
		gInfo[idx] = new GamerInfo(name,gInfo[idx].getTribe(),vz,gInfo[idx].getVt(),gInfo[idx].getVp());
		out.println("게이머 종족수정이 완료되었습니다.");
	}
	public void triModi(String name,int idx) {
		mv.menu("종족변경");
		String tribe = getString("종족 : ");
		int vz = getScore("저그전 : ");
		int vt = getScore("테란전 : ");
		int vp = getScore("토스전 : ");
		gInfo[idx] = new GamerInfo(name,tribe,vz,vt,vp);
		out.println("게이머 종족수정이 완료되었습니다.");
	}
	private void delet() {
		mv.menu("선수 기록삭제");
		String name = getString("이름 : ");
		int idx = search(name);
		if(idx<0)mv.noOne();
		else {
			for(int idxData=idx;idxData<curCnt;idxData++) {
				gInfo[idxData]=gInfo[idxData+1];
			}
			out.println("게이머 정보삭제가 완료되었습니다.");
			curCnt--;
		}
	}
	private void tribeView() {
		if(curCnt<1) mv.noOne();
		else {
			mv.menu("종족 분포현황");
			out.println("1.저그 2.프로토스 3.테란");
			int choice = getChoice();
			switch(choice) {
			case TRIBE_MENU.ZERG:
				zergViewer();
				break;
			case TRIBE_MENU.PROTOSS:
				tossViewer();
				break;
			case TRIBE_MENU.TERRAN:
				terranViewer();
				break;
				
			}
		}
	}
	private void zergViewer() {
		int trank=1;
		mv.menu("저그선수현황");
		for(int i=0;i<curCnt;i++) {
			if(gInfo[i].getTribe().equals(TRIBE_VAL.ZERG)) {
				gInfo[i].tribeShow(trank++);
			}
		}
		if(trank==1) out.println("등록된 게이머가 없습니다.");
	}
	private void tossViewer() {
		int trank=1;
		mv.menu("토스선수 현황");
		for(int i=0;i<curCnt;i++) {
			if(gInfo[i].getTribe().equals(TRIBE_VAL.PROTOSS)) {
				gInfo[i].tribeShow(trank++);
			}
		}
	}
	private void terranViewer() {
		int trank=1;
		mv.menu("테란선수 현황");
		for(int i=0;i<curCnt;i++) {
			if(gInfo[i].getTribe().equals(TRIBE_VAL.TERRAN)) {
				gInfo[i].tribeShow(trank++);
			}
		}
		if(trank==1) out.println("등록된 게이머가 없습니다.");
	}
	private int search(String name) {
		for(int idx=0;idx<curCnt;idx++) {
			if(gInfo[idx].getName().equals(name)) return idx;
		}return -1;
	}
	private void Menu() {
		mv.GamerMenu();
		int choice = getChoice();
		switch(choice) {
		case INIT_MENU.INPUT://cl
			gameInput();
			break;
		case INIT_MENU.STAT: //cl
			gameStat();
			break;
		case INIT_MENU.PRO: 
			proView();
			break;
		case INIT_MENU.MODI://cl
			gameModi();
			break;
		case INIT_MENU.PROT://cl
			tribeView();
			break;
		case INIT_MENU.EXIT:
			out.println("게이머 등록명부를 종료합니다.");
			System.exit(0);
		}
	}
	public void Start() {
		while(true){
			Menu();
		}
			
	}

}