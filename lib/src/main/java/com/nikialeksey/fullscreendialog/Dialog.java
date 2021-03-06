package com.nikialeksey.fullscreendialog;

import android.content.DialogInterface;
import android.support.annotation.NonNull;

public interface Dialog extends DialogInterface {

    void show();

    void addOnClose(@NonNull ClickListener clickListener);

    void addOnAction(@NonNull ClickListener clickListener);
}
