package top.tinn.behavioral_pattern.ChainOfResponsibilityPattern;

/**
 * @ClassName PurchaseRequest
 * @Description
 * @Author Tinn
 * @Date 2020/4/13 15:00
 */
public class PurchaseRequest {
    private Double amount;
    private Integer number;
    private String purpose;

    public PurchaseRequest(Double amount, Integer number, String purpose) {
        this.amount = amount;
        this.number = number;
        this.purpose = purpose;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }
}
