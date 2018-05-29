package id.co.bale_it.kliksahabat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;

import id.co.bale_it.kliksahabat.adapter.MyAdapter;
import id.co.bale_it.kliksahabat.adapter2.MyAdapter2;

public class DPMPTSP extends AppCompatActivity {

    int [] images = {R.drawable.logp1, R.drawable.logp1,R.drawable.logp1};
    String [] names = {"SIUP","TDP","DLL"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dpmptsp);
        getSupportActionBar().setTitle("Daftar Yanlik");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //REFERENCE RECYCLER
        RecyclerView rv= (RecyclerView) findViewById(R.id.myRecycler);

        //SET PROPERTIES
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.smoothScrollToPosition(0);
        rv.setItemAnimator(new DefaultItemAnimator());

        //ADAPTER
        MyAdapter2 adapter=new MyAdapter2(this,names,images);
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

