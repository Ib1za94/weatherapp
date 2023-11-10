package com.example.weatherapp

import com.example.weatherapp.databinding.ActivityMainBinding
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.android.volley.Request


const val API_KEY = "f6461ef1d1c544769fc175736230911"
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding. root)
        binding.bGet.setOnClickListener{
            getResult("Kyiv")
        }
    }
    private fun getResult(name: String){
        val url = "https://api.weatherapi.com/v1/current.json" +
                "?key=$API_KEY&q=$name&aqi=no"

        val queue = Volley.newRequestQueue(this)

        val stringRequest = StringRequest(Request.Method.GET,
            url,
            {
                    response ->
                Log.d("myLog","Response: $response")
            },
            {
                Log.d("MyLog", "Volley error: $it")
            }
        )

        queue.add(stringRequest)
    }
}


