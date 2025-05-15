// Observer Pattern
import java.util.*;
interface Observer {
    void update(String message);
}
class EmailObserver implements Observer {
    public void update(String message) {
        System.out.println("Email received: " + message);
    }
}
class SMSObserver implements Observer {
    public void update(String message) {
        System.out.println("SMS received: " + message);
    }
}
class Subject {
    List<Observer> observers = new ArrayList<>();
    public void addObserver(Observer o) {
        observers.add(o);
    }
    public void notifyObservers(String msg) {
        for (Observer o : observers) o.update(msg);
    }
}
class ObserverDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();
        subject.addObserver(new EmailObserver());
        subject.addObserver(new SMSObserver());
        subject.notifyObservers("State Changed");
    }
}
