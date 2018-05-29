package id.co.bale_it.kliksahabat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.view.View;

import id.co.bale_it.kliksahabat.adapter.MyAdapter;

public class SubMenu1 extends AppCompatActivity {
    String [] names = {"SETDA","DINKES","DIKBUD","DISHUB","DINSOS","DISNAKKESWAN","DPMPTSP","DLL"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_menu1);
        getSupportActionBar().setTitle("Perangkat Daerah");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //REFERENCE RECYCLER
        RecyclerView rv= (RecyclerView) findViewById(R.id.myRecycler);

        //SET PROPERTIES
        rv.setLayoutManager(new GridLayoutManager(this,2));
        rv.smoothScrollToPosition(0);
        rv.setItemAnimator(new DefaultItemAnimator());

        //ADAPTER
        final MyAdapter adapter=new MyAdapter(this,names);
        rv.setAdapter(adapter);


    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }

        return super.onOptionsItemSelected(item);
    }

}

