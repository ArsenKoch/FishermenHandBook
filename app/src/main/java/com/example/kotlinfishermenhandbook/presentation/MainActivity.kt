package com.example.kotlinfishermenhandbook.presentation

import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kotlinfishermenhandbook.FishermenListViewModel
import com.example.kotlinfishermenhandbook.R
import com.example.kotlinfishermenhandbook.data.FishermenRepositoryImpl
import com.example.kotlinfishermenhandbook.domain.entity.FishermenListItem
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.main_content.*

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    private var adapter: FishermenAdapter? = null

    private val viewModel = FishermenListViewModel(FishermenRepositoryImpl(applicationContext))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        nav_view.setNavigationItemSelectedListener(this)

        val list = ArrayList<FishermenListItem>()

        list.addAll(
            viewModel.fillArrays(
                resources.getStringArray(R.array.fish),
                resources.getStringArray(R.array.fish_content),
                viewModel.getImageId(R.array.fish_image_array)
            )
        )

        rcView.hasFixedSize()
        rcView.layoutManager = LinearLayoutManager(this)
        adapter = FishermenAdapter(list, this)
        rcView.adapter = adapter
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.id_fish -> {
                Toast.makeText(this, R.string.you_clicked_fish, Toast.LENGTH_SHORT).show()
                adapter?.updateAdapter(
                    viewModel.fillArrays(
                        resources.getStringArray(R.array.fish),
                        resources.getStringArray(R.array.fish_content),
                        viewModel.getImageId(R.array.fish_image_array)
                    )
                )
            }
            R.id.id_na -> {
                Toast.makeText(this, R.string.you_clicked_bait, Toast.LENGTH_SHORT).show()
                adapter?.updateAdapter(
                    viewModel.fillArrays(
                        resources.getStringArray(R.array.na),
                        resources.getStringArray(R.array.na_content),
                        viewModel.getImageId(R.array.na_image_array)
                    )
                )
            }
            R.id.id_sna -> {
                Toast.makeText(this, R.string.you_clicked_tackle, Toast.LENGTH_SHORT).show()
                adapter?.updateAdapter(
                    viewModel.fillArrays(
                        resources.getStringArray(R.array.sna),
                        resources.getStringArray(R.array.sna_content),
                        viewModel.getImageId(R.array.sna_image_array)
                    )
                )
            }
            R.id.id_history -> {
                Toast.makeText(this, R.string.you_clicked_fishing_stories, Toast.LENGTH_SHORT)
                    .show()
                adapter?.updateAdapter(
                    viewModel.fillArrays(
                        resources.getStringArray(R.array.history),
                        resources.getStringArray(R.array.history_content),
                        viewModel.getImageId(R.array.history_image_array)
                    )
                )
            }
            R.id.id_info -> {
                Toast.makeText(this, R.string.you_clicked_about_program, Toast.LENGTH_SHORT).show()
                adapter?.updateAdapter(
                    viewModel.fillArrays(
                        resources.getStringArray(R.array.info),
                        resources.getStringArray(R.array.info_content),
                        viewModel.getImageId(R.array.info_image_array)
                    )
                )
            }
        }

        drawerLayout.closeDrawer(GravityCompat.START)
        return true
    }
}