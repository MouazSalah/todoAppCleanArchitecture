package de.rezkalla.todocleararchapp.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dagger.android.AndroidInjection
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.support.HasSupportFragmentInjector
import de.rezkalla.todocleararchapp.R
import javax.inject.Inject

class MainActivity : AppCompatActivity()  , HasSupportFragmentInjector {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AndroidInjection.inject(this)
        setContentView(R.layout.activity_main)
    }

    @Inject
    lateinit var fragmentInjector: DispatchingAndroidInjector<androidx.fragment.app.Fragment>

    override fun supportFragmentInjector(): AndroidInjector<androidx.fragment.app.Fragment> {
        return fragmentInjector
    }
}
