package PhoneBook07Egtukeul;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;
import javax.swing.JTextField;

public class SearchEventHandler implements ActionListener{
	JTextField searchField;
	JTextArea textArea;
	SearchEventHandler(JTextField field, JTextArea area){
		searchField = field;
		textArea = area;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String name = searchField.getText();
		PhoneBookManager manager = PhoneBookManager.createManagerInst();
		String searchResult = manager.searchData(name);
		
		if(searchResult==null) {
			textArea.setText(null);
			textArea.append("해당하는 데이터가 존재하지 않습니다. \n");
		}
		
		else {
			textArea.setText(null);
			textArea.append("찾으시는 정보를 알려드립니다. \n");
			textArea.append(searchResult);
			textArea.append("\n");
		}
		
	}

}
