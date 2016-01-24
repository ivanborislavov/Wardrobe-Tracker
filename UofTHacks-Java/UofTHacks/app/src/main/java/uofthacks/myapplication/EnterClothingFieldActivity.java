package uofthacks.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

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


        // Freeze the fields depending on the class
        if (curr_map.containsKey("Accessories")) {
            // freeze size and colour
            TextView sizeField = (TextView) findViewById(R.id.sizeField);
            TextView colourField = (TextView) findViewById(R.id.colourField);
            sizeField.setFocusable(false);
            colourField.setFocusable(false);
        }


    }

    public void proceedToSpecificFields(View view) {
//        Intent intent = new Intent(this,);
    }

}
