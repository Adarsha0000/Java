import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class NewProgram implements MouseListener{
    JButton jb; //declaring a button
    JLabel lb; //declaring a label
    NewProgram(){
        JFrame jf = new JFrame("Simple Game"); //creating frame and adding title
        jb = new JButton("Press Me"); // creating an object for button and title of button
        jb.setBounds(10,10,100,20); //setting the position and the size
        jb.addMouseListener(this); //implementing a eventlistner for button
        jf.add(jb); //adding buttom in frame
        jf.setSize(500,500); //setting size for the frame
        jf.setLayout(null); //overall layout of app, if ture get to set the border,grid,etc
        jf.setVisible(true); //making the frame visible
        // lb= new JLabel("Hello");
        // lb.setBounds(40,40,50,30);
        // jf.add(lb);
        // lb.setVisible(false);
    }
    public static void main(String[] args) {
        new NewProgram();
    }
    public void mouseClicked(MouseEvent e){ //runs when mouse is clicked 
        // lb.setVisible(true);
        // jb.setVisible(false);
    }
    
    public void mouseExited(MouseEvent e){ //runs when mouse is not clicked
        
    }
    
    public void mousePressed(MouseEvent e){ //runs when mouse is presssed
        
    }
    
    public void mouseEntered(MouseEvent e){ //runs when hovered
        Random r= new Random();
        int RandX= r.nextInt(400);
        int RandY = r.nextInt(480);
        jb.setBounds(RandX,RandY,100,20);
    }
    
    public void mouseReleased(MouseEvent e){ //runs when mouse is released
        
    }
}