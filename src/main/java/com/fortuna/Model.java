package com.fortuna;

/**
 * Created on 12.05.2016.
 */
public class Model {

    /**
     * Side A of triangle
     */
    private int triangleSideA;

    /**
     * Side B of triangle
     */
    private int triangleSideB;

    /**
     * Side C of triangle
     */
    private int triangleSideC;


    // The Program logic

    /**
     * Calculation half perimeter of triangle: p = (a + b + c) / 2
     *
     * @return half perimeter of triangle
     */
    public double half_perimeter(){
        return (triangleSideA + triangleSideB + triangleSideC) / 2.0;
    }

    /**
     * Calculation square of triangle: s = sqrt(p*(p-a)*(p-b)*(p-c))
     *
     * @return square of triangle
     */
    public double square(){
        return Math.sqrt(half_perimeter() * (half_perimeter() - triangleSideA)
                                          * (half_perimeter() - triangleSideB)
                                          * (half_perimeter() - triangleSideC));
    }


    public int getTriangleSideA() {
        return triangleSideA;
    }

    public void setTriangleSideA(int triangleSideA) {
        this.triangleSideA = triangleSideA;
    }

    public int getTriangleSideB() {
        return triangleSideB;
    }

    public void setTriangleSideB(int triangleSideB) {
        this.triangleSideB = triangleSideB;
    }

    public int getTriangleSideC() {
        return triangleSideC;
    }

    public void setTriangleSideC(int triangleSideC) {
        this.triangleSideC = triangleSideC;
    }
}
