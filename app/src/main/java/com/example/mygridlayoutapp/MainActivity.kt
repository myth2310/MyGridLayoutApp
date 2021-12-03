package com.example.mygridlayoutapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mygridlayoutapp.adapters.huruhadaptor
import com.example.mygridlayoutapp.model.hurufitem

class MainActivity : AppCompatActivity() {

    private var recyclerView: RecyclerView? = null
    private var charItem: ArrayList<hurufitem>? = null
    private var gridLayoutManager: GridLayoutManager? = null
    private var alphaAdapters: huruhadaptor? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.my_recycler)
        gridLayoutManager =
                GridLayoutManager(applicationContext, 3, LinearLayoutManager.VERTICAL, false)
        recyclerView?.layoutManager = gridLayoutManager
        recyclerView?.setHasFixedSize(true)

        charItem = ArrayList()
        charItem = setAlphas()
        alphaAdapters = huruhadaptor(applicationContext, charItem!!)
        recyclerView?.adapter = alphaAdapters

    }

    private fun setAlphas(): ArrayList<hurufitem> {

        var arrayList: ArrayList<hurufitem> = ArrayList()

        arrayList.add(hurufitem(R.drawable.letter_a, "A Latter"))
        arrayList.add(hurufitem(R.drawable.letter_b, "B Latter"))
        arrayList.add(hurufitem(R.drawable.letter_c, "C Latter"))
        arrayList.add(hurufitem(R.drawable.letter_d, "D Latter"))
        arrayList.add(hurufitem(R.drawable.letter_e, "E Latter"))
        arrayList.add(hurufitem(R.drawable.letter_f, "F Latter"))
        arrayList.add(hurufitem(R.drawable.letter_g, "G Latter"))
        arrayList.add(hurufitem(R.drawable.letter_h, "H Latter"))
        arrayList.add(hurufitem(R.drawable.letter_i, "I Latter"))
        arrayList.add(hurufitem(R.drawable.letter_j, "J Latter"))
        arrayList.add(hurufitem(R.drawable.letter_k, "K Latter"))
        arrayList.add(hurufitem(R.drawable.letter_l, "L Latter"))
        arrayList.add(hurufitem(R.drawable.letter_m, "M Latter"))
        arrayList.add(hurufitem(R.drawable.letter_n, "N Latter"))
        arrayList.add(hurufitem(R.drawable.letter_o, "O Latter"))
        arrayList.add(hurufitem(R.drawable.letter_p, "O Latter"))
        arrayList.add(hurufitem(R.drawable.letter_q, "Q Latter"))
        arrayList.add(hurufitem(R.drawable.letter_r, "R Latter"))
        arrayList.add(hurufitem(R.drawable.letter_s, "S Latter"))
        arrayList.add(hurufitem(R.drawable.letter_t, "T Latter"))
        arrayList.add(hurufitem(R.drawable.letter_u, "U Latter"))
        arrayList.add(hurufitem(R.drawable.letter_v, "V Latter"))
        arrayList.add(hurufitem(R.drawable.letter_w, "W Latter"))
        arrayList.add(hurufitem(R.drawable.letter_q, "Q Latter"))
        arrayList.add(hurufitem(R.drawable.letter_y, "Y Latter"))
        arrayList.add(hurufitem(R.drawable.letter_z, "Z Latter"))


        return arrayList
    }

}