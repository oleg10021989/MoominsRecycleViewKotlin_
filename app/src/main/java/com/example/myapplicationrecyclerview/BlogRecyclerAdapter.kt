package com.example.myapplicationrecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.myapplicationrecyclerview.databinding.LayoutBlogListItemBinding
import com.example.myapplicationrecyclerview.models.BlogPost
import kotlin.collections.ArrayList

class BlogRecyclerAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private val TAG: String = "AppDebug"

    private var items: List<BlogPost> = ArrayList()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return BlogViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.layout_blog_list_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is BlogViewHolder -> {
                holder.bind(items[position])
            }
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    fun submitList(blogList: List<BlogPost>) {
        items = blogList
    }

    class BlogViewHolder
    constructor(
        itemView: View
    ) : RecyclerView.ViewHolder(itemView) {
        private val binding = LayoutBlogListItemBinding.bind(itemView)

        val blogImage = binding.blogImage
        val blogTitle = binding.blogTitle
        val blogAuthor = binding.blogAuthor
        val blogBody = binding.blogBody

        // taking each individual BlogPost object and bind it to the views in a layout
        fun bind(blogPost: BlogPost) {
            blogTitle.text = blogPost.title
            blogAuthor.text = blogPost.userName
            blogBody.text = blogPost.body

            //default properties to Glide  - what to display if there is an error or the image cannot be displayed
            val requestOptions = RequestOptions()
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_background)

            Glide.with(blogAuthor.context)
                .setDefaultRequestOptions(requestOptions)
                .load(blogPost.image)
                .into(blogImage)


        }
    }
}