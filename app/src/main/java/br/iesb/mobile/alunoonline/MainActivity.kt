package br.iesb.mobile.alunoonline

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var TiraZero  = true // responsavel por tirar o 0 da tela ao digitar
    var Numero1 = "" // primeira numero antes do sinal de operação
    var sinal = "+"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

     //Operações
         bt_divi.setOnClickListener(){KoltinOperacoes("/") }
         bt_mult.setOnClickListener(){ KoltinOperacoes("*") }
         bt_mais.setOnClickListener(){ KoltinOperacoes("+") }
         bt_menos.setOnClickListener(){ KoltinOperacoes("-") }
         bt_percent.setOnClickListener(){ KoltinOperacoes("%") }

    //Limpador AC
        bt_limpar.setOnClickListener(){ KotlinLimpador() }

    //Igualdade
        bt_igual.setOnClickListener(){ KoltinIgualdade()}

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
        bt_ponto.setOnClickListener{ kotlinNumeros(".") }

    }

    private fun KotlinLimpador(){
        editText.setText("0")
        TiraZero = true
    }

    private fun kotlinNumeros(validador : String){
        if(TiraZero){
            editText.setText("")
        }
        TiraZero = false

        when(validador) {
            "1" -> {
                editText.text = editText.text.toString() + bt_um.text.toString()
            }
            "2" -> {
                editText.text = editText.text.toString() + bt_dois.text.toString()
            }
            "3" -> {
                editText.text = editText.text.toString() + bt_tres.text.toString()
            }
            "4" -> {
                editText.text = editText.text.toString() + bt_quatro.text.toString()
            }
            "5" -> {
                editText.text = editText.text.toString() + bt_cinco.text.toString()
            }
            "6" -> {
                editText.text = editText.text.toString() + bt_seis.text.toString()
            }
            "7" -> {
                editText.text = editText.text.toString() + bt_sete.text.toString()
            }
            "8" -> {
                editText.text = editText.text.toString() + bt_oito.text.toString()
            }
            "9" -> {
                editText.text = editText.text.toString() + bt_nove.text.toString()
            }
            "0" -> {
                editText.text = editText.text.toString() + bt_zero.text.toString()
            }
        }
    }

    private fun KoltinIgualdade(){

        var Numero2 = editText.text.toString()
        var ResultFinal = 0.0

        when(sinal){
            "+" -> {ResultFinal = (Numero1.toDouble() + Numero2.toDouble())}
            "-" -> {ResultFinal = (Numero1.toDouble() - Numero2.toDouble())}
            "*" -> {ResultFinal = (Numero1.toDouble() * Numero2.toDouble())}
            "/" -> {ResultFinal = (Numero1.toDouble() / Numero2.toDouble())}
            "%" -> {ResultFinal = (Numero1.toDouble() % Numero2.toDouble())}
        }
        editText.setText(ResultFinal.toString())
    }

    @SuppressLint("SetTextI18n")
    private fun KoltinOperacoes(operacao : String ){

        Numero1 = editText.text.toString()

        if(operacao == "+"){
            sinal = "+"
            editText.text = editText.text.toString() + bt_mais.text.toString()
        }
        if(operacao == "-"){
            sinal = "-"
            editText.text = editText.text.toString() + bt_menos.text.toString()
        }
        if(operacao == "*"){
            sinal = "*"
            editText.text = editText.text.toString() + bt_mult.text.toString()
        }
        if(operacao == "/"){
            sinal = "/"
            editText.text = editText.text.toString() + bt_divi.text.toString()
        }
        if(operacao == "%"){
            sinal = "%"
            editText.text = editText.text.toString() + bt_percent.text.toString()
        }
    }

}