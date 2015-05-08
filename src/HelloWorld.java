
import java.applet.Applet;
import java.awt.*;
public class HelloWorld extends Applet{
public void paint(Graphics g){	
  g.drawString("Hell World",70,100);
  this.setBackground(new Color(120, 180, 140));
  g.setColor(Color.blue);
}
}

