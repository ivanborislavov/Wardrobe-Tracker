package uofthacks.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.HashMap;

public class EnterClothingFieldActivity extends AppCompatActivity {
    private String[] parameters;
    private EditText[] enterTextField;
    private HashMap<String, String> curr_map;
    private boolean isAccessories = false;


    @Override
    @SuppressWarnings("unchecked")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_clothing_field);

        Intent intent = getIntent();

        curr_map = (HashMap<String, String>) intent.getSerializableExtra("HashMap-Fields");

        // Need to store the fields
        parameters = new String[4];
        enterTextField = new EditText[4];


        // Freeze the fields depending on the class
        if (curr_map.get("Class").equals("Accessories")) {
            // freeze size and colour
            enterTextField[1] = (EditText) findViewById(R.id.sizeField);
            enterTextField[1].setFocusable(false);
            enterTextField[1].setText("");

            enterTextField[2] = (EditText) findViewById(R.id.colourField);
            enterTextField[2].setFocusable(false);
            enterTextField[2].setText("");

            isAccessories = true;
        }
    }

    public void proceedToSpecificFields(View view) {
        enterTextField[0] = (EditText) findViewById(R.id.brandField);
        enterTextField[1] = (EditText) findViewById(R.id.sizeField);
        enterTextField[2] = (EditText) findViewById(R.id.colourField);
        enterTextField[3] = (EditText) findViewById(R.id.typeField);

        String brand = enterTextField[0].getText().toString();
        String size = enterTextField[1].getText().toString();
        String colour = enterTextField[2].getText().toString();
        String type = enterTextField[3].getText().toString();


        // brand and type is required for all of them
        if (brand.equals(null) || brand.equals("")) {
            enterTextField[0].setError("Brand cannot be empty");
            return;
        }
        if (type.equals(null) || type.equals("")) {
            enterTextField[3].setError("Type cannot be empty");
            return;
        }

        // not accessories; need to check for size & colour
        if (!isAccessories) {
            if (size.equals(null) || size.equals("")) {
                enterTextField[1].setError("Size cannot be empty");
                return;
            }
            if (colour.equals(null) || colour.equals("")) {
                enterTextField[2].setError("Colour cannot be empty");
                return;
            }
        }

        // add to hashmap
        curr_map.put("brand", brand);
        curr_map.put("size", size);
        curr_map.put("colour", colour);
        curr_map.put("type", type);
    }

}
