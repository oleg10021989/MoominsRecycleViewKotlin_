package com.example.myapplicationrecyclerview.fragments

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.myapplicationrecyclerview.data.DataSource
import com.example.myapplicationrecyclerview.R
import com.example.myapplicationrecyclerview.databinding.FragmentPostBinding
import com.example.myapplicationrecyclerview.models.BlogPost
import com.google.android.material.transition.MaterialContainerTransform


class PostFragment : Fragment() {

    private val args: PostFragmentArgs by navArgs()

    /*
    lazy - memory is not allocated unless we use it.
    variable will not be initialized unless we use it in our code
     */
    private val postId: Long by lazy(LazyThreadSafetyMode.NONE) { args.blogPost }

    private lateinit var binding: FragmentPostBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        sharedElementEnterTransition = MaterialContainerTransform().apply {
            drawingViewId = R.id.nav_host_fragment
            duration = resources.getInteger((R.integer.reply_motion_duration_large)).toLong()
            scrimColor = Color.TRANSPARENT
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentPostBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.navigationBackIcon.setOnClickListener {
            findNavController().navigateUp()
        }
        initView()
    }

    private fun initView() {
        val blogPost = DataSource.createDataSet()[postId.toInt()]
        if (blogPost != null) {

            binding.run {
                blogTitle.text = blogPost.title
                blogBody.text = blogPost.body
                blogAuthor.text = blogPost.userName
            }
            //init image
            setImageGlide(blogPost)
        }
    }

    private fun setImageGlide(blogPost: BlogPost) {
        //default properties to Glide  - what to display if there is an error or the image cannot be displayed
        val requestOptions = RequestOptions()
            .placeholder(R.drawable.white_background)
            .error(R.drawable.white_background)

        Glide.with(this)
            .setDefaultRequestOptions(requestOptions)
            .load(blogPost.image)
            .into(binding.blogImage)

        Glide.with(this)
            .setDefaultRequestOptions(requestOptions)
            .load(blogPost.image2)
            .into(binding.blogImage2)
    }
}