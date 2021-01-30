package br.com.fuzari.viagens.ui.activity;

import androidx.appcompat.app.AppCompatActivity;
import br.com.fuzari.viagens.R;
import br.com.fuzari.viagens.ui.adapter.ListaPacotesAdapter;
import br.com.fuzari.viagens.dao.PacoteDao;
import br.com.fuzari.viagens.model.Pacote;

import android.os.Bundle;
import android.widget.ListView;

import java.util.List;

public class ListaPacotesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_pacotes);
        setTitle(R.string.activity_lista_pacotes_titulo);
        configuraLista();
    }

    private void configuraLista() {
        ListView listaPacotes = findViewById(R.id.activity_lista_pacotes_itens);
        List<Pacote> pacotes = new PacoteDao().lista();
        listaPacotes.setAdapter(new ListaPacotesAdapter(pacotes, this));
    }
}