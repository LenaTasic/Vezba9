package com.company;

public class Kalkulator {
    double operand1;
    double operand2;

    public double add() {
        System.out.println(this.operand1 + this.operand2);
        return this.operand1 + this.operand2;
    }

    public double sub() {
        return this.operand1 - this.operand2;
    }

    public double mul() {
        return this.operand1 * this.operand2;
    }

    public double div() {
        return this.operand1 / this.operand2;
    }

}
