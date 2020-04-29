package top.tinn.behavioral_pattern.ChainOfResponsibilityPattern;

/**
 * @ClassName President
 * @Description
 * @Author Tinn
 * @Date 2020/4/13 15:03
 */
public class President extends Approver {
    public President(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() < 150000)
            System.out.println(name+"审批"+request.getPurpose());
        else successor.processRequest(request);
    }
}
