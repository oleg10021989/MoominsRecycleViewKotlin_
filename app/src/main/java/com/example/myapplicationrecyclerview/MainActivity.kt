package com.example.myapplicationrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplicationrecyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var blogAdapter: BlogRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        initRecycleView()
        addDataSet()
    }

    private fun addDataSet() {
        val data = DataSource.createDataSet()
        blogAdapter.submitList(data)
    }

    private fun initRecycleView() {

        binding.recycleView.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            blogAdapter = BlogRecyclerAdapter()
            adapter = blogAdapter
        }


//        *** WE USE : binding.recycleView.apply INSTEAD ***
//        binding.recycleView.layoutManager =LinearLayoutManager(this@MainActivity)
//        blogAdapter = BlogRecyclerAdapter()
//        binding.recycleView.adapter = blogAdapter
    }
}