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
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.btik.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityVerificationBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView back;

  @NonNull
  public final AppCompatButton btnSubmit;

  @NonNull
  public final AppCompatImageView ivBca;

  @NonNull
  public final ImageView ivUpload;

  @NonNull
  public final TextView tvDesc;

  @NonNull
  public final TextView tvNamaRek;

  @NonNull
  public final TextView tvNorek;

  @NonNull
  public final TextView tvTitleNoRekening;

  private ActivityVerificationBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView back,
      @NonNull AppCompatButton btnSubmit, @NonNull AppCompatImageView ivBca,
      @NonNull ImageView ivUpload, @NonNull TextView tvDesc, @NonNull TextView tvNamaRek,
      @NonNull TextView tvNorek, @NonNull TextView tvTitleNoRekening) {
    this.rootView = rootView;
    this.back = back;
    this.btnSubmit = btnSubmit;
    this.ivBca = ivBca;
    this.ivUpload = ivUpload;
    this.tvDesc = tvDesc;
    this.tvNamaRek = tvNamaRek;
    this.tvNorek = tvNorek;
    this.tvTitleNoRekening = tvTitleNoRekening;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityVerificationBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityVerificationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_verification, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityVerificationBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.back;
      ImageView back = ViewBindings.findChildViewById(rootView, id);
      if (back == null) {
        break missingId;
      }

      id = R.id.btnSubmit;
      AppCompatButton btnSubmit = ViewBindings.findChildViewById(rootView, id);
      if (btnSubmit == null) {
        break missingId;
      }

      id = R.id.ivBca;
      AppCompatImageView ivBca = ViewBindings.findChildViewById(rootView, id);
      if (ivBca == null) {
        break missingId;
      }

      id = R.id.ivUpload;
      ImageView ivUpload = ViewBindings.findChildViewById(rootView, id);
      if (ivUpload == null) {
        break missingId;
      }

      id = R.id.tvDesc;
      TextView tvDesc = ViewBindings.findChildViewById(rootView, id);
      if (tvDesc == null) {
        break missingId;
      }

      id = R.id.tvNamaRek;
      TextView tvNamaRek = ViewBindings.findChildViewById(rootView, id);
      if (tvNamaRek == null) {
        break missingId;
      }

      id = R.id.tvNorek;
      TextView tvNorek = ViewBindings.findChildViewById(rootView, id);
      if (tvNorek == null) {
        break missingId;
      }

      id = R.id.tvTitleNoRekening;
      TextView tvTitleNoRekening = ViewBindings.findChildViewById(rootView, id);
      if (tvTitleNoRekening == null) {
        break missingId;
      }

      return new ActivityVerificationBinding((ConstraintLayout) rootView, back, btnSubmit, ivBca,
          ivUpload, tvDesc, tvNamaRek, tvNorek, tvTitleNoRekening);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
