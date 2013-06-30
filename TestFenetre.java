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
    fenetre.setInfos("Recherche de board, appuyez sur le bouton."); //3456789 123456789");
  }
}
