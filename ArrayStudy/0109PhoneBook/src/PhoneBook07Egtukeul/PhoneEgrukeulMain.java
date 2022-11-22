package PhoneBook07Egtukeul;

import javax.swing.JFrame;

public class PhoneEgrukeulMain {

	public static void main(String[] args) {
		PhoneBookManager manager = PhoneBookManager.createManagerInst();
		JFrame winFrame = new SearchDelFrame("PhoneBookVer09");
		int choice;
		int hihi;
		while(true) {
			try {
				MenuViewer.showMenu();
				choice = MenuViewer.sci.nextInt();
				
				if(choice<INIT_MENU.INPUT||choice>INIT_MENU.EXIT)
					throw new MenuChoiceException(choice);
				
				switch(choice) {
				case INIT_MENU.INPUT:
					manager.inputData();
					break;
				case INIT_MENU.EXIT:
					manager.storeToFile();
					System.out.println("프로그램을 종료합니다.");
					System.exit(0);
					return;
				}
					
			} catch(MenuChoiceException e) {
				e.showWrongChoice();
				System.out.println("메뉴 선택을 처음부터 다시 진행합니다. \n");
			}
		}

	}

}
