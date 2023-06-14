import java.util.HashMap;

public class SUV implements CarServiceStation{

    private HashMap<String,Integer> prices;
    private int totalAmount;
    public SUV(){
        prices = new HashMap<>();
        prices.put("BS01", 5000);
        prices.put("EF01", 10000);
        prices.put("CF01", 6000);
        prices.put("BF01", 2500);
        prices.put("GF01", 8000);
    }


    @Override
    public int basicService() {
        return prices.get("BS01");
    }

    @Override
    public int engineFixing() {
        return prices.get("EF01");
    }

    @Override
    public int clutchFixing() {
        return prices.get("CF01");
    }

    @Override
    public int brakeFixing() {
        return  prices.get("BF01");
    }

    @Override
    public int gearFixing() {
        return prices.get("GF01");
    }
}
