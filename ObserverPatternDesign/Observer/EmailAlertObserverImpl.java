package ObserverPatternDesign.Observer;
import ObserverPatternDesign.Observable.IStocksObservable;;
public class EmailAlertObserverImpl implements NotificationAlertObserver {
    String emailId;
    IStocksObservable observable;
    public EmailAlertObserverImpl(String email,IStocksObservable ob)
    {
        emailId = email;
        observable = ob;
    }

    @Override
    public void update()
    {
        sendEmail(emailId,"Product is in Stock, Hurry Up !!");
    }

    private void sendEmail(String email,String msg)
    {
        System.out.println(msg + " sent to "+email);
    }
    
}
