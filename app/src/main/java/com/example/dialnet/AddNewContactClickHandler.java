package com.example.dialnet;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;

public class AddNewContactClickHandler {

    Contacts contact;
    Context context;
    MyViewModel myViewModel;

    public AddNewContactClickHandler(Contacts contact, Context context, MyViewModel myViewModel) {
        this.contact = contact;
        this.context = context;
        this.myViewModel = myViewModel;
    }

    public void onAddContactClicked(View view){
        if (contact.getFirstName() == null || contact.getPhone() == null){
            Toast.makeText(context, "Fields Cannot be empty", Toast.LENGTH_SHORT).show();
        }
        else{
            Intent i = new Intent(context,MainActivity.class);

            Contacts c = new Contacts(
                    contact.getFirstName(),
                    contact.getLastName(),
                    contact.getPhone()
            );

            myViewModel.addNewContact(c);

            context.startActivity(i);

        }
    }
}
