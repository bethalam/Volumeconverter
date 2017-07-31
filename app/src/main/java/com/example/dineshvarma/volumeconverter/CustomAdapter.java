package com.example.dineshvarma.volumeconverter;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {
    Context context;
    String[] codes={"m"+ '\u00b3', "dm"+ '\u00b3', "cm"+ '\u00b3', "mm"+ '\u00b3', "l", "dl", "cl", "ml", "ft"+ '\u00b3', "in"+ '\u00b3', "yd"+ '\u00b3'};
    String[] names={"Cubic metre m"+ '\u00b3', "Cubic decimetre dm"+ '\u00b3', "Cubic centimetre cm"+ '\u00b3', "Cubic millimetre mm"+ '\u00b3', "Litre l",
            "Decilitre dl", "Centilitre cl", "Millilitre ml", "Cubic foot ft"+ '\u00b3', "Cubic inch in"+ '\u00b3', "Cubic yard yd"+ '\u00b3'};
     CustomAdapter(Context c){
        context = c;
    }
    @Override
    public int getCount() {
        return names.length;
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        TextView txt = new TextView(context);
        txt.setTextSize(24);
        txt.setText(codes[i]);
        txt.setTextColor(Color.parseColor("#000000"));
        return  txt;
    }

    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        TextView txt = new TextView(context);
        txt.setPadding(16, 16, 16, 16);
        txt.setTextSize(28);
        txt.setText(names[position]);
        txt.setTextColor(Color.parseColor("#000000"));
        return  txt;
    }
}
