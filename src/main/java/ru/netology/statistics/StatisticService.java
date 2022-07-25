package ru.netology.statistics;

    public class StatisticService {
        public int SalesSum(int[] sales) {
            int sum = 0;
            for (int sale : sales) {
                sum += sale;
            }
            return sum;
        }


        public int SalesAverage(int[] sales) {
            return SalesSum(sales) / sales.length;
        }


        public int MaxMonth(int[] sales) {
            int max = sales[0];
            int index = 1;
            int month=1;
            for (int sale : sales) {
                if (sale >= max) {
                    max = sale;
                    month=index;
                }
                index += 1;
            }
            return month;
        }


        public int MinMonth(int[] sales) {
            int min = sales[0];
            int index = 1;
            int month=1;
            for (int sale : sales) {
                if (sale <= min) {
                    min = sale;
                    month=index;
                }
                index += 1;
            }
            return month;
        }


        public int SalesBelowAverage(int[] sales) {
            int count = 0;
            for (int sale : sales) {
                if (sale < SalesAverage(sales)) {
                    count += 1;
                }
            }
            return count;
        }


        public int SalesOverAverage(int[] sales) {
            int count = 0;
            for (int sale : sales) {
                if (sale > SalesAverage(sales)) {
                    count += 1;
                }
            }
            return count;
        }
    }
