package ru.netology.statistics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatisticServiceTest {

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        @Test
        void salesSum() {
            StatisticService service = new StatisticService();
            int expected = 180;
            int actual = service.SalesSum(sales);
            assertEquals(expected, actual);
        }

        @Test
        void salesAverage() {
            StatisticService service = new StatisticService();
            int expected = 15;
            int actual = service.SalesAverage(sales);
            assertEquals(expected, actual);
        }

        @Test
        void maxMonth() {
            StatisticService service = new StatisticService();
            int expected = 8;
            int actual = service.MaxMonth(sales);
            assertEquals(expected, actual);
        }

        @Test
        void minMonth() {
            StatisticService service = new StatisticService();
            int expected = 9;
            int actual = service.MinMonth(sales);
            assertEquals(expected, actual);
        }

        @Test
        void salesBelowAverage() {
            StatisticService service = new StatisticService();
            int expected = 5;
            int actual = service.SalesBelowAverage(sales);
            assertEquals(expected, actual);
        }

        @Test
        void salesOverAverage() {
            StatisticService service = new StatisticService();
            int expected = 5;
            int actual = service.SalesOverAverage(sales);
            assertEquals(expected, actual);
        }
}
