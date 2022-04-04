package com.example.myapplicationrecyclerview.fragments

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.Long
import kotlin.jvm.JvmStatic

public data class PostFragmentArgs(
  public val blogPost: Long
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putLong("blogPost", this.blogPost)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("blogPost", this.blogPost)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): PostFragmentArgs {
      bundle.setClassLoader(PostFragmentArgs::class.java.classLoader)
      val __blogPost : Long
      if (bundle.containsKey("blogPost")) {
        __blogPost = bundle.getLong("blogPost")
      } else {
        throw IllegalArgumentException("Required argument \"blogPost\" is missing and does not have an android:defaultValue")
      }
      return PostFragmentArgs(__blogPost)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): PostFragmentArgs {
      val __blogPost : Long?
      if (savedStateHandle.contains("blogPost")) {
        __blogPost = savedStateHandle["blogPost"]
        if (__blogPost == null) {
          throw IllegalArgumentException("Argument \"blogPost\" of type long does not support null values")
        }
      } else {
        throw IllegalArgumentException("Required argument \"blogPost\" is missing and does not have an android:defaultValue")
      }
      return PostFragmentArgs(__blogPost)
    }
  }
}
