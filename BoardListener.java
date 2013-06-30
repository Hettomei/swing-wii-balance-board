import wiiremotej.*;
import wiiremotej.event.* ;
import java.text.DecimalFormat;

public class BoardListener extends BalanceBoardAdapter{

  private BalanceBoard board;
  private Fenetre fenetre;
  private DecimalFormat df;
  private double weight;

  public BoardListener(BalanceBoard board, Fenetre fenetre)
  {
    this.board = board;
    this.fenetre = fenetre;
    this.df = new DecimalFormat("#.00");
  }

  public void massInputReceived(BBMassEvent evt)
  {
    weight = evt.getTotalMass();
    fenetre.setData("" + df.format(weight) + " kg");
  }

  public void statusReported(BBStatusEvent evt){
    fenetre.setBattery(evt.getBatteryLevel());
  }

}
