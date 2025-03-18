package ru.job4j.map;

import org.junit.Test;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class UrlPatternGrouperTest {

    @Test
    public void whenUrlsGroupedWithSamePatternsThenCorrectStatisticsAreReturned() {
        UrlPatternGrouper grouper = new UrlPatternGrouper();
        List<String> urls = Arrays.asList(
                "/exercise",
                "/exercise/217",
                "/exercise/218",
                "/exercise/218/task-view/1255",
                "/",
                "/exercise",
                "/exercise/217",
                "/exercise/218",
                "/exercise/217",
                "/exercise/218",
                "/exercise/218/task-view/1255",
                "/interview/9",
                "/exercise",
                "/exercise/217",
                "/exercise/218",
                "/exercise/218/task-view/1255",
                "/exercise/218/task-view/1256"
        );

        List<UrlPatternGrouper.PageStatistic> result = grouper.groupUrls(urls);
        List<UrlPatternGrouper.PageStatistic> expected = Arrays.asList(
                new UrlPatternGrouper.PageStatistic("/exercise", 3),
                new UrlPatternGrouper.PageStatistic("/exercise/..", 8),
                new UrlPatternGrouper.PageStatistic("/interview/..", 1),
                new UrlPatternGrouper.PageStatistic("/", 1)
        );
        expected.sort(Comparator.comparing(UrlPatternGrouper.PageStatistic::getPattern));
        assertThat(result, is(expected));
    }

    @Test
    public void whenNoUrlsProvidedThenEmptyStatisticsAreReturned() {
        UrlPatternGrouper grouper = new UrlPatternGrouper();

        List<String> urls = Arrays.asList();

        List<UrlPatternGrouper.PageStatistic> result = grouper.groupUrls(urls);

        assertThat(result.isEmpty(), is(true));
    }

    @Test
    public void whenSingleRootUrlProvidedThenCorrectStatisticsAreReturned() {
        UrlPatternGrouper grouper = new UrlPatternGrouper();

        List<String> urls = Arrays.asList("/");

        List<UrlPatternGrouper.PageStatistic> result = grouper.groupUrls(urls);
        List<UrlPatternGrouper.PageStatistic> expected = List.of(new UrlPatternGrouper.PageStatistic("/", 1));

        assertThat(result, is(expected));
    }

    @Test
    public void whenDifferentUrlsProvidedThenCorrectStatisticsAreReturned() {
        UrlPatternGrouper grouper = new UrlPatternGrouper();

        List<String> urls = Arrays.asList(
                "/exercise",
                "/interview",
                "/exercise/214",
                "/interview/9"
        );

        List<UrlPatternGrouper.PageStatistic> result = grouper.groupUrls(urls);
        List<UrlPatternGrouper.PageStatistic> expected = List.of(
                        new UrlPatternGrouper.PageStatistic("/exercise", 1),
                new UrlPatternGrouper.PageStatistic("/exercise/..", 1),
                new UrlPatternGrouper.PageStatistic("/interview", 1),
                new UrlPatternGrouper.PageStatistic("/interview/..", 1)
        );

        assertThat(result, is(expected));
    }

    @Test
    public void whenOnlyExerciseUrlsProvidedThenCorrectStatisticsAreReturned() {
        UrlPatternGrouper grouper = new UrlPatternGrouper();

        List<String> urls = Arrays.asList(
                "/exercise",
                "/exercise/217",
                "/exercise/218/task-view/1255"
        );

        List<UrlPatternGrouper.PageStatistic> result = grouper.groupUrls(urls);
        List<UrlPatternGrouper.PageStatistic> expected = List.of(
                        new UrlPatternGrouper.PageStatistic("/exercise", 1),
                new UrlPatternGrouper.PageStatistic("/exercise/..", 2)
        );

        assertThat(result, is(expected));
    }
}