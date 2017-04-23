package com.swpuiot.yikao.adapter.SomeBody;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.swpuiot.yikao.R;
import com.swpuiot.yikao.entities.SomeBodyEntity;

import java.util.List;

/**
 * Created by 羊荣毅_L on 2017/4/6.
 */
public class SomeBodyRecyclerViewAdapter extends RecyclerView.Adapter<SomeBodyRecyclerViewHolder> {
    private LayoutInflater mInflater;
    private Context mContext;
    private List<SomeBodyEntity> mSomeBodyEntities;

    public SomeBodyRecyclerViewAdapter(Context context, List<SomeBodyEntity> someBodyEntities) {
        mContext = context;
        mInflater = LayoutInflater.from(context);
        mSomeBodyEntities = someBodyEntities;
    }

    @Override
    public SomeBodyRecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = mInflater.inflate(R.layout.item_somebody_info, parent, false);
        SomeBodyRecyclerViewHolder holder = new SomeBodyRecyclerViewHolder(itemView);
        return holder;
    }

    @Override
    public void onBindViewHolder(SomeBodyRecyclerViewHolder holder, int position) {
//        holder.name.setText(mSomeBodyEntities.get(position).getName());
//        holder.time.setText(mSomeBodyEntities.get(position).getTimr());
//        holder.prooduce.setText(mSomeBodyEntities.get(position).getProduce());
//        holder.jidian.setText(mSomeBodyEntities.get(position).getJidian()+"");
//        holder.phoneNumb.setText(mSomeBodyEntities.get(position).getPhoneNumb());
//        holder.goodAt.setText(mSomeBodyEntities.get(position).getGoodat());
//        holder.checkNumb.setText("浏览"+mSomeBodyEntities.get(position).getChecknumb()+"次");
//        holder.messageNumb.setText(mSomeBodyEntities.get(position).getMessageNumb()+"");
//        holder.zanNumb.setText(mSomeBodyEntities.get(position).getZanNumb()+"");
//        holder.image.setImageResource(mSomeBodyEntities.get(position).getImageId());
    }

    @Override
    public int getItemCount() {
        return mSomeBodyEntities.size();
    }
}
