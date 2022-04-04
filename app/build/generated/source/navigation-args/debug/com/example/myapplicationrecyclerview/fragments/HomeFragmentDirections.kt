package com.example.myapplicationrecyclerview.fragments

import android.os.Bundle
import androidx.navigation.NavDirections
import com.example.myapplicationrecyclerview.R
import kotlin.Int
import kotlin.Long

public class HomeFragmentDirections private constructor() {
  private data class ActionHomeFragmentToPostFragment(
    public val blogPost: Long
  ) : NavDirections {
    public override val actionId: Int = R.id.action_homeFragment_to_postFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putLong("blogPost", this.blogPost)
        return result
      }
  }

  public companion object {
    public fun actionHomeFragmentToPostFragment(blogPost: Long): NavDirections =
        ActionHomeFragmentToPostFragment(blogPost)
  }
}
