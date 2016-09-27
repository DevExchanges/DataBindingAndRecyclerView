package info.devexchanges.databindingrecyclerview;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import info.devexchanges.databindingrecyclerview.databinding.ItemRecyclerViewBinding;

public class RecyclerViewAdapter extends RecyclerView.Adapter<CountryViewHolder> {

    private List<Country> users;

    public RecyclerViewAdapter(List<Country> users) {
        this.users = users;
    }

    @Override
    public CountryViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View statusContainer = inflater.inflate(R.layout.item_recycler_view, parent, false);

        return new CountryViewHolder(statusContainer);
    }

    @Override
    public void onBindViewHolder(CountryViewHolder holder, int position) {
        Country status = users.get(position);
        holder.bind(status);
    }

    @Override
    public int getItemCount() {
        return users.size();
    }
}
