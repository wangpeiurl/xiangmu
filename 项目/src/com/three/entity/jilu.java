package com.three.entity;

public class jilu {
    private int Oid;//编号
    private int Sid;//送审着ID
    private int Did;//审批真ID
    private String SubDate;//送审时间
    private String ADate;//审批时间
    private int Type;//审批状态（1，未审批；2，已审核）
    private int Suc;//审批结果（1，通过；2，未通过）
    private String Decrease;//备注

    public int getOid() {
        return Oid;
    }

    public void setOid(int oid) {
        Oid = oid;
    }

    public int getSid() {
        return Sid;
    }

    public void setSid(int sid) {
        Sid = sid;
    }

    public int getDid() {
        return Did;
    }

    public void setDid(int did) {
        Did = did;
    }

    public String getSubDate() {
        return SubDate;
    }

    public void setSubDate(String subDate) {
        SubDate = subDate;
    }

    public String getADate() {
        return ADate;
    }

    public void setADate(String ADate) {
        this.ADate = ADate;
    }

    public int getType() {
        return Type;
    }

    public void setType(int type) {
        Type = type;
    }

    public int getSuc() {
        return Suc;
    }

    public void setSuc(int suc) {
        Suc = suc;
    }

    public String getDecrease() {
        return Decrease;
    }

    public void setDecrease(String decrease) {
        Decrease = decrease;
    }

    @Override
    public String toString() {
        return "jilu{" +
                "Oid=" + Oid +
                ", Sid=" + Sid +
                ", Did=" + Did +
                ", SubDate='" + SubDate + '\'' +
                ", ADate='" + ADate + '\'' +
                ", Type=" + Type +
                ", Suc=" + Suc +
                ", Decrease='" + Decrease + '\'' +
                '}';
    }
}
