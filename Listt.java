import wiiremotej.*;
import wiiremotej.event.* ;

public class Listt extends BalanceBoardAdapter{

  private static double massX;
  private static double massY;
  private BalanceBoard board;
  //private Fenetre fenetre;

  public Listt(BalanceBoard board) //, Fenetre fenetre)
  {
    this.board = board;
    //this.fenetre = fenetre;
    //this.fenetre.setVisible(true);
  }

  public void massInputReceived(BBMassEvent evt)
  {
    double massTL = evt.getMass(MassConstants.TOP, MassConstants.LEFT);
    double massTR = evt.getMass(MassConstants.TOP, MassConstants.RIGHT);
    double massBL = evt.getMass(MassConstants.BOTTOM, MassConstants.LEFT);
    double massBR = evt.getMass(MassConstants.BOTTOM, MassConstants.RIGHT);

    System.out.println("- " + massTL + " " + massTR + " " + massBL + " " + massBR);

    if (evt.getTotalMass() > 3) { // if mass is too small, don't bother
      double topMass = massTL + massTR;
      double bottomMass = massBL + massBR;
      double leftMass = massTL + massBL;
      double rightMass = massTR + massBR;

      double vertRange = topMass + bottomMass;
      double horizRange = rightMass + leftMass;

      massX = (rightMass-leftMass)/horizRange;
      massY = -(topMass-bottomMass)/vertRange;
    }
    else {
      massX = 0;
      massY = 0;
    }

    System.out.println("X: " + massX);
    System.out.println("Y: " + massY);

    System.out.println(" " + evt.getTotalMass());
    //fenetre.setStr("" + evt.getTotalMass() + " kg");
    //try {
      //Thread.sleep(1000);
    //}catch (InterruptedException ex) { System.out.println("problem de sleep");}
  }
}

