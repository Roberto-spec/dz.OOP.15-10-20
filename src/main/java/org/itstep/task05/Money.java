package org.itstep.task05;

public class Money {
    private long hryvnia;
    private byte kopecks;

    public Money(long hryvnia, int kopecks) {
        this.hryvnia = hryvnia;
        this.kopecks = (byte)kopecks;
    }
    public Money(long hryvnia) {
        this.hryvnia = hryvnia;
        this.kopecks = (byte)0;
    }
    public Money() {
        hryvnia=0;
        kopecks=(byte)0;
    }
    public void show(){
        System.out.println(getHryvnia()+","+(int)getKopecks());

    }
    public long getHryvnia() {
        return hryvnia;
    }

    public void setHryvnia(long hryvnia) {
        this.hryvnia = hryvnia;
    }

    public byte getKopecks() {
        return kopecks;
    }

    public void setKopecks(byte kopecks) {
        this.kopecks = kopecks;
    }
    public void simplify(){
        if((int)getKopecks()>=100){
            setHryvnia(getHryvnia()+1);
            setKopecks((byte)((int)getKopecks()-100));
        }

    }
}
