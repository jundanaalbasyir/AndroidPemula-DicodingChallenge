package com.jundana.dicodingchallenge_jundana;

import com.jundana.dicodingchallenge_jundana.Models.Animals;

import java.util.ArrayList;

class AnimalsData {
    private static String[] animalsName = {
            "Badak Hitam",
            "Gorilla Dataran Rendah",
            "Gorilla Gunung",
            "Harimau Siberia",
            "Ikan Vaquita",
            "Lemur Bambu Besar",
            "Komodo",
            "Macan Tutul Amur",
            "Penyu Belimbing",
            "Tupai Jepang",
            "Saola",
    };

    private static String[] animalsDetails = {
            "Cula badak hitam yang beredar di pasar gelap memang sangat mahal, akan tetapi tidak diketahui kegunaannya. Apakah hanya untuk hobi semata atau digunakan untuk yang lainnya. Nah, karena harga yang mahal dari cula badak hitam inilah banyak pemburu liar yang berlomba-lomba memilikinya.\n" +
                    "\n" +
                    "Badak hitam ini adalah hewan purba yang masih hidup sampai sekarang. Habitat badak hitam ini ada di afrika. Menurut data penelitian oleh ilmuan, di habitat liarnya saat ini hanya tinggal sedikit saja. Populasinya saat ini hanya sekitar 4.800 ekor. Belum diketahui pasti jumlah tersebut, bisa jadi lebih sedikit atau lebih banyak.",

            "Hewan ini sering diburu oleh para pemburu yang tidak bertanggung jawab. Hewan ini diburu bukan untuk diambil bulu atau kulitnya, akan tetapi untuk diambil dagingnya untuk dijadikan bahan makanan sehingga membuat hewan ini menjadi langka.\n" +
                    "\n" +
                    "Selain karena pemburu yang menyebabkan hewan ini terancam punah, ada satu penyakit yang membuat gorilla ini semakin berkurang spesiesnya yaitu virus ebola. Karenanya diberitakan bahwa ada sekitar 90% gorilla dataran rendah mati di sekitar kawasan Gabon.",

            "Gorilla gunung yang berada di negara Republik Demokratik Kongo ini merupakan hewan yang terancam punah juga. Karena kelangkaannya, pemerintah Kongo telah memberikan penanganan khusus terhadap gorilla gunung.\n" +
                    "\n" +
                    "Kelangkaaan gorilla gunung ini banyak disebabkan oleh penyakit yang menyerangnya. Oleh karena itu, meskipun sudah ada di penangkaran hewan tetap saja tidak sembarang orang yang bisa masuk melihatnya. Ini dilakukan untuk tetap menjaga keamanan populasi gorilla gunung ini.\n" +
                    "\n" +
                    "Karena jumlahnya saat ini di alam bebas hanya sekitar 850 ekor saja. Namun dari jumlah tersebut kemungkinan bisa kurang atau bisa lebih.",

            "Jika Indonesia mempunyai Harimau Sumatra,  maka Siberia juga memiliki Harimau endemik di negaranya. Harimau ini biasanya dijuluki dengan sebutan Harimau Amur. Saat ini keberadaannya di alam liar sudah semakin sedikit dan terancam kepunahan nya.\n" +
                    "\n" +
                    "Harimau Siberia adalah satu-satunya harimau terbesar di dunia. Saat ini populasinya kurang lebih sekitar 400 hingga 500 ekor saja. Semakin sedikitnya populasi mereka ini disebabkan oleh pemburuan liar juga semakin berkurangnya habitat mereka karena keberlangsungan hidup harimau tersebut sangat tergantung terhadap habitat aslinya.",

            "Ikan vaquita adalah ikan asal teluk California, ikan ini sangat mirip dengan ikan lumba-lumba, namun di antaranya tetap berbeda. Ikan  Vaquita merupakan satwa laut langka yang terancam punah, saat ini hanya tersisa sekitar 100 ekor saja.\n" +
                    "\n" +
                    "Yang menyebabkan kelangkaan nya tak lain dan tak bukan adalah pemburuan liar. Ikan ini diburu karena pada bagian insangnya sangat mahal.",

            "Madagascar yang dulunya dipenuhi oleh lemur bambu besar saat ini ternyata populasinya mulai berkurang. Lebih tepatnya di Madagascar bagian tenggara. Saat ini hanya tersisa hanya sekitar 200 ekor saja. Yang menyebabkan berkurangnya spesies ini adalah karena perubahan iklim yang sangat ekstrim.\n" +
                    "\n" +
                    "Karena perubahan iklim sangat mempengaruhi keberlangsungan hidup hewan ini. Jika tidak ada campur tangan manusia bisa jadi hewan ini sudah punah.",

            "Komodo atau Varanus Komodoensis merupakan hewan asli Indonesia yang tepatnya dari pulau Komodo ini sangat popular di dunia. Saat ini habitat komodo di alam bebas sudah mulai berkurang dan hanya tinggal beberapa ratus ekor saja.\n" +
                    "\n" +
                    "Oleh karena itu Pmerintah Indonesia berupaya menjaga kelestarian hewan ini karena hewan ini hanya ada di Pulau komodo saja dan satu-satunya yang ada di dunia.",

            "Macan tutul amur ini memiliki bulu khas yang sangat indah dan juga tebal. Hewan ini berasal dari Rusia. Hewan ini sering diburu karena bulunya yang indah dan tebal tersebut. Biasanya dijadikan untuk bahan membuat jaket dan pakaian lainnya\n" +
                    "\n" +
                    "Bukan hanya karena bulunya yang tebal saja, namun karena corak pada bulunya sangat indah sehingga bagus untuk dijadikan pakaian. Karena pemburuan tersebutlah yang membuat hewan ini semakin  langka di Rusia, hanya tersisa kurang lebih 30 ekor saja di dunia.\n" +
                    "\n" +
                    "Untuk tetap menjaga keberadaannya, berbagai negara turut ikut menjaganya seperti perancis yang membuat penangkaran macan tutul amur di kebun binatang Mulhause.",

            "Tahukan Anda hewan hewan yang memiliki tubuh paling besar di dunia? Ternyata hewan tersebut adalah Penyu Belimbing. Habitat asli penyu belimbing ini ada di Indonesia tepatnya di daerah Papua Barat.\n" +
                    "\n" +
                    "Kasus yang menyebabkan semakin berkurangnya hewan tersebut bukanlah disebabkan oleh pemburuan liar, akan tetapi disebabkan oleh kualitas air laut yang semakin memburuk. Apa lagi tiap tahunnya penyu belimbing ini melakukan migrasi yaitu dari satu tempat pindah ke tempat lainnya.\n" +
                    "\n" +
                    "Untuk pencegahan kepunahan penyu belimbing, pemerintah Indonesia bekerja sama dengan ahli biota laut dan Universitas Alabama melakukan konservasi agar hewan ini tetap terjaga keberadaannya.",

            "Seperti namanya, tupai ini memang berasal dari negara jepang. Nama latin tuapi ini adalah Sciurus lis, tupai ini merupakan spesies endemik jepang. Penyebaran tupai ini yaitu di pulau Honsu, Kyushu, dan Shikoku.\n" +
                    "\n" +
                    "Dari survei yang diakukan peneliti jepang menyatakan bahwa tupai di Honshu bagian barat daya sudah berkurang spesiesnya. Yang lebih parahnya lagi tupai yang ada di pulau Kyushu justru sudak ada lagi spesiesnya. Penyebab dari berkurangnya spesies ini adalah habitat mereka yang diusik oleh manusia untuk pembangunan.",

            "Saola atau sering disebut dengan Unicorn Asia ini merupakan salah satu hewan langka yang terancam punah. Sebutan unicorn merujuk pada tanduknya yang runcing seperti kuda unicorn yang ada di film-film kartun dan boneka.\n" +
                    "\n" +
                    "Para ahli menyatakan bahwa hewan ini sekarang keberadaannya hanya beberapa puluh ekor saja dan akan diperkirakan akan punah jika tidak ada penanganan khusus untuk mengembangbiakkan hewan ini."
    };

    private static int[] AnimalsImages = {
            R.drawable.badak_hitam,
            R.drawable.gorilla_dataran_rendah,
            R.drawable.gorilla_gunung,
            R.drawable.harimau_siberia,
            R.drawable.ikan_vaquita,
            R.drawable.lemur_bambu_besar,
            R.drawable.komodo,
            R.drawable.macan_tutul_amur,
            R.drawable.penyu_belimbing,
            R.drawable.tupai_jepang,
            R.drawable.saola
    };

    static ArrayList<Animals> getListData() {
        ArrayList<Animals> list = new ArrayList<>();
        for (int position = 0; position < animalsName.length; position++) {
            Animals animals = new Animals();
            animals.setPhoto(AnimalsImages[position]);
            animals.setAnimalsName(animalsName[position]);
            animals.setAnimalsDetail(animalsDetails[position]);
            list.add(animals);
        }
        return list;
    }
}