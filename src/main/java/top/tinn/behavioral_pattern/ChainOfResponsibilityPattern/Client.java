package top.tinn.behavioral_pattern.ChainOfResponsibilityPattern;

/**
 * @ClassName Client
 * @Description
 * @Author Tinn
 * @Date 2020/4/13 15:04
 */
public class Client {
    public static void main(String[] args) {
        Approver a,b,c,d;
        a = new Director("director");
        b = new VicePresident("vice president");
        c = new President("president");
        d = new Congress("congress");
        a.setSuccessor(b);
        b.setSuccessor(c);
        c.setSuccessor(d);
        PurchaseRequest request = new PurchaseRequest(500000D,100,"购买家具");
        a.processRequest(request);
    }
}
