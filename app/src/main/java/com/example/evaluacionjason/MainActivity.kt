package com.example.evaluacionjason

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.coordinatorlayout.widget.CoordinatorLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.android.volley.Request
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.example.evaluacionjason.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar
import org.json.JSONArray
import org.json.JSONException

class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding
    private lateinit var coordinatorLayout: CoordinatorLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        coordinatorLayout = binding.coordinatorLayout
        val requestQueue = Volley.newRequestQueue(this)
        val url = "http://192.168.0.30/crudphp/mostrarMysql.php"
        val stringRequest = StringRequest(
            Request.Method.GET, url,
            { response ->
                try {
                    val jsonArray = JSONArray(response)
                    val coordinadores = mutableListOf<Tabla>()

                    for (i in 0 until jsonArray.length()) {
                        val jsonObject = jsonArray.getJSONObject(i)
                        val idC = jsonObject.getInt("idC")
                        val nombres = jsonObject.getString("nombres")
                        val apeliidos = jsonObject.getString("apeliidos")
                        val fechaNac = jsonObject.getString("fechaNac")
                        val titulo = jsonObject.getString("titulo")
                        val email = jsonObject.getString("email")
                        val facultad = jsonObject.getString("facultad")

                        val data = Tabla(idC, nombres, apeliidos, fechaNac, titulo, email, facultad)
                        coordinadores.add(data)
                    }

                    binding.recyclerView.adapter = TablaAdapter(coordinadores)
                    binding.recyclerView.layoutManager = LinearLayoutManager(this)
                } catch (e: JSONException) {
                    e.printStackTrace()
                    Snackbar.make(coordinatorLayout, "Error: ${e.message}", Snackbar.LENGTH_LONG).show()
                }
            },
            { error ->
                Snackbar.make(coordinatorLayout, "Error: ${error.message}", Snackbar.LENGTH_LONG).show()
            })

        requestQueue.add(stringRequest)
    }
}