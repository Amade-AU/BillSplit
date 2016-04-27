package uts.billsplit.models;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by Hamza on 25/04/2016.
 */

@DatabaseTable(tableName = "friend")
public class Friend {

    @DatabaseField(generatedId =  true)
    private int id;

    @DatabaseField
    private String name;

    @DatabaseField
    private int group;

    @DatabaseField
    private int number;

    public Friend(int id, String name, int group, int number) {
        this.id = id;
        this.name = name;
        this.group = group;
        this.number = number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
