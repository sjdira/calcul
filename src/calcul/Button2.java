package calcul;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

@SuppressWarnings("serial")
public class Button2 extends JButton implements MouseListener{
	
	public Button2(String str){
		super(str);
		this.setBackground(Color.orange);
		this.setForeground(Color.black);
		this.setPreferredSize(new Dimension(75,30));
		this.addMouseListener(this);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		this.setBackground(new Color(192,192,192));
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		this.setBackground(new Color(192,192,192));
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		this.setBackground(Color.orange);
	}
}