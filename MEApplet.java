import java.awt.*;
import java.awt.event.*;
import java.applet.*;
//<applet code="MEApplet" width=300 height=300>
//</applet>
public class MEApplet extends Applet implements MouseListener
{
public void init()
{
addMouseListener(this);
}
public void mouseClicked(MouseEvent me)
{
setBackground(Color.yellow);
repaint();
}
public void mouseEntered(MouseEvent me)
{
setBackground(Color.red);
repaint();
}
public void mouseExited(MouseEvent me)
{
setBackground(Color.green);
repaint();
}
public void mousePressed(MouseEvent me)
{
}
public void mouseReleased(MouseEvent me)
{
}
}
