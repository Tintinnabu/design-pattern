package top.tinn.structural_pattern.FacadePattern;

/**
 * @ClassName Facade
 * @Description
 * @Author Tinn
 * @Date 2020/4/13 14:05
 */
public class Facade {
    private SubSystemA subSystemA;
    private SubSystemB subSystemB;
    private SubSystemC subSystemC;

    public SubSystemA getSubSystemA() {
        return subSystemA;
    }

    public void setSubSystemA(SubSystemA subSystemA) {
        this.subSystemA = subSystemA;
    }

    public SubSystemB getSubSystemB() {
        return subSystemB;
    }

    public void setSubSystemB(SubSystemB subSystemB) {
        this.subSystemB = subSystemB;
    }

    public SubSystemC getSubSystemC() {
        return subSystemC;
    }

    public void setSubSystemC(SubSystemC subSystemC) {
        this.subSystemC = subSystemC;
    }

    public void method(){
        subSystemA.methodA();
        subSystemB.methodB();
        subSystemC.methodC();
    }
}
