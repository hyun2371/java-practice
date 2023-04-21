package generic;

import generic.officials.Officials;

public class Restaurant<T extends Officials> {
    public T officials;

    public Restaurant(T officials) {
        this.officials = officials;
    }

    public void serve(){
        System.out.println(officials.name +"에게 음식을 제공합니다.");
    }
}