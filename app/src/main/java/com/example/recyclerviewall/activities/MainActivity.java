package com.example.recyclerviewall.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.recyclerviewall.R;
import com.example.recyclerviewall.adapters.ItemCardViewAdapter;
import com.example.recyclerviewall.adapters.ItemGridAdapter;
import com.example.recyclerviewall.adapters.ItemListAdapter;
import com.example.recyclerviewall.models.Resort;
import com.example.recyclerviewall.models.ResortData;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<Resort> list;

    final String STATE_TITLE = "state_title";
    final String STATE_LIST = "state_list";
    final String STATE_MODE = "state_mode";

    int mode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);

        list = new ArrayList<>();
//        list.addAll(ResortData.getListData());
//        showRecyclerViewList();
        if (savedInstanceState == null){
            setActionBarTitle("List Mode");
            list.addAll(ResortData.getListData());
            showRecyclerViewList();
            mode = R.id.action_list;
        }else {
            String stateTitle = savedInstanceState.getString(STATE_TITLE);
            ArrayList<Resort> stateList = savedInstanceState.getParcelableArrayList(STATE_LIST);
            int stateMode = savedInstanceState.getInt(STATE_MODE);
            setActionBarTitle(stateTitle);
            list.addAll(stateList);
            setMode(stateMode);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.item_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    private void setMode(int itemId) {
        String title = null;
        switch (itemId){
            case R.id.action_list:
            title = "List Mode";
            showRecyclerViewList();
            break;
            case R.id.action_gride:
                title = "Grid Mode";
                showRecyclerViewGrid();
                break;
            case R.id.action_cardView:
                title = "CardView Mode";
                showRecyclerCardView();
                break;
        }
        mode = itemId;
        setActionBarTitle(title);
    }

    private void showRecyclerCardView() {
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ItemCardViewAdapter cardViewAdapter = new ItemCardViewAdapter(this);
        cardViewAdapter.setListResort(list);
        recyclerView.setAdapter(cardViewAdapter);
    }

    private void setActionBarTitle(String title) {
        getSupportActionBar().setTitle(title);
    }

    private void showRecyclerViewGrid() {
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));
        ItemGridAdapter itemGridAdapter = new ItemGridAdapter(this);
        itemGridAdapter.setListResort(list);
        recyclerView.setAdapter(itemGridAdapter);
    }

    private void showRecyclerViewList() {
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
            ItemListAdapter listAdapter = new ItemListAdapter(this);
            listAdapter.setListResort(list);
            recyclerView.setAdapter(listAdapter);

    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString(STATE_TITLE,getSupportActionBar().getTitle().toString());
        outState.putParcelableArrayList(STATE_LIST,list);
        outState.putInt(STATE_MODE,mode);
    }
}
