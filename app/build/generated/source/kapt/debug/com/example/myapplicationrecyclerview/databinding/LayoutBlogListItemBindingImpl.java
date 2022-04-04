package com.example.myapplicationrecyclerview.databinding;
import com.example.myapplicationrecyclerview.R;
import com.example.myapplicationrecyclerview.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class LayoutBlogListItemBindingImpl extends LayoutBlogListItemBinding implements com.example.myapplicationrecyclerview.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.blog_image, 1);
        sViewsWithIds.put(R.id.container1, 2);
        sViewsWithIds.put(R.id.blog_title, 3);
        sViewsWithIds.put(R.id.blog_body, 4);
        sViewsWithIds.put(R.id.blog_author, 5);
    }
    // views
    @NonNull
    private final com.google.android.material.card.MaterialCardView mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public LayoutBlogListItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private LayoutBlogListItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[4]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[3]
            , (android.widget.LinearLayout) bindings[2]
            );
        this.mboundView0 = (com.google.android.material.card.MaterialCardView) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        mCallback1 = new com.example.myapplicationrecyclerview.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.blogPost == variableId) {
            setBlogPost((com.example.myapplicationrecyclerview.models.BlogPost) variable);
        }
        else if (BR.listener == variableId) {
            setListener((com.example.myapplicationrecyclerview.adapters.BlogRecyclerAdapter.OnItemClickListener) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setBlogPost(@Nullable com.example.myapplicationrecyclerview.models.BlogPost BlogPost) {
        this.mBlogPost = BlogPost;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.blogPost);
        super.requestRebind();
    }
    public void setListener(@Nullable com.example.myapplicationrecyclerview.adapters.BlogRecyclerAdapter.OnItemClickListener Listener) {
        this.mListener = Listener;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.listener);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        com.example.myapplicationrecyclerview.models.BlogPost blogPost = mBlogPost;
        long blogPostId = 0;
        com.example.myapplicationrecyclerview.adapters.BlogRecyclerAdapter.OnItemClickListener listener = mListener;
        java.lang.String mboundView0AndroidStringPostCardTransitionNameBlogPostId = null;

        if ((dirtyFlags & 0x5L) != 0) {



                if (blogPost != null) {
                    // read blogPost.id
                    blogPostId = blogPost.getId();
                }


                // read @android:string/post_card_transition_name
                mboundView0AndroidStringPostCardTransitionNameBlogPostId = mboundView0.getResources().getString(R.string.post_card_transition_name, blogPostId);
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.mboundView0.setOnClickListener(mCallback1);
        }
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 21
            if(getBuildSdkInt() >= 21) {

                this.mboundView0.setTransitionName(mboundView0AndroidStringPostCardTransitionNameBlogPostId);
            }
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // blogPost
        com.example.myapplicationrecyclerview.models.BlogPost blogPost = mBlogPost;
        // listener != null
        boolean listenerJavaLangObjectNull = false;
        // listener
        com.example.myapplicationrecyclerview.adapters.BlogRecyclerAdapter.OnItemClickListener listener = mListener;



        listenerJavaLangObjectNull = (listener) != (null);
        if (listenerJavaLangObjectNull) {




            listener.onItemClick(callbackArg_0, blogPost);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): blogPost
        flag 1 (0x2L): listener
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}