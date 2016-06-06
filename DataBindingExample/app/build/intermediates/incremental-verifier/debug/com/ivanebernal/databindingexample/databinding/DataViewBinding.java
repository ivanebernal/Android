package com.ivanebernal.databindingexample.databinding;
import com.ivanebernal.databindingexample.R;
import com.ivanebernal.databindingexample.BR;
import android.view.View;
public class DataViewBinding extends android.databinding.ViewDataBinding  {

    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    private final com.ivanebernal.databindingexample.DataView mboundView0;
    private final android.widget.TextView mboundView1;
    // variables
    private com.ivanebernal.databindingexample.DataSource mDataSource;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public DataViewBinding(android.databinding.DataBindingComponent bindingComponent, View root) {
        super(bindingComponent, root, 0);
        final Object[] bindings = mapBindings(bindingComponent, root, 2, sIncludes, sViewsWithIds);
        this.mboundView0 = (com.ivanebernal.databindingexample.DataView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
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

    public boolean setVariable(int variableId, Object variable) {
        switch(variableId) {
            case BR.dataSource :
                setDataSource((com.ivanebernal.databindingexample.DataSource) variable);
                return true;
        }
        return false;
    }

    public void setDataSource(com.ivanebernal.databindingexample.DataSource dataSource) {
        this.mDataSource = dataSource;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.dataSource);
        super.requestRebind();
    }
    public com.ivanebernal.databindingexample.DataSource getDataSource() {
        return mDataSource;
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
        java.lang.String messageDataSource = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (dataSource != null) {
                    // read dataSource.message
                    messageDataSource = dataSource.getMessage();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, messageDataSource);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    public static DataViewBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static DataViewBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<DataViewBinding>inflate(inflater, com.ivanebernal.databindingexample.R.layout.data_view, root, attachToRoot, bindingComponent);
    }
    public static DataViewBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static DataViewBinding inflate(android.view.LayoutInflater inflater, android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.ivanebernal.databindingexample.R.layout.data_view, null, false), bindingComponent);
    }
    public static DataViewBinding bind(android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static DataViewBinding bind(android.view.View view, android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/data_view_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new DataViewBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): dataSource
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}