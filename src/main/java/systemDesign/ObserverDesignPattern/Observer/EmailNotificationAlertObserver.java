package systemDesign.ObserverDesignPattern.Observer;

import systemDesign.ObserverDesignPattern.Observable.StockObservable;

public class EmailNotificationAlertObserver implements NotificationAlertObserverImpl{
      String emailId;
      StockObservable observable;

      EmailNotificationAlertObserver(String emailId, StockObservable observable1){
          this.emailId = emailId;
          this.observable = observable1;
      }

      public void update(){
          sendMail(emailId,"object is in stock hurry up");}

      public void sendMail(String emailId, String msg){
          System.out.println("msg" + emailId);
      }
}
