package uts.billsplit.util;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import java.sql.SQLException;

import uts.billsplit.R;
import uts.billsplit.models.Bill;
import uts.billsplit.models.Friend;
import uts.billsplit.models.Group;

/**
 * Created by Hamza on 25/04/2016.
 */
public class DatabaseHelper extends OrmLiteSqliteOpenHelper {

    private static final String DATABASE_NAME = "billsplit";
    private static final int DATABASE_VERSION = 1;

    private Dao<Friend, Integer> friendDao;
    private Dao<Group, Integer> groupDao;
    private Dao<Bill, Integer> billDao;

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION, R.raw.ormlite_config);
    }


    @Override
    public void onCreate(SQLiteDatabase database, ConnectionSource connectionSource) {
        try {
            TableUtils.createTableIfNotExists(connectionSource, Friend.class);
            TableUtils.createTableIfNotExists(connectionSource, Bill.class);
            TableUtils.createTableIfNotExists(connectionSource, Group.class);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase database, ConnectionSource connectionSource, int oldVersion, int newVersion) {
        try {
            TableUtils.dropTable(connectionSource, Friend.class, false);
            TableUtils.dropTable(connectionSource, Group.class, false);
            TableUtils.dropTable(connectionSource, Bill.class, false);
            onCreate(database, connectionSource);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public Dao<Friend, Integer> getFrindsDao() throws SQLException {

        if (friendDao == null) {
            friendDao = getDao(Friend.class);
        }
        return friendDao;

    }

    public Dao<Group, Integer> getGroupsDao() throws SQLException {

        if (groupDao == null) {
            groupDao = getDao(Group.class);
        }
        return groupDao;
    }

    public Dao<Bill, Integer> getBillDao() throws SQLException {

        if (billDao == null) {
            billDao = getDao(Bill.class);
        }
        return billDao;
    }
}
