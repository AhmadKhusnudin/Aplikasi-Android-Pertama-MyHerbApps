package com.dicoding.myherbapps

object DataTanaman {
        private val namaTanaman = arrayOf(
            "Jahe",
            "Kunyit",
            "Lengkuas",
            "Kencur",
            "Temulawak",
            "Daun Kemangi",
            "Daun Ketumbar",
            "Bawang Putih",
            "Daun Sirih",
            "Daun Mint",
            "Lidah Buaya"
        )

        private val namaLatin = arrayOf(
            "(Zingiber officinale)",
            "(Curcuma longa Linn)",
            "(Alpinia galanga)",
            "(Kaempferia galanga)",
            "(Curcuma zanthorrhiza)",
            "(Ocimum basilicum)",
            "(Coriandrum sativum)",
            "(Allium sativum)",
            "(Piper betle)",
            "(Mentha × piperita)",
            "(Aloe vera)"
        )

        private val warnaTanaman = arrayOf(
            "Kuning Kemerahan",
            "Jingga Kekuningan",
            "Putih atau Merah Kecoklatan",
            "Coklat Muda hingga Coklat Tua",
            "Kuning hingga Merah Jingga",
            "Hijau",
            "Hijau",
            "Putih",
            "Hijau",
            "Hijau",
            "Hijau"

        )

        private val akarTanaman = arrayOf(
            "Rimpang",
            "Serabut",
            "Rimpang",
            "Serabut",
            "Rimpang",
            "Tunggang",
            "Tunggang",
            "Serabut",
            "Tunggang",
            "Rhizoma",
            "Serabut"

        )

        private val daunTanaman = arrayOf(
            "Menyirip",
            "Menyirip",
            "Lanset Memanjang",
            "Lonjong",
            "Bundar Memanjang",
            "Menyirip",
            "Melengkung",
            "Lanset Memanjang",
            "Menyirip",
            "Menyirip",
            "Memanjang"

        )

