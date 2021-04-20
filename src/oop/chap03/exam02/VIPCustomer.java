package oop.chap03.exam02;

public class VIPCustomer extends Customer{

    private int agentID;
    double salesRatio;

    public VIPCustomer() {
        customerGrade = "VIP";    // 상위 클래스를 멤버변수를 변경하려면 protected로 되어 있어야 한다.
        bonusRatio = 0.05;
        salesRatio = 0.1;
    }

    public int getAgentID() {
        return agentID;
    }
}

