//package com.it.ssm.utils;
//
//import org.springframework.beans.propertyeditors.PropertiesEditor;
//
//import java.text.ParseException;
//import java.util.Date;
//
////日期和字符串转换
//public class DateStringEditor extends PropertiesEditor {
//    @Override
//    public void setAsText(String text) throws IllegalArgumentException {
//
//        try {
//            Date date = DateUtils.String2Date(text, "yyyy-MM-dd HH:mm");
//
//            super.setValue(date);
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//
//    }
//}
