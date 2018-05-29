package id.co.bale_it.kliksahabat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;

import id.co.bale_it.kliksahabat.adapter2.MyAdapter2;

public class SubDPM extends AppCompatActivity {

    int [] images = {R.drawable.ic_dashboard_black_24dp,R.drawable.ic_assignment_black_24dp, R.drawable.ic_border_color_black_24dp,
            R.drawable.ic_av_timer_black_24dp,
            R.drawable.ic_attach_money_black_24dp,R.drawable.ic_person_pin_circle_black_24dp,
            R.drawable.ic_person_black_24dp,R.drawable.ic_account_box_black_24dp,
            R.drawable.ic_public_black_24dp};
    String [] names = {"Nama Layanan","Persyaratan","Atur Layanan","Lama Layanan","Biaya","Alamat Pengelola","Nama Pengelola","Nomor Kontak","Pendaftaran Online"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_dpm);
        getSupportActionBar().setTitle("Info Yanlik");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //REFERENCE RECYCLER
        RecyclerView rv= (RecyclerView) findViewById(R.id.myRecycler1);

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

