package top.tinn.creational_pattern.SimpleFactoryPattern;

import com.sun.jmx.snmp.SnmpNull;

/**
 * @ClassName Factory
 * @Description
 * @Author Tinn
 * @Date 2020/4/12 14:31
 */
public class Factory {
    public static Product getProduct(String arg){
        Product product = null;
        if ("A".equals(arg)){
            product = new ProductA();
        }else if ("B".equals(arg)){
            product = new ProductB();
        }
        return product;
    }
}
