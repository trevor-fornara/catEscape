package catEscape;

import java.awt.BorderLayout;

import javax.swing.*;

public class TitleScreen {
	
	Window display = new Window("Cat Escape", 1000, 1000);
	
	private ImageIcon backgr = new ImageIcon("catEscape/finalImages/title.jpg");
	private ImageIcon titl = new ImageIcon("catEscape/finalImages/text.jpg");
	
	JLabel background = new JLabel("", backgr, JLabel.CENTER);
	JLabel title = new JLabel("", titl, JLabel.CENTER);
	
	public void titleScreen() {
		
	}
	
	public void createTitleScreen() {
		display.createWindow();
		display.getFrame().add(background, BorderLayout.CENTER);
		display.getFrame().add(title, BorderLayout.CENTER);
	}
}
