package com.example.btik.databinding;
import com.example.btik.R;
import com.example.btik.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ProductViewBindingImpl extends ProductViewBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.back, 3);
        sViewsWithIds.put(R.id.iv_product, 4);
        sViewsWithIds.put(R.id.tvPrice, 5);
        sViewsWithIds.put(R.id.lytSecond, 6);
        sViewsWithIds.put(R.id.btnMinItem, 7);
        sViewsWithIds.put(R.id.tvTotalItem, 8);
        sViewsWithIds.put(R.id.btnPlusItem, 9);
        sViewsWithIds.put(R.id.tvTitleDesc, 10);
        sViewsWithIds.put(R.id.tvTitleSize, 11);
        sViewsWithIds.put(R.id.lytSize, 12);
        sViewsWithIds.put(R.id.btnSizeSmall, 13);
        sViewsWithIds.put(R.id.btnSizeMedium, 14);
        sViewsWithIds.put(R.id.btnSizeLarge, 15);
        sViewsWithIds.put(R.id.btnSizeExtraLarge, 16);
        sViewsWithIds.put(R.id.btnSizeDoubleExtraLarge, 17);
        sViewsWithIds.put(R.id.btnBuy, 18);
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ProductViewBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 19, sIncludes, sViewsWithIds));
    }
    private ProductViewBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[3]
            , (androidx.appcompat.widget.AppCompatButton) bindings[18]
            , (androidx.appcompat.widget.AppCompatButton) bindings[7]
            , (androidx.appcompat.widget.AppCompatButton) bindings[9]
            , (androidx.appcompat.widget.AppCompatButton) bindings[17]
            , (androidx.appcompat.widget.AppCompatButton) bindings[16]
            , (androidx.appcompat.widget.AppCompatButton) bindings[15]
            , (androidx.appcompat.widget.AppCompatButton) bindings[14]
            , (androidx.appcompat.widget.AppCompatButton) bindings[13]
            , (android.widget.TextView) bindings[2]
            , (android.widget.ImageView) bindings[4]
            , (android.widget.LinearLayout) bindings[6]
            , (android.widget.LinearLayout) bindings[12]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[8]
            );
        this.info.setTag(null);
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.tvNamaBarang.setTag(null);
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
        if (BR.isData == variableId) {
            setIsData((com.example.btik.dashboard.DataBarang) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setIsData(@Nullable com.example.btik.dashboard.DataBarang IsData) {
        this.mIsData = IsData;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.isData);
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
        java.lang.String isDataNamaBarang = null;
        com.example.btik.dashboard.DataBarang isData = mIsData;
        java.lang.String isDataInfo = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (isData != null) {
                    // read isData.namaBarang
                    isDataNamaBarang = isData.getNamaBarang();
                    // read isData.info
                    isDataInfo = isData.getInfo();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.info, isDataInfo);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvNamaBarang, isDataNamaBarang);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): isData
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}