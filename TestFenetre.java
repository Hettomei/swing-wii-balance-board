/*
 * This class is only here to improve Gui
 */
public class TestFenetre{

  public static void main (String[] args){
    TestFenetre a = new TestFenetre();
  }

  private Fenetre fenetre;

  TestFenetre(){
    this.fenetre = new Fenetre();
    fenetre.setVisible(true);
    fenetre.setInfos("Recherche de board, appuyez sur le bouton. 123456789 123456789");
    fenetre.setData("1000 0000 kg");
    fenetre.setData2("1234567890");
    fenetre.setBattery(0.56);
  }
}
