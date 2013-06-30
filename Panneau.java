import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Panneau extends JPanel {
  private String infos1;
  private String infos2;
  private String data;
  private String data2;
  private String battery;
  private int count;
  private int count2;
  private Font font_settings;
  private Font font_data;
  private Font font_battery;

  public Panneau() {
    this.count         = 2000;
    this.count2        = 2000;
    this.battery       = "";
    this.infos1        = "";
    this.infos2        = "";
    this.data          = "";
    this.data2          = "";
    this.font_settings = new Font("Courier", Font.BOLD, 20);
    this.font_data     = new Font("Courier", Font.BOLD, 50);
    this.font_battery  = new Font("Courier", Font.BOLD, 10);
  }

  public void setBattery(double other){
    this.battery = "Batterie : " + (int)(other*100) + " %";
  }

  public void setData(String other){
    count++;
    if (count > 30){
      this.data = other;
      this.repaint();
      count = 0;
    }
  }

  public void setData2(String other){
    count2++;
    if (count2 > 30){
      this.data2 = other;
      this.repaint();
      count2 = 0;
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
    clean_space(g);
    draw_infos(g);
    draw_battery(g);
    draw_data1(g);
    draw_data2(g);
  }

  public void clean_space(Graphics g){
    g.setColor(Color.white);
    g.fillRect(0, 0, this.getWidth(), this.getHeight());
  }

  public void draw_battery(Graphics g){
    g.setFont(font_battery);
    g.setColor(Color.black);
    g.drawString(this.battery, this.getWidth() - 100, this.getHeight() - 10);
  }

  public void draw_infos(Graphics g){
    g.setFont(font_settings);
    g.setColor(Color.black);
    g.drawString(this.infos1, 10, 20);
    g.drawString(this.infos2, 10, 40);
  }

  public void draw_data1(Graphics g){
    g.setFont(font_data);
    g.setColor(Color.black);
    g.drawString(this.data, 50, 200);
  }

  public void draw_data2(Graphics g){
    g.setFont(font_data);
    g.setColor(Color.black);
    g.drawString(this.data2, 50, 250);
  }
}
