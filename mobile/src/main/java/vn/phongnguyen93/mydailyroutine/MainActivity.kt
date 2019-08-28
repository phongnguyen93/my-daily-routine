package vn.phongnguyen93.mydailyroutine

import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import dagger.android.support.DaggerAppCompatActivity
import vn.phongnguyen93.mydailyroutine.ui.MainActivityViewModel
import vn.phongnguyen93.mydailyroutine.widget.CurvedBottomNavigationView
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity() {

    lateinit var curvedBottomNavigationView: CurvedBottomNavigationView

    private lateinit var viewModel: MainActivityViewModel

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewModel =
            ViewModelProviders.of(this, viewModelFactory)
                .get(MainActivityViewModel::class.java)

        setContentView(R.layout.activity_main)
        curvedBottomNavigationView =
            findViewById<CurvedBottomNavigationView>(R.id.curved_bottom_navigation)
        curvedBottomNavigationView.inflateMenu(R.menu.bottom_navigation_menu)
    }

    override fun onResume() {
        super.onResume()
        viewModel.onLoaded()
    }
}
