package systemDesign.ObserverDesignPattern.Observable;

import systemDesign.ObserverDesignPattern.Observer.NotificationAlertObserverImpl;

public interface StockObservable {
    public void add(NotificationAlertObserverImpl observer);

    public void remove(NotificationAlertObserverImpl observer);

    public void notifySubscriber();

    public void setStockCount(int newStockAdded);

    public int getStockCount();
}
