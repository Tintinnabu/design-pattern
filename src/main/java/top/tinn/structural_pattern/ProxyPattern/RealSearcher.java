package top.tinn.structural_pattern.ProxyPattern;

/**
 * @ClassName RealSearcher
 * @Description
 * @Author Tinn
 * @Date 2020/4/13 14:49
 */
public class RealSearcher implements Searcher {
    @Override
    public String doSearch(String userId, String keyword) {
        return "doing search:"+keyword;
    }
}
