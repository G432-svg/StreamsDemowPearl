package be.intecbrussel.the_notebook.plant_entities;

import java.util.ArrayList;
import java.util.List;

public class Bush extends Plant {

    private String fruit;
    private LeafType leafType;


    public Bush(String name, double height) {
        super(name, height);
    }


    public Bush(String name, String fruit, LeafType leafType) {
        super(name);
        this.fruit = fruit;
        this.leafType = leafType;
    }

    public Bush(String name, double height, String fruit, LeafType leafType) {
        super(name, height);
        this.fruit = fruit;
        this.leafType = leafType;
    }

    public String getFruit() {
        return fruit;
    }

    public void setFruit(String fruit) {
        this.fruit = fruit;
    }

    public LeafType getLeafType() {
        return leafType;
    }

    public void setLeafType(LeafType leafType) {
        this.leafType = leafType;
    }

    @Override
    public String toString() {
        return "Bush{" +
                " name='" + name + '\'' +
                ", height=" + height +
                ", fruit='" + fruit + '\'' +
                ", leafType=" + leafType +
                "} " + super.toString();
    }
}