package com.springjdbcbatchstock;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class AppDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;
  
    // batch updates - Full
    public void saveStockPriceDlyAsBatch(List<StockPrice> prices) {

        jdbcTemplate.batchUpdate("insert into stockprice_dly(id,symbol,date,open,close) values(?,?,?,?,?)",
                new BatchPreparedStatementSetter() {
                    @Override
                    public void setValues(PreparedStatement ps, int i) throws SQLException {
                        ps.setInt(1, prices.get(i).getId()); // TODO Auto-generated method stub
                        ps.setString(2, prices.get(i).getSymbol());
                        ps.setDate(3, (Date) prices.get(i).getDate());
                        ps.setFloat(4, prices.get(i).getOpen());
                        ps.setFloat(5,prices.get(i).getClose());
                    }
                    @Override
                    public int getBatchSize() {
                        System.out.println(prices.size());
                        return prices.size();
                    }
                });
    }
}
