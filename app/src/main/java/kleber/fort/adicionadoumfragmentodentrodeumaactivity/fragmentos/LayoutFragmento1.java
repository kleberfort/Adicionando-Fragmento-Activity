package kleber.fort.adicionadoumfragmentodentrodeumaactivity.fragmentos;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import kleber.fort.adicionadoumfragmentodentrodeumaactivity.R;
import kleber.fort.adicionadoumfragmentodentrodeumaactivity.databinding.LayoutFragmento1Binding;

public class LayoutFragmento1 extends Fragment {

    private LayoutFragmento1Binding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        binding = LayoutFragmento1Binding.inflate(inflater, container, false);

        binding.textView4.setText("texto Alterado Usando a Classe Fragmento 1");

        return binding.getRoot();

        //return  inflater.inflate(R.layout.layout_fragmento1, container, false);

        //return super.onCreateView(inflater, container, savedInstanceState);





    }
}
