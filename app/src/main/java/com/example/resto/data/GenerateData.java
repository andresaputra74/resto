package com.example.resto.data;

import com.example.resto.R;
import com.example.resto.model.Menu;

import java.util.ArrayList;
import java.util.List;

import static com.example.resto.model.Menu.TIPE_MAKANAN;
import static com.example.resto.model.Menu.TIPE_MINUMAN;
import static com.example.resto.model.Menu.TIPE_SNACK;

public class GenerateData {

	public static List<Menu> getListMenuMakanan() {
		List<Menu> listMenuMakanan = new ArrayList<>();

		listMenuMakanan.add(new Menu(
				R.drawable.burgerblack,
				TIPE_MAKANAN,
				"Burger Black",
				"Rp. 5.000.000",
				"Lorem"
		));
		listMenuMakanan.add(new Menu(
				//wqeqweqeqweqweqweq
		));

		return listMenuMakanan;
	}

	public static List<Menu> getListMenuMinuman() {
		List<Menu> listMenuMinuman = new ArrayList<>();

		// insert

		return listMenuMinuman;
	}

	public static List<Menu> getListMenuSnack() {
		List<Menu> listMenuSnack = new ArrayList<>();

		// insert

		return listMenuSnack;
	}
}
