package application;

import controller.ExchangeOperation;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.CurrencySet;
import views.ui.implementation.console.*;
import views.ui.implementation.swing.ApplicationFrame;

public class App {   
    public static void main (String args []) {     
        CurrencySet currencySet = new views.persistence.implementation.sqlite.CurrencySetLoader().load();
        SwingMODE(currencySet);
        //ConsoleMODE(currencySet);
    }
    
    private static void SwingMODE (CurrencySet currencySet) {
        ApplicationFrame frame = new ApplicationFrame(currencySet.toArray());
        frame.register(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ExchangeOperation(currencySet, frame.getExchangeDialog(), frame.getExchangeDisplay()).execute();
            }
        });
    }
    
    private static void ConsoleMODE (CurrencySet currencySet) {
        new ExchangeOperation(currencySet, new ExchangeDialog(), new ExchangeDisplay()).execute();
    }
}
