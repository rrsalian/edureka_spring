package com.springjdbcbatchstock;

import java.util.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) throws Exception {
        
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        AppService service = context.getBean("appService", AppService.class);        
        Date date = new java.util.Date();
        Calendar cal = Calendar.getInstance();
		
        List<StockPrice> prices = new ArrayList<>();
        for(int i=1; i < 2001; i++) {        	
        	date = MyCalendar.getPreviousWorkingDay(date);
        	cal.setTime ( date ); // convert your date to Calendar object            
            java.sql.Date sqlDate = new java.sql.Date(date.getTime());
            //System.out.println(sqlDate);
            StockPrice stockPrice = new StockPrice();
            stockPrice.setSymbol("QQQ");
            stockPrice.setId(i);
        	stockPrice.setDate(sqlDate);      	
        	stockPrice.setOpen((float)(392 - (i * 0.00125)));
        	stockPrice.setClose((float)(392 + (i * 0.00125)));
        	prices.add(stockPrice);        	
            date = cal.getTime();  //again get back your date object
        }
        service.saveStockPriceDataAsBatch(prices);
        context.close();
    }
}
