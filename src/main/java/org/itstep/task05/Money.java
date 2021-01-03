package org.itstep.task05;

public class Money {
    private long hryvnia;
    private byte kopecks;

    public Money(long hryvnia, byte kopecks) {
        this.hryvnia = hryvnia;
        this.kopecks = kopecks;
    }
    Money(long hryvnia){
        this.hryvnia = hryvnia;
        this.kopecks = (byte)0;
    }
    Money(){
        this.hryvnia = 0;
        this.kopecks = (byte)0;
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
    public void show(){
        System.out.println(getHryvnia()+","+(int)getKopecks());

    }
//* - сложение (addition).
//            * - вычитание (subtraction),
// * - умножение (multiplication),
// * - деление на дробное число (division),
// * - умножение на дробное (метод multiply) число
// * - операции сравнения (метод equals) возвращает boolean.

    public boolean equals(Money right){
        if(getHryvnia()== right.getHryvnia()&&(int)(getKopecks())==(int)(right.getKopecks())) return true;
        return false;
    }
    public Money multiply(double d){
        Money money=new Money();
        long k=(long)((((double)getKopecks())+((double)(getHryvnia())*100))*d);
        long h=0;
        while(k>=100){
            k-=100;
            h+=1;
        }
        money.setHryvnia(h);
        money.setKopecks((byte)k);
        return money;
    }
    public Money division(double d){
        Money money=new Money();
        long k=(long)((((double)getKopecks())+((double)(getHryvnia())*100))/d);
        long h=0;
        while(k>=100){
            k-=100;
            h+=1;
        }
        money.setHryvnia(h);
        money.setKopecks((byte)k);
        return money;
    }
    public Money multiplication(Money right){
        Money money=new Money();
        int k=(int)getKopecks()*(int)right.getKopecks();
        long h=getHryvnia()*right.getHryvnia();
        while(k>=100){
            k-=100;
            h+=1;
        }
        money.setHryvnia(h);
        money.setKopecks((byte)k);
        return money;
    }
    public Money subtraction(Money right){
        Money money=new Money();
        int k=(int)getKopecks()-(int)right.getKopecks();
        long h=getHryvnia()-right.getHryvnia();
        while((k+100)<100){
            k+=100;
            h-=1;
        }
        money.setHryvnia(h);
        money.setKopecks((byte)k);
        return money;
    }
    public Money addition(Money right){
        Money money=new Money();
        int k=(int)getKopecks()+(int)right.getKopecks();
        long h=getHryvnia()+right.getHryvnia();
        while(k>=100){
            k-=100;
            h+=1;
        }
        money.setHryvnia(h);
        money.setKopecks((byte)k);
        return money;
    }


}
