package jp.techacademy.hiroto.ugajin.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log // 追加
import android.view.View // 追加
import jp.techacademy.hiroto.ugajin.ui.databinding.ActivityMainBinding // 追加

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding // 追加

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater) // 追加
        val view = binding.root // 追加
//        setContentView(R.layout.activity_main)
        setContentView(view) // 変更

        // View BindingでUI部品を指定
        binding.button1.text = "ボタン"
//        binding.button1.setOnClickListener(this)  // 追加

        binding.button1.setOnClickListener {
            Log.d("UI_PARTS", "ボタンをタップしました")
        }
    }
    // 以下の関数を追加
    override fun onClick(v: View) {
        Log.d("UI_PARTS", "ボタンをタップしました")
    }
}