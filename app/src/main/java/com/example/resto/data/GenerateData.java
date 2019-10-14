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
                R.drawable.chickenburger,
                TIPE_MAKANAN,
                "Chciken Burger",
                "Rp. 34.000",
                "dari bahan pilihan yang berkualitas baik, dengan roti kualitas terbaik, daun selada yang masih segar serta daging ayam pilihan yang berkualitas dengan baik"
        ));
        listMenuMakanan.add(new Menu(
                R.drawable.burgerblack,
                TIPE_MAKANAN,
                "Black Burger",
                "Rp. 38.000",
                "sdsd"
        ));
        listMenuMakanan.add(new Menu(
                R.drawable.burgerdaging,
                TIPE_MAKANAN,
                "Beef Burger",
                "Rp. 36.000",
                " dengan menggunakan daging sapi pilihan dan berkualitas serta dengan tekstur yang pas cocok untuk semua usia"
        ));
        listMenuMakanan.add(new Menu(
                R.drawable.burgerkeju1,
                TIPE_MAKANAN,
                "Cheese Burger",
                "Rp. 37.000",
                "pengeluaran Burger terbaru dengan warna yang sedikit berbeda dan berkualitas baik tersedia dengan daging pilihan, keju berkualitas, dan sayuran yang terbaik dari hasil panen"
        ));
        listMenuMakanan.add(new Menu(
                R.drawable.burgerspicy,
                TIPE_MAKANAN,
                "Spicy Burger",
                "Rp. 40.000",
                "sd"
        ));
        listMenuMakanan.add(new Menu(
                R.drawable.hotdog,
                TIPE_MAKANAN,
                "Hot Dog",
                "Rp. 24.000",
                "d"
        ));
        listMenuMakanan.add(new Menu(
                R.drawable.kebab,
                TIPE_MAKANAN,
                "Kebab",
                "Rp. 26.000",
                "sdsd"
        ));
        listMenuMakanan.add(new Menu(
                R.drawable.sandwich,
                TIPE_MAKANAN,
                "Sandwich",
                "Rp. 20.000",
                "sdsd"
        ));

        return listMenuMakanan;
    }

    public static List<Menu> getListMenuMinuman() {
        List<Menu> listMenuMinuman = new ArrayList<>();

        listMenuMinuman.add(new Menu(
                R.drawable.bubblegum1,
                TIPE_MINUMAN,
                "Ice Bubble Gum",
                "Rp. 15.000",
                "sdsd"
        ));
        listMenuMinuman.add(new Menu(
                R.drawable.cappucino1,
                TIPE_MINUMAN,
                "Ice Cappucino",
                "Rp. 12.000",
                "sdsd"
        ));
        listMenuMinuman.add(new Menu(
                R.drawable.taroblend1,
                TIPE_MINUMAN,
                "Ice Taro Blend",
                "Rp. 16.000",
                "sdsd"
        ));
        listMenuMinuman.add(new Menu(
                R.drawable.strawberry,
                TIPE_MINUMAN,
                "Ice Strawberry Blend",
                "Rp. 13.000",
                "sdsd"
        ));
        listMenuMinuman.add(new Menu(
                R.drawable.caramel,
                TIPE_MINUMAN,
                "Hot Carramel",
                "Rp. 16.000",
                "sdsd"
        ));
        listMenuMinuman.add(new Menu(
                R.drawable.mochacino,
                TIPE_MINUMAN,
                "Hot Moccacino",
                "Rp. 16.000",
                "sdsd"
        ));
        listMenuMinuman.add(new Menu(
                R.drawable.kopitubruk,
                TIPE_MINUMAN,
                "Kopi Tubruk",
                "Rp. 10.000",
                "sdsd"
        ));

        return listMenuMinuman;
    }

    public static List<Menu> getListMenuSnack() {
        List<Menu> listMenuSnack = new ArrayList<>();

        listMenuSnack.add(new Menu(
                R.drawable.ayamkrispi1,
                TIPE_SNACK,
                "Cryspi Chicken",
                "Rp. 12.000",
                "sdsd"
        ));
        listMenuSnack.add(new Menu(
                R.drawable.jamurkrispi1,
                TIPE_SNACK,
                "Jamur Crispi",
                "Rp. 14.000",
                "sdsd"
        ));
        listMenuSnack.add(new Menu(
                R.drawable.kentang1,
                TIPE_SNACK,
                "French Fries",
                "Rp. 10.000",
                "sdsd"
        ));
        listMenuSnack.add(new Menu(
                R.drawable.onionring1,
                TIPE_SNACK,
                "Onion Ring",
                "Rp. 14.000",
                "sdsd"
        ));
        listMenuSnack.add(new Menu(
                R.drawable.rotibakar1,
                TIPE_SNACK,
                "Roti Bakar",
                "Rp. 12.000",
                "sdsd"
        ));
        listMenuSnack.add(new Menu(
                R.drawable.tahubakso1,
                TIPE_SNACK,
                "Tahu Bakso",
                "Rp. 10.000",
                "sdsd"
        ));

        return listMenuSnack;
    }
}
