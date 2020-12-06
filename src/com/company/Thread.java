package com.company;

public class Thread {
    public static void sleep(int i) {
    }

    public class TimeThread implements Runnable {

        private City city;

        public TimeThread(City city) {
            this.city = city;
        }

        public City getCity() {
            return city;
        }

        public void setCity(City city) {
            this.city = city;
        }

        @Override
        public void run() {

            city.showTime();


        }
    }
}
