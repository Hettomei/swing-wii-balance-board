import com.intel.bluetooth.BlueCoveConfigProperties;
import java.net.*;
import wiiremotej.*;
import wiiremotej.event.* ;
import java.io.*;

public class NewBoard{

  public static void main (String[] args){
    //init bluetooth
    System.setProperty (BlueCoveConfigProperties.PROPERTY_JSR_82_PSM_MINIMUM_OFF, "true") ;

    WiiRemoteJ.setConsoleLoggingAll();

    NewBoard a = new NewBoard();

    a.connecter();
    //a.deconecter();
  }

  private BalanceBoard board = null ;
  private Fenetre fenetre;

  NewBoard(){
    this.fenetre = new Fenetre();
  }

  public void connecter(){
    fenetre.setVisible(true);
    while (board == null) {
      try {
        System.out.println("Recherche de board");
        fenetre.setInfos("Recherche de board, appuyez sur le bouton");
        //board = WiiRemoteJ.findBalanceBoard();//methode bloquante, allow you to take the bluetooth ID
        board = WiiRemoteJ.connectToBalanceBoard ("0024446AB360") ;
      }
      catch(Exception e) {
        board = null;
        System.out.println("Probleme de connection, reessayez");
        fenetre.setInfos("Probleme de connection, reessayez");
      }
    }

    System.out.println("Wii balance connectée ! @MAC: ");
    System.out.println(board.getBluetoothAddress());
    fenetre.setInfos("Board connectee.");

    try{
      board.addBalanceBoardListener(new BoardListener(board, fenetre));
      board.requestStatus();
    }
    catch(Exception e){
      e.printStackTrace();
    }

  }

  public void deconnecter(){
    board.disconnect();
  }

}

