package ru.netology.stats;

public class StatsService {

    public int sumSells(int[] month) {
        int sum = 0;
        for (int num : month) {
            sum = sum + num;
        }
        return sum;
    }

    public int averageSells(int[] month) {
        int average = 0;
        int sum = 0;
        for (int i = 0; i < month.length; i++) {
            sum += month[i];
        }
        average = sum / month.length;
        return Math.round(average);
    }

    public int getMaxSell(int[] month) {
        int maxSell = 0;
        for (int i = 0; i < month.length; i++) {
            if (month[i] > month[maxSell]) {
                maxSell = i;
            }
        }
        return maxSell;
    }

    public int getMinSell(int[] month) {
        int minSell = 0;
        for (int i = 0; i < month.length; i++) {
            if (month[i] < month[minSell]) {
                minSell = i;
            }
        }
        return minSell;
    }

    public int downAverage(int[] month) {

        int variable = 0;
        for (int i = 0; i < month.length; i++) {
            if (month[i] < averageSells(month)) {
                variable++;
            }
        }
        return variable;
    }

    public int upAverage(int[] month) {

        int variable = 0;
        for (int i = 0; i < month.length; i++) {
            if (month[i] > averageSells(month)) {
                variable++;
            }
        }
        return variable;
    }
}



