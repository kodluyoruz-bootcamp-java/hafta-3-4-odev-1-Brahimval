package com.company;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;

public abstract class City<GmtEnum> implements Clock{


        public  String cityName;
        int cityCode;
        private GmtEnum gmtEnum;
        public City(String cityName, String cityCode, GmtEnum gmtEnum) {
                this.cityCode=cityCode;
                this.cityName=cityName;
                this.gmtEnum = gmtEnum;
                
            }

        public  String getCityName(String cityName){
                 return cityName;
        }
        public String getCityCode(String cityCode){
                   return  cityCode;
    }
    public GmtEnum getGmtEnum() {
            return gmtEnum;
        }
        @Override
        public void showTime() {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

            while (true) {
                LocalTime time = LocalTime.now().minusHours(3); //to set GMT = 0
                time = time.plusHours(this.getGmtEnum().getGmt()); //get gmt difference and add it to default time as a hour

                System.out.print(this.getCityName() + " = " + time.format(formatter) + "\r");
                //TimeUnit.NANOSECONDS.sleep(1_000_000_000 - time.getNano());
                Thread.sleep(1000);

            }
        }
    }

