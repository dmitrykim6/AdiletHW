package HW130;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float[] score = new float[7];

        float max = 0;
        int maxElement = -1;
        float min = 10;
        int minElement = -1;
        float sum = 0;
        float total = 0;

        for (int i = 1; i <= score.length; i++) {
            System.out.println("Enter score for judge " + i + ":");
            score[i-1] = input.nextFloat();

            if(score[i-1] > max){
                max = score[i-1];
                maxElement = i-1;
            }
            if(score[i-1] < min){
                min = score[i-1];
                minElement = i-1;
            }
        }
        System.out.println("Enter difficulty:");
        Double difficultyD = input.nextDouble();

        float difficulty = difficultyD.floatValue();


        for (int i = 0; i < score.length; i++) {
            if(i == maxElement || i == minElement){

            }else {
                sum = sum + score[i];
            }
        }

        total = sum  * difficulty * 0.6f;
        System.out.println("Total: " + total);
    }
}
