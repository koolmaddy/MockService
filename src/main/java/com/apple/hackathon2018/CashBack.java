package com.apple.hackathon2018;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rupalh on 5/7/18.
 */
public class CashBack {
    private List<CashBackInfo> cashBackInfo = new ArrayList<>();

    public List<CashBackInfo> getCashBackInfo() {
        return cashBackInfo;
    }

    public void setCashBackInfo(List<CashBackInfo> cashBackInfo) {
        this.cashBackInfo = cashBackInfo;
    }

    public void addCard(int i, double v) {
       CashBackInfo info = new CashBackInfo(i,v);
        cashBackInfo.add(info);
    }
}

class CashBackInfo {
    private double value;
    private int walletCardId;

    public CashBackInfo(int i, double v) {
        this.value= v;
        this.walletCardId = i;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public int getWalletCardId() {
        return walletCardId;
    }

    public void setWalletCardId(int walletCardId) {
        this.walletCardId = walletCardId;
    }
}
