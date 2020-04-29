package top.tinn.behavioral_pattern.ChainOfResponsibilityPattern;

/**
 * @ClassName Approver
 * @Description
 * @Author Tinn
 * @Date 2020/4/13 14:59
 */
abstract class Approver {
    protected Approver successor;
    protected String name;

    public Approver(String name) {
        this.name = name;
    }

    public void setSuccessor(Approver successor) {
        this.successor = successor;
    }

    public abstract void processRequest(PurchaseRequest request);
}
