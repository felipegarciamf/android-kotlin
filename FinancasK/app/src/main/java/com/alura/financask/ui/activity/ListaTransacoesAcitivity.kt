package com.alura.financask.ui.activity

import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import com.alura.financask.R
import com.alura.financask.ui.adapter.ListaTransacoesAdapter
import kotlinx.android.synthetic.main.activity_lista_transacoes.*

class ListaTransacoesAcitivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_transacoes)

        val transacoes: List<String> = listOf("Comida - R$ 20,50", "Economia - R$ 100,00")

        val arrayAdapter = ArrayAdapter<Any>(this, android.R.layout.simple_list_item_1)

        lista_transacoes_listview.adapter = ListaTransacoesAdapter(transacoes, this)
    }

}

