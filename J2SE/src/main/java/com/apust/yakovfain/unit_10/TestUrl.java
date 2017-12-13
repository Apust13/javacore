package com.apust.yakovfain.unit_10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.StringTokenizer;

/**
 * Created by GUN
 * on 14.07.2016.
 */
public class TestUrl {

    static void printStockQuote(String symbol){
        String csvString;
        URL url = null;
        URLConnection urlConn = null;
        InputStreamReader inStream = null;
        BufferedReader reader = null;


        try {
            url = new URL("http://quote.yahoo.com/d/quotes.csv?s=" + symbol + "&f=sl1d1t1c1ohgv=.cv");
            urlConn = url.openConnection();
            inStream = new InputStreamReader(urlConn.getInputStream());
            reader = new BufferedReader(inStream);

            csvString = reader.readLine();

            StringTokenizer tokenizer = new StringTokenizer(csvString, ",");
            String ticker = tokenizer.nextToken();
            String price = tokenizer.nextToken();
            String tradeDate = tokenizer.nextToken();
            String tradeTime = tokenizer.nextToken();
            System.out.println("Symbol: " + ticker + " Price: " + price + " Date: " + tradeDate + " Time: " + tradeTime);

        } catch (MalformedURLException e) {
            System.out.println("Please check the spelling of " + "the URL: " + e.toString());
        } catch (IOException e) {
            System.out.println("Can't read from the Internet: " + e.toString());
        } finally {
            try {
                inStream.close();
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

    public static void main(String[] args) {
        if(args.length==0){
            System.out.println("Sample Usage: java StockQuote IBM");
            System.exit(0);
        }
        printStockQuote(args[0]);
    }

}
