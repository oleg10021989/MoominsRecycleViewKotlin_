package com.example.myapplicationrecyclerview.databinding;
import com.example.myapplicationrecyclerview.R;
import com.example.myapplicationrecyclerview.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentPostBindingImpl extends FragmentPostBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.navigation_back_icon, 1);
        sViewsWithIds.put(R.id.blog_title, 2);
        sViewsWithIds.put(R.id.blog_image, 3);
        sViewsWithIds.put(R.id.blog_image2, 4);
        sViewsWithIds.put(R.id.container1, 5);
        sViewsWithIds.put(R.id.blog_body, 6);
        sViewsWithIds.put(R.id.blog_author, 7);
    }
    // views
    @NonNull
    private final android.widget.FrameLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentPostBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private FragmentPostBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[6]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.ImageView) bindings[4]
            , (android.widget.TextView) bindings[2]
            , (android.widget.LinearLayout) bindings[5]
            , (android.widget.ImageButton) bindings[1]
            );
        this.mboundView0 = (android.widget.FrameLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setBlogPost(@Nullable com.example.myapplicationrecyclerview.models.BlogPost BlogPost) {
        this.mBlogPost = BlogPost;
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
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): blogPost
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}