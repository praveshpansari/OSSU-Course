package model;

public class Snake extends Animal {

    private double length;
    private boolean venom;

    public Snake(String nm, String ct, int age, Zookeeper zk, double wgt, double len, boolean vn) {
        super(nm, ct, age, zk, wgt);
        length = len;
        venom = vn;
    }

    public double getLength() {
        return length;
    }

    public boolean isVenom() {
        return venom;
    }


}