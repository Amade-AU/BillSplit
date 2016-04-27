package uts.billsplit.models;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.util.List;

/**
 * Created by Hamza on 25/04/2016.
 */

@DatabaseTable(tableName = "bill")
public class Bill {

    @DatabaseField(generatedId =  true)
    private int id;

    @DatabaseField
    private String detail;

    @DatabaseField
    private List<Friend> friends;

    @DatabaseField
    private double amount;

    @DatabaseField
    private int paidby;

    @DatabaseField
    private String splitBy;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public List<Friend> getFriends() {
        return friends;
    }

    public void setFriends(List<Friend> friends) {
        this.friends = friends;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getPaidby() {
        return paidby;
    }

    public void setPaidby(int paidby) {
        this.paidby = paidby;
    }

    public String getSplitBy() {
        return splitBy;
    }

    public void setSplitBy(String splitBy) {
        this.splitBy = splitBy;
    }
}
