package com.springjdbcbatchstock;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AppService {
    @Autowired
    AppDAO appDAO;

    public void saveStockPriceDataAsBatch(List<StockPrice> prices) {
        appDAO.saveStockPriceDlyAsBatch(prices);
    }   
}