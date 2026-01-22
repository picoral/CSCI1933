/*
 * ComplexNumber.java
 * Author: Chris Dovolis January 2024
 * CSCI 1933 example code
 * The ComplexNumber class wraps the real and imaginary components
 * into one object that also includes constructors, selectors, and ops
 * Can you think of operators (other than add) that could be implemented?
 */

public class ComplexNumber {

    // constructors

    public ComplexNumber() {}  // default
  
    public ComplexNumber(double real, double imag) {
        realPart = real;
        imagPart = imag;
    }

    // getters and setters

    public void setRealPart(double real) {
        realPart = real;
    }

    public double getRealPart() { return realPart; }

    public void setImagPart(double imag) {
        imagPart = imag;
    }

    public double getImagPart() { return imagPart; }

    // operators

    public ComplexNumber addComplex(ComplexNumber anotherComplexNumber) {
        return new ComplexNumber(realPart +
                                 anotherComplexNumber.getRealPart(),
                                 imagPart +
                                 anotherComplexNumber.getImagPart());
    }
        
    public String toString() {
        return realPart + "+" + imagPart + "i";
    }

    public boolean equals(Object anotherObject) {
        ComplexNumber anotherComplexNumber;
        if (anotherObject instanceof ComplexNumber) {
          anotherComplexNumber = (ComplexNumber) anotherObject;
	  if (realPart == anotherComplexNumber.getRealPart() &&
	      imagPart == anotherComplexNumber.getImagPart())
            return true;
        }
	return false;
    }
          
    // attributes

    private double realPart;
    private double imagPart;

    public static void main(String[] args) {
        // a test or demo program for the ComplexNumber class

        ComplexNumber c = new ComplexNumber(1.0, 2.0);

        System.out.println("c is: " + c);
        System.out.println("The real part of c is: " + c.getRealPart());
        System.out.println("c added to c is: " + c.addComplex(c));
    }
}
