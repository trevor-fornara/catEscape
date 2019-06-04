package catEscape;

import javax.swing.*;
import java.awt.*;

public class Window {
	
	private JFrame frame;
	private Canvas canvas;
	
	private String title;
	private int width, height;
	
	public Window(String title, int width, int height) {
		this.title = title;
		this.width = width;
		this.height = height;
	}
	
	public void createWindow() {
		//JFrame
		frame = new JFrame(title);
		frame.setSize(width, height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		//Canvas
		canvas = new Canvas();
		canvas.setSize(width, height);
		
		frame.add(canvas);
		
	}
	
	public JFrame getFrame() {
		return frame;
	}
	
}
