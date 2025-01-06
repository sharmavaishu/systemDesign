package systemDesign.ObserverDesignPattern.Observer;

import systemDesign.ObserverDesignPattern.Observable.StockObservable;

public class MobileSmsNotificationObserver implements NotificationAlertObserverImpl{
    String mobileNumber;
    StockObservable observable;

    MobileSmsNotificationObserver(String mobileNumber, StockObservable observable1){
        this.mobileNumber = mobileNumber;
        this.observable = observable1;
    }

    public void update(){
        sendMessageViaMobile(mobileNumber,"object is in stock hurry up");}

    public void sendMessageViaMobile(String mobileNumber, String msg){
        System.out.println("msg" + mobileNumber);
    }
}
