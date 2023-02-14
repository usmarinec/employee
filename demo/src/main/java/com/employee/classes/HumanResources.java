package com.employee.classes;

import com.employee.interfaces.Observer;

public class HumanResources implements Observer {
    @Override
    public void update(Object o){
        System.out.println("HumanResources::update(): " + o);
    }
}
