import commonUtils.num2CNmoneyUtils;

import java.math.BigDecimal;

/**
 * Created by Zhangx on 2017/4/25 at 18:50.
 */
public class Main
{
    public static void main(String[] args)
    {
        double money=201231.131;
        BigDecimal numberOfMoney=new BigDecimal(money);
        String s= num2CNmoneyUtils.number2CNMonetaryUnit(numberOfMoney);
        System.out.println(s.toString());
    }
}
