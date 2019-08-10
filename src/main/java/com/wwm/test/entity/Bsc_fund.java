package com.wwm.test.entity;

public class Bsc_fund {
    private int settunit;
    private String funcode;
    private String fundname;
    private String fundtype;
    private String status;

    public Bsc_fund(int settunit, String funcode, String fundname, String fundtype, String status) {
        this.settunit = settunit;
        this.funcode = funcode;
        this.fundname = fundname;
        this.fundtype = fundtype;
        this.status = status;
    }

    public int getSettunit() {
        return settunit;
    }

    public void setSettunit(int settunit) {
        this.settunit = settunit;
    }

    public String getFuncode() {
        return funcode;
    }

    public void setFuncode(String funcode) {
        this.funcode = funcode;
    }

    public String getFundname() {
        return fundname;
    }

    public void setFundname(String fundname) {
        this.fundname = fundname;
    }

    public String getFundtype() {
        return fundtype;
    }

    public void setFundtype(String fundtype) {
        this.fundtype = fundtype;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bsc_fund bsc_fund = (Bsc_fund) o;

        if (getSettunit() != bsc_fund.getSettunit()) return false;
        if (!getFuncode().equals(bsc_fund.getFuncode())) return false;
        if (!getFundname().equals(bsc_fund.getFundname())) return false;
        if (getFundtype() != null ? !getFundtype().equals(bsc_fund.getFundtype()) : bsc_fund.getFundtype() != null)
            return false;
        return getStatus() != null ? getStatus().equals(bsc_fund.getStatus()) : bsc_fund.getStatus() == null;
    }

    @Override
    public int hashCode() {
        int result = getSettunit();
        result = 31 * result + getFuncode().hashCode();
        result = 31 * result + getFundname().hashCode();
        result = 31 * result + (getFundtype() != null ? getFundtype().hashCode() : 0);
        result = 31 * result + (getStatus() != null ? getStatus().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Bsc_fund{" +
                "settunit=" + settunit +
                ", funcode='" + funcode + '\'' +
                ", fundname='" + fundname + '\'' +
                ", fundtype='" + fundtype + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
