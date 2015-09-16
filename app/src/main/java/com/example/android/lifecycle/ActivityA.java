/*
 * Copyright (C) 2012 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.lifecycle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Example Activity to demonstrate the lifecycle callback methods.
 */
public class ActivityA extends Activity implements View.OnClickListener {

    private Button mButtonActivityB;
    private Button mButtonActivityC;
    private Button mButtonFinishActivityA;
    private Button mButtonStartDialog;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);

        // Set views
        mButtonActivityB = (Button) findViewById(R.id.btn_start_b);
        mButtonActivityC = (Button) findViewById(R.id.btn_start_c);
        mButtonFinishActivityA = (Button) findViewById(R.id.btn_finish_a);
        mButtonStartDialog = (Button) findViewById(R.id.btn_start_dialog);

        // Set Listeners
        mButtonActivityB.setOnClickListener(this);
        mButtonActivityC.setOnClickListener(this);
        mButtonFinishActivityA.setOnClickListener(this);
        mButtonStartDialog.setOnClickListener(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    public void startDialog() {
        Intent intent = new Intent(ActivityA.this, DialogActivity.class);
        startActivity(intent);
    }

    public void startActivityB() {
        Intent intent = new Intent(ActivityA.this, ActivityB.class);
        startActivity(intent);
    }

    public void startActivityC() {
        Intent intent = new Intent(ActivityA.this, ActivityC.class);
        startActivity(intent);
    }

    public void finishActivityA() {
        ActivityA.this.finish();
    }

    @Override
    public void onClick(View v) {
        if (v == mButtonActivityB) {
            startActivityB();
        } else if (v == mButtonActivityC) {
            startActivityC();
        } else if (v == mButtonFinishActivityA) {
            finishActivityA();
        } else if (v == mButtonStartDialog) {
            startDialog();
        }
    }
}
