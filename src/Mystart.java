import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

class Mystart extends JPanel {
	private static final int EXIT_ON_CLOSE = 0;
	Image Start_img = Toolkit.getDefaultToolkit().getImage("startBG.jpg");
	Image i_start = Toolkit.getDefaultToolkit().getImage("i_start.png");
	Image i_end = Toolkit.getDefaultToolkit().getImage("i_end.png");
	Image s_start = Toolkit.getDefaultToolkit().getImage("s_start.png");
	Image s_end = Toolkit.getDefaultToolkit().getImage("s_end.png");
	public static boolean start = true;
	public static boolean end = false;

	public void paintComponent(Graphics g) {
		g.drawImage(Start_img, 0, 0, 933, 670, this);
		draw_start(g);
		draw_end(g);
	}

	void draw_start(Graphics g) {
		if (start == false) {
			g.drawImage(i_start, 340, 350, 250, 170, this);
		} else {
			g.drawImage(s_start, 340, 350, 250, 170, this);
		}
	}

	void draw_end(Graphics g) {
		if (end == false) {
			g.drawImage(i_end, 340, 510, 250, 170, this);
		} else {
			g.drawImage(s_end, 340, 510, 250, 170, this);
		}
	}
}
