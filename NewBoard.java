import com.intel.bluetooth.BlueCoveConfigProperties;
import java.net.*;
import wiiremotej.*;
import wiiremotej.event.* ;
import java.io.*;
import java.util.Date;//pour limiter le nombre de commande par milliseconde

public class NewBoard{

  public static void main (String[] args){
    //initialisation du bluetooth
    System.setProperty (BlueCoveConfigProperties.PROPERTY_JSR_82_PSM_MINIMUM_OFF, "true") ;

    WiiRemoteJ.setConsoleLoggingAll();

    NewBoard a = new NewBoard();

    a.connecter();
    //a.deconecter();
  }

  private BalanceBoard board = null ;
  private Fenetre f;

  NewBoard(){
    this.f = new Fenetre();
  }

  public void connecter(){
    while (board == null) {
      try {
        System.out.println("Recherche de board");
        board = WiiRemoteJ.findBalanceBoard();//methode bloquante
        /*
          si on veut une board bien précise avec l'adresse mac, faire :
          board = WiiRemoteJ.connectToRemote ("0024F3957B2C") ;
        */
      }
      catch(Exception e) {
        board = null;
        System.out.println("Probleme de connection, reessayez");
      }
    }

    System.out.println("Wii balance connectée ! @MAC: " + board.getBluetoothAddress());

    try{
      board.setLEDIlluminated(true);
      board.addBalanceBoardListener(new Listt(board));
    }
    catch(Exception e){
      e.printStackTrace();
    }

  }

  public void deconnecter(){
    board.disconnect();
  }

}

