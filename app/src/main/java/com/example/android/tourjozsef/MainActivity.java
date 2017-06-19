package com.example.android.tourjozsef;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

/**
 * Guide app for businessmen seeking investment opportunities in Budapest's 8th district.
 * Show information on empty building lots, closed shops/pubs and attractions.
 * Tha app has four Fragments (corresponding to the four types of information)--accessible from
 * the navigation drawer--shown in a FrameLayout (content_main.xml)
 */
public class MainActivity extends AppCompatActivity {

    private DrawerLayout mDrawer;
    private Toolbar mToolbar;
    private NavigationView mNavDrawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);

        // set the first fragment
        // Source: http://chrisrisner.com/Using-Fragments-with-the-Navigation-Drawer-Activity
        Fragment fragment = null;
        Class fragmentClass = HomeFragment.class;
        try {
            fragment = (Fragment) fragmentClass.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.frameLayout, fragment).commit();


        mDrawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, mDrawer, mToolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        mDrawer.setDrawerListener(toggle);
        toggle.syncState();

        mNavDrawer = (NavigationView) findViewById(R.id.nav_view);
        mNavDrawer.setNavigationItemSelectedListener(navigationItemSelectedListener);
    }

    /**
     * Implements NavigationView.OnNavigationItemSelectedListener
     * When a menu item in NavigationView (activity_main.xml) is clicked, a corresponding fragment
     * is shown.
     */
    NavigationView.OnNavigationItemSelectedListener navigationItemSelectedListener =
            new NavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            int id = item.getItemId();

            // Replaces Fragments in the frameLayout (found in content_main.xml)
            // source: http://yasirameen.com/2016/07/android-fragments-navigation-drawer/
            if (id == R.id.nav_building_sites) {
                BuildingSitesFragment buildingSitesFragment = new BuildingSitesFragment();
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frameLayout, buildingSitesFragment)
                        .addToBackStack(null)
                        .commit();

            } else if (id == R.id.nav_shops) {
                KiosksFragment kiosksFragment = new KiosksFragment();
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frameLayout, kiosksFragment)
                        .addToBackStack(null)
                        .commit();

            } else if (id == R.id.nav_pubs) {
                DivesFragment divesFragment = new DivesFragment();
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frameLayout, divesFragment)
                        .addToBackStack(null)
                        .commit();

            } else if (id == R.id.nav_attractions) {
                AttractionsFragment attractionsFragment = new AttractionsFragment();
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frameLayout, attractionsFragment)
                        .addToBackStack(null)
                        .commit();

            }

            // Set action bar title
            // Source: http://guides.codepath.com/android/fragment-navigation-drawer
            setTitle(item.getTitle());

            mDrawer.closeDrawer(GravityCompat.START);
            return true;
        }
    };

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
