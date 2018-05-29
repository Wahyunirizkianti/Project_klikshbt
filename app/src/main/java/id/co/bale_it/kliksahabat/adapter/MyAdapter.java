package id.co.bale_it.kliksahabat.adapter;

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


public class MyAdapter extends RecyclerView.Adapter<MyHolder>{


    Context c;
    String[] players;


    public MyAdapter(Context ctx,String[] players)
    {

        this.c=ctx;
        this.players=players;

    }
    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.model,null);


        MyHolder holder=new MyHolder(v);

        return holder;
    }



    @Override
    public void onBindViewHolder(MyHolder holder, final int position) {


        holder.nameTxt.setText(players[position]);


        holder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onItemClick(View v, int pos) {
                switch (pos) {
                    case 0:
                        break;
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    case 6:
                        Intent dpm=new Intent(c, DPMPTSP.class);
                        c.startActivity(dpm);
                        break;
                    case 7:
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
