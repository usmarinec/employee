package com.employee;

import com.employee.classes.Developer;
import com.employee.classes.HumanResources;
import com.employee.classes.Developer.Language;

public class App 
{
    public static void main( String[] args )
    {
        Developer employee = new Developer("Glass Joe", 1234, Language.JAVA);
        employee.register(new HumanResources());
        employee.setOrgNum(9876);
        employee.notifyObservers();
    }
}
