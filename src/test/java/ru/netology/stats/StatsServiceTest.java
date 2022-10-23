package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class StatsServiceTest {

    @Test
    public void shouldFindSumSells() {
        StatsService service = new StatsService();
        int[] month = {8, 15, 13, 15, 17, 24, 19, 20, 7, 14, 14, 18};

        int expectedSum = 184;
        int actualSum = service.sumSells(month);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void shouldFindAverageSum() {
        StatsService service = new StatsService();
        int[] month = {8, 15, 13, 15, 17, 24, 19, 20, 7, 14, 14, 18};

        double expectedAverage = 15;
        double actualAverage = service.averageSells(month);

        Assertions.assertEquals(expectedAverage, actualAverage);

    }


    @Test
    public void shouldFindMaxSell() {
        StatsService service = new StatsService();
        int[] month = {8, 15, 13, 15, 17, 24, 19, 20, 7, 14, 14, 18};

        int expectedSell = 5;
        int actualSell = service.getMaxSell(month);

        Assertions.assertEquals(expectedSell, actualSell);

    }

    @Test
    public void shouldFindMinSell() {
        StatsService service = new StatsService();
        int[] month = {8, 15, 13, 15, 17, 24, 19, 20, 7, 14, 14, 18};

        int expectedSell = 8;
        int actualSell = service.getMinSell(month);

        Assertions.assertEquals(expectedSell, actualSell);
    }

    @Test
    public void shouldFindDownAverage() {
        StatsService service = new StatsService();
        int[] month = {8, 15, 13, 15, 17, 24, 19, 20, 7, 14, 14, 18};

        int expectedDown = 5;
        int actualDown = service.downAverage(month);

        Assertions.assertEquals(expectedDown, actualDown);
    }

    @Test
    public void shouldFindUpAverage() {
        StatsService service = new StatsService();
        int[] month = {8, 15, 13, 15, 17, 24, 19, 20, 7, 14, 14, 18};

        int expectedUp = 5;
        int actualUp = service.upAverage(month);

        Assertions.assertEquals(expectedUp, actualUp);
    }

}
