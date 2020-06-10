package com.alura.financask.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.alura.financask.R
import com.alura.financask.model.Transacao
import com.alura.financask.ui.adapter.ListaTransacoesAdapter
import kotlinx.android.synthetic.main.activity_lista_transacoes.*
import java.math.BigDecimal
import java.util.*

class ListaTransacoesAcitivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_transacoes)

        val transacoes: List<Transacao> = listOf(Transacao(BigDecimal(20.50), "Comida", Calendar.getInstance()),
                                            Transacao(BigDecimal(20), "Teste", Calendar.getInstance()))


        lista_transacoes_listview.adapter = ListaTransacoesAdapter(transacoes, this)
    }

}

