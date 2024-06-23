import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
// import java.awt.Color;
// import java.awt.Graphics;

public class AdapterDemo extends MouseMotionAdapter{
    JFrame f;
    AdapterDemo(){
        f= new JFrame("Java Paint");
        f.addMouseMotionListener(this);
        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);
    }
    public void mouseDragged(MouseEvent e){
        Graphics g =f.getGraphics();
        g.setColor(Color.CYAN);
        g.drawOval(e.getX(), e.getY(), 30, 30);
    }
    public static void main(String[] args) {
        new AdapterDemo();
    }
}
