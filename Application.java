package week5Assignment;

public class Application {

  public static void main(String[] args) {
    AsteriskLogger myAstErr = new AsteriskLogger();
    myAstErr.astriskErr("This is a really cool Error");
    AsteriskLogger myAstLog = new AsteriskLogger();
    myAstLog.astriskLog("This is a nifty Log");
    SpacedLogger mySpcErr = new SpacedLogger();
    mySpcErr.spaceErr("This is a weird way to display errors");
    SpacedLogger mySpcLog = new SpacedLogger();
    mySpcLog.spaceLog("This is a weird way to display logs");
  }

}
