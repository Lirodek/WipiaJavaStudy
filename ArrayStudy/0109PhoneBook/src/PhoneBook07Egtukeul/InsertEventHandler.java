package PhoneBook07Egtukeul;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;
import javax.swing.JTextField;

public class InsertEventHandler implements ActionListener 
{
	JTextField istField;
	JTextArea textArea;
	
	InsertEventHandler(JTextField istField, JTextArea area)
	{
		this.istField = istField;
		this.textArea = area;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String name = istField.getText();
		PhoneBookManager manager = PhoneBookManager.createManagerInst();
		boolean istResult=true;
		
		if(!(istResult))
			textArea.append("해당하는 사람의 정보는 이미 존재합니다.");
		
		else
		{
			
		}
		
	}
	
}
