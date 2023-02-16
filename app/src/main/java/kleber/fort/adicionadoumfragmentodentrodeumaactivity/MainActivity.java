package kleber.fort.adicionadoumfragmentodentrodeumaactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import kleber.fort.adicionadoumfragmentodentrodeumaactivity.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.linearLayout1.setBackgroundColor(getResources().getColor(R.color.purple_200) );


        binding.linearLayout2.setBackgroundColor(getResources().getColor(R.color.teal_200) );



    }
}