package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Kalkulator kalkulator1 = new Kalkulator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Unesite prvi broj");
        kalkulator1.operand1 = Double.parseDouble(scanner.nextLine());

        System.out.println("Unesite operator");
        String operator = scanner.nextLine();

        System.out.println("Unesite drugi broj");
        kalkulator1.operand2 = Double.parseDouble(scanner.nextLine());


        if(operator.contains("+")) {
            System.out.println(kalkulator1.add());
        }else if(operator.contains("-")){
            System.out.println(kalkulator1.sub());
        }else if(operator.contains("*")){
            System.out.println(kalkulator1.mul());
        }else if(operator.contains("/")){
            System.out.println(kalkulator1.div());
        }else {
            System.out.println("Operator nije podrzan");
        }
    }

}
