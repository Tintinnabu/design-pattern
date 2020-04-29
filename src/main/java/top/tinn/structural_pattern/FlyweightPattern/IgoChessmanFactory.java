package top.tinn.structural_pattern.FlyweightPattern;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName IgoChessmanFactory
 * @Description
 * @Author Tinn
 * @Date 2020/4/13 14:30
 */
public class IgoChessmanFactory {
    private static IgoChessmanFactory instance = new IgoChessmanFactory();
    private static Map<String,IgoChessman> map;

    private IgoChessmanFactory() {
        map = new HashMap<>();
        IgoChessman black,white;
        black = new BlackIgoChessman();
        white = new WhiteIgoChessman();
        map.put("b",black);
        map.put("w",white);
    }

    public static IgoChessmanFactory getInstance(){
        return instance;
    }

    public IgoChessman getIgoChessman(String color){
        return map.get(color);
    }
}
