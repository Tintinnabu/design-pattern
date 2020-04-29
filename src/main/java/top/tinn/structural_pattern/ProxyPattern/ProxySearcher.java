package top.tinn.structural_pattern.ProxyPattern;

/**
 * @ClassName ProxySearcher
 * @Description
 * @Author Tinn
 * @Date 2020/4/13 14:47
 */
public class ProxySearcher implements Searcher {
    private Logger logger;
    private AccessValidator accessValidator;
    private Searcher searcher = new RealSearcher();

    @Override
    public String doSearch(String userId, String keyword) {
        if (accessValidator.validate(userId)){
            logger.Log(userId);
            return searcher.doSearch(userId,keyword);
        }
        return "";
    }
}
