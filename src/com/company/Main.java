package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            Scanner num = new Scanner(System.in);
            float x = num.nextFloat();
            float y = num.nextFloat();
            float z = num.nextFloat();

            if (x <= 0) {
                throw new Exception("Вы ввели число меньше нуля");
            }
            if (y >= 3) {
                throw new Exception("Вы ввели число число больше 3");
            }
            if (z >= 30) {
                throw new Exception("Вы ввели число число больше 30");
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}

    class Formula {
        float x;
        float y;
        float z;

        public Formula(float x, float y, float z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }

        public void displayFormula() {
            double l = Math.sqrt(x * x + y * y + z * z);
            System.out.println(l);
        }
    }