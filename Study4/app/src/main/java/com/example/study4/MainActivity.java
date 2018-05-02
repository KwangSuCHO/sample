package com.example.study4;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.listView);
        ArrayList<FriendList> items = new ArrayList<FriendList>();

        FriendList item1 = new FriendList(R.drawable.person, "qwe","asd" );
        FriendList item2 = new FriendList(R.drawable.person, "sdf", "pj");
        FriendList item3 = new FriendList(R.drawable.person, "d'","dfp");

        for(int i = 0; i<10; i++){
            items.add(item1);
            items.add(item2);
            items.add(item3);
        }

        FriendListAdapter adapter = new FriendListAdapter(this,R.layout.friend_list, items);
        listView.setAdapter(adapter);
    }
}
