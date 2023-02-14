package com.employee.classes;

import java.util.ArrayList;
import java.util.List;

import com.employee.interfaces.Observable;
import com.employee.interfaces.Observer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class Employee implements Observable{
    protected String name;
    protected int orgNum;

    @ToString.Exclude
    final List<Observer> observers = new ArrayList<>();

    @Override
    public void register(Observer obj){
        observers.add(obj);
    }

    @Override
    public void notifyObservers(){
        observers.forEach(obs -> obs.update(this));
    }
}
