package uts.billsplit.util;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

import uts.billsplit.R;
import uts.billsplit.models.Friend;

/**
 * Created by Hamza on 25/04/2016.
 */
public class FriendsAdaptor extends ArrayAdapter<Friend> {

    private final Context mContext;
    private List<Friend> mFriendsData;

    public FriendsAdaptor(Context context, List<Friend> objects) {

        super(context, R.layout.friends_list_row, objects);
        this.mContext = context;
        this.mFriendsData = objects;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.friends_list_row, parent, false);

        TextView friendName = (TextView) rowView.findViewById(R.id.text_friend_name);
        TextView friendDetails = (TextView) rowView.findViewById(R.id.text_friend_details);

        friendName.setText(mFriendsData.get(position).getName());
        friendDetails.setText("Cleared");
        return rowView;
    }

    @Override
    public int getCount() {
        return mFriendsData.size();
    }
}

