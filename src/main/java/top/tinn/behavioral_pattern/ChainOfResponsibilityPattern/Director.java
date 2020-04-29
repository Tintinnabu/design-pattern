package top.tinn.behavioral_pattern.ChainOfResponsibilityPattern;

/**
 * @ClassName Director
 * @Description
 * @Author Tinn
 * @Date 2020/4/13 15:01
 */
public class Director extends Approver {

    public Director(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() < 50000)
            System.out.println(name+"审批"+request.getPurpose());
        else successor.processRequest(request);
    }
}
