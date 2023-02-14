package com.employee.interfaces;

public interface Observable {
    //method to register and unregister observers
    public void register(Observer obj);

    //method to notify observers of change
    public void notifyObservers();
}
