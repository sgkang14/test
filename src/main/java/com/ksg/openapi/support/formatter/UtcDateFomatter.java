//package com.ksg.openapi.support.formatter;
//
//import org.springframework.format.Formatter;
//
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.time.*;
//import java.time.format.DateTimeFormatter;
//import java.util.Date;
//import java.util.Locale;
//import java.util.TimeZone;
//
///**
// * Created by 강성근
// */
//public class UtcDateFomatter implements Formatter<Date> {
//
//    private static final SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//
//    @Override
//    public Date parse(String text, Locale locale) throws ParseException {
///
//        ZonedDateTime zdt2 = ZonedDateTime.parse("2002/06/18/ 20:30:00 KST", DateTimeFormatter.ofPattern("yyyy/MM/dd/ HH:mm:ss z"));
//
//
//
//        // String ->  ZonedDateTime 변환
//        ZonedDateTime local = ;
//        ZonedDateTime utc = local.withZoneSameInstant(ZoneOffset.UTC);
//        utc.;
//
//                Date date;
//
//        ZonedDateTime seoul = Year.of(2002).atMonth(6).atDay(18).atTime(20, 30).atZone(ZoneId.of("Asia/Seoul"));
//        System.out.println("Seoul =     " + seoul);
//
//        ZonedDateTime utc = seoul.withZoneSameInstant(ZoneOffset.UTC);
//        System.out.println("UTC =       " + utc);
//
//
//
//        ZonedDateTime zonedDateTime = ZonedDateTime.parse("2002-06-18T20:30:00+09:00[Asia/Seoul]");
//
//
//        LocalDateTime ldt;
//        ZonedDateTime localTime = Year.of(2002).atMonth(6).atDay(18).atTime(20, 30).atZone(ZoneId.of("Asia/Seoul"));
//
//        System.out.println(worldCup.format(DateTimeFormatter.ISO_DATE_TIME));
//        System.out.println(worldCup.format(DateTimeFormatter.ofPattern("yyyy/MM/dd/ HH:mm:ss z")));
//        System.out.println(worldCup.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL)));
//        System.out.println(worldCup.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL).withLocale(Locale.KOREA)));
//
//
//        try {
//            String dateString = "20190101235959";
//
//// String을 Date형식으로 변환
//            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//            LocalDateTime ldt = LocalDateTime.parse(text, formatter);
//            DateTime datetime;
//
//// millisecond 단위로 변경 (1546354799000)
//            ldt.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
//
//
//
//
//
//            long sourceMsec = format.parse(text).getTime();
//            long offsetMsec = 0;
//
//            new Date(sourceMsec - offsetMsec);
//
//            String utcTime = format.format(sourceMsec - offsetMsec);
//            utcTime = utcTime.replace("+0000", "");
//            return d
//        } catch (Exception e) {
//            throw new ParseException(e);
//        }
//    }
//
//    @Override
//    public String print(Date object, Locale locale) {
//        return object.toString();
//    }
//}
