package mmcoe.stock;


import mmcoe.stock.Broker;
import mmcoe.stock.Exchange;
import mmoce.stock.Holder;
import mmcoe.stock.StockSingleton;


public class TestStock {
    public static void main(String[] args) {

        //Stock tisco = new Stock();
        
        Holder h = StockSingleton.getStock();
        h.viewQuote();
        
        Broker b = StockSingleton.getStock();
        b.getQuote();
        
        Exchange e = StockSingleton.getStock();
        e.setQuote();
        
        System.out.println(h==b);
        System.out.println(b==e);
    }
}