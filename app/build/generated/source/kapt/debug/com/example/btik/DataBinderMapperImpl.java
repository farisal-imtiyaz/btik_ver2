package com.example.btik;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.example.btik.databinding.ActivityAddressBindingImpl;
import com.example.btik.databinding.ActivityDashboardBindingImpl;
import com.example.btik.databinding.ActivityEditProfileBindingImpl;
import com.example.btik.databinding.ActivityProfileBindingImpl;
import com.example.btik.databinding.ItemListBarangBindingImpl;
import com.example.btik.databinding.ProductViewBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYADDRESS = 1;

  private static final int LAYOUT_ACTIVITYDASHBOARD = 2;

  private static final int LAYOUT_ACTIVITYEDITPROFILE = 3;

  private static final int LAYOUT_ACTIVITYPROFILE = 4;

  private static final int LAYOUT_ITEMLISTBARANG = 5;

  private static final int LAYOUT_PRODUCTVIEW = 6;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(6);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.btik.R.layout.activity_address, LAYOUT_ACTIVITYADDRESS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.btik.R.layout.activity_dashboard, LAYOUT_ACTIVITYDASHBOARD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.btik.R.layout.activity_edit_profile, LAYOUT_ACTIVITYEDITPROFILE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.btik.R.layout.activity_profile, LAYOUT_ACTIVITYPROFILE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.btik.R.layout.item_list_barang, LAYOUT_ITEMLISTBARANG);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.btik.R.layout.product_view, LAYOUT_PRODUCTVIEW);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYADDRESS: {
          if ("layout/activity_address_0".equals(tag)) {
            return new ActivityAddressBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_address is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYDASHBOARD: {
          if ("layout/activity_dashboard_0".equals(tag)) {
            return new ActivityDashboardBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_dashboard is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYEDITPROFILE: {
          if ("layout/activity_edit_profile_0".equals(tag)) {
            return new ActivityEditProfileBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_edit_profile is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYPROFILE: {
          if ("layout/activity_profile_0".equals(tag)) {
            return new ActivityProfileBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_profile is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMLISTBARANG: {
          if ("layout/item_list_barang_0".equals(tag)) {
            return new ItemListBarangBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_list_barang is invalid. Received: " + tag);
        }
        case  LAYOUT_PRODUCTVIEW: {
          if ("layout/product_view_0".equals(tag)) {
            return new ProductViewBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for product_view is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(3);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "isData");
      sKeys.put(2, "isProduct");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(6);

    static {
      sKeys.put("layout/activity_address_0", com.example.btik.R.layout.activity_address);
      sKeys.put("layout/activity_dashboard_0", com.example.btik.R.layout.activity_dashboard);
      sKeys.put("layout/activity_edit_profile_0", com.example.btik.R.layout.activity_edit_profile);
      sKeys.put("layout/activity_profile_0", com.example.btik.R.layout.activity_profile);
      sKeys.put("layout/item_list_barang_0", com.example.btik.R.layout.item_list_barang);
      sKeys.put("layout/product_view_0", com.example.btik.R.layout.product_view);
    }
  }
}
