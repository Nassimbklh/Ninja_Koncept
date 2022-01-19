package com.example.ninjakoncept.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.ninjakoncept.R

class homeFragment : Fragment(){
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater?.inflate(R.layout.fragment_home, container, false)
        // injecter le fragment dans la boite(fragment_actualiter)
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragment_actualiter, homeFragment())
        
    }
}