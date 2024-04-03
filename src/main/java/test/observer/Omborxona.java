package test.observer;

import test.observer.kuzatuvchilar.Observer;

import java.util.ArrayList;
import java.util.List;

public class Omborxona implements Subject{
    public List<Observer> observers;
    public String tv;
    public String mobile;
    public String laptop;

    public Omborxona(){
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }
    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
    @Override
    public void notifyObservers() {
        for (Observer o : observers){
            o.update(tv, mobile, laptop);
        }
    }
    public void setMeasurement(String tv, String mobile, String laptop){
        this.tv = tv;
        this.mobile = mobile;
        this.laptop = laptop;
        notifyObservers();
    }
}
