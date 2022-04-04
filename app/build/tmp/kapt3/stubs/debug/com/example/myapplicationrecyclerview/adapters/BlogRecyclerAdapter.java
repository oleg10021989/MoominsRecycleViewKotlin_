package com.example.myapplicationrecyclerview.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0015\u0016B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0016J\u0014\u0010\u0013\u001a\u00020\f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0007R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/example/myapplicationrecyclerview/adapters/BlogRecyclerAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "listener", "Lcom/example/myapplicationrecyclerview/adapters/BlogRecyclerAdapter$OnItemClickListener;", "(Lcom/example/myapplicationrecyclerview/adapters/BlogRecyclerAdapter$OnItemClickListener;)V", "items", "", "Lcom/example/myapplicationrecyclerview/models/BlogPost;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "submitList", "blogList", "BlogViewHolder", "OnItemClickListener", "app_debug"})
public final class BlogRecyclerAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    private final com.example.myapplicationrecyclerview.adapters.BlogRecyclerAdapter.OnItemClickListener listener = null;
    private java.util.List<com.example.myapplicationrecyclerview.models.BlogPost> items;
    
    public BlogRecyclerAdapter(@org.jetbrains.annotations.NotNull
    com.example.myapplicationrecyclerview.adapters.BlogRecyclerAdapter.OnItemClickListener listener) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    public final void submitList(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.myapplicationrecyclerview.models.BlogPost> blogList) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/example/myapplicationrecyclerview/adapters/BlogRecyclerAdapter$OnItemClickListener;", "", "onItemClick", "", "view", "Landroid/view/View;", "item", "Lcom/example/myapplicationrecyclerview/models/BlogPost;", "app_debug"})
    public static abstract interface OnItemClickListener {
        
        public abstract void onItemClick(@org.jetbrains.annotations.NotNull
        android.view.View view, @org.jetbrains.annotations.NotNull
        com.example.myapplicationrecyclerview.models.BlogPost item);
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\n\u00a8\u0006\u0017"}, d2 = {"Lcom/example/myapplicationrecyclerview/adapters/BlogRecyclerAdapter$BlogViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/myapplicationrecyclerview/databinding/LayoutBlogListItemBinding;", "listener", "Lcom/example/myapplicationrecyclerview/adapters/BlogRecyclerAdapter$OnItemClickListener;", "(Lcom/example/myapplicationrecyclerview/databinding/LayoutBlogListItemBinding;Lcom/example/myapplicationrecyclerview/adapters/BlogRecyclerAdapter$OnItemClickListener;)V", "blogAuthor", "Landroid/widget/TextView;", "getBlogAuthor", "()Landroid/widget/TextView;", "blogBody", "getBlogBody", "blogImage", "Landroid/widget/ImageView;", "getBlogImage", "()Landroid/widget/ImageView;", "blogTitle", "getBlogTitle", "bind", "", "blogPost", "Lcom/example/myapplicationrecyclerview/models/BlogPost;", "app_debug"})
    public static class BlogViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.example.myapplicationrecyclerview.databinding.LayoutBlogListItemBinding binding = null;
        @org.jetbrains.annotations.NotNull
        private final android.widget.ImageView blogImage = null;
        @org.jetbrains.annotations.NotNull
        private final android.widget.TextView blogTitle = null;
        @org.jetbrains.annotations.NotNull
        private final android.widget.TextView blogAuthor = null;
        @org.jetbrains.annotations.NotNull
        private final android.widget.TextView blogBody = null;
        
        public BlogViewHolder(@org.jetbrains.annotations.NotNull
        com.example.myapplicationrecyclerview.databinding.LayoutBlogListItemBinding binding, @org.jetbrains.annotations.NotNull
        com.example.myapplicationrecyclerview.adapters.BlogRecyclerAdapter.OnItemClickListener listener) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.ImageView getBlogImage() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getBlogTitle() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getBlogAuthor() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getBlogBody() {
            return null;
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull
        com.example.myapplicationrecyclerview.models.BlogPost blogPost) {
        }
    }
}