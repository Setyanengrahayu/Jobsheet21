package com.example.job21_setya

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    val list = ArrayList<Kelas>()
    val listKelas = arrayOf(
        "NOR HIDAYAH FITRIYANI",
        "NOVITA SARI",
        "NUR IZZA",
        "RISKA ANGGUN ANGGRIANI",
        "SAHRUL LUKMAN HAKIM",
        "SETYA NENG RAHAYU",
        "SITI AGNIA AMALIA",
        "TIARA BINTANG LISWANDA",
        "WAHYU EKA PRASETYA",
        "ZAHROTUN NISWAH",
        "ZULIANA"
    )
    lateinit var kelasView: RecyclerView
    lateinit var kelasAdapter: KelasAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        kelasView = findViewById(R.id.kelasView)
        kelasView.layoutManager = LinearLayoutManager(this)

        for (i in listKelas.indices) {
            list.add(Kelas(listKelas[i]))
        }

        kelasAdapter = KelasAdapter(list)
        kelasAdapter.notifyDataSetChanged()
        kelasView.adapter = kelasAdapter
    }
}