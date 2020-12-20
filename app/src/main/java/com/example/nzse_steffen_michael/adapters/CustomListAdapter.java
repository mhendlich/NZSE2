package com.example.nzse_steffen_michael.adapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.nzse_steffen_michael.DataObjects.ErgebnissDataObject;
import com.example.nzse_steffen_michael.R;

import java.util.List;

public class CustomListAdapter extends ArrayAdapter<ErgebnissDataObject> {
    private final Activity context;
    private final List<ErgebnissDataObject> userErgebnissDataobjectList;
    private final String DELIMITER = ",";


    public CustomListAdapter(@NonNull Activity context, int resource, @NonNull List<ErgebnissDataObject> objects) {
        super(context, resource, objects);
        this.context = context;
        userErgebnissDataobjectList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View rowView = convertView;
        if (rowView == null) {

            LayoutInflater inflater = context.getLayoutInflater();
            rowView = inflater.inflate(R.layout.list_row, null);
            ViewHolder viewHolder = new ViewHolder();
            viewHolder.houseName =  rowView.findViewById(R.id.house_name);
            viewHolder.rent = rowView.findViewById(R.id.rent_price);
            viewHolder.favicon = rowView.findViewById(R.id.fav_icon);
            rowView.setTag(viewHolder);
        }

        //fill data
        ViewHolder holder = (ViewHolder) rowView.getTag();
        ErgebnissDataObject userErgebnissDataobject = userErgebnissDataobjectList.get(position);

        holder.houseName.setText(userErgebnissDataobject.getHouseName());
        if(userErgebnissDataobject.getPrice() != null ){
            holder.rent.setText(userErgebnissDataobject.getPrice());
        } else if(userErgebnissDataobject.getRent() != null ) {
            holder.rent.setText(userErgebnissDataobject.getRent());
        }
        if(userErgebnissDataobject.isFav()) {
            holder.favicon.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_favorite_black_18dp, 0);
        }

        return rowView;
    }

    static class ViewHolder {

        public TextView houseName;
        public TextView rent;
        public TextView price;
        public TextView favicon;

    }
}