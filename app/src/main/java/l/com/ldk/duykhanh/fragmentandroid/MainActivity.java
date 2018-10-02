package l.com.ldk.duykhanh.fragmentandroid;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View .OnClickListener{

    Fragment  fragment = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public void onClick(View view) {
switch(view.getId()){
    case R.id.btnFragment1:
        fragment = new FragmentOne();
        loadFragment(fragment);
        break;
    case R.id.btnFragment2:
        fragment = new FragmentTwo();
        loadFragment(fragment);
        break;
}
    }

    private void loadFragment(Fragment fragment){
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.fragment, fragment);
        transaction.commit();
    }
}
