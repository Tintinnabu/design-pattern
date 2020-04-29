package top.tinn.behavioral_pattern.ChainOfResponsibilityPattern;

/**
 * @ClassName Congress
 * @Description
 * @Author Tinn
 * @Date 2020/4/13 15:03
 */
public class Congress extends Approver {
    public Congress(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        System.out.println(name+"审批"+request.getPurpose());
    }
}
