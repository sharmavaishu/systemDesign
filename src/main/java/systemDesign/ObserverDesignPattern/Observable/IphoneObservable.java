package systemDesign.ObserverDesignPattern.Observable;

import systemDesign.ObserverDesignPattern.Observer.NotificationAlertObserverImpl;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservable implements StockObservable{

    public List<NotificationAlertObserverImpl> observerList = new ArrayList<>();
    public int stockCount = 0;
    @Override
    public void add(NotificationAlertObserverImpl observer) {
         observerList.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserverImpl observer) {
       observerList.remove(observer);
    }

    @Override
    public void notifySubscriber() {
       for(NotificationAlertObserverImpl observer: observerList){
           observer.update();
       }
    }



    @Override
    public void setStockCount(int newStockAdded) {
         if(stockCount == 0){
             notifySubscriber();
         }
         stockCount = stockCount + newStockAdded;
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
}
