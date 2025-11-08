package com.example.fregment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentA} factory method to
 * create an instance of this fragment.
 */
public class FragmentA extends Fragment {

    private SharedViewModel viewModel;
    private EditText editText;
    private Button btnSend, btnSwitch;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a, container, false);

        editText = view.findViewById(R.id.editText);
        btnSend = view.findViewById(R.id.btnSend);
        btnSwitch = view.findViewById(R.id.btnSwitch);

        viewModel = new ViewModelProvider(requireActivity()).get(SharedViewModel.class);

        btnSend.setOnClickListener(v ->
                viewModel.setMessage(editText.getText().toString())
        );

        btnSwitch.setOnClickListener(v ->
                getParentFragmentManager().beginTransaction()
                        .replace(R.id.fragmentContainer, new FragmentB())
                        .addToBackStack(null)
                        .commit()
        );

        return view;
    }
}
