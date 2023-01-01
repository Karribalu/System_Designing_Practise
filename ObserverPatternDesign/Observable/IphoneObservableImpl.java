package ObserverPatternDesign.Observable;
import java.util.*;
import ObserverPatternDesign.Observer.*;
public class IphoneObservableImpl implements IStocksObservable {

    public List<NotificationAlertObserver> observerList = new ArrayList<>();
    public int stockCount = 0;
    @Override
    public void add(NotificationAlertObserver observer) {
        
        observerList.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver Observer) {
        observerList.remove(Observer);
        
    }

    @Override
    public void notifySubscribers() {
        for(NotificationAlertObserver obj:observerList)
        {
            obj.update();
        }
        
    }

    @Override
    public void setStockCount(int newStockCount) {
        if(stockCount == 0)
        {
            notifySubscribers();
        }
        stockCount = stockCount + newStockCount;
        
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }

    
}
