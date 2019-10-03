import java.util.ArrayList;
import java.util.List;

public class Subject {



    //-----------------------
    // ArrayList
    //-----------------------

    /*
    * This is the list of observers that will
    * get all notifications(updates)
    */
    private List<Observer> observers = new ArrayList<Observer>();
    private int state;

    //-----------------------
    // Getters - Setters
    //-----------------------

    public int getState() {
        return state;
    }

    /*
    * When you assign a new value to this state,
    * method notifyAllObservers() is been activated
    */
    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    //-----------------------
    // Functions
    //-----------------------

    /*
    * Adding new observers to the list
    */
    public void attach(Observer observer) {
        observers.add(observer);
    }

    /*
    * Loop thru all observers and call their method update()
    */
    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }


}