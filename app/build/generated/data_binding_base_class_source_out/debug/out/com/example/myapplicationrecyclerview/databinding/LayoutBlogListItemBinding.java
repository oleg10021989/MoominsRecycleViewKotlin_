// Generated by data binding compiler. Do not edit!
package com.example.myapplicationrecyclerview.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.myapplicationrecyclerview.R;
import com.example.myapplicationrecyclerview.adapters.BlogRecyclerAdapter;
import com.example.myapplicationrecyclerview.models.BlogPost;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class LayoutBlogListItemBinding extends ViewDataBinding {
  @NonNull
  public final TextView blogAuthor;

  @NonNull
  public final TextView blogBody;

  @NonNull
  public final ImageView blogImage;

  @NonNull
  public final TextView blogTitle;

  @NonNull
  public final LinearLayout container1;

  @Bindable
  protected BlogPost mBlogPost;

  @Bindable
  protected BlogRecyclerAdapter.OnItemClickListener mListener;

  protected LayoutBlogListItemBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView blogAuthor, TextView blogBody, ImageView blogImage, TextView blogTitle,
      LinearLayout container1) {
    super(_bindingComponent, _root, _localFieldCount);
    this.blogAuthor = blogAuthor;
    this.blogBody = blogBody;
    this.blogImage = blogImage;
    this.blogTitle = blogTitle;
    this.container1 = container1;
  }

  public abstract void setBlogPost(@Nullable BlogPost blogPost);

  @Nullable
  public BlogPost getBlogPost() {
    return mBlogPost;
  }

  public abstract void setListener(@Nullable BlogRecyclerAdapter.OnItemClickListener listener);

  @Nullable
  public BlogRecyclerAdapter.OnItemClickListener getListener() {
    return mListener;
  }

  @NonNull
  public static LayoutBlogListItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.layout_blog_list_item, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static LayoutBlogListItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<LayoutBlogListItemBinding>inflateInternal(inflater, R.layout.layout_blog_list_item, root, attachToRoot, component);
  }

  @NonNull
  public static LayoutBlogListItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.layout_blog_list_item, null, false, component)
   */
  @NonNull
  @Deprecated
  public static LayoutBlogListItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<LayoutBlogListItemBinding>inflateInternal(inflater, R.layout.layout_blog_list_item, null, false, component);
  }

  public static LayoutBlogListItemBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static LayoutBlogListItemBinding bind(@NonNull View view, @Nullable Object component) {
    return (LayoutBlogListItemBinding)bind(component, view, R.layout.layout_blog_list_item);
  }
}
