package ObserverPatternDesign.Observer;

import ObserverPatternDesign.Observable.IStocksObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{

    String userName;
    IStocksObservable observable;
    public MobileAlertObserverImpl(String email, IStocksObservable ob)
    {
        observable = ob;
        userName = email;
    }
    @Override
    public void update() {
        sendMsgOnMobile(userName,"Product is in stock HurryUp!");

        
    }
    private void sendMsgOnMobile(String userName,String msg)
    {
        System.out.println("Msg sent to " + userName);
    }
    
}
