package com.example.suresh.toolsandpizzas;


import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Toast;


public class PastaFragment extends Fragment {


//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//        //ArrayAdapter<String> adapter = new ArrayAdapter<>(
//          //  inflater.getContext(), android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.pasta));
//        //setListAdapter(adapter);
//        return super.onCreateView(inflater, container, savedInstanceState); }
//
//}


    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //ArrayAdapter<String> adapter = new ArrayAdapter<>(
        //  inflater.getContext(), android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.pasta));
        //setListAdapter(adapter);
        return inflater.inflate(R.layout.fragment_pasta, container, false);

    }

    public void onClickDone(View view) {
        CharSequence text = "Your order has been updated";
        int duration = Snackbar.LENGTH_SHORT;
        Snackbar snackbar = Snackbar.make(view.findViewById(R.id.coordinator), text, duration);
        snackbar.setAction("Undo",
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast toast = Toast.makeText(getContext(), "Undone!",
                                Toast.LENGTH_SHORT);
                        toast.show();
                    }
                });
        snackbar.show();
    }
}

