package week5Assignment;
import java.util.*;
import java.lang.*;
import java.text.SimpleDateFormat;
import java.util.Date;
public class SpacedLogger {
  private static final SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");

  public void spaceLog(String spaceLog) {
    Date date = new Date();
    String spacedString = spaceLog.replaceAll(".(?=.)", "$0 ");
    System.out.println(sdf1.format(date) +" : " + spacedString);
  }
  public void spaceErr(String spaceErr) {
    Date date = new Date();
    String spacedString = spaceErr.replaceAll(".(?=.)", "$0 ");
    System.out.println(sdf1.format(date) + " ERROR:" + spacedString);
  }
}
