import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Panneau extends JPanel {
  private String infos1;
  private String infos2;
  private String data;
  private int count;
  private Font font_settings;
  private Font font_data;

  public Panneau() {
    this.count = 2000;
    this.infos1 = "";
    this.infos2 = "";
    this.data = "";
    this.font_settings = new Font("Courier", Font.BOLD, 20);
    this.font_data = new Font("Courier", Font.BOLD, 50);
  }

  public void setData(String other){
    count++;
    if (count > 30){
      this.data = other;
      this.repaint();
      count = 0;
    }
  }

  public void setInfos(String other){
    int max = 45;

    if (other.length() < max){
      this.infos1 = other.substring(0, other.length());
      this.infos2 = "";
    }
    else {
      this.infos1 = other.substring(0, max);
      this.infos2 = other.substring(max);
    }
  }

  public void paintComponent(Graphics g){
    g.setColor(Color.white);
    g.fillRect(0, 0, this.getWidth(), this.getHeight());
    g.setFont(font_settings);
    g.setColor(Color.black);
    g.drawString(this.infos1, 10, 20);
    g.drawString(this.infos2, 10, 40);

    g.setFont(font_data);
    g.drawString(this.data, 50, 200);
  }
}
