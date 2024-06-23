import javax.swing.*;
import java.awt.event.*;

public class Login implements ActionListener{
    JLabel message;
    JTextField tx1;
    JTextField tx2;

    Login(){
        message = new JLabel();
        JFrame f = new JFrame("Login");

        JLabel lbl1 = new JLabel("Username");
        lbl1.setBounds(10,10,100,20);
        f.add(lbl1);

        tx1 = new JTextField();
        tx1.setBounds(130,10,100,20);
        f.add(tx1);

        JLabel lbl2 = new JLabel("Password");
        lbl2.setBounds(10,60,100,20);
        f.add(lbl2);

        tx2 = new JTextField();
        tx2.setBounds(130,60,100,20);
        f.add(tx2);

        JButton btn = new JButton("Login");
        btn.setBounds(50,100, 100,20);
        btn.addActionListener(this);
        f.add(btn);


        f.setLayout(null);
        f.setSize(500,500);
        f.setVisible(true);

        message.setBounds(10,140,100,20);
        message.setVisible(true);
        f.add(message);
    }
    public static void main(String[] args) {
        new Login();
    }
    
    public void actionPerformed(ActionEvent a){
        if(tx1.getText().equals("admin") && tx2.getText().equals("admin")){
            message.setText("Login Successful");
        }else{
            message.setText("Invalid");
        }
    }
}
