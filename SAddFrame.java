import javax.swing.*;
import java.awt.event.*;
class SAddFrame extends JFrame implements ActionListener
{
JButton b1,b2;JTextField tf1,tf2,tf3;JLabel l1,l2,l3;
SAddFrame()
{
l1=new JLabel("Enter First NO:");
l2=new JLabel("Enter Second No:");
l3=new JLabel("Result:");
tf1=new JTextField();tf2=new JTextField();tf3=new JTextField();
b1=new JButton("ADD");b2=new JButton("CLEAR");
setLayout(new GridLayout(4,2));
add(l1);add(tf1);
add(l2);add(tf2);
add(l3);add(tf3);
add(b1);add(b2);
b1.addActionListener(this); b2.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
String s=ae.getActionCommand();
if(s.equals("ADD"))
{
int n1=Integer.parseInt(tf1.getText());
int n2=Integer.parseInt(tf2.getText());
tf3.setText(""+(n1+n2));
}
else
{
tf1.setText("");tf2.setText("");tf3.setText("");
}
}
public static void main(String a[])
{
SAddFrame af=new SAddFrame();
af.setSize(200,200);
af.setVisible(true);
}
}

