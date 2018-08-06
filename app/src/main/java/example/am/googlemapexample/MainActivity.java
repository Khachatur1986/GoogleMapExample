package example.am.googlemapexample;

import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

/**
 * https://developers.google.com/maps/documentation/android-sdk/signup
 * https://www.tutorialspoint.com/android/android_google_maps.htm
 * https://www.youtube.com/watch?v=urLA8z6-l3k
 * https://www.codeofaninja.com/2017/02/create-simple-rest-api-in-php.html
 */

/**
 * key = AIzaSyD1ypfnjzJW3M2zix5L0PUXnx7fsGvX_4o
 */
public class MainActivity extends FragmentActivity implements OnMapReadyCallback{

    GoogleMap mMap ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap  = googleMap;

        // Add a marker in Sydney, Australia, and move the camera.
        LatLng sydney = new LatLng(-34, 151);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
    }
}
