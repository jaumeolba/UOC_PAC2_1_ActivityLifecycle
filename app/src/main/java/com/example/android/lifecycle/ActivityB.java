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
public class ActivityB extends Activity {

    private Button mButtonActivityA;
    private Button mButtonActivityC;
    private Button mButtonFinishActivityB;
    private Button mButtonStartDialog;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        // Set views
        mButtonActivityA = (Button) findViewById(R.id.btn_start_a);
        mButtonActivityC = (Button) findViewById(R.id.btn_start_c);
        mButtonFinishActivityB = (Button) findViewById(R.id.btn_finish_b);
        mButtonStartDialog = (Button) findViewById(R.id.btn_start_dialog);

        // Set Listeners
        mButtonActivityA.setOnClickListener(startActivityAListener);
        mButtonActivityC.setOnClickListener(startActivityCListener);
        mButtonFinishActivityB.setOnClickListener(finishActivityBListener);
        mButtonStartDialog.setOnClickListener(startDialogListener);
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
        Intent intent = new Intent(ActivityB.this, DialogActivity.class);
        startActivity(intent);
    }

    public void startActivityA() {
        Intent intent = new Intent(ActivityB.this, ActivityA.class);
        startActivity(intent);
    }

    public void startActivityC() {
        Intent intent = new Intent(ActivityB.this, ActivityC.class);
        startActivity(intent);
    }

    public void finishActivityB() {
        ActivityB.this.finish();
    }

    // Listeners
    private View.OnClickListener startActivityAListener = new View.OnClickListener() {
        public void onClick(View v) {
            // do something when the button is clicked
            startActivityA();
        }
    };

    private View.OnClickListener startActivityCListener = new View.OnClickListener() {
        public void onClick(View v) {
            // do something when the button is clicked
            startActivityC();
        }
    };

    private View.OnClickListener finishActivityBListener = new View.OnClickListener() {
        public void onClick(View v) {
            // do something when the button is clicked
            finishActivityB();
        }
    };

    private View.OnClickListener startDialogListener = new View.OnClickListener() {
        public void onClick(View v) {
            // do something when the button is clicked
            startDialog();
        }
    };
}
