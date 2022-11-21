package PhoneBook07Egtukeul;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GraphicsConfiguration;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.border.Border;

public class SearchDelFrame extends JFrame{
//	private static final GraphicsConfiguration title = null;
	JTextField searchField = new JTextField(15);
	JButton searchBtn = new JButton("SEARCH");
	
	JTextField delField = new JTextField(15);
	JButton delBtn = new JButton("DEL");
	
	JTextField allField = new JTextField();
	JButton allBtn = new JButton("SEARCH(ALL)");
	
	JTextArea textArea = new JTextArea(20, 25);
	
	class InnerClass implements WindowListener
	{
		public void windowOpened(WindowEvent e) {}
		public void windowClosing(WindowEvent e) 
		{
			System.out.println("\n프로그램을 종료합니다.");
			dispose();
			System.exit(0);
		}
		public void windowClosed(WindowEvent e) {}
		public void windowIconified(WindowEvent e) {}
		public void windowDeiconified(WindowEvent e) {}
		public void windowActivated(WindowEvent e) {}
		public void windowDeactivated(WindowEvent e) {}
		
	}
	
	public SearchDelFrame(String title) {
		super(title);
		setBounds(100, 200, 450, 550);
		setLayout(new BorderLayout());
		Border border = BorderFactory.createEtchedBorder();
		
		Border srchBorder = BorderFactory.createTitledBorder(border, "Search");
		JPanel srchPanel = new JPanel();
		srchPanel.setBorder(srchBorder);
		srchPanel.setLayout(new FlowLayout());
		srchPanel.add(searchField);
		srchPanel.add(searchBtn);
		
		Border allBorder = BorderFactory.createTitledBorder(border, "SearchAll");
		JPanel allPanel = new JPanel();
		allPanel.setBorder(allBorder);
		allPanel.setLayout(new FlowLayout());
		allPanel.add(allField);
		allPanel.add(allBtn);
		
		Border delBorder = BorderFactory.createTitledBorder(border, "Delete");
		JPanel delPanel = new JPanel();
		delPanel.setBorder(delBorder);
		delPanel.setLayout(new FlowLayout());
		delPanel.add(delField);
		delPanel.add(delBtn);
		
		JScrollPane scrollTextArea = new JScrollPane(textArea);
		Border textBorder = BorderFactory.createTitledBorder(border, "Infomation Board");
		scrollTextArea.setBorder(textBorder);
		
		add(allPanel, BorderLayout.WEST);
		add(srchPanel, BorderLayout.NORTH);
		add(delPanel, BorderLayout.SOUTH);
		add(scrollTextArea, BorderLayout.CENTER);
		
		allBtn.addActionListener(new SallEventHandler(allField, textArea));
		searchBtn.addActionListener(new SearchEventHandler(searchField, textArea));
		delBtn.addActionListener(new DeleteEventHandler(delField, textArea));
		
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		
		WindowListener inner = new InnerClass();
		addWindowListener(inner);
	}
}
