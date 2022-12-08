package PhoneBook07Egtukeul;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashSet;
import java.util.Iterator;

public class PhoneBookManager {
	
	private final File dataFile = new File("PhoneBook.dat");
	HashSet<PhoneInfo> infoStorage = new HashSet<PhoneInfo>();
	
	static PhoneBookManager inst = null;

	private PhoneBookManager() {
		readFromFile();
	}
	
	public static PhoneBookManager createManagerInst() {
		
		if(inst == null) 
			inst = new PhoneBookManager();
		
		return inst;
		
	}
	
	private PhoneInfo readFriendInfo() {
		String name = getString("이름 : ");
		String phone = getString("번호 : ");
		return new PhoneInfo(name, phone);
	}
	
	private PhoneInfo readUnivFriendInfo() {
		String name = getString("이름 : ");
		String phone = getString("번호 : ");
		String major = getString("전공 : ");
		int year = getInteger("학년 : ");
		
		return new PhoneUnivInfo(name,phone,major, year);
	}

	private PhoneInfo readCompanyFriendInfo() {
		String name = getString("이름 : ");
		String phone = getString("번호 : ");
		String company = getString("회사 : ");
		
		return new PhoneCompanyInfo(name, phone, company);
	}
	
	public void inputData() throws MenuChoiceException{
		System.out.println("데이터 입력을 시작합니다.");
		System.out.println("1.일반, 2.대학, 3.회사");
		int choice = getInteger("선택 >> ");
		PhoneInfo info=null;
		
		if(choice<INPUT_SELECT.NORMAL || choice>INPUT_SELECT.COMPANY)
			throw new MenuChoiceException(choice);
		
		switch(choice) {
		case INPUT_SELECT.NORMAL:
			info = readFriendInfo();
			break;
			
		case INPUT_SELECT.UNIV:
			info = readUnivFriendInfo();
			break;
			
		case INPUT_SELECT.COMPANY:
			info = readCompanyFriendInfo();
			break;
		}
		boolean isAdded = infoStorage.add(info);
		if(isAdded==true)
			System.out.println("데이터 입력이 완료되었습니다. \n");
		else
			System.out.println("이미 저장된 데이터 입니다. \n");
	}
	
	public String allData() {
		String allData="";
		Iterator<PhoneInfo> itr;
		try {
			itr = infoStorage.iterator();
		} catch (Exception e) {
			System.out.println("데이터 검색에 실패했습니다.");
			return null;
		}
		while(itr.hasNext()) {
			allData += itr.next().toString()+"\n";
		}
		return allData;
	}
	
	public String searchData(String name) {
		PhoneInfo info = search(name);
		if(info==null)
			return null;
		
		else
			return info.toString();
	}
	public boolean deleteData(String name) {
		
		Iterator<PhoneInfo> itr = infoStorage.iterator();
		
		while(itr.hasNext()) {
			PhoneInfo curInfo = itr.next();
			
			if(name.equals(curInfo.name)) {
				itr.remove();
				return true;
			}
		
		}
		return false;
	}
	
	public PhoneInfo search(String name) {
		
		Iterator<PhoneInfo> itr = infoStorage.iterator();
		
		while(itr.hasNext()) {
			PhoneInfo curInfo = itr.next();
			
			if(curInfo.name.equals(name))
				return curInfo;
		}
		
		return null;
	}
	
	private int getInteger(String s) {
		
		System.out.print(s);
		int i = MenuViewer.sci.nextInt();
		
		return i;
	}
	
	private String getString(String s) {
		
		System.out.print(s);
		String getString = MenuViewer.sc.nextLine();
		return getString;
		
	}
	
	public void storeToFile() {
		try {
			FileOutputStream file = new FileOutputStream(dataFile);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			Iterator<PhoneInfo> itr = infoStorage.iterator();
			while(itr.hasNext()) 
				out.writeObject(itr.next());
			
			out.close();
			
		} catch(IOException e) {
			System.out.println("데이터 검색이 완료되었습니다.");
		}
	}
	public void readFromFile() {
		
		if(dataFile.exists()==false)
			return;
		
		try {
			FileInputStream file = new FileInputStream(dataFile);
			ObjectInputStream in = new ObjectInputStream(file);
			
			while(true) {
				PhoneInfo info = (PhoneInfo)in.readObject();
				if(info==null)
					break;
				
				infoStorage.add(info);
			}
			
			in.close();
		} catch (ClassNotFoundException e) {
			System.out.println("데이터 로드 실패");
			return;
		} catch(IOException e) {
			System.out.println("데이터 로드 완료..");
			return;
		}
	}
}
