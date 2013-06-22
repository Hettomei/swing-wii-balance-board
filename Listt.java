import wiiremotej.*;
import wiiremotej.event.* ;
import java.text.DecimalFormat;

public class Listt extends BalanceBoardAdapter{

  private BalanceBoard board;
  private Fenetre fenetre;
  private DecimalFormat df;

  public Listt(BalanceBoard board, Fenetre fenetre)
  {
    this.board = board;
    this.fenetre = fenetre;
    this.fenetre.setVisible(true);
    this.df = new DecimalFormat("#.00");
  }

  public void massInputReceived(BBMassEvent evt)
  {
    double a = evt.getTotalMass();

    fenetre.setStr("" + df.format(a) + " kg");
  }
}

