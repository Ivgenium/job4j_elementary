package ru.job4j.map;

import java.util.*;
import java.util.stream.Collectors;

public class UrlPatternGrouper {

    public static class PageStatistic {
        private final String pattern;
        private final int count;

        public PageStatistic(String pattern, int count) {
            this.pattern = pattern;
            this.count = count;
        }

        public String getPattern() {
            return pattern;
        }

        public int getCount() {
            return count;
        }

        @Override
        public String toString() {
            return "PageStatistic{"
                    + "pattern='" + pattern + '\''
                    + ", count=" + count + '}';
        }

        @Override
        public boolean equals(Object o) {
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            PageStatistic that = (PageStatistic) o;
            return count == that.count && Objects.equals(pattern, that.pattern);
        }

        @Override
        public int hashCode() {
            return Objects.hash(pattern, count);
        }
    }

    public List<PageStatistic> groupUrls(List<String> urls) {
        return urls.stream()
                .map(url -> {
                    String[] temp = url.split("/");
                    if (temp.length == 0) {
                        return "/";
                    } else if (temp.length == 2) {
                        return "/" + temp[1];
                    } else if (temp.length == 3) {
                        return "/" + temp[1] + "/..";
                    } else {
                        return "";
                    }
                })
                .filter(url -> !url.isEmpty())
                .collect(Collectors.groupingBy(url -> url, Collectors.counting()))
                .entrySet().stream()
                .map(entry -> new PageStatistic(entry.getKey(), entry.getValue().intValue()))
                .sorted(Comparator.comparing(PageStatistic::getPattern))
                .toList();
//        for (String url : urls) {
//            String[] temp = url.split("/");
//            if (temp.length == 1) {
//                return "/";
//            } else if (temp.length == 2) {
//                return "/" + temp[1];
//            } else {
//                return "/" + temp[1] + "/..";
//            }
//        }
//        return Collections.emptyList();
    }

    public static void main(String[] args) {
        // Пример использования класса
    }
}