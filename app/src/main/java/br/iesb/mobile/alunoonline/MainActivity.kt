package br.iesb.mobile.alunoonline

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

     bt_divi.setOnClickListener(){}
     bt_mult.setOnClickListener(){}
     bt_igual.setOnClickListener(){}
     bt_mais.setOnClickListener(){}
     bt_menos.setOnClickListener(){}
     bt_percent.setOnClickListener(){}
     bt_ponto.setOnClickListener(){kotlinText(".")}

    editText

    bt_nove.setOnClickListener{ kotlinText("9")}
    bt_oito.setOnClickListener{ kotlinText("8")}
    bt_sete.setOnClickListener{ kotlinText("7")}
    bt_seis.setOnClickListener{ kotlinText("6")}
    bt_cinco.setOnClickListener{ kotlinText("5")}
    bt_quatro.setOnClickListener{ kotlinText("4")}
    bt_tres.setOnClickListener{ kotlinText("3") }
    bt_dois.setOnClickListener{ kotlinText("2")}
    bt_um.setOnClickListener{ kotlinText("1") }
    bt_zero.setOnClickListener { kotlinText("0") }

    }

    private fun kotlinText(validador : String){

        if(validador == "1"){
            editText.text = editText.text.toString() + bt_um.text.toString()
        }
        if(validador == "2"){
            editText.text = editText.text.toString() + bt_dois.text.toString()
        }
        if(validador == "3"){
            editText.text = editText.text.toString() + bt_tres.text.toString()
        }
        if(validador == "4"){
            editText.text = editText.text.toString() + bt_quatro.text.toString()
        }
        if(validador == "5"){
            editText.text = editText.text.toString() + bt_cinco.text.toString()
        }
        if(validador == "6"){
            editText.text = editText.text.toString() + bt_seis.text.toString()
        }
        if(validador == "7"){
            editText.text = editText.text.toString() + bt_sete.text.toString()
        }
        if(validador == "8"){
            editText.text = editText.text.toString() + bt_oito.text.toString()
        }
        if(validador == "9"){
            editText.text = editText.text.toString() + bt_nove.text.toString()
        }
        if(validador == "0"){
            editText.text = editText.text.toString() + bt_zero.text.toString()
        }
        if(validador == "."){
            editText.text = editText.text.toString() + bt_ponto.text.toString()
        }


    }

    private fun opera( valor : Number , Verifica : Boolean){

        var str = valor.toInt()
       return
        Toast.makeText(this, str,Toast.LENGTH_LONG).show()
    }

    private fun printaText(){

    }

}