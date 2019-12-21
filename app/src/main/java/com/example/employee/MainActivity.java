package com.example.employee;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2,e3,e4,e5,e6,e7;
    Button button;
    String emp,desig,sal,pla,comp,mail,mob;
    Employ employ;
    String e,d,s,p,c,m,mo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1=(EditText)findViewById(R.id.empname);
        e2=(EditText)findViewById(R.id.designation);
        e3=(EditText)findViewById(R.id.salary);
        e4=(EditText)findViewById(R.id.place);
        e5=(EditText)findViewById(R.id.compname);
        e6=(EditText)findViewById(R.id.emailid);
        e7=(EditText)findViewById(R.id.mobile);
        button=(Button)findViewById(R.id.submit);
        employ=new Employ();


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                emp=e1.getText().toString();
                desig=e2.getText().toString();
                sal=e3.getText().toString();
                pla=e4.getText().toString();
                comp=e5.getText().toString();
                mail=e6.getText().toString();
                mob=e7.getText().toString();

                employ.setEemp(emp);
                employ.setEdesig(desig);
                employ.setEsal(sal);
                employ.setEpla(pla);
                employ.setEcomp(comp);
                employ.setEemail(mail);
                employ.setEmob(mob);
                e=employ.getEemp();
                d=employ.getEdesig();
                s=employ.getEsal();


                Toast.makeText(getApplicationContext(),e+d+s,Toast.LENGTH_LONG).show();

            }
        });

    }
}
