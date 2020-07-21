package com.adwaitkumar.calculatorbyadwait

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun bunumberevent(view: View)
    {
        if(isclean==true)
        {
            shownumber.setText("")
        }
        isclean=false
        val buselect=view as Button
        var curtext:String=shownumber.text.toString()
        when(buselect.id)
        {
            bu0.id->{
                curtext+="0"
            }
            bu1.id->{
                curtext+="1"
            }
            bu2.id->{
                curtext+="2"
            }
            bu3.id->{
                curtext+="3"
            }
            bu4.id->{
                curtext+="4"
            }
            bu5.id->{
                curtext+="5"
            }
            bu6.id->{
                curtext+="6"
            }
            bu7.id->{
                curtext+="7"
            }
            bu8.id->{
                curtext+="8"
            }
            bu9.id->{
                curtext+="9"
            }
            budot.id->{
                curtext+="."
            }
            buplusminus.id->{
                curtext="-"+curtext
            }

        }
        shownumber.setText(curtext)
    }
    var op:String="*"
    var oldnumber=""
    var isclean=true
    fun buopevent(view: View)
    {
        val buselect=view as Button

        when(buselect.id)
        {
            bumul.id->{
                op="*"
            }
            busub.id->{
                op="-"
            }
            buadd.id->{
                op="+"
            }
            budiv.id->{
                op="/"
            }
        }
        isclean=true
        oldnumber=shownumber.text.toString()
    }
    fun  buequalevent(view: View)
    {
        var finalans:Double?=null
        var newnumber:String=shownumber.text.toString()
        when(op)
        {
            "*"->{
                finalans=oldnumber.toDouble()*newnumber.toDouble()
            }
            "-"->{
                finalans=oldnumber.toDouble()-newnumber.toDouble()
            }
            "+"->{
                finalans=oldnumber.toDouble()+newnumber.toDouble()
            }
            "/"->{
                finalans=oldnumber.toDouble()/newnumber.toDouble()
            }
        }
        shownumber.setText(finalans.toString())
        isclean=true
    }
}