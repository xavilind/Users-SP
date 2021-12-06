package com.example.userssp

import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.cursosant.android.userssp.User
import com.example.userssp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var userAdapter: UserAdapter
    private lateinit var linearLayoutManager: RecyclerView.LayoutManager

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        userAdapter = UserAdapter(getUsers())
        linearLayoutManager = LinearLayoutManager(this)

        binding.recyclerView.apply {
            layoutManager = linearLayoutManager
            adapter = userAdapter
        }
    }

    private fun getUsers() : MutableList<User>{
        val users = mutableListOf<User>()

        val alain = User(1, "Alain", "Nicoñas", "https://frogames.es/wp-content/uploads/2020/09/alain-1.jpg")
        val samanta = User(2, "Samanta", "Meza", "https://www.bing.com/images/search?view=detailV2&ccid=ePuXPpjA&id=FBCAED9538DE5DEF6A26DD67AE8A47E113B5E34F&thid=OIP.ePuXPpjAylrqDh7rBQ8urwHaE8&mediaurl=https%3a%2f%2fupload.wikimedia.org%2fwikipedia%2fcommons%2fthumb%2fb%2fb2%2fSamanta_villar.jpg%2f800px-Samanta_villar.jpg&cdnurl=https%3a%2f%2fth.bing.com%2fth%2fid%2fR.78fb973e98c0ca5aea0e1eeb050f2eaf%3frik%3dT%252bO1E%252bFHiq5n3Q%26pid%3dImgRaw%26r%3d0&exph=534&expw=800&q=samanta&simid=608013145588326924&FORM=IRPRST&ck=C98B2175335EB431DC337055B2E12035&selectedIndex=0&qft=+filterui%3alicense-L2_L3")
        val javier = User(3, "javier", "Gómez", "https://www.google.com.mx/url?sa=i&url=https%3A%2F%2Fdenaflows.com%2Fha-muerto-javier-krahe-el-mundo-es-un-poco-peor%2F&psig=AOvVaw2AsnBwfhaCJuIkui0mYOKl&ust=1636939455715000&source=images&cd=vfe&ved=0CAsQjRxqFwoTCKCs-enYlvQCFQAAAAAdAAAAABAE")
        val emma = User(4, "Emma", "Cruz", "https://www.google.com.mx/url?sa=i&url=https%3A%2F%2Fwww.wikiwand.com%2Fen%2FEmma_Wortelboer&psig=AOvVaw0I_HfEX9_mjuXRGbJoyeYT&ust=1636939549229000&source=images&cd=vfe&ved=0CAsQjRxqFwoTCMjNqJbZlvQCFQAAAAAdAAAAABAD")

        users.add(alain)
        users.add(samanta)
        users.add(javier)
        users.add(javier)
        users.add(emma)
        users.add(alain)
        users.add(samanta)
        users.add(javier)
        users.add(javier)
        users.add(emma)
        users.add(alain)
        users.add(samanta)
        users.add(javier)
        users.add(javier)
        users.add(emma)

        return users
    }
}