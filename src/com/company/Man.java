package com.company;

public class Man extends Human {
    public Man(boolean man, String name, String surname, float height, float weight) {
        super(man, name, surname, height, weight);
    }

    public Man() {

    }

    public boolean speak(Human other) {
        if (!isMan() || !other.isMan())
            return true;
        return Math.random() <= 0.5;

    }

    public boolean sustain(Human other) {
        if (!isMan() && !other.isMan())
            return Math.random() >= 0.05;
        else if (!isMan() && other.isMan())
            return Math.random() >= 0.7;
        else if (isMan() && !other.isMan())
            return Math.random() >= 0.7;
        else
            return Math.random() >= 0.056;

    }


        public boolean spendTime (Human other){
            float h = Math.abs(getHeight() - other.getHeight());
            if (h / getHeight() > 0.1)
                return Math.random() < 0.85;
            else return Math.random() < 0.95;
        }
        public Human relation (Human other){
            if (speak(other) && sustain(other) && spendTime(other)) {
                if (isMan() == other.isMan()) return null;
                Women w = !isMan() ? (Women) (this) : (Women) other;
                return w.giveBirth();
            }
            return null;
        }


    }
