package brianmccabe.distancer

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import brianmccabe.distancer.databinding.ActivityMainBinding

class HomeActivity : AppCompatActivity() {

    lateinit var activityMainBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val viewModel = ViewModelProviders.of(this)[HomeActivityViewModel::class.java]
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        activityMainBinding.lifecycleOwner = this
        activityMainBinding.viewModel = viewModel

        viewModel.getUsers(this)
    }
}
