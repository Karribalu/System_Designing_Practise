package ObserverPatternDesign;
import ObserverPatternDesign.Observable.*;
import ObserverPatternDesign.Observer.*;
public class Store {
    public static void main(String[] args) {
        IStocksObservable iphoneObservable = new IphoneObservableImpl();

        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("bala@gmail.com", iphoneObservable);
        NotificationAlertObserver observer2 = new EmailAlertObserverImpl("ashwani@gmail.com", iphoneObservable);
        NotificationAlertObserver observer3 = new EmailAlertObserverImpl("Jyothi@gmail.com", iphoneObservable);
        
        iphoneObservable.add(observer1);
        iphoneObservable.add(observer2);
        iphoneObservable.add(observer3);

        iphoneObservable.setStockCount(10);
        iphoneObservable.setStockCount(0);
        iphoneObservable.setStockCount(100);
        System.out.println(iphoneObservable.getStockCount());
    }
}
