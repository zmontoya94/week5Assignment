package week5Assignment;

import java.text.SimpleDateFormat;
import java.util.Date;
//Added Date functionality... despite it not being in the asignment because... 
//What kinda logger doesnt log when the error or log happens? 
public class AsteriskLogger {
  private static final SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");
  public void astriskLog (String AsteriskLog) {
    Date date = new Date();
    System.out.println("***" + sdf1.format(date) +" : " + AsteriskLog + "***");
  }
  public void astriskErr (String AstriskErr) {
    Date date = new Date();
    String errText = ("***" + sdf1.format(date) + " ERROR:" + AstriskErr + "***");
    int countErrText = errText.length();
    for (int i = 0 ; i < countErrText ; i++) {
      System.out.print("*");
      }
    System.out.println("");
    System.out.println(errText);
    
    for (int i = 0 ; i < countErrText ; i++) {
      System.out.print("*");
      }
    System.out.println("");
  }
}