    private val manfaat = arrayOf(
        "1.\tMengurangi Reaksi Alergi\nMinuman jahe dapat meredakan reaksi alergi. Sifat anti-inflamasi yang terdapat pada jahe dapat menenangkan respons peradangan yang disebabkan oleh alergi\n\n2.\tMenurunkan Berat Badan\nMengonsumsi jahe adalah cara alami dan sehat untuk menurunkan berat badan. meskipun klaim ini perlu penelitian lebih lanjut, minum teh jahe hangat memang membuat anda merasa lebih kenyang.\n\n3.\tMeredakan Nyeri Haid\nPenelitian telah menunjukkan bahwa minum jahe dapat meredakan nyeri haid. Bahkan ada penelitian yang menunjukkan bahwa jahe sama efektifnya sebagai pereda nyeri dalam mengatasi kram menstruasi",
        "1.\tMeningkatkan Daya Tahan Tubuh\nKunyit mengandung zat kurkumin yang bekerja meningkatkan daya tahan tubuh. meningkatkan sistem pertahanan tubuh melawan virus atau bakteri penyebab penyakit.\n\n2.\tMengobati Radang\nKandungan pada kunyit yang disebut kurkumin merupakan antioksidan yang memiliki efek antiradang poten.\n\n3.\tMengurangi Rasa Mual\nKandungan kurkumin pada kunyit akan meresap ke dalam aliran darah manusia dan mengurangi tekanan pada perut. Dengan mengkonsumsi kunyit, tekanan pada perut terasa ringan dan lega sehingga mengurangi rasa mual.",
        "1.\tMeredakan nyeri sendi\nLengkuas diduga dapat meredakan nyeri sendi, misalnya pada kasus osteoarthritis atau rheumatoid arthritis. Sama jahe dan kunyit, lengkuas juga mengandung senyawa kimia antiradang yang dapat membantu meredakan peradangan penyebab nyeri sendi.\n\n2.\tMeningkatkan kesuburan pria\nKonsumsi lengkuas juga diyakini dapat meningkatkan kesuburan pria. Sebuah penelitian yang dilakukan selama 3 bulan kepada pria dengan kualitas sperma buruk, menunjukkan bahwa suplemen yang mengandung lengkuas dapat membantu meningkatan kualitas sperma.\n\n3.\tMenurunkan kadar gula darah dan kolesterol\nKonsumsi lengkuas juga diyakini dapat mencegah penyakit diabetes tipe 2 dan jantung. Manfaat ini mungkin diperoleh berkat kandungan antioksidan polifenol yang dapat menurunkan kadar gula darah dan kolesterol jahat dalam tubuh.",
        "1.\tMenurunkan tekanan darah\nKencur telah lama digunakan untuk mengobati tekanan darah tinggi atau hipertensi. Berbagai studi pun mendukung temuan ini karena kencur mengandung kalium, antioksidan, dan senyawa yang bersifat diuretik.\n\n2.\tMembasmi bakteri penyebab penyakit\nEkstrak kencur diketahui mengandung minyak esensial yang bersifat antibakteri. Beberapa riset menunjukkan bahwa kandungan antibakteri pada kencur dapat membasmi kuman di kulit, gigi dan gusi, serta saluran pernapasan.\n\n3.\tMeredakan nyeri dan peradangan\nKencur mengandung zat yang bersifat antinyeri dan antiradang. Saat tubuh mengalami peradangan atau nyeri, Anda dapat menggunakan kencur untuk meringankannya. Manfaat kencur ini sudah terkenal sejak dahulu sehingga umum digunakan untuk meredakan nyeri akibat sakit kepala, sakit gigi, dan radang sendi.",
        "1.\tMemperlancar Proses Pencernaan\nKandungan serat kurkumin yang tinggi pada temulawak dapat membantu memperlancar proses pencernaan. Khasiat temulawak yang satu ini cocok bagi kamu yang memiliki masalah susah buang air besar. Selain itu, masalah gangguan pencernaan lain juga diketahui dapat diatasi dengan temulawak.\n\n2.\tMeningkatkan Daya Tahan Tubuh\nSalah satu manfaat dari temulawak yang terkenal adalah ia mampu meningkatkan daya tahan tubuh kita dan menghindari berbagai macam penyakit. Hal ini karena kandungan kurkumin yang ada dalam temulawak diketahui memiliki sifat anti-inflamasi. Anti-inflamasi membantu meningkatkan kekebalan dan daya tahan tubuh.\n\n3.\tSebagai Antibakteri dan Antijamur\nManfaat temulawak selanjutnya yang dapat kamu temukan adalah berfungsi sebagai antibakteri dan antijamur. Seperti yang kita ketahui, salah satu penyebab penyakit infeksi adalah bakteri. Adanya senyawa xanthorrhizol pada temulawak ternyata cukup efektif untuk membasmi bakteri jenis Staphylococcus dan Salmonella.",
        "1.\tMencegah demam\nKemangi dapat mengurangi demam karena flu. Saat demam karena flu, Anda dapat mengunyah kemangi. Untuk mencegah demam saat musim penghujan, Anda dapat meminum air rebusan kemangi. Minum setiap hari untuk mencegah demam karena musim penghujan.\n\n2.\tMeredakan batuk\nSaat batuk melanda, Anda dapat memanfaatkan kemangi untuk meredakan batuk. Ambil 8 lembar kemangi, campur dengan cengkeh kemudian seduh dengan air mendidih. Tambahkan garam untuk sedikit membantu memberikan rasa. Biarkan hingga dingin kemudian minum. Lakukan secara rutin setiap hari untuk menghilangkan batuk.\n\n3.\tMeningkatkan sistem imun\nRutin mengonsumsi kemangi setiap hari dapat meningkatkan sistem imun. Studi menunjukkan bahwa berbagai senyawa kimia dalam kemangi dapat meningkatkan sistem imun dalam tubuh. Untuk mendapatkan hasil yang terbaik, gunakan kemangi segar alih-alih yang kering.",
        "1.\tMenurunkan risiko penyakit jantung\nResiko penyakit jantung dapat bertambah bila terdapat bekuan darah pada pembuluh darah Anda. Kabar baiknya, sebuah penelitian dalam jurnal Current Cardiology Reviews menyebutkan bahwa daun ketumbar mungkin bisa menurunkan risiko tersebut.\n\n2.\tMenurunkan gula darah\nDaun dan biji ketumbar juga bermanfaat bagi mereka yang harus mengontrol gula darah dengan baik. Ini disebabkan karena zat aktif pada daun dan biji ketumbar meningkatkan aktivitas enzim glikogen sintase, glikogen fosforilase, dan enzim-enzim glukoneogenik.\n\n3.\tMeredakan nyeri dan migrain\nDaun ketumbar telah sejak lama digunakan sebagai obat alami untuk sakit kepala, gejala alergi, hingga luka bakar. Ternyata, ini disebabkan karena daun ketumbar mampu meredakan nyeri dan peradangan pada tubuh.",
        "1.\tMembersihkan pencernaan\nBawang putih memiliki kekuatan alami untuk membersihkan racun dan bakteri berbahaya di dalam perut Anda. Sehingga saat Anda mengonsumsi bawang putih dalam keadaan perut kosong, maka sistem pencernaan Anda akan jadi sehat.\n\n2.\tMengurangi masalah saraf\nMenurut penelitian yang dilansir dari boldsky.com, makan bawang putih secara teratur bisa mengurangi masalah saraf.\n\n3.\tMenurunkan hipertensi\nAhli kesehatan mengatakan bahwa makan bawang putih sangat dianjurkan bagi mereka yang menderita tekanan darah tinggi. Sebab bawang putih akan melancarkan sirkulasi darah sehingga bisa menurunkan hipertensi.",
        "1.\tMenyehatkan Saluran Pencernaan\nFakta pertama terkait manfaat daun sirih yaitu, daun ini mampu menyehatkan saluran pencernaan dalam tubuh. Kandungannya dapat meningkatkan metabolisme, sehingga merangsang kerja usus untuk menyerap nutrisi dan vitamin penting bagi tubuh. Selain itu, daun sirih juga bisa dijadikan obat herbal untuk mengatasi sembelit. Air rebusannya diklaim bisa membantu kelancaran buang air besar.\n\n2.\tMenyembuhkan luka\nDaun Sirih, terutama yang berjenis merah memiliki kandungan saponin yang bersifat antiseptik. Senyawa ini beperan penting dalam penyembuhan luka. Selain saponin, sirih merah juga memiliki tanin yang berfungsi membentuk kolagen sehingga luka lebih cepat tertutup.\n\n3.\tMenjaga Kesehatan Mulut dan Gigi\nManfaat daun sirih lainnya adalah dapat menjaga kesehatan mulut dan merawat gigi. Sifat antimikroba pada daun sirih, membantu mengatasi bakteri yang tertinggal di mulut. Oleh karena itu, sejak dulu daun sirih sudah digunakan untuk menjaga gigi. Orang tua saat itu memakainya dengan cara mengunyah daun sirih.",
        "1.\tMembuat kulit lebih baik\nRamuan mint terkenal karena kualitasnya yang mencerahkan kulit. Ini memiliki sifat alami yang menenangkan kulit yang teriritasi dan kasar. Bubur daun mint dapat meredakan gigitan nyamuk dan lebah.\n\n2.\tMengurangi iritasi usus\nMengkonsumsi daun mint atau mengunyahnya langsung setelah dicuci adalah obat yang umum dikenal untuk iritasi usus. Jika menderita mual karena sakit perut atau jika perut kembung meskipun belum makan apa-apa, Anda harus mengkonsumsi daun mint untuk membantu pencernaan.\n\n3.\tMencegah kanker\nCukup banyak penelitian yang mencoba membuktikan bahwa daun mint efektif dalam mencegah kanker usus besar. Daun mint kaya akan vitamin A, C dan beta-karoten. Vitamin C merupakan anti oksidan yang digunakan tubuh dalam bentuk larut air untuk mencegah pertumbuhan radikal bebas dalam tubuh. Hal ini dikenal untuk mencegah kanker dan pertumbuhan tumor dalam tubuh.",
        "1.\tBahan Pelembap Alami\nLidah buaya merupakan salah satu tanaman yang 90% kandungannya terdiri atas air. Itulah sebabnya lidah buaya dapat menjadi bahan pelembap alami bagi kulit. Kandungan vitamin, antioksidan, dan mineral dalam lidah buaya terbukti ampuh mengatasi sejumlah gangguan kesehatan kulit. Berbagai masalah seperti kulit kering, pecah-pecah, dan bersisik akan berangsur-angsur sembuh. Sensasi dingin yang diperoleh dari lidah buaya akan membuat kulit menjadi lebih rileks.\n\n2.\tMencegah Timbulnya Kerutan\nSebuah penelitian yang diterbitkan jurnal The Annals of Dermatology pada 2009 menyatakan, penggunaan lidah buaya selama minimal 90 hari dapat mencegah timbulnya kerutan kulit. Ini karena kandungan lidah buaya terbukti ampuh meningkatkan elastisitas kulit. Risiko timbulnya kerutan pun dapat diminimalkan. Anda akan tampak lebih awet muda tanpa kerutan-kerutan yang muncul pada kulit.\n\n3.\tBahan Scrub untuk Kulit Sensitif\n Kulit sensitif biasanya lebih mudah iritasi bila tidak cocok dengan produk tertentu. Jika kulit Anda tergolong sensitif, wajib mengetahui manfaat lidah buaya untuk kulit sensitif ini. Kandungan lidah buaya ternyata aman untuk kulit sensitif dan cocok dijadikan campuran scrub. Anda tinggal mencampurkan lidah buaya dengan oatmeal untuk mendapatkan tekstur scrub yang tepat. Proses eksfoliasi sel-sel kulit mati pun akan berlangsung cepat dan mudah dengan scrub berbahan lidah buaya."

    )

        private val imgTanaman = intArrayOf(
            R.drawable.jahe,
            R.drawable.kunyit,
            R.drawable.lengkuas,
            R.drawable.kencur,
            R.drawable.temulawak,
            R.drawable.daun_kemangi,
            R.drawable.daun_ketumbar,
            R.drawable.bawang_putih,
            R.drawable.daun_sirih,
            R.drawable.daun_mint,
            R.drawable.lidah_buaya
        )

        val listData : ArrayList<Herbal>
            get() {
                val list = arrayListOf<Herbal>()
                for (position in namaTanaman.indices){
                    val herbal = Herbal()
                    herbal.nama = namaTanaman[position]
                    herbal.latin = namaLatin[position]
                    herbal.warna = warnaTanaman[position]
                    herbal.akar = akarTanaman[position]
                    herbal.daun = daunTanaman[position]
                    herbal.foto = imgTanaman[position]
                    herbal.manfaat = manfaat[position]
                    list.add(herbal)
                }
                return list
            }
}