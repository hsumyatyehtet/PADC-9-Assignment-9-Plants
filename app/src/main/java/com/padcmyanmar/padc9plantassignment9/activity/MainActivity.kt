package com.padcmyanmar.padc9plantassignment9.activity

import android.content.Intent
import android.os.Bundle
import android.view.Gravity
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar
import com.padcmyanmar.padc9plantassignment9.R
import com.padcmyanmar.padc9plantassignment9.adapter.PlantAdapter
import com.padcmyanmar.padc9plantassignment9.adapter.PlantDrawerViewAdapter
import com.padcmyanmar.padc9plantassignment9.data.model.PlantModelImpl
import com.padcmyanmar.padc9plantassignment9.data.vos.PlantVO
import com.padcmyanmar.padc9plantassignment9.delegate.PlantDelegate
import com.padcmyanmar.padc9plantassignment9.mvp.presenters.PlantListPresenter
import com.padcmyanmar.padc9plantassignment9.mvp.views.PlantListView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main_item.*
import kotlinx.android.synthetic.main.drawer_layout.*

class MainActivity : BaseActivity(),PlantListView {

    override fun displayError(errorMessage: String) {
        Snackbar.make(root_view,errorMessage,Snackbar.LENGTH_LONG).show()
    }

    override fun displayPlantList(plantList: List<PlantVO>) {
        mAdapter.setNewData(plantList.toMutableList())
    }

    override fun navigationTodetail(plantId: String) {
        startActivity(PlantDetailActivity.newIntent(applicationContext,plantId ))
    }

    private lateinit var mDrawerLayout: DrawerLayout
    private lateinit var mPresenter: PlantListPresenter
    private lateinit var mAdapter: PlantAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mPresenter= PlantListPresenter()
        mPresenter.initPresenter(this)

        mAdapter = PlantAdapter(mPresenter)
        val plantDrawerViewAdapter = PlantDrawerViewAdapter()

        with(recycler_view_main) {
            recycler_view_main.setHasFixedSize(true)
            recycler_view_main.layoutManager = LinearLayoutManager(context, RecyclerView.VERTICAL, false)
            recycler_view_main.adapter = mAdapter
        }

        iv_navigation.setOnClickListener {
            drawer_layout.openDrawer(Gravity.LEFT)
        }

        with(rv_navigation) {
            rv_navigation.setHasFixedSize(true)
            rv_navigation.layoutManager = GridLayoutManager(context, 2)
            rv_navigation.adapter=plantDrawerViewAdapter
        }

//        model=PlantModelImpl
//
//        model.getPlant(
//            {plants ->
//                plantAdapter.setNewData(plants.toMutableList())
//            },{
//                Snackbar.make(root_view,it,Snackbar.LENGTH_INDEFINITE).show()
//            }
//        )

        mPresenter.onCreate()
    }

    override fun onStart() {
        super.onStart()
        mPresenter.onStart()
    }

    override fun onResume() {
        super.onResume()
        mPresenter.onResume()
    }

    override fun onPause() {
        super.onPause()
        mPresenter.onPause()
    }

    override fun onStop() {
        super.onStop()
        mPresenter.onStop()
    }

    override fun onDestroy() {
        super.onDestroy()
        mPresenter.onDestroy()
    }

//    override fun onTapDelegat(plantId: String) {
////        val intent=Intent(this,PlantDetailActivity::class.java)
////        startActivity(intent)
//
//        startActivity(PlantDetailActivity.newIntent(applicationContext,plantId ))
//    }

    override fun onBackPressed() {
        if(drawer_layout.isDrawerOpen(GravityCompat.START)){
            drawer_layout.closeDrawer(GravityCompat.START)
        }else{
            super.onBackPressed()
        }
    }
}