package uts.billsplit.models;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.util.List;

/**
 * Created by Hamza on 25/04/2016.
 */

@DatabaseTable(tableName =  "group")
public class Group {

    @DatabaseField(generatedId =  true)
    private int id;

    @DatabaseField
    private String name;

    @DatabaseField
    private List<Friend> members;

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

    public List<Friend> getMembers() {
        return members;
    }

    public void setMembers(List<Friend> members) {
        this.members = members;
    }
}
