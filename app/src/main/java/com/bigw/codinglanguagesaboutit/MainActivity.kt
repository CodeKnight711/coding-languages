package com.bigw.codinglanguagesaboutit

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import com.bigw.codinglanguagesaboutit.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    private val adapter by lazy { LangAdapter() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val layoutManager = GridLayoutManager(this, 2)

        binding.recyclerView.layoutManager = layoutManager
        binding.recyclerView.adapter = adapter


        setData()


    }

    private fun setData() {

        val data = ArrayList<LangModel>()
        val images = arrayOf(R.drawable.logo_c, R.drawable.logo_c_plus, R.drawable.logo_c_sharp, R.drawable.logo_js, R.drawable.logo_ts, R.drawable.logo_dart, R.drawable.logo_java, R.drawable.logo_python, R.drawable.logo_php, R.drawable.logo_ruby, R.drawable.logo_swift, R.drawable.logo_mysql, R.drawable.logo_kotlin)
        val names = arrayOf("C", "C++", "C#","Java Script", "Type Script", "Dart", "Java", "Python", "Php", "Ruby", "Swift","MySql", "Kotlin")

        for (i in 0..<images.size){
            val img = images[i]
            val name = names[i]
            val langmodel = LangModel(img, name)
            data.add(langmodel)
        }

        adapter.setData(data)

    }
}