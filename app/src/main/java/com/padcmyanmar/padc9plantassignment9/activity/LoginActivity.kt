package com.padcmyanmar.padc9plantassignment9.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.padcmyanmar.padc9plantassignment9.R
import kotlinx.android.synthetic.main.login_main.*

class LoginActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //window.decorView.systemUiVisibility= View.SYSTEM_UI_FLAG_FULLSCREEN

        setContentView(R.layout.login_main)

        btn_login.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }

}
