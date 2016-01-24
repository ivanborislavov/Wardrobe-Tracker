package uofthacks.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class ClothesActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_clothes);
    Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
    setSupportActionBar(toolbar);
  }

  public void startAddingNewClothes(View view) {
    Intent intent = new Intent(this, StartCreateNewClothesActivity.class);
    startActivity(intent);
  }

  public void startEditingClothes(View view) {
    // nothing yet
  }

  public void startViewingClothes(View view) {
    // nothing yet
  }
}
