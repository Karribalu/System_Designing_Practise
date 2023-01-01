package ObserverPatternDesign.Observable;
import ObserverPatternDesign.Observer.*;

public interface IStocksObservable {
    public void add(NotificationAlertObserver Observer);
    public void remove(NotificationAlertObserver Observer);
    public void notifySubscribers();
    public void setStockCount(int newStockCount);
    public int getStockCount();
}
