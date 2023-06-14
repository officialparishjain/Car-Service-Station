import java.util.HashMap;

public class Sedan implements CarServiceStation {

    private HashMap<String,Integer> prices;
    private int totalAmount;
    public Sedan(){
        prices = new HashMap<>();
        prices.put("BS01", 4000);
        prices.put("EF01", 8000);
        prices.put("CF01", 4000);
        prices.put("BF01", 1500);
        prices.put("GF01", 6000);
    }


    @Override
    public int basicService() {
        return  prices.get("BS01");
    }

    @Override
    public int engineFixing() {
        return  prices.get("EF01");
    }

    @Override
    public int clutchFixing() {
        return  prices.get("CF01");
    }

    @Override
    public int brakeFixing() {
        return  prices.get("BF01");
    }

    @Override
    public int gearFixing() {
        return  prices.get("GF01");
    }
}
