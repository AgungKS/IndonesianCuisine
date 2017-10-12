package com.aks.indonesiancuisine;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView listHistory;
    LinearLayoutManager linear;

    List<PolaItem> items;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listHistory = (RecyclerView)findViewById(R.id.list_makanan);

        linear = new LinearLayoutManager(this);
        listHistory.setLayoutManager(linear);

        items = new ArrayList<>();
        items.add(new PolaItem(R.drawable.a1,"Nasi Goreng","Nasi Goreng dengan bumbu pedas","\n" +
                "\n" +
                "    Nasi 600 gr\n" +
                "\n" +
                "    Daging ayam 125 g. Cincang halus\n" +
                "\n" +
                "    Telur 1 butir. Kocok\n" +
                "\n" +
                "    Bawang merah 5 siung\n" +
                "\n" +
                "    Bawang putih 3 siung\n" +
                "\n" +
                "    Cabai merah 3 buah\n" +
                "\n" +
                "    Daun bawang 1 batang. Iris halus\n" +
                "\n" +
                "    Kecap manis 2 sdm\n" +
                "\n" +
                "    Garam 1 sdt\n" +
                "\n" +
                "    Merica ¼ sdt\n" +
                "\n" +
                "    Minyak\n","    Tumis bawang putih hingga harum. Tambahkan telur lalu orak-arik.\n" +
                "    Tambahkan ayam yang telah dicincang halus dan sosis.\n" +
                "    Masukkan daun bawang. Tumis lagi.\n" +
                "    Masukkan nasi lalu aduk hingga rata.\n" +
                "    Tambahkan kecap ikan, garam, dan merica\n" +
                "    Pindahkan nasi goreng putih pada piring saja."));
        items.add(new PolaItem(R.drawable.a2,"Nasi Ruwet","Nasi Ruwet dengan bumbu pedas","\n" +
                "    Siapkan nasi matang (-/+ 200 gram)\n" +
                "    1 bungkus mie instan (bisa diganti dengan mie jenis lain). Masak seperti membuat mie instan\n" +
                "    2 butir telur (1 telur digoreng orak arik dan yang 1 buat telur mata sapi)\n" +
                "    1 buah tomat ukuran kecil, lalu iris tipis\n" +
                "    Daun bawang secukupnya, lalu iris\n" +
                "    Minyak untuk menumis.\n" +
                "\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tBumbu:\n" +
                "\n" +
                "    2 siung bawang putih, memarkan dan cincang sampai halus\n" +
                "    4 siung bawang merah, memarkan dan cincang\n" +
                "    4 buah cabai rawet, iris tipis\n" +
                "    1 sdt saus cabe\n" +
                "    1 sdm kecap manis\n" +
                "    1 sdt saus tiram\n" +
                "    Garam secukupnya\n" +
                "    Gula secukupnya\n" +
                "    Merica bubuk secukupnya\n","\n" +
                "    Panaskan minyak untuk menumis\n" +
                "    Tumis bawang merah dan putih sampai harum\n" +
                "    Tambahkan tomat, cabe, tumis kembali\n" +
                "    Masukan gula, garam, dan merica\n" +
                "    Masukan nasi sama orak arik telur, daun bawang, aduk rata\n" +
                "    Tuangkan kecap, saus tiram, saus cabe. Aduk kembali\n" +
                "    Lalu tambahkan mie instan yang sudah dimasak tadi.\n" +
                "    Aduk rata sampai matang dan tercampur rata.\n" +
                "    Tuang kedalam piring, lalu tambahkan telur mata sapi diatasnya.\n" +
                "    Siap disajikan.\n"));
        items.add(new PolaItem(R.drawable.a3,"Mie Goreng","Mie Goreng dengan bumbu pedas","\n" +
                "    1 bungkus (2 potong) mie telur kering, rebus hingga matang lalu tiriskan dan tambahkan 1 sendok makan minyak goreng, aduk rata\n" +
                "    5 butir kemiri sangrai\n" +
                "    4 siung bawang putih\n" +
                "    2 sendok makan Kecap\n" +
                "    1/4 sendok teh lada putih bubuk\n" +
                "    1/4 sendok teh garam\n" +
                "    1 sendok teh gula pasir\n" +
                "    5 butir bakso sapi, potong\n" +
                "    100 gram udang pancet atau udang galah kupas\n" +
                "    200 gram kol, potong\n" +
                "    200 gram sawi hijau / caisim, potong-potong\n" +
                "    2 tangkai daun bawang, potong bulat 1 cm\n" +
                "    1 tangkai daun seledri, potong kasar\n" +
                "    2 butir telur ayam, kocok lepas\n" +
                "    5 sendok makan minyak goreng\n","\n" +
                "    Tumis bumbu halus hingga harum dan matang betul, kemudian masukkan bakso, udang, tumis hingga berubah warna lalu tambahkan telur. Setelah telur matang, masukkan sayuran, Royko, garam, dan gula.\n" +
                "    Tambahkan mie dan kecap. Aduk hingga bumbu merata dengan mie.\n"));
        items.add(new PolaItem(R.drawable.a4,"Mie Godog","Mie Godog dengan bumbu pedas","\n" +
                "300 gram Mie Kuning Basah\n" +
                "100 gram Daging Ayam\n" +
                "1 ikat Sawi Hijau\n" +
                "500 ml Kaldu Ayam\n" +
                "secukupnya Daun Bawang\n" +
                "secukupnya Seledri\n" +
                "3 siung Bawang Merah\n" +
                "1 sendok makan Saus Tiram\n" +
                "1 buah Tomat\n" +
                "1 sendok makan Kecap Manis\n" +
                "secukupnya Cabai (Cabe) Rawit Hijau\n" +
                "secukupnya BUMBU HALUS\n" +
                "4 siung Bawang Putih\n" +
                "1 sendok teh Lada (Merica)\n" +
                "2 butir Kemiri\n" +
                "1 sendok makan Ebi\n" +
                "secukupnya Garam ","\n" +
                "\n" +
                "Haluskan bawang putih, lada, kemiri , garam dan ebi yang telah direndam.\n" +
                "\n" +
                "Cuci bersih mie.\n" +
                "\n" +
                "Tumis bawang merah hingga harum, masukkan bumbu halus, tumis hingga matang. Masukkan cabai dan tomat, tumis hingga tomat agak layu.\n" +
                "\n" +
                "Masukkan saus tiram dan kecap. Masukkan kaldu ayam. Masak sampai air mendidih.\n" +
                "Masukkan ayam yang telah direbus dan di potong dadu.\n" +
                "kemudian masukkan mie kuning.\n" +
                "\n" +
                "Cicipi rasanya, jika kurang mantap dapat di tambah kaldu bubuk. Pastikan rasanya sudah pas.\n" +
                "Terakhir masukkan sawi, daun bawang dan seledri. Jangan terlalu masak sayurnya agar vitaminnya tidak hilang.\n" +
                "matikan api sajikan dengan bawang goreng."));
        items.add(new PolaItem(R.drawable.a5,"Gongso Ayam","Gongso Ayam dengan bumbu pedas","\n" +
                "250 gram Dada Ayam\n" +
                "1 buah Tomat\n" +
                "1 sendok makan Saus Tiram\n" +
                "3 sendok makan Kecap Manis\n" +
                "secukupnya Garam\n" +
                "secukupnya Kaldu Bubuk\n" +
                "50 ml Air\n" +
                "1 batang Daun Bawang\n" +
                "secukupnya Bawang goreng\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tBumbu\n" +
                "10 siung Bawang Merah\n" +
                "4 siung Bawang Putih\n" +
                "8 buah Cabai (Cabe) Merah\n" +
                "2 buah Cabai (Cabe) Rawit Hijau\n" +
                "2 butir Kemiri\n" +
                "1 sendok teh Lada (Merica) ","\n" +
                "\n" +
                "Haluskan 8 siung bawang merah, bawang putih, cabai merah, cabe rawit, kemiri dan lada.\n" +
                "\n" +
                "Cincang 2 siung bawang merah.\n" +
                "\n" +
                "Tumis bawang merah dan bumbu halus hingga matang. Masukkan tomat, tumis hingga layu.\n" +
                "\n" +
                "Masukkan saus tiram dan kecap. Garam dan kaldu bubuk. Masukkan daun bawang.\n" +
                "\n" +
                "Masukaan ayam suwir, aduk rata, lalu masukkan air. Cicipi umumnya rasa gongso manis pedas. sajikan dengan bawang goreng "));
        items.add(new PolaItem(R.drawable.a6,"Gongso Babat","Gongso Babat dengan bumbu pedas","\n" +
                "1/2 kg babat\n" +
                "2 lembar daun salam\n" +
                "2 batang sere geprek\n" +
                "Jahe satu ruas jari geprek\n" +
                "1 ruas jari lengkuas geprek\n" +
                "3 sendok kecap manis (sesuai selera)\n" +
                "Garam\n" +
                "1/2 sdt gula putih\n" +
                "Air\n" +
                "Minyak\n" +
                "Bumbu halus :\n" +
                "7 bawang merah\n" +
                "5 bawang putih\n" +
                "3 cabe merah kriting\n" +
                "5 cabe rawit merah / sesuai selera ","\n" +
                "\n" +
                "Rebus babat yg sudah dibersihkan potong sisihkan\n" +
                "\n" +
                "Tumis bumbu halus hingga harum jangan sampai gosong ya,,, tambahkan salam lengkuas jahe sereh\n" +
                "\n" +
                "Masukan babat aduk aduk tambahkan sedikit air gula putih garam sasa lalu kecap manis\n" +
                "\n" +
                "Aduk aduk hingga air surut dan mulai mengental,, cek rasa\n" +
                "\n" +
                "Matikan kompor, babat gongso dah siap disajikan\n"));


        adapter = new Adapter(this,items);
        listHistory.setAdapter(adapter);
    }
}