# Week-10: Auto Complete Text View

A simple program demonstrating the usage of `AutoCompleteTextView`.

> XML code
```xml
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">


    <TextView
        android:id="@+id/textView"
        android:layout_width="278dp"
        android:layout_height="70dp"
        android:gravity="center"
        android:text="@string/enter_your_branch"
        android:textSize="34sp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.496"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.218" />

    <AutoCompleteTextView
        android:id="@+id/inputBranch"
        android:layout_width="250dp"
        android:layout_height="58dp"
        android:layout_marginTop="176dp"
        android:hint="@string/enter_your_branch"
        app:layout_constraintEnd_toEndOf="@+id/textView"
        app:layout_constraintStart_toStartOf="@+id/textView"
        app:layout_constraintTop_toBottomOf="@+id/textView" />

</androidx.constraintlayout.widget.ConstraintLayout>
```

> Java code
```java
package com.example.autocomplete;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    private final String [] branches = { "CSE", "CSM", "CSO", "CSD", "MEC", "EEE", "ECE", "CIV" };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AutoCompleteTextView autoCompleteTextView = findViewById(R.id.inputBranch);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, branches);
        autoCompleteTextView.setAdapter(adapter);
    }
}
```

## Output

<div align="center">

![output](output/output_ss.png)

</div>
