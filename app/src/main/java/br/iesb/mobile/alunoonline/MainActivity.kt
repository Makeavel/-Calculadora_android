package br.iesb.mobile.alunoonline

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var TiraZero  = true
    var Numero1 = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

     //Operações
         bt_divi.setOnClickListener(){KoltinOperacoes("/") }
         bt_mult.setOnClickListener(){ KoltinOperacoes("*") }
         bt_mais.setOnClickListener(){ KoltinOperacoes("+") }
         bt_menos.setOnClickListener(){ KoltinOperacoes("-") }
         bt_percent.setOnClickListener(){ KoltinOperacoes("%") }
         bt_ponto.setOnClickListener(){ kotlinNumeros(".") }

    //Limpador AC
        bt_limpar.setOnClickListener(){ KotlinLimpador("0") }

    //Igualdade
        bt_igual.setOnClickListener(){ KoltinIgualdade(editText.text.toString())}

    //Numeros
        bt_nove.setOnClickListener{ kotlinNumeros("9")}
        bt_oito.setOnClickListener{ kotlinNumeros("8")}
        bt_sete.setOnClickListener{ kotlinNumeros("7")}
        bt_seis.setOnClickListener{ kotlinNumeros("6")}
        bt_cinco.setOnClickListener{ kotlinNumeros("5")}
        bt_quatro.setOnClickListener{ kotlinNumeros("4")}
        bt_tres.setOnClickListener{ kotlinNumeros("3") }
        bt_dois.setOnClickListener{ kotlinNumeros("2")}
        bt_um.setOnClickListener{ kotlinNumeros("1") }
        bt_zero.setOnClickListener { kotlinNumeros("0") }

    }

    private fun KotlinLimpador(Limpador : String){
        editText.setText("0")
        TiraZero = true
    }

    private fun kotlinNumeros(validador : String){
        if(TiraZero){
            editText.setText("")
        }
        TiraZero = false

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


    }

    private fun KoltinIgualdade(Igualdade : String){

        var Numero2 = editText.text.toString()
        var ResultFinal = 0.0

        if(editText.text.toString() == "*"){
            ResultFinal = (Numero1.toDouble() * Numero2.toDouble())
        }
        if(editText.text.toString() == "/"){
            ResultFinal = (Numero1.toDouble() / Numero2.toDouble())
        }
        if(editText.text.toString() == "+"){
            ResultFinal = (Numero1.toDouble() + Numero2.toDouble())
        }
        if(editText.text.toString() == "-"){
            ResultFinal = (Numero1.toDouble() - Numero2.toDouble())
        }
        if(editText.text.toString() == "%"){
            ResultFinal = (Numero1.toDouble() % Numero2.toDouble())
        }
        editText.setText(ResultFinal.toString())
    }

    private fun KoltinOperacoes(operacao : String ){

        Numero1 = editText.text.toString()

        if(operacao == "+"){
            editText.text = editText.text.toString() + bt_mais.text.toString()
        }
        if(operacao == "-"){
            editText.text = editText.text.toString() + bt_menos.text.toString()
        }
        if(operacao == "*"){
            editText.text = editText.text.toString() + bt_mult.text.toString()
        }
        if(operacao == "/"){
            editText.text = editText.text.toString() + bt_divi.text.toString()
        }
        if(operacao == "%"){
            editText.text = editText.text.toString() + bt_percent.text.toString()
        }
    }

}