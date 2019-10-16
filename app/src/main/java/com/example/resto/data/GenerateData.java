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
                "Chicken Burger dari bahan pilihan yang berkualitas baik, dengan roti kualitas terbaik, daun selada yang masih segar serta daging ayam pilihan yang berkualitas dengan baik"
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
                "Spicy Burger ini menu terbaru dari kami dengan tampilan warna dan rasa terbaru dengan rasa pedas yang lebih pedas dari saus biasa"
        ));
        listMenuMakanan.add(new Menu(
                R.drawable.hotdog,
                TIPE_MAKANAN,
                "Hot Dog",
                "Rp. 24.000",
                "Hot Dog terbuat dari sosis yang terbalut dengan roti dengan tambahan saus dan mayonais yang berkualitas baik dan di ambil dari sosis pilihan dari daging yang segar"
        ));
        listMenuMakanan.add(new Menu(
                R.drawable.kebab,
                TIPE_MAKANAN,
                "Kebab",
                "Rp. 26.000",
                "Kebab merupakan makanan asal Turki dengan menggunakan daging-daging yang diolah terlebih dahulu dan ditambahkan sayur-sayuran hasil dari panen yang berkualitas"
        ));
        listMenuMakanan.add(new Menu(
                R.drawable.sandwich,
                TIPE_MAKANAN,
                "Sandwich",
                "Rp. 20.000",
                "Sandwich makanan dengan sayuran terbaik dari hasil panen dan ditambahkan dengan telur yang berkualitas dan beef daging yang diolah dengan hygienis"
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
                "Bubble Gum atau yang biasa dikenal dengan permen karet ini sudah banyak penggemarnya, bubble gum bukan hanya sekedar dalam bentuk permen karet saja, kini kamu bisa mencoba sensasi manisnya bubble gum dalam sebuah minuman"
        ));
        listMenuMinuman.add(new Menu(
                R.drawable.cappucino1,
                TIPE_MINUMAN,
                "Ice Cappucino",
                "Rp. 12.000",
                "Cappucino merupakan minuman khas Italia yang dibuat dari espresso dan susu, tetapi referensi lain juga ada yang menyebutkan bahwa kapucino berawal dari biji biji kopi tentara Turki,"
        ));
        listMenuMinuman.add(new Menu(
                R.drawable.taroblend1,
                TIPE_MINUMAN,
                "Ice Taro Blend",
                "Rp. 16.000",
                "Taro merupakan salah satu jenis makanan yang sangat populer. Bentuk aslinya menyerupai dengan kentang dan ubi. Taro ini memiliki rasa manis dan sedikit rasa kacang, warna ungunya yang menjadi ciri khas dari makanan ini."
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
