
package android.databinding;
import com.ivanebernal.databindingexample.BR;
class DataBinderMapper {
    final static int TARGET_MIN_SDK = 15;
    public DataBinderMapper() {
    }
    public android.databinding.ViewDataBinding getDataBinder(android.databinding.DataBindingComponent bindingComponent, android.view.View view, int layoutId) {
        switch(layoutId) {
                case com.ivanebernal.databindingexample.R.layout.item_view:
                    return com.ivanebernal.databindingexample.databinding.ItemViewBinding.bind(view, bindingComponent);
                case com.ivanebernal.databindingexample.R.layout.data_view:
                    return com.ivanebernal.databindingexample.databinding.DataViewBinding.bind(view, bindingComponent);
                case com.ivanebernal.databindingexample.R.layout.activity_main:
                    return com.ivanebernal.databindingexample.databinding.ActivityMainBinding.bind(view, bindingComponent);
                case com.ivanebernal.databindingexample.R.layout.include_view:
                    return com.ivanebernal.databindingexample.databinding.IncludeViewBinding.bind(view, bindingComponent);
                case com.ivanebernal.databindingexample.R.layout.expressions:
                    return com.ivanebernal.databindingexample.databinding.ExpressionsBinding.bind(view, bindingComponent);
                case com.ivanebernal.databindingexample.R.layout.fragment_data:
                    return com.ivanebernal.databindingexample.databinding.FragmentDataBinding.bind(view, bindingComponent);
        }
        return null;
    }
    android.databinding.ViewDataBinding getDataBinder(android.databinding.DataBindingComponent bindingComponent, android.view.View[] views, int layoutId) {
        switch(layoutId) {
        }
        return null;
    }
    int getLayoutId(String tag) {
        if (tag == null) {
            return 0;
        }
        final int code = tag.hashCode();
        switch(code) {
            case -1223782307: {
                if(tag.equals("layout/item_view_0")) {
                    return com.ivanebernal.databindingexample.R.layout.item_view;
                }
                break;
            }
            case 2123895782: {
                if(tag.equals("layout/data_view_0")) {
                    return com.ivanebernal.databindingexample.R.layout.data_view;
                }
                break;
            }
            case 423753077: {
                if(tag.equals("layout/activity_main_0")) {
                    return com.ivanebernal.databindingexample.R.layout.activity_main;
                }
                break;
            }
            case -42478: {
                if(tag.equals("layout/include_view_0")) {
                    return com.ivanebernal.databindingexample.R.layout.include_view;
                }
                break;
            }
            case 386477991: {
                if(tag.equals("layout/expressions_0")) {
                    return com.ivanebernal.databindingexample.R.layout.expressions;
                }
                break;
            }
            case -1243235131: {
                if(tag.equals("layout/fragment_data_0")) {
                    return com.ivanebernal.databindingexample.R.layout.fragment_data;
                }
                break;
            }
        }
        return 0;
    }
    String convertBrIdToString(int id) {
        if (id < 0 || id >= InnerBrLookup.sKeys.length) {
            return null;
        }
        return InnerBrLookup.sKeys[id];
    }
    private static class InnerBrLookup {
        static String[] sKeys = new String[]{
            "_all"
            ,"dataSource"
            ,"imageUrl"
            ,"includeSource"
            ,"item"
            ,"number"};
    }
}