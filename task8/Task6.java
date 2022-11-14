package com.java.se.ProgrammingLanguage.task8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Task6 {
    public static void main(String[] args) throws ParseException {
        Map<String, Date> birthdayMap = new HashMap<>();
        Map<String, Date> birthdayMap2 = new HashMap<>();
        String[] names = "Август, Августин, Авраам, Аврора, Агата, Агафон, Агнесса, Агния, Ада, Аделаида".split(", ");
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        for (String name:names) {
            String dateDay = "26-";
            String dateYear = "-1989";
            String month = getmonth(randombetween1and12());
            Date date = formatter.parse(dateDay+month+dateYear);
            birthdayMap.put(name,date);
            birthdayMap2.put(name,date);
        }


        // with .remove
        birthdayMap2.forEach((k,v) -> System.out.println(k +", "+v));
        System.out.println();
        Iterator<Map.Entry<String,Date>> iterator = birthdayMap2.entrySet().iterator();
        while(iterator.hasNext()){
            Date value = iterator.next().getValue();
            LocalDate localDate = value.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            int month = localDate.getMonthValue();
            if(!(month <= 5 || month >= 9)){
                iterator.remove();
            }
        }
        birthdayMap2.forEach((k,v) -> System.out.println(k +", "+v));
        System.out.println();




        // without remove
        Map<String,Date> birthdayOhneSummerMap = removeSummerBirthDay(birthdayMap);
        birthdayOhneSummerMap.forEach((k,v) -> System.out.println(k +", "+v));



    }
    public static Map<String,Date> removeSummerBirthDay(Map<String,Date> map){
        Map<String,Date> mapres = new HashMap<>();
        map.forEach((k,v) ->{
            LocalDate localDate = v.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            int month = localDate.getMonthValue();
            if(month <= 5 || month >= 9){
                mapres.put(k,v);
            }
        });
        return mapres;
    }
    public static int randombetween1and12(){
        return (int) (Math.random()*(12)+1);
    }
    public static String getmonth(int i){
        return i >= 10 ? String.valueOf(i):"0" + i;
    }
}
