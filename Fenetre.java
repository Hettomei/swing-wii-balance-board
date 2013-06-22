import javax.swing.JFrame;

public class Fenetre extends JFrame {

  private Panneau p;

  public Fenetre(){
    this.setTitle("Pese personne Java");
    this.setSize(500, 400);
    this.setLocationRelativeTo(null);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    p = new Panneau();
    this.setContentPane(p);
  }

  public void setStr(String str){
    p.setStr(str);
  }
}
