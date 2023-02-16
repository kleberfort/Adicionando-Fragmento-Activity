package kleber.fort.adicionadoumfragmentodentrodeumaactivity.fragmentos;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import kleber.fort.adicionadoumfragmentodentrodeumaactivity.databinding.LayoutFragmento2Binding;

public class LayoutFragmento2 extends Fragment {

    private LayoutFragmento2Binding binding;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        binding = LayoutFragmento2Binding.inflate(inflater, container, false);


        binding.textView3.setText("texto Alterado Usando a Classe Fragmento 2");


        return binding.getRoot();


        //return super.onCreateView(inflater, container, savedInstanceState);
    }
}
