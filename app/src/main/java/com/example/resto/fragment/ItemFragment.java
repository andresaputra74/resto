package com.example.resto.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.resto.R;

public class ItemFragment extends Fragment {

	public static final String TAG_FRAGMENT_MAKANAN = "fragment_makanan";
	public static final String TAG_FRAGMENT_MINUMAN = "fragment_minuman";
	public static final String TAG_FRAGMENT_SNACK = "fragment_snack";

	public ItemFragment() {
	}

	public static ItemFragment newInstance() {
		return new ItemFragment();
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
							 Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_menu, container, false);
		return view;
	}
}
