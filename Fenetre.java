import javax.swing.JFrame;

public class Fenetre extends JFrame {

  private Panneau p;

  public Fenetre(){
    this.setTitle("Pese personne Java");
    this.setSize(600, 500);
    this.setLocationRelativeTo(null);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    p = new Panneau();
    this.setContentPane(p);
  }

  public void setData(String str){
    p.setData(str);
  }

  public void setInfos(String other){
    p.setInfos(other);
  }
}
