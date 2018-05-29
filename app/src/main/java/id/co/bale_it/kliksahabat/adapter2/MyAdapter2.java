package id.co.bale_it.kliksahabat.adapter2;

/**
 * Created by Satria on 9/30/2017.
 */

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import id.co.bale_it.kliksahabat.DPMPTSP;
import id.co.bale_it.kliksahabat.R;
import id.co.bale_it.kliksahabat.SubDPM;
import id.co.bale_it.kliksahabat.adapter.ItemClickListener;


public class MyAdapter2 extends RecyclerView.Adapter<MyHolder2> {


    Context c;
    String[] players;
    int[] images;

    public MyAdapter2(Context ctx, String[] players, int[] images) {

        this.c = ctx;
        this.players = players;
        this.images = images;
    }

    @Override
    public MyHolder2 onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.modellist, null);


        MyHolder2 holder = new MyHolder2(v);

        return holder;
    }


    @Override
    public void onBindViewHolder(MyHolder2 holder, final int position) {


        holder.nameTxt.setText(players[position]);
        holder.img.setImageResource(images[position]);

        holder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onItemClick(View v, int pos) {
                switch (pos) {
                    case 0:
                        Intent subdpm = new Intent(c, SubDPM.class);
                        c.startActivity(subdpm);
                        break;
                    case 1:
                        break;
                    case 2:
                        break;
                }


//                Intent i=new Intent(c,DetailActivity.class);
//
//
//                i.putExtra("Name",players[position]);
//
//
//
//                c.startActivity(i);

            }
        });

    }


    @Override
    public int getItemCount() {
        return players.length;
    }
}
