package ch7;

import java.awt.*;
import java.awt.event.*;

public class Ex7_Anony {
	public static void main(String[] args) {
		Frame f = new Frame();
		
		//Call and Declaration a method of anonymous class
		//Used only once and thrown away.
		@SuppressWarnings("unused")
		EventHandler windowClosing = new EventHandler() {
			//Override a abstract method of anonymous class
			//Used only once and thrown away.
			public void windowClosing(WindowEvent e) {
				e.getWindow().setVisible(false);
				e.getWindow().dispose();
				System.exit(0);
			}
		};
		
		f.addWindowListener((WindowListener) new EventHandler());
	}//main()
}//Main

//class EventHandler extends WindowAdapter{
//	public void windowClosing(WindowEvent e) {
//		e.getWindow().setVisible(false);
//		e.getWindow().dispose();
//		System.exit(0);
//	}//windowClosing()
//}//EventHandler *extends* WindowAdapter

class EventHandler{
	public void windowClosing(WindowEvent e) {};
}//EventHandler *Anonymous Class*
