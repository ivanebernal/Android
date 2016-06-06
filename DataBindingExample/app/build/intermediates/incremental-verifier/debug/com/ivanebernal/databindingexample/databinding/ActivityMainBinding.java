package com.ivanebernal.databindingexample.databinding;
import com.ivanebernal.databindingexample.R;
import com.ivanebernal.databindingexample.BR;
import android.view.View;
public class ActivityMainBinding extends android.databinding.ViewDataBinding  {

    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new android.databinding.ViewDataBinding.IncludedLayouts(5);
        sIncludes.setIncludes(0, 
            new String[] {"include_view"},
            new int[] {2},
            new int[] {R.layout.include_view});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.menu, 3);
        sViewsWithIds.put(R.id.list, 4);
    }
    // views
    public final android.widget.TextView hello;
    public final android.support.v7.widget.RecyclerView list;
    private final android.widget.LinearLayout mboundView0;
    private final com.ivanebernal.databindingexample.databinding.IncludeViewBinding mboundView01;
    public final android.widget.LinearLayout menu;
    // variables
    private com.ivanebernal.databindingexample.DataSource mDataSource;
    private com.ivanebernal.databindingexample.DataSource mIncludeSource;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityMainBinding(android.databinding.DataBindingComponent bindingComponent, View root) {
        super(bindingComponent, root, 0);
        final Object[] bindings = mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds);
        this.hello = (android.widget.TextView) bindings[1];
        this.hello.setTag(null);
        this.list = (android.support.v7.widget.RecyclerView) bindings[4];
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView01 = (com.ivanebernal.databindingexample.databinding.IncludeViewBinding) bindings[2];
        this.menu = (android.widget.LinearLayout) bindings[3];
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
        }
        mboundView01.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (mboundView01.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    public boolean setVariable(int variableId, Object variable) {
        switch(variableId) {
            case BR.dataSource :
                setDataSource((com.ivanebernal.databindingexample.DataSource) variable);
                return true;
            case BR.includeSource :
                setIncludeSource((com.ivanebernal.databindingexample.DataSource) variable);
                return true;
            case BR.imageUrl :
            case BR.number :
                return true;
        }
        return false;
    }

    public void setImageUrl(java.lang.String imageUrl) {
        // not used, ignore
    }
    public java.lang.String getImageUrl() {
        return null;
    }
    public void setNumber(int number) {
        // not used, ignore
    }
    public int getNumber() {
        return 0;
    }
    public void setDataSource(com.ivanebernal.databindingexample.DataSource dataSource) {
        this.mDataSource = dataSource;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.dataSource);
        super.requestRebind();
    }
    public com.ivanebernal.databindingexample.DataSource getDataSource() {
        return mDataSource;
    }
    public void setIncludeSource(com.ivanebernal.databindingexample.DataSource includeSource) {
        this.mIncludeSource = includeSource;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.includeSource);
        super.requestRebind();
    }
    public com.ivanebernal.databindingexample.DataSource getIncludeSource() {
        return mIncludeSource;
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
        com.ivanebernal.databindingexample.DataSource dataSource = mDataSource;
        com.ivanebernal.databindingexample.DataSource includeSource = mIncludeSource;
        java.lang.String messageDataSource = null;

        if ((dirtyFlags & 0x12L) != 0) {



                if (dataSource != null) {
                    // read dataSource.message
                    messageDataSource = dataSource.getMessage();
                }
        }
        if ((dirtyFlags & 0x18L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x12L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.hello, messageDataSource);
        }
        if ((dirtyFlags & 0x18L) != 0) {
            // api target 1

            this.mboundView01.setDataSource(includeSource);
        }
        mboundView01.executePendingBindings();
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    public static ActivityMainBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ActivityMainBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ActivityMainBinding>inflate(inflater, com.ivanebernal.databindingexample.R.layout.activity_main, root, attachToRoot, bindingComponent);
    }
    public static ActivityMainBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ActivityMainBinding inflate(android.view.LayoutInflater inflater, android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.ivanebernal.databindingexample.R.layout.activity_main, null, false), bindingComponent);
    }
    public static ActivityMainBinding bind(android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ActivityMainBinding bind(android.view.View view, android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/activity_main_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ActivityMainBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): imageUrl
        flag 1 (0x2L): dataSource
        flag 2 (0x3L): number
        flag 3 (0x4L): includeSource
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}