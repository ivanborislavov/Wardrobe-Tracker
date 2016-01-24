package uofthacks.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class StartCreateNewClothesActivity extends AppCompatActivity {

    private String type_selected;
        private HashMap<String, String> nameValuePair;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_create_new_clothes);

        /**
         * this is magic
         */
        Spinner spinner = (Spinner) findViewById(R.id.clothing_spinner);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.clothes_type_array, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinner.setAdapter(adapter);

        // ok could this be why???
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                type_selected = parent.getItemAtPosition(position).toString();
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
                return;
            }
        });
    }

    public void startCreatingClothesObject(View view) {
        // start creating the object
        Intent intent = new Intent(this, EnterClothingFieldActivity.class);

        nameValuePair = new HashMap<String, String>();
        nameValuePair.put("Class", type_selected);

        intent.putExtra("HashMap-Fields", nameValuePair);
        startActivity(intent);
    }
}
