package com.example.aboutme.databinding;
import com.example.aboutme.R;
import com.example.aboutme.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMainBindingImpl extends ActivityMainBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.nameText, 2);
        sViewsWithIds.put(R.id.nickNameEdit, 3);
        sViewsWithIds.put(R.id.starImage, 4);
        sViewsWithIds.put(R.id.doneButton, 5);
        sViewsWithIds.put(R.id.bio_scroll, 6);
        sViewsWithIds.put(R.id.bio_text, 7);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener nickNameTextandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of myName.nickName
            //         is myName.setNickName((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(nickNameText);
            // localize variables for thread safety
            // myName.nickName
            java.lang.String myNameNickName = null;
            // myName
            com.example.aboutme.MyName myName = mMyName;
            // myName != null
            boolean myNameJavaLangObjectNull = false;



            myNameJavaLangObjectNull = (myName) != (null);
            if (myNameJavaLangObjectNull) {




                myName.setNickName(((java.lang.String) (callbackArg_0)));
            }
        }
    };

    public ActivityMainBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private ActivityMainBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ScrollView) bindings[6]
            , (android.widget.TextView) bindings[7]
            , (android.widget.Button) bindings[5]
            , (android.widget.TextView) bindings[2]
            , (android.widget.EditText) bindings[3]
            , (android.widget.TextView) bindings[1]
            , (android.widget.ImageView) bindings[4]
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.nickNameText.setTag(null);
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
        if (BR.myName == variableId) {
            setMyName((com.example.aboutme.MyName) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setMyName(@Nullable com.example.aboutme.MyName MyName) {
        this.mMyName = MyName;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.myName);
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
        java.lang.String myNameNickName = null;
        com.example.aboutme.MyName myName = mMyName;

        if ((dirtyFlags & 0x3L) != 0) {



                if (myName != null) {
                    // read myName.nickName
                    myNameNickName = myName.getNickName();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.nickNameText, myNameNickName);
        }
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.nickNameText, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, nickNameTextandroidTextAttrChanged);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): myName
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}