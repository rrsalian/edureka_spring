package com.example.demo;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) throws Exception {
        
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        AppService service = context.getBean("appService", AppService.class);
        //from client application, calling the business method
        Orders order = new Orders();


        context.close();
    }
}
