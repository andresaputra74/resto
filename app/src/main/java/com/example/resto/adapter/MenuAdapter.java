package com.example.resto.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.resto.R;
import com.example.resto.model.Menu;

import java.util.ArrayList;
import java.util.List;

public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.ViewHolder> {

	private final Activity activity;
	private List<Menu> listMenu = new ArrayList<>();

	public MenuAdapter(Activity activity) {
		this.activity = activity;
	}

	public void setListMenu(List<Menu> listMenu) {
		if (listMenu != null) {
			this.listMenu.clear();
			this.listMenu.addAll(listMenu);
			notifyDataSetChanged();
		}
	}

	@NonNull
	@Override
	public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
		View view = LayoutInflater.from(activity.getApplicationContext()).inflate(R.layout.item_makanan, parent, false);
		return new ViewHolder(view);
	}

	@Override
	public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
		holder.nama.setText(listMenu.get(position).getNama());
		Glide.with(activity.getApplicationContext())
				.load(listMenu.get(position).getGambar())
				.apply(new RequestOptions().fitCenter())
				.into(holder.gambar);
	}

	@Override
	public int getItemCount() {
		return listMenu.size();
	}

	public class ViewHolder extends RecyclerView.ViewHolder {

		ImageView gambar;
		TextView nama;

		public ViewHolder(@NonNull View itemView) {
			super(itemView);

			gambar = itemView.findViewById(R.id.gambar);
			nama = itemView.findViewById(R.id.tv_nama_makanan);
		}
	}
}
