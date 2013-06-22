import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Panneau extends JPanel {
  private String str;
  private int count;

  public Panneau() {
    this.count = 2000;
    this.str = "";
  }

  public void setStr(String other){
    count++;
    if (count > 30){
      this.str = other;
      this.repaint();
      count = 0;
    }
  }
  
  public void displayNow(String other){
    this.str = other;
  }

  public void paintComponent(Graphics g){
    Font font = new Font("Courier", Font.BOLD, 55);
    g.setColor(Color.white);
    g.fillRect(0, 0, this.getWidth(), this.getHeight());
    g.setFont(font);
    g.setColor(Color.black);
    g.drawString(this.str, 100, 100);
  }
}
