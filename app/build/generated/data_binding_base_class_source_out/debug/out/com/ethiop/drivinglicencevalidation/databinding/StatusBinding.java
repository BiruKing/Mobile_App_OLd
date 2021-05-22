// Generated by view binder compiler. Do not edit!
package com.ethiop.drivinglicencevalidation.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.ethiop.drivinglicencevalidation.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class StatusBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView imageView2;

  @NonNull
  public final Button penality;

  @NonNull
  public final TextView report;

  @NonNull
  public final TextView textView10;

  @NonNull
  public final TextView textView11;

  @NonNull
  public final TextView textView13;

  @NonNull
  public final TextView textView14;

  @NonNull
  public final TextView textView15;

  @NonNull
  public final TextView textView16;

  @NonNull
  public final TextView textView17;

  @NonNull
  public final TextView textView18;

  @NonNull
  public final TextView textView19;

  @NonNull
  public final TextView textView20;

  private StatusBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView imageView2,
      @NonNull Button penality, @NonNull TextView report, @NonNull TextView textView10,
      @NonNull TextView textView11, @NonNull TextView textView13, @NonNull TextView textView14,
      @NonNull TextView textView15, @NonNull TextView textView16, @NonNull TextView textView17,
      @NonNull TextView textView18, @NonNull TextView textView19, @NonNull TextView textView20) {
    this.rootView = rootView;
    this.imageView2 = imageView2;
    this.penality = penality;
    this.report = report;
    this.textView10 = textView10;
    this.textView11 = textView11;
    this.textView13 = textView13;
    this.textView14 = textView14;
    this.textView15 = textView15;
    this.textView16 = textView16;
    this.textView17 = textView17;
    this.textView18 = textView18;
    this.textView19 = textView19;
    this.textView20 = textView20;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static StatusBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static StatusBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent,
      boolean attachToParent) {
    View root = inflater.inflate(R.layout.status, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static StatusBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.imageView2;
      ImageView imageView2 = rootView.findViewById(id);
      if (imageView2 == null) {
        break missingId;
      }

      id = R.id.penality;
      Button penality = rootView.findViewById(id);
      if (penality == null) {
        break missingId;
      }

      id = R.id.report;
      TextView report = rootView.findViewById(id);
      if (report == null) {
        break missingId;
      }

      id = R.id.textView10;
      TextView textView10 = rootView.findViewById(id);
      if (textView10 == null) {
        break missingId;
      }

      id = R.id.textView11;
      TextView textView11 = rootView.findViewById(id);
      if (textView11 == null) {
        break missingId;
      }

      id = R.id.textView13;
      TextView textView13 = rootView.findViewById(id);
      if (textView13 == null) {
        break missingId;
      }

      id = R.id.textView14;
      TextView textView14 = rootView.findViewById(id);
      if (textView14 == null) {
        break missingId;
      }

      id = R.id.textView15;
      TextView textView15 = rootView.findViewById(id);
      if (textView15 == null) {
        break missingId;
      }

      id = R.id.textView16;
      TextView textView16 = rootView.findViewById(id);
      if (textView16 == null) {
        break missingId;
      }

      id = R.id.textView17;
      TextView textView17 = rootView.findViewById(id);
      if (textView17 == null) {
        break missingId;
      }

      id = R.id.textView18;
      TextView textView18 = rootView.findViewById(id);
      if (textView18 == null) {
        break missingId;
      }

      id = R.id.textView19;
      TextView textView19 = rootView.findViewById(id);
      if (textView19 == null) {
        break missingId;
      }

      id = R.id.textView20;
      TextView textView20 = rootView.findViewById(id);
      if (textView20 == null) {
        break missingId;
      }

      return new StatusBinding((ConstraintLayout) rootView, imageView2, penality, report,
          textView10, textView11, textView13, textView14, textView15, textView16, textView17,
          textView18, textView19, textView20);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
