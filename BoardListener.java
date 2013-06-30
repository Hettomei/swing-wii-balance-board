import wiiremotej.*;
import wiiremotej.event.* ;
import java.text.DecimalFormat;

public class BoardListener extends BalanceBoardAdapter{

  private BalanceBoard board;
  private Fenetre fenetre;
  private DecimalFormat df;

  public BoardListener(BalanceBoard board, Fenetre fenetre)
  {
    this.board = board;
    this.fenetre = fenetre;
    this.df = new DecimalFormat("#.00");
  }

  public void massInputReceived(BBMassEvent evt)
  {
    double a = evt.getTotalMass();

    fenetre.setData("" + df.format(a) + " kg");
  }
}

