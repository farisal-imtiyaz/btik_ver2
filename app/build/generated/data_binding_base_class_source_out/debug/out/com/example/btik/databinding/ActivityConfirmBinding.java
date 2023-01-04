// Generated by view binder compiler. Do not edit!
package com.example.btik.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.btik.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityConfirmBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView back;

  @NonNull
  public final AppCompatButton backHome;

  @NonNull
  public final TextView teksAkhir;

  @NonNull
  public final TextView teksAwal;

  private ActivityConfirmBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView back,
      @NonNull AppCompatButton backHome, @NonNull TextView teksAkhir, @NonNull TextView teksAwal) {
    this.rootView = rootView;
    this.back = back;
    this.backHome = backHome;
    this.teksAkhir = teksAkhir;
    this.teksAwal = teksAwal;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityConfirmBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityConfirmBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_confirm, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityConfirmBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.back;
      ImageView back = ViewBindings.findChildViewById(rootView, id);
      if (back == null) {
        break missingId;
      }

      id = R.id.back_home;
      AppCompatButton backHome = ViewBindings.findChildViewById(rootView, id);
      if (backHome == null) {
        break missingId;
      }

      id = R.id.teks_akhir;
      TextView teksAkhir = ViewBindings.findChildViewById(rootView, id);
      if (teksAkhir == null) {
        break missingId;
      }

      id = R.id.teks_awal;
      TextView teksAwal = ViewBindings.findChildViewById(rootView, id);
      if (teksAwal == null) {
        break missingId;
      }

      return new ActivityConfirmBinding((ConstraintLayout) rootView, back, backHome, teksAkhir,
          teksAwal);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}