package PhoneBook07Egtukeul;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;
import javax.swing.JTextField;

public class DeleteEventHandler implements ActionListener{
	
	JTextField delField;
	JTextArea textArea;
	
	DeleteEventHandler(JTextField field, JTextArea area){
		
		delField = field;
		textArea = area;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String name = delField.getText();
		PhoneBookManager manager = PhoneBookManager.createManagerInst();
		boolean isDeleted = manager.deleteData(name);
		
		if(isDeleted)
			textArea.append("데이터 삭제를 완료했습니다. \n");
		else
			textArea.append("해당하는 데이터가 존재하지 않습니다. \n");
		
	}
	
}
