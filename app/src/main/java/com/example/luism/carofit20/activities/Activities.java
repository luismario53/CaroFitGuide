package com.example.luism.carofit20.activities;

import android.os.Bundle;
import com.google.android.material.navigation.NavigationView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.appcompat.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.widget.SearchView;
import android.widget.SearchView.OnQueryTextListener;
import android.widget.TextView;

import com.example.luism.carofit20.R;
import com.example.luism.carofit20.adapters.MyAdapter;
import com.example.luism.carofit20.models.Alimento;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Activities extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener ,OnQueryTextListener {

    public List<Alimento> foodList = new ArrayList<>();;
    public List<Alimento> auxList = new ArrayList<>();;
    public List<Alimento> fruitList = new ArrayList<>();;
    public List<Alimento> proteinList = new ArrayList<>();;
    public List<Alimento> vegetableList = new ArrayList<>();;
    public List<Alimento> oilList = new ArrayList<>();;
    public List<Alimento> freeList = new ArrayList<>();;
    public List<Alimento> cerealList = new ArrayList<>();;
    public List<Alimento> legumeList = new ArrayList<>();;


    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    MyAdapter adapter;
    TextView textViewInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activities);
        Bundle bundle = getIntent().getExtras();
        textViewInfo = findViewById(R.id.textViewInfo);
        if(bundle!=null) {
            this.foodList = (ArrayList) bundle.getSerializable("food");
            setList();
            switch (bundle.getString("key")) {
                case "cereal": {
                    setTitle("Cereales sin Grasa");
                    textViewInfo.setText(" Cereales aportan un promedio de: \n Carbohidratos = 15 gr \n Proteínas = 2 gr \n Grasa = 0 gr");
                    this.auxList = this.cerealList;
                    break;
                }
                case "proteina": {
                    setTitle("Proteínas");
                    textViewInfo.setText(" Proteínas aportan un promedio de: \n Carbohidratos = 0 gr \n Proteínas = 7 gr \n Grasa = 1 gr");
                    this.auxList = this.proteinList;
                    break;
                }
                case "fruta": {
                    setTitle("Frutas");
                    textViewInfo.setText(" Frutas aportan un promedio de: \n Carbohidratos = 15 gr \n Proteínas = 0 gr \n Grasa = 0 gr");
                    this.auxList = this.fruitList;
                    break;
                }
                case "verdura": {
                    setTitle("Verduras");
                    textViewInfo.setText("Las verduras en este reto las contamos como libre, la idea es promover su consumo. Se recomienda fresca, cocida, en smoothies, ensaladas o caldos. No olvides usarlas.");
                    this.auxList = this.vegetableList;
                    break;
                }
                case "libre": {
                    setTitle("Otros");
                    textViewInfo.setText("Los alimentos mencionados en esta lista en su mayoría son libres, pero recordando tener un limite estándar con la porción.");
                    this.auxList = this.freeList;
                    break;
                }
                case "leguminosa": {
                    setTitle("Leguminosas");
                    textViewInfo.setText(" Leguminosas aportan un promedio de: \n Carbohidratos = 20 gr \n Proteínas = 8 gr \n Grasa = 1 gr");
                    this.auxList = this.legumeList;
                    break;
                }
                case "aceite": {
                    setTitle("Aceites y Grasas");
                    textViewInfo.setText(" Aceites y grasas aportan un promedio de: \n Carbohidratos = 0 gr \n Proteínas = 3 gr \n Grasa = 5 gr");
                    this.auxList = this.oilList;
                    break;
                }
            }
        }


        recyclerView = findViewById(R.id.recyclerView);
        layoutManager = new LinearLayoutManager(getApplicationContext());
        adapter =  new MyAdapter(auxList,R.layout.recycler_view);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);


        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer =  findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setItemIconTintList(null);
        navigationView.setNavigationItemSelectedListener(this);

        final SearchView searchView = findViewById(R.id.searchView);
        searchView.setOnQueryTextListener(this);
        searchView.setOnQueryTextFocusChangeListener(new OnFocusChangeListener() {
            public void onFocusChange(View view, boolean z) {
                if (!z) {
                    searchView.setIconified(true);
                }
            }
        });

        searchView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                searchView.setIconified(false);
            }
        });

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    private List<Alimento> filteredListFood(List<Alimento> list, String str) {
        ArrayList arrayList = new ArrayList();
        try {
            String toLowerCase = str.toLowerCase();
            if (toLowerCase.isEmpty()) {
                return this.auxList;
            }
            for (int i = 0; i < list.size(); i++) {
                if (((Alimento) list.get(i)).getNombre().toLowerCase().startsWith(toLowerCase) || ((Alimento) list.get(i)).getNombre().toLowerCase().contains(toLowerCase)) {
                    arrayList.add(list.get(i));
                }
            }
            return arrayList;
        } catch (Exception e) {
            return arrayList;
        }
    }

    public boolean onQueryTextChange(String str) {
        try {
            adapter.setFilteredList(filteredListFood(auxList, str));
        } catch (Exception e) {
        }
        return true;
    }

    public boolean onQueryTextSubmit(String str) {
        return false;
    }


    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        if (id == R.id.nvCereal) {
            setTitle("Cereales sin Grasa");
            textViewInfo.setText(" Cereales aportan un promedio de: \n Carbohidratos = 15 gr \n Proteínas = 2 gr \n Grasa = 0 gr");
            adapter.setFilteredList(cerealList);
            pickFood(cerealList);
        } else if (id == R.id.nvFree) {
            setTitle("Otros");
            textViewInfo.setText("Los alimentos mencionados en esta lista en su mayoría son libres, pero recordando tener un limite estándar con la porción.");
            adapter.setFilteredList(freeList);
            pickFood(freeList);
        } else if (id == R.id.nvFruit) {
            setTitle("Frutas");
            textViewInfo.setText(" Frutas aportan un promedio de: \n Carbohidratos = 15 gr \n Proteínas = 0 gr \n Grasa = 0 gr");
            adapter.setFilteredList(fruitList);
            pickFood(fruitList);
        } else if (id == R.id.nvLegume) {
            setTitle("Leguminosas");
            textViewInfo.setText(" Leguminosas aportan un promedio de: \n Carbohidratos = 20 gr \n Proteínas = 8 gr \n Grasa = 1 gr");
            adapter.setFilteredList(legumeList);
            pickFood(legumeList);
        } else if (id == R.id.nvOil) {
            setTitle("Aceites y Grasas");
            textViewInfo.setText(" Aceites y grasas aportan un promedio de: \n Carbohidratos = 0 gr \n Proteínas = 3 gr \n Grasa = 5 gr");
            adapter.setFilteredList(oilList);
            pickFood(oilList);
        } else if (id == R.id.nvProtein) {
            setTitle("Proteínas");
            textViewInfo.setText(" Proteínas aportan un promedio de: \n Carbohidratos = 0 gr \n Proteínas = 7 gr \n Grasa = 1 gr");
            adapter.setFilteredList(proteinList);
            pickFood(proteinList);
        } else if (id == R.id.nvVegetable) {
            setTitle("Verduras");
            textViewInfo.setText("Las verduras en este reto las contamos como libre, la idea es promover su consumo. Se recomienda fresca, cocida, en smoothies, ensaladas o caldos. No olvides usarlas.");
            adapter.setFilteredList(vegetableList);
            pickFood(vegetableList);
        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void pickFood(List<Alimento> foodList){

        this.auxList = foodList;
    }

    public void setList(){
        for(int i=0;i<foodList.size();i++){
            if(foodList.get(i).getTipo().equals("Cereal")){
                this.cerealList.add(this.foodList.get(i));
            }else if(foodList.get(i).getTipo().equals("Proteina")){
                this.proteinList.add(this.foodList.get(i));
            }else if(foodList.get(i).getTipo().equals("Verdura")){
                this.vegetableList.add(this.foodList.get(i));
            }else if(foodList.get(i).getTipo().equals("Otros")){
                this.freeList.add(this.foodList.get(i));
            }else if(foodList.get(i).getTipo().equals("Grasa")){
                this.oilList.add(this.foodList.get(i));
            }else if(foodList.get(i).getTipo().equals("Fruta")){
                this.fruitList.add(this.foodList.get(i));
            }else if(foodList.get(i).getTipo().equals("Leguminosa")){
                this.legumeList.add(this.foodList.get(i));
            }
        }
        Collections.sort(cerealList, new Comparator<Alimento>() {
            public int compare(Alimento obj1, Alimento obj2) {
                return obj1.getNombre().compareTo(obj2.getNombre());
            }
        });

        Collections.sort(proteinList, new Comparator<Alimento>() {
            public int compare(Alimento obj1, Alimento obj2) {
                return obj1.getNombre().compareTo(obj2.getNombre());
            }
        });

        Collections.sort(fruitList, new Comparator<Alimento>() {
            public int compare(Alimento obj1, Alimento obj2) {
                return obj1.getNombre().compareTo(obj2.getNombre());
            }
        });

        Collections.sort(freeList, new Comparator<Alimento>() {
            public int compare(Alimento obj1, Alimento obj2) {
                return obj1.getNombre().compareTo(obj2.getNombre());
            }
        });

        Collections.sort(vegetableList, new Comparator<Alimento>() {
            public int compare(Alimento obj1, Alimento obj2) {
                return obj1.getNombre().compareTo(obj2.getNombre());
            }
        });

        Collections.sort(oilList, new Comparator<Alimento>() {
            public int compare(Alimento obj1, Alimento obj2) {
                return obj1.getNombre().compareTo(obj2.getNombre());
            }
        });

        Collections.sort(legumeList, new Comparator<Alimento>() {
            public int compare(Alimento obj1, Alimento obj2) {
                return obj1.getNombre().compareTo(obj2.getNombre());
            }
        });
    }
}
