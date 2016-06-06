package com.ivanebernal.databindingexample.databinding;
import com.ivanebernal.databindingexample.R;
import com.ivanebernal.databindingexample.BR;
import android.view.View;
public class ExpressionsBinding extends android.databinding.ViewDataBinding  {

    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    private final android.widget.LinearLayout mboundView0;
    private final android.widget.ImageView mboundView1;
    private final android.widget.TextView mboundView2;
    private final android.widget.TextView mboundView3;
    private final android.widget.TextView mboundView4;
    // variables
    private com.ivanebernal.databindingexample.MenuItem mItem;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ExpressionsBinding(android.databinding.DataBindingComponent bindingComponent, View root) {
        super(bindingComponent, root, 0);
        final Object[] bindings = mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.ImageView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.TextView) bindings[4];
        this.mboundView4.setTag(null);
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
            case BR.item :
                setItem((com.ivanebernal.databindingexample.MenuItem) variable);
                return true;
        }
        return false;
    }

    public void setItem(com.ivanebernal.databindingexample.MenuItem item) {
        this.mItem = item;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.item);
        super.requestRebind();
    }
    public com.ivanebernal.databindingexample.MenuItem getItem() {
        return mItem;
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
        java.lang.String mapItemStringFlavor = null;
        int isSpecialItemVISIBLE = 0;
        java.lang.String androidStringSpecial = null;
        java.lang.String androidStringArraySi = null;
        com.ivanebernal.databindingexample.MenuItem item = mItem;
        java.util.Map<java.lang.String,java.lang.String> mapItem = null;
        java.lang.String androidStringPriceMa = null;
        java.lang.String isSpecialItemAndroid = null;
        java.lang.String mapItemStringPrice = null;
        boolean isSpecialItem = false;
        int indexItem = 0;

        if ((dirtyFlags & 0x3L) != 0) {



                if (item != null) {
                    // read item.map
                    mapItem = item.map;
                    // read item.isSpecial
                    isSpecialItem = item.isSpecial;
                    // read item.index
                    indexItem = item.index;
                }
                if((dirtyFlags & 0x3L) != 0) {
                    if (isSpecialItem) {
                        dirtyFlags |= 0x8L;
                        dirtyFlags |= 0x20L;
                    } else {
                        dirtyFlags |= 0x4L;
                        dirtyFlags |= 0x10L;
                    }}


                if (mapItem != null) {
                    // read item.map["flavor"]
                    mapItemStringFlavor = mapItem.get("flavor");
                }
                // read item.isSpecial ? View.VISIBLE : View.INVISIBLE
                isSpecialItemVISIBLE = (isSpecialItem) ? (android.view.View.VISIBLE) : (android.view.View.INVISIBLE);
                // read @android:stringArray/sizes[item.index]
                androidStringArraySi = getFromArray(getRoot().getResources().getStringArray(R.array  .sizes), indexItem);
        }
        // batch finished

        if ((dirtyFlags & 0x30L) != 0) {

                if (mapItem != null) {
                    // read item.map["price"]
                    mapItemStringPrice = mapItem.get("price");
                }

            if ((dirtyFlags & 0x20L) != 0) {

                    // read @android:string/special
                    androidStringSpecial = getRoot().getResources().getString(R.string.special, mapItemStringPrice);
            }
            if ((dirtyFlags & 0x10L) != 0) {

                    // read @android:string/price
                    androidStringPriceMa = getRoot().getResources().getString(R.string.price, mapItemStringPrice);
            }
        }

        if ((dirtyFlags & 0x3L) != 0) {

                // read item.isSpecial ? @android:string/special : @android:string/price
                isSpecialItemAndroid = (isSpecialItem) ? (androidStringSpecial) : (androidStringPriceMa);
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            this.mboundView1.setVisibility(isSpecialItemVISIBLE);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, androidStringArraySi);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, mapItemStringFlavor);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, isSpecialItemAndroid);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    public static ExpressionsBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ExpressionsBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ExpressionsBinding>inflate(inflater, com.ivanebernal.databindingexample.R.layout.expressions, root, attachToRoot, bindingComponent);
    }
    public static ExpressionsBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ExpressionsBinding inflate(android.view.LayoutInflater inflater, android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.ivanebernal.databindingexample.R.layout.expressions, null, false), bindingComponent);
    }
    public static ExpressionsBinding bind(android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ExpressionsBinding bind(android.view.View view, android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/expressions_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ExpressionsBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): item
        flag 1 (0x2L): null
        flag 2 (0x3L): item.isSpecial ? View.VISIBLE : View.INVISIBLE
        flag 3 (0x4L): item.isSpecial ? View.VISIBLE : View.INVISIBLE
        flag 4 (0x5L): item.isSpecial ? @android:string/special : @android:string/price
        flag 5 (0x6L): item.isSpecial ? @android:string/special : @android:string/price
    flag mapping end*/
    //end
}