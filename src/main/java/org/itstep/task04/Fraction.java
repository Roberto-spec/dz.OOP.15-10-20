package org.itstep.task04;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }
    public Fraction(){
        this.numerator =0;
        this.denominator = 1;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }
    public Fraction addition(Fraction c){
        //addition
        System.out.println();
        show();
        System.out.print(" + ");
        c.show();
        System.out.print(" = ");

        if(c.getDenominator()==getNumerator()){
            setNumerator(getNumerator()+c.getNumerator());

        }
        else {
            setNumerator((getNumerator()*c.getDenominator())+(c.getNumerator()*getDenominator()));
            setDenominator(getDenominator()*c.getDenominator());
        }
        simplify();
        return this;
    }
    public Fraction subtraction(Fraction c){
        System.out.println();
        show();
        System.out.print(" - ");
        c.show();
        System.out.print(" = ");

        if(c.getDenominator()==getNumerator()){
            setNumerator(getNumerator()-c.getNumerator());

        }
        else {
            setNumerator((getNumerator()*c.getDenominator())-(c.getNumerator()*getDenominator()));
            setDenominator(getDenominator()*c.getDenominator());
        }
        simplify();
        return this;
    }
    public Fraction multiplication(Fraction c){
        System.out.println();
        show();
        System.out.print(" * ");
        c.show();
        System.out.print(" = ");

        setNumerator(getNumerator()*c.getNumerator());
        setDenominator(getDenominator()*c.getDenominator());
        simplify();
        return this;
    }
    public Fraction division(Fraction c){
        System.out.println();
        show();
        System.out.print(" / ");
        c.show();
        System.out.print(" = ");
        setNumerator(getNumerator()*c.getDenominator());
        setDenominator(getDenominator()*c.getNumerator());
        simplify();
        return this;
    }
    void show(){
        System.out.print(getNumerator()+"/"+getDenominator());

    }
    void simplify(){
        int limit=Math.min(getNumerator(),getDenominator());
        for(int i=2;i<=limit;i++){
            if(getNumerator()%i==0&&getDenominator()%i==0){
                setNumerator(getNumerator()/i);
                setDenominator(getDenominator()/i);
            }
        }

    };

}
