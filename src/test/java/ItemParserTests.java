import org.junit.Test;
import org.junit.Assert;

public class ItemParserTests {




    @Test
    public void checkNameTest(){

        String word = "nAMe";

        ItemParser itemParser = new ItemParser();

        Assert.assertTrue(itemParser.checkName(word));

    }

    @Test
    public void checkPriceTest(){

        String price = "pRice";

        ItemParser itemParser = new ItemParser();

        Assert.assertTrue(itemParser.checkPrice(price));
    }

    @Test
    public void checkTypeTest(){

        String type = "tYpE";

        ItemParser itemParser = new ItemParser();

        Assert.assertTrue(itemParser.checkType(type));
    }

    @Test
    public void checkExpirationTest(){

        String expiration = "exPiRatioN";

        ItemParser itemParser = new ItemParser();

        Assert.assertTrue(itemParser.checkExpiration(expiration));
    }

    @Test
    public void checkCookieTest(){
        String cookie = "C0okies";

        ItemParser itemParser = new ItemParser();

        Assert.assertTrue(itemParser.checkCookies(cookie));

    }

    @Test
    public void checkBreadTest(){
        String bread= "BrEad";

        ItemParser itemParser = new ItemParser();

        Assert.assertTrue(itemParser.checkBread(bread));
    }

    @Test
    public void checkApplesTest(){
        String apple = "AppLes";

        ItemParser itemParser = new ItemParser();

        Assert.assertTrue(itemParser.checkApples(apple));
    }

    @Test
    public void checkMilkTest(){
        String milk = "MILk";

        ItemParser itemParser = new ItemParser();

        Assert.assertTrue(itemParser.checkMilk(milk));
    }


}
