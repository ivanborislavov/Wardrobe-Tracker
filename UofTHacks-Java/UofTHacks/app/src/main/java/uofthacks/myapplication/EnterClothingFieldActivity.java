package uofthacks.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.HashMap;

public class EnterClothingFieldActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_clothing_field);


        Intent intent = getIntent();

        @SuppressWarnings("unchecked")
        HashMap<String, String> curr_map =
                (HashMap<String, String>) intent.getSerializableExtra(
                        "HashMap-Fields");
    }

}
