package android;

import android.app.Activity;
import android.os.Bundle;


import androidx.annotation.Nullable;

public class Test extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        long time = 1000_000_000;
    }
}
