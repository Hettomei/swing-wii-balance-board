import wiiremotej.*;
import wiiremotej.event.* ;

public class Listt extends BalanceBoardAdapter{

  private BalanceBoard board;
  private Fenetre fenetre;

  public Listt(BalanceBoard board, Fenetre fenetre)
  {
    this.board = board;
    this.fenetre = fenetre;
    this.fenetre.setVisible(true);
  }

  public void massInputReceived(BBMassEvent evt)
  {
    fenetre.setStr("" + evt.getTotalMass() + " kg");
  }
}

