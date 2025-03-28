package ru.job4j.map;

import java.util.*;

public class Weather {
    public static List<Info> editData(List<Info> list) {
        Map<String, Integer> temp = new LinkedHashMap<>();
        for (Info element : list) {
            temp.putIfAbsent(element.getCity(), 0);
            temp.put(element.getCity(), temp.get(element.getCity()) + element.getRainfall());
        }
        List<Info> rsl = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : temp.entrySet()) {
            rsl.add(new Info(entry.getKey(), entry.getValue()));
        }
        return rsl;
    }

    public static class Info {
        private String city;

        private int rainfall;

        public Info(String city, int rainfall) {
            this.city = city;
            this.rainfall = rainfall;
        }

        public String getCity() {
            return city;
        }

        public int getRainfall() {
            return rainfall;
        }

        @SuppressWarnings("checkstyle:OperatorWrap")
        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Info info = (Info) o;
            return rainfall == info.rainfall
                    && Objects.equals(city, info.city);
        }

        @Override
        public int hashCode() {
            return Objects.hash(city, rainfall);
        }
    }
}
