package me.miu.multimodulearch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import dagger.hilt.android.AndroidEntryPoint
import me.miu.common_utils.Activities
import me.miu.common_utils.Navigator
import me.miu.multimodulearch.databinding.ActivityMainBinding
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var provider: Navigator.Provider

    private var _binding:ActivityMainBinding?=null
    private val binding: ActivityMainBinding
        get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.statusBarColor = ContextCompat.getColor(this,R.color.white)
        _binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        provider.getActivities(Activities.NewsActivity).navigate(this)
    }
}