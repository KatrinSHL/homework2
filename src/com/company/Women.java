package com.company;

public class Women extends Man{
    public Women(boolean man, String name, String surname, float height, float weight) {
        super(man, name, surname, height, weight);
    }

    public Human giveBirth(){
        return new Human();
    }
}
