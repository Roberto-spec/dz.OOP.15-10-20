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
    public void simplify_plus(int c){
        while(c>=100) {

            setHryvnia(getHryvnia() + 1);
            c-=100;
        }
        setKopecks((byte)c);
    }
    public void simplify_minus(int c){
        while(c<0) {

            setHryvnia(getHryvnia() + 1);
            c-=100;
        }
        setKopecks((byte)c);
    }
    public Money addition(Money a){
        Money b=new Money();
        b.setHryvnia(getHryvnia()+a.getHryvnia());
        int c=(int)getKopecks()+(int)a.getKopecks();

        b.simplify_plus(c);
        return b;
    }

    public Money subtraction(Money a){
        Money b=new Money();
        b.setHryvnia(getHryvnia()-a.getHryvnia());
        int c=(int)getKopecks()-(int)a.getKopecks();

        b.simplify_minus(c);
        return b;
    }
    public long to_long(){
        long c;
        c=(int)getKopecks()+(getHryvnia()*100);

        return c;
    }
    public void to_money(long c){

        setKopecks((byte)(c%100));
        setHryvnia(c-(int)getKopecks());

    }

    public Money multiplication(Money a){



        long c=to_long()+a.to_long();
        to_money(c);

        return this;
    }
}
