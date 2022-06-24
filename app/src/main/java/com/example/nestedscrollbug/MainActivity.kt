package com.example.nestedscrollbug

import android.os.Bundle
import android.widget.FrameLayout
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomsheet.BottomSheetBehavior

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.main_activity)

        val standardBottomSheet: FrameLayout = findViewById(R.id.standardBottomSheet)
        val bottomSheetBehavior = BottomSheetBehavior.from(standardBottomSheet)
        bottomSheetBehavior.apply {
            saveFlags = BottomSheetBehavior.SAVE_ALL
            isHideable = false
            state = BottomSheetBehavior.STATE_COLLAPSED
        }

    }
}
