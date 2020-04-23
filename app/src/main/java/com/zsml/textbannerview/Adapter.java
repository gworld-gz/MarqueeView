package com.zsml.textbannerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gw.marqueview.MarqueeView;

import java.util.ArrayList;
import java.util.List;

/**
 * Copyright (C), 2017-2020, Gworld(平潭)互联网有限公司
 *
 * @author :        zlh <519009242@qq.com>
 * @date :          2020-04-23 10:56
 * @desc :
 */
public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    private List<Model> list = new ArrayList<>();

    public static class Model{
        public Model(List<String> data) {
            this.data = data;
        }

        public List<String> data;
    }

    public Adapter(){
        ArrayList<String> strings = new ArrayList<>();
        strings.add("12222");
        strings.add("12333333");
        strings.add("12");
        list.add(new Model(strings));

        strings = new ArrayList<>();
        strings.add("fsdfsdf");
        strings.add("sfsdfsdfsssss");
        list.add(new Model(strings));

        strings = new ArrayList<>();
        strings.add("1555555e");
        strings.add("12a22");
        strings.add("120002");
        strings.add("12lll22");
        strings.add("12s22");
        strings.add("12kkkk2");
        list.add(new Model(strings));

        strings = new ArrayList<>();
        strings.add("slllllmmmmm");
        strings.add("12a22");
        strings.add("120002");
        strings.add("12lll22");
        strings.add("12s22");
        strings.add("12kkkk2");
        list.add(new Model(strings));

        strings = new ArrayList<>();
        strings.add("6677");
        strings.add("8888888");
        list.add(new Model(strings));

        strings = new ArrayList<>();
        strings.add("9999999");
        strings.add("3333333");
        strings.add("11111111");
        list.add(new Model(strings));

        strings = new ArrayList<>();
        strings.add("12222");
        list.add(new Model(strings));

        strings = new ArrayList<>();
        strings.add("177777");
        strings.add("12a22");
        strings.add("120002");
        strings.add("12lll22");
        strings.add("12s22");
        strings.add("12kkkk2");
        list.add(new Model(strings));

        strings = new ArrayList<>();
        strings.add("1eeee");
        strings.add("12a22");
        strings.add("120002");
        strings.add("12lll22");
        strings.add("12s22");
        strings.add("12kkkk2");
        list.add(new Model(strings));

        strings = new ArrayList<>();
        strings.add("1999999");
        strings.add("12a22");
        strings.add("120002");
        strings.add("12lll22");
        strings.add("12s22");
        strings.add("12kkkk2");
        list.add(new Model(strings));
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent,false);
        return new ViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.marqueeView.startWithList(list.get(position).data);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        MarqueeView marqueeView;

        public ViewHolder(View itemView) {
            super(itemView);
            marqueeView = itemView.findViewById(R.id.marqueeView);
        }
    }
}
