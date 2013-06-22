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
    if (count > 2000){
      this.str = other;
      count = 0;
    }
  }

  public void paintComponent(Graphics g){
    Font font = new Font("Courier", Font.BOLD, 75);
    g.setFont(font);
    g.setColor(Color.black);
    g.drawString(this.str, 100, 100);
  }
}
