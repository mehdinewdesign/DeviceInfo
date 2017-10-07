package com.example.akif.devinfo.views


import android.view.Gravity
import android.widget.LinearLayout
import com.example.akif.devinfo.fragments.CPUFragment
import org.jetbrains.anko.*

/**
 * Created by akif on 9/25/17.
 */
class CPUView : AnkoComponent<CPUFragment> {
    private lateinit var ankoContext: AnkoContext<CPUFragment>

    override fun createView(ui: AnkoContext<CPUFragment>) = with(ui) {
        ankoContext = ui

        verticalLayout {
            this.gravity = Gravity.CENTER
            lparams(width = matchParent, height = matchParent)


            linearLayout {
                orientation = LinearLayout.HORIZONTAL

            }

        }
    }
}