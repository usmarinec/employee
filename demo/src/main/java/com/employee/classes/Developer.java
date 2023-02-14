package com.employee.classes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class Developer extends Employee{
    public enum Language{
        JAVA, C_SHARP, TYPE_SCRIPT
    }

    Language preferrLanguage;

    public Developer(String name, int orgNum, Language prefLanguage){
        super(name, orgNum);
        this.preferrLanguage = prefLanguage;
    }
}
