package org.itstep.task07;

public class Complex {
    private double real;
    private double imaginary;

    Complex(){
        this.real=0;
        this.imaginary=0;
    }
    Complex(double real, double imaginary){
        this.real=real;
        this.imaginary=imaginary;
    }
    public double getReal() {
        return real;
    }
    public void setReal(double real) {
        this.real = real;
    }
    public double getImaginary() {
        return imaginary;
    }
    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }
//    сложения (plus);
// * - вычитания (minus);
// * - умножения (times).
public Complex times(Complex right){
    Complex c=new Complex((real*right.getReal())-(imaginary*right.getImaginary()),(imaginary*right.getReal())+(real*right.getImaginary()));
    return c;

}
     public Complex minus(Complex right){
        Complex c=new Complex(real- right.getReal(),imaginary-right.getImaginary());
        return c;

    }

    public Complex plus(Complex right){
        Complex c=new Complex(real+ right.getReal(),imaginary+right.getImaginary());
        return c;

    }

    public boolean equals(Complex right){
        if(real== right.getReal()&&imaginary==right.getImaginary()) return true;
        return false;
    }





    @Override
    public String toString() {
        if (real==0){
            if(imaginary==0) return real+"";
            return imaginary+"i";
        }
        if (imaginary==0) return real+"";
        if (imaginary<0) return real+" - "+Math.abs(imaginary)+"i";
        return real+" + "+imaginary+"i";
    }
}
