package main;

import dependencies.ConverterRates;
import dependencies.MoneyConverter;

public class Main {
    public static void main(String[] args) {

        MoneyConverter myConverter = new MoneyConverter(new ConverterRates());

        myConverter.convertEurosToUSD(100, "usd");

        myConverter.convertEurosToYen(100, "yen");



    }
}