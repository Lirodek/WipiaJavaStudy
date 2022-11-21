package PhoneBook07Egtukeul;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;
import javax.swing.JTextField;

public class SallEventHandler implements ActionListener{
	
	JTextField allField;
	JTextArea textArea;
	
	SallEventHandler(JTextField field, JTextArea area){
		
		allField = field;
		textArea = area;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		PhoneBookManager manager = PhoneBookManager.createManagerInst();
		String allDataResult = manager.allData();
		if(allDataResult==null)
			textArea.append("\n저장된 데이터가 없습니다.\n");
		else {
			textArea.append("\n저장된 정보를 보여드립니다.\n");
			textArea.append(allDataResult);
			textArea.append("\n");
		}
		
		
	}
	
	
}
