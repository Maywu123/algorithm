package xuliehua;

import java.io.Serializable;

public class Pair implements Serializable {
    public int number;
    public String name;

    public Pair(int number,String name){
        this.name=name;
        this.number=number;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }
}

