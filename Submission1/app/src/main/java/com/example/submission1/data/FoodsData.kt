package com.example.submission1.data

import com.example.submission1.R

object FoodsData {
    private val foodNames = arrayOf(
        "Karee Kameng - Aceh",
        "Bika Ambon - Sumatera Utara",
        "Rendang - Sumatera Barat",
        "Gulai ikan Patin - Jambi",
        "Pendap - Bengkulu",
        "Gulai Belacan - Riau",
        "Kerak Telor - Jakarta",
        "Rujak Kangkung - Jawa Barat",
        "Tempe Mendoan - Jawa Tengah",
        "Nasi Gudeg - D.I. Yogyakarta"
    )

    private val foodDetails = arrayOf(
        "Karee Kameng adalah makanan tradisional khas dari Aceh yang dijuluki Serambi Mekkah-nya Indonesia.  Makanan ini merupakan sajian yang paling favorit oleh warga Aceh. Karee Kameng dalam bahasa Indonesia disebut kari kambing adalah lauk yang hampir selalu ada di setiap kedai nasi maupun di berbagai perhelatan.  Di banyak keude bu (kedai nasi) kari ini terpampang di depan kedai dalam kuali atau wajan besar yang selalu dipanaskan.",
        "Makanan khas di Sumatera Utara khususnya Medan adalah Bika Ambon. Bika Ambon ini enak banget kadang juga dijual dengan rasa lain seperti durian dan keju. Rasanya manis dan lembut.",
        "Sumatera Barat terkenal dengan makanan Padang yang berasal dari kota Padang. Makanan yang banyak rempahnya ini mempunyai rasa yang kuat. Rendang adalah salah satu masakan Padang yang menjadi favorit banyak orang Indonesiabahkan sampai luar negeri.",
        "Gulai ikan Patin adalah masakan yang populer di masyarakat Jambi.  Gulai ini dimasak dengan menggunakan tempoyak yaitu daging buah durian yang telah difermentasi. Tetapi ada sebagian orang yang memilih untuk mengganti tempoyak dengan santan kelapa untuk menghindari bau dan rasa tempoyak yang cukup menyengat.",
        "Pendap merupakan makanan bercitarasa pedas yang sangat populer di provinsi Bengkulu. Pendap terdiri dari bahan ikan yang dicampur dengan beberapa bahan utama seperti bawang putih, kencur, cabai giling, kelapa muda yang kemudian dimasak dalam balutan daun talas.",
        "Gulai Belacan salah satu masakan khas dari Riau. Gulai ini dibuat dengan kuah campuran belacan atau terasi. Bahannya biasanya memakai udang atau ikan.",
        "Kerak telor adalah makanan asli khas daerah Jakarta (Betawi) dengan bahan-bahan beras ketan putih, telur ayam, ebi (udang kering yang diasinkan) yang disangrai kering ditambah bawang merah goreng lalu diberi bumbu yang dihaluskan berupa kelapa sangrai, cabai merah, kencur, jahe, merica butiran, garam, dan gula pasir.",
        "Semua orang sudah mengerti apabila olahan dengan nama rujak sudah pasti identik dengan buah-buahan dengan taburan bumbu kacangnya. Namun berbanding terbalik dengan rujak kangkung karena yang dijadikan sebagai bahan bakunya adalah sayur kangkung bukan buah.\n" +
        "Kelebihan dari penggunaan kangkung adalah untuk mendapatkanya yang lebih mudah dan juga karena sifatnya yang kering alias tak berair, bisa membuat rasa pedas bumbunya semakin terasa. Selain itu yang membuatnya unik adalah dalam bumbunya ada bahan dari asam jawa sehingga bisa menghasilkan rasa pedas dan sensasi rasa masam.",
        "Makanan khas JawaTengah yang selanjutnya adalah sebuah makanan yang sangat terkenal baik di sekitaran Jawa Tengah itu sendiri atau di seluruh Indonesia. Pasalnya makanan yang sangat terkenal dengan nama Tempe Mendoan ini saat ini sudah dikenal banyak orang. Sebenarnya Tempe Mendoan ini merupakan makanan khas yang berasal dari Banyumas. Dari namanya saja kita sudah bisa menebak kira-kira bahan utama dari makanan khas Jawa Tengah ini apa.",
        "Tempe Mendoan merupakan sebuah makanan yang dibuat dari tempe dengan ukuran teme yang lebar. Langkah berikutnya adalah dengan melumuri tempe tersebut dengan tepung yang tentu saja sudah bercampur dengan bumbu khas dari Tempe Mendoan ini. Setelah itu di tempat tersebut digoreng hingga mendo atau garing.  Tempe Mendoan merupakan makanan khas Jawa Tengah yang cukup sederhana akan tetapi jika dicampur dengan cabai atau sambal rasanya akan sangat lezat.",
        "Nasi Gudeg makanan khas D.I. Yogyakarta yang terbuat dari nangka mudayang dimasak dengan santan. Gudeg dmakan dengan nasi dan disajikan dengan kuah santan kental (areh), ayam kampung, telur, tahu, dan sambalgoreng krecek."
    )

    private val foodImages = intArrayOf(
        R.drawable.karee_kameng,
        R.drawable.bika_ambon,
        R.drawable.rendang,
        R.drawable.gulai_ikan_patin,
        R.drawable.pendap,
        R.drawable.gulai_belacan,
        R.drawable.kerak_telor,
        R.drawable.rujak_kangkung,
        R.drawable.tempe_mendoan,
        R.drawable.nasi_gudeg
    )

    val listData: ArrayList<Food>get() {
        val list = arrayListOf<Food>()
        for (position in foodNames.indices) {
            val food = Food()
            food.name = foodNames[position]
            food.detail = foodDetails[position]
            food.photo = foodImages[position]
            list.add(food)
        }
        return list
    }
}