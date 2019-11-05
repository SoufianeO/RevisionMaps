package com.example.myapplication;
import com.google.firebase.database.DatabaseReference;
public class RevisionDao {
    private DatabaseReference databaseReference ;

    public RevisionDao(DatabaseReference databaseReference) {
        NodeCreator nodeCreator = new NodeCreator("Revisions");
        this.databaseReference = nodeCreator.getDatabaseReference();
    }
    public void registerRevision(Revision revision ){
        String id = databaseReference.push().getKey();
        revision.setRevisionId(id);
        databaseReference.child(id).setValue(revision);
    }
}
