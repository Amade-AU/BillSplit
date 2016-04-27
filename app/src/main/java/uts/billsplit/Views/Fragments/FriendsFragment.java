package uts.billsplit.Views.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import uts.billsplit.R;
import uts.billsplit.models.Friend;
import uts.billsplit.util.DatabaseHelper;
import uts.billsplit.util.FriendsAdaptor;


/**
 * A simple {@link Fragment} subclass.
 */
public class FriendsFragment extends Fragment {

    private ListView mFriendsList;
    private FriendsAdaptor mFriendsAdaptor;
    private DatabaseHelper mDbHelper;
    private List<Friend> mFriendData;


    public FriendsFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setHasOptionsMenu(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_friends, container, false);

        populateList();
        mFriendsList = (ListView) view.findViewById(R.id.friends_list);
        mFriendsAdaptor = new FriendsAdaptor(getActivity(), mFriendData);
        mFriendsList.setAdapter(mFriendsAdaptor);

        return view;
    }

    public void populateList(){

        mFriendData = new ArrayList<>();
        mFriendData.add(new Friend(1, "Hamza", 2, 431921724));
        mFriendData.add(new Friend(1,"Artaza" , 2 , 431921724));
        mFriendData.add(new Friend(1,"Farhan" , 2 , 431921724));
        mFriendData.add(new Friend(1, "Amjad", 2, 431921724));
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        getActivity().getMenuInflater().inflate(R.menu.friends_fragment_menu, menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
