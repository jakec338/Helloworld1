package com.example.jake.helloworld1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.NumberFormat;
import java.util.List;

/**
 * Created by Jake on 21/03/2016.
 */
public class ProductListAdapter extends ArrayAdapter<Product> {

    private List<Product> products;

    public ProductListAdapter(Context context, int resource, List<Product> objects) {
        super(context, resource, objects);
        products = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null){
            convertView = LayoutInflater.from(getContext()).
                    inflate(R.layout.list_item, parent, false);
        }

        Product product = products.get(position);

        TextView itemText = (TextView) convertView.findViewById(R.id.itemText);
        itemText.setText(product.getName());

        TextView descriptionText = (TextView) convertView.findViewById(R.id.descriptionText);
        descriptionText.setText(product.getDescription());

        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        String price = formatter.format(product.getPrice());
        TextView priceText = (TextView) convertView.findViewById(R.id.priceText);
        priceText.setText(price);


        return convertView;
    }
}
