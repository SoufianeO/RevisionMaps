package com.example.myapplication;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class NodeCreator {
    private DatabaseReference databaseReference ;

    public NodeCreator(String node) {
        this.databaseReference = FirebaseDatabase.getInstance().getReference(node);
    }

    public DatabaseReference getDatabaseReference() {
        return databaseReference;
    }
}
