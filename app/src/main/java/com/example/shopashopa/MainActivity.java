package com.example.shopashopa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private EditText itemName;
    private Button addButton;
    private ListView itemListView;
    private ArrayAdapter<String> adapter;
    private ArrayList<String> itemList;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        // Initialize UI components
        itemName = findViewById(R.id.itemName);
        addButton = findViewById(R.id.addButton);
        itemListView = findViewById(R.id.itemListView);
        itemList = new ArrayList<>();
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, itemList);
        itemListView.setAdapter(adapter);
        
        // Set up button click listener
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addItem();
            }
        });
    }
    
    // Method to add item to the list
    private void addItem() {
        String item = itemName.getText().toString().trim();
        if (!item.isEmpty()) {
            itemList.add(item);
            adapter.notifyDataSetChanged();
            itemName.setText("");
        } else {
            Toast.makeText(this, "Please enter an item name", Toast.LENGTH_SHORT).show();
        }
    }
}
