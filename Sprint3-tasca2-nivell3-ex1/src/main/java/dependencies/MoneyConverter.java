package dependencies;

public class MoneyConverter {

    private ConverterRates myRates;

    public MoneyConverter(ConverterRates myRates) {
        this.myRates = myRates;
    }


    public void convertEurosToUSD(float eurosAmount, String moneyName){

        float amountConverted = eurosAmount * myRates.convertToUSD();

        System.out.println(eurosAmount + " euros are worth -> " + amountConverted + " " + moneyName);
    }

    public void convertEurosToYen(float eurosAmount, String moneyName){

        float amountConverted = eurosAmount * myRates.convertToYen();

        System.out.println(eurosAmount + " euros are worth -> " + amountConverted + " " + moneyName);
    }


}
