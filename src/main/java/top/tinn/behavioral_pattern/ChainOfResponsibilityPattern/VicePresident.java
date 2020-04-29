package top.tinn.behavioral_pattern.ChainOfResponsibilityPattern;

/**
 * @ClassName VicePresident
 * @Description
 * @Author Tinn
 * @Date 2020/4/13 15:03
 */
public class VicePresident extends Approver {
    public VicePresident(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() < 100000)
            System.out.println(name+"审批"+request.getPurpose());
        else successor.processRequest(request);
    }
}
