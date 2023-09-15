package testdb;



import javax.swing.*;

import org.w3c.dom.events.EventTarget;
import org.w3c.dom.events.MouseEvent;
import org.w3c.dom.views.AbstractView;

import java.awt.*;
import java.awt.event.MouseListener;

public class Squarecube implements MouseEvent {

    JFrame f;
    JTextField tr, ti;
    JLabel l1, l2;
    JButton b;

    Squarecube() {
        f = new JFrame("Square and cube", null);
      




        l1 = new JLabel("Enter your number", null, AT_TARGET);
        l1.setBounds(50,50,100,100);
        f.add(l1);

        tr = new JTextField();
        tr.setBounds(50, 150,300,100);
        f.add(tr);

        b= new JButton("Square and cube");
        b.setBounds(50,180,100,100);
        f.add(b);
        b.addMouseListener((MouseListener) this);



        l2 = new JLabel("Result", null, AT_TARGET);
        l2.setBounds(50,300,100,100);
        f.add(l2);

        ti = new JTextField();
        ti.setBounds(50, 500,300,100);
        f.add(ti);




        f.setSize(700, 700);
        f.setVisible(true);
        f.setLayout(null);

    }
    public void MousePressed(MouseEvent e){
        String s1=tr.getText();
        int n=Integer.parseInt(s1);

        int square = n*n;
        String s2=String.valueOf(square);
        ti.setText(s2);
    }

    public static void main(String[] args) {
        new Squarecube();

    }
	@Override
	public AbstractView getView() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int getDetail() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void initUIEvent(String typeArg, boolean canBubbleArg, boolean cancelableArg, AbstractView viewArg,
			int detailArg) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public EventTarget getTarget() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public EventTarget getCurrentTarget() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public short getEventPhase() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public boolean getBubbles() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean getCancelable() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public long getTimeStamp() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void stopPropagation() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void preventDefault() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void initEvent(String eventTypeArg, boolean canBubbleArg, boolean cancelableArg) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public int getScreenX() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int getScreenY() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int getClientX() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int getClientY() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public boolean getCtrlKey() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean getShiftKey() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean getAltKey() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean getMetaKey() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public short getButton() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public EventTarget getRelatedTarget() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void initMouseEvent(String typeArg, boolean canBubbleArg, boolean cancelableArg, AbstractView viewArg,
			int detailArg, int screenXArg, int screenYArg, int clientXArg, int clientYArg, boolean ctrlKeyArg,
			boolean altKeyArg, boolean shiftKeyArg, boolean metaKeyArg, short buttonArg, EventTarget relatedTargetArg) {
		// TODO Auto-generated method stub
		
	}
}


