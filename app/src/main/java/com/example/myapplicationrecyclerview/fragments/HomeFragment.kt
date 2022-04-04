package com.example.myapplicationrecyclerview.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.doOnPreDraw
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.FragmentNavigatorExtras
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplicationrecyclerview.R
import com.example.myapplicationrecyclerview.adapters.BlogRecyclerAdapter
import com.example.myapplicationrecyclerview.data.DataSource
import com.example.myapplicationrecyclerview.databinding.FragmentHomeBinding
import com.example.myapplicationrecyclerview.models.BlogPost
import com.google.android.material.transition.MaterialContainerTransform
import com.google.android.material.transition.MaterialElevationScale


class HomeFragment : Fragment(), BlogRecyclerAdapter.OnItemClickListener {

    private lateinit var binding: FragmentHomeBinding
    private var blogAdapter = BlogRecyclerAdapter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val postFragment = PostFragment()
        postFragment.sharedElementEnterTransition = MaterialContainerTransform()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initRecycleView()
        addDataSet(view)

        postponeEnterTransition()
        view.doOnPreDraw {
            startPostponedEnterTransition()
        }
    }


    private fun addDataSet(view: View) {
        //create posts
        val data = DataSource.createDataSet()

        //init adapter`s list
        blogAdapter.submitList(data)
    }

    private fun initRecycleView() {
        binding.recycleView.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = blogAdapter
        }
    }

    override fun onItemClick(view: View, itemBlog: BlogPost) {

        //to have the list of posts subtly scale out when exiting and back in when reentering:
        exitTransition = MaterialElevationScale(false).apply {
            duration = resources.getInteger(R.integer.reply_motion_duration_large).toLong()
        }
        reenterTransition = MaterialElevationScale(true).apply {
            duration = resources.getInteger(R.integer.reply_motion_duration_large).toLong()
        }
        /*
        create the mapping from your start view (posts list item) and end view (posts details screen):
        The FragmentNavigator.Extras class allows you to map shared elements from one destination to the next
         by their transition name
         */
        val postCardDetailTransitionName = getString(R.string.post_card_detail_transition_name)
        val extras = FragmentNavigatorExtras(view to postCardDetailTransitionName)
        // itemBlog.id - the value that we pass to post fragment
        val directions = HomeFragmentDirections.actionHomeFragmentToPostFragment(itemBlog.id)
        findNavController().navigate(directions, extras)
    }
}