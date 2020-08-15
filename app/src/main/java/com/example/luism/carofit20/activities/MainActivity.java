package com.example.luism.carofit20.activities;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.example.luism.carofit20.R;
import com.example.luism.carofit20.models.Alimento;
import com.squareup.picasso.Picasso;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity{

    public List<Alimento> foodList = new ArrayList<>();


    ImageView buttonCereal;
    ImageView buttonFree;
    ImageView buttonOil;
    ImageView buttonFruit;
    ImageView buttonLegume;
    ImageView buttonVegetable;
    ImageView buttonProtein;
    ImageView imageViewBackground2;
    ImageView imageViewFront;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        imageViewBackground2 = findViewById(R.id.imageViewBackground);
        imageViewFront = findViewById(R.id.imageViewTitle);
        buttonCereal = findViewById(R.id.imageViewCereal);
        buttonProtein = findViewById(R.id.imageViewProteina);
        buttonFruit = findViewById(R.id.imageViewFruta);
        buttonFree = findViewById(R.id.imageViewLibre);
        buttonVegetable = findViewById(R.id.imageViewVerdura);
        buttonOil = findViewById(R.id.imageViewAceite);
        buttonLegume = findViewById(R.id.imageViewLeguminosa);

        Picasso.get().load(R.drawable.fondo_segunda_pagina).fit().into(imageViewBackground2);
        Picasso.get().load(R.drawable.logo_superior).fit().into(imageViewFront);

        buttonCereal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Activities.class);
                intent.putExtra("food", (Serializable) foodList);
                intent.putExtra("key","cereal");
                startActivity(intent);
            }
        });

        buttonProtein.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Activities.class);
                intent.putExtra("food", (Serializable) foodList);
                intent.putExtra("key","proteina");
                startActivity(intent);
            }
        });

        buttonFruit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Activities.class);
                intent.putExtra("food", (Serializable) foodList);
                intent.putExtra("key","fruta");
                startActivity(intent);
            }
        });

        buttonFree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Activities.class);
                intent.putExtra("food", (Serializable) foodList);
                intent.putExtra("key","libre");
                startActivity(intent);
            }
        });

        buttonVegetable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Activities.class);
                intent.putExtra("food", (Serializable) foodList);
                intent.putExtra("key","verdura");
                startActivity(intent);
            }
        });

        buttonOil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Activities.class);
                intent.putExtra("food", (Serializable) foodList);
                intent.putExtra("key","aceite");
                startActivity(intent);
            }
        });

        buttonLegume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Activities.class);
                intent.putExtra("food", (Serializable) foodList);
                intent.putExtra("key","leguminosa");
                startActivity(intent);
            }
        });

        addFood();



    }

    public void addFood(){
        foodList.add(new Alimento("Cereal","Amaranto tostado","1/4 tz","16 gramos"));
        foodList.add(new Alimento("Cereal","Arroz cocido","1/4 tz","47 gramos"));
        foodList.add(new Alimento("Cereal","Arroz inflado natural","1/2 tz","20 gramos"));
        foodList.add(new Alimento("Cereal","Arroz crudo","20 gramos","20 gramos"));
        foodList.add(new Alimento("Cereal","Avena cocida en agua","1/2 tz","120 gramos"));
        foodList.add(new Alimento("Cereal","Avena en hojuelas cruda","1/4 tz","20 gramos"));
        foodList.add(new Alimento("Cereal","Camote cocido","1/3 tz","70 gramos"));
        foodList.add(new Alimento("Cereal","Cuscus cocido","1/3 tz","50 gramos"));
        foodList.add(new Alimento("Cereal","Elote blanco cocido","1/2 tz","82 gramos"));
        foodList.add(new Alimento("Cereal","Espaguetti integral cocido","1/3 tz","46 gramos"));

        foodList.add(new Alimento("Cereal","Elote amarillo enlatado","1/3 tz","82 gramos"));
        foodList.add(new Alimento("Cereal","Galleta habanera","4 pz","18 gramos"));
        foodList.add(new Alimento("Cereal","Galleta saladita","3 pz","16 gramos"));
        foodList.add(new Alimento("Cereal","Granola sin azúcar","3 C","18 gramos"));
        foodList.add(new Alimento("Cereal","Harina de arroz","2 C","18 gramos"));
        foodList.add(new Alimento("Cereal","Harina de amaranto","2 C","19 gramos"));
        foodList.add(new Alimento("Cereal","Harina de avena","1/5 tz","20 gramos"));
        foodList.add(new Alimento("Cereal","Harina de papa","2 C","20 gramos"));
        foodList.add(new Alimento("Cereal","Harina de trigo integral","2 1/2 C","20 gramos"));
        foodList.add(new Alimento("Cereal","Harina de maíz nixtamalizada","2 1/2 C","20 gramos"));

        foodList.add(new Alimento("Cereal","Galletas maria","3 pz","20 gramos"));
        foodList.add(new Alimento("Cereal","Masa de maíz blanco","45 gr","45 gramos"));
        foodList.add(new Alimento("Cereal","Maíz pozolero cocido","1/3 tz","54 gramos"));
        foodList.add(new Alimento("Cereal","Maíz blanco cocido","25 gr","25 gramos"));
        foodList.add(new Alimento("Cereal","Maicena","2 C","16 gramos"));
        foodList.add(new Alimento("Cereal","Nixtamal crudo","45 gr","45 gramos"));
        foodList.add(new Alimento("Cereal","Nixtamal cocido","90 gr","90 gramos"));
        foodList.add(new Alimento("Cereal","Palomitas infladas sin grasa","2 tz","15 gramos"));
        foodList.add(new Alimento("Cereal","Pan bagel integral","1/3 pz","25 gramos"));
        foodList.add(new Alimento("Cereal","Pan birote","1/3 pz","20 gramos"));

        foodList.add(new Alimento("Cereal","Pan tostado","1 pz","25 gramos"));
        foodList.add(new Alimento("Cereal","Pan árabe","1/2 pz","20 gramos"));
        foodList.add(new Alimento("Cereal","Pan centeno","3/4 pz","25 gramos"));
        foodList.add(new Alimento("Cereal","Pan integral Bimbo","1 pz ","25 gramos"));
        foodList.add(new Alimento("Cereal","´Pan cero cero Bimbo","1 pz","25 gramos"));
        foodList.add(new Alimento("Cereal","Pan Ezequiel","1 pz ","34 gramos"));
        foodList.add(new Alimento("Cereal","Pan pita taquero","1/2 pz","20 gramos"));
        foodList.add(new Alimento("Cereal","Pan pita integral Castaño","3/4 pz","30 gramos"));
        foodList.add(new Alimento("Cereal","Pan pita Libanius","1/3 pz","20 gramos"));
        foodList.add(new Alimento("Cereal","Pan Thins","1 1/2 pz","30 gramos"));

        foodList.add(new Alimento("Cereal","Pan multigrain Oroweat","3/4 pz","30 gramos"));
        foodList.add(new Alimento("Cereal","Papa cocida","1/2 pz","70 gramos"));
        foodList.add(new Alimento("Cereal","Pasta cruda","20 gr","20 gramos"));
        foodList.add(new Alimento("Cereal","Pasta cocida","1/3 tz","50 gramos"));
        foodList.add(new Alimento("Cereal","Puré de camote natural","1/4 tz","60 gramos"));
        foodList.add(new Alimento("Cereal","Quinoa cocida","1/2 tz","80 gramos"));
        foodList.add(new Alimento("Cereal","Rice cake","2 pz","15 gramos"));
        foodList.add(new Alimento("Cereal","Salmas Sanissimo","3 pz","18 gr"));
        foodList.add(new Alimento("Cereal","Salvado de maíz","6 C","30 gramos"));
        foodList.add(new Alimento("Cereal","Salvado de trigo","6 C","30 gramos"));

        foodList.add(new Alimento("Cereal","Tapioca","1/4 tz","20 gramos"));
        foodList.add(new Alimento("Cereal","Tortilla maíz","1 pz","20 gr"));
        foodList.add(new Alimento("Cereal","Tortillas delgaditas Torti-regias","3 pz ","33 gramos"));
        foodList.add(new Alimento("Cereal","Tortillas nopal Azteca","1 pz","22 gramos"));
        foodList.add(new Alimento("Cereal","Tortillas de avena integral","2 pz","-"));
        foodList.add(new Alimento("Cereal","Tortillas artesanales AVESANAS","2 pz","-"));
        foodList.add(new Alimento("Cereal","Tortillas Tomatillas","2 pz","-"));
        foodList.add(new Alimento("Cereal","Tortillas de Amaranto Rafita","1 ½ pz","28 gramos"));
        foodList.add(new Alimento("Cereal","Tortillas Susalia","1 y ½ pz","37.5 gramos"));
        foodList.add(new Alimento("Cereal","Tortillas nopal Nopalia","2 pz","25 gramos"));

        foodList.add(new Alimento("Cereal","Tostada nopal Sr. Cactus","3 pz","36 gramos"));
        foodList.add(new Alimento("Cereal","Tortilla Sr. Cactus","1 pz","25 gramos"));
        foodList.add(new Alimento("Cereal","Tostada de maíz y nopal Nopalia","1 pz","11 gramos"));
        foodList.add(new Alimento("Cereal","Tostada nopal Susalia","2 pz","24 gramos"));
        foodList.add(new Alimento("Cereal","Tostada horneada Sanissimo","1 pz","12 gramos"));
        foodList.add(new Alimento("Cereal","Totopos horneados Nopalia","18 pz","22 gramos"));
        foodList.add(new Alimento("Cereal","Totopos horneados Susalia","12 pz","24 gramos"));
        foodList.add(new Alimento("Cereal","Yuca","1/4 pz","88 gramos"));
        foodList.add(new Alimento("Cereal","Arepa integral","1/4 pz","20 gramos"));
        foodList.add(new Alimento("Cereal","Choclo cocido","1/2 tz","50 gramos"));

        foodList.add(new Alimento("Cereal","Galletas de maíz inflado","2 pz","15 gramos"));
        foodList.add(new Alimento("Cereal","Fideos de arroz secos","20 gr","20 gramos"));
        foodList.add(new Alimento("Cereal","Fideos de arroz cocido","1/3 tz","60 gramos"));
        foodList.add(new Alimento("Cereal","Fideos cocidos","1/3 tz","60 gramos"));
        foodList.add(new Alimento("Cereal","Galletas de soda","6 pz","20 gramos"));
        foodList.add(new Alimento("Cereal","Galletas de arroz inflado","2 pz","15 gramos"));
        foodList.add(new Alimento("Cereal","Galletas Gullon","3 pz","20 gramos"));
        foodList.add(new Alimento("Cereal","Kasha","1/4 tz","22 gramos"));
        foodList.add(new Alimento("Cereal","Maíz inflado","1/2 tz","18 gramos"));
        foodList.add(new Alimento("Cereal","Mijo cocido","1/3 tz","60 gramos"));

        foodList.add(new Alimento("Cereal","Muesli","3 C","18 gramos"));
        foodList.add(new Alimento("Cereal","Pan Funchs multigrano light","1 pz","25 gramos"));
        foodList.add(new Alimento("Cereal","Pan pita ideal integral light","1 pz","38 gramos"));
        foodList.add(new Alimento("Cereal","Pan molde integral light Castaño","2 pz","45 gramos"));
        foodList.add(new Alimento("Cereal","Granola Nutrisa","3 C","30 gramos"));
        foodList.add(new Alimento("Cereal","Pan marraqueta","1/4 pz","25 gramos"));
        foodList.add(new Alimento("Cereal","Pan molde ideal light","2 pz","45 gramos"));
        foodList.add(new Alimento("Cereal","Pan molde ideal","1 pz","25 gramos"));
        foodList.add(new Alimento("Cereal","Pan árabe integral","1/2 pz","20 gramos"));
        foodList.add(new Alimento("Cereal","Patata","100 gr","100 gramos"));

        foodList.add(new Alimento("Cereal","Trigo cocido","1/3 tz","80 gramos"));
        foodList.add(new Alimento("Cereal","Churritos de nopal","25 gr","25 gramos"));
        foodList.add(new Alimento("Cereal","Galletas tika","4 pz","20 gramos"));
        foodList.add(new Alimento("Cereal","Jicas horneadas","1 paquete ","-"));
        foodList.add(new Alimento("Cereal","TARO chips","1 paquete","120 gramos"));
        foodList.add(new Alimento("Cereal","ZANAZ chips","1/2 paquete","60 gramos"));
        foodList.add(new Alimento("Cereal","CAMOS chips","1/3 paquete","40 gramos"));
        foodList.add(new Alimento("Cereal","Banana chips vitali","25 gr","25 gramos"));
        foodList.add(new Alimento("Cereal","Churros de amaranto vitali","22 gr","22 gramos"));
        foodList.add(new Alimento("Cereal","Churros de amaranto con limón y sal vitali","22 gr ","22 gramos"));

        foodList.add(new Alimento("Cereal","Pita Crisp Libanius","22 gr","22 gramos"));
        foodList.add(new Alimento("Cereal","Totopos horneados Sanissimo","7 pz","20 gramos"));
        foodList.add(new Alimento("Cereal","Galletas de ajonjolí Breton","3 pz ","14 gramos"));
        foodList.add(new Alimento("Cereal","Pita chips Town House","5 pz","12 gramos"));
        foodList.add(new Alimento("Cereal","Pan de centeno","1 pz","24 gramos"));
        foodList.add(new Alimento("Cereal","Galletas de nopal horneadas Nopalia","4 pz ","22 gramos"));
        foodList.add(new Alimento("Cereal","Churritos de nopal Nopalia","20 gr ","20 gramos"));
        foodList.add(new Alimento("Cereal","Crisps Susalia","9 pz","54 gramos"));
        foodList.add(new Alimento("Cereal","Susalitas enchiladas Susalia","25 gr","25 gramos"));
        foodList.add(new Alimento("Cereal","Churrinopal Susalia","25 gr","25 gramos"));

        foodList.add(new Alimento("Cereal","Tortillas PanchoVilla","1 pz","25 gramos"));
        foodList.add(new Alimento("Cereal","Tortillas Rapiditas","1 pz ","25 gramos"));
        foodList.add(new Alimento("Cereal","Tostadas Noglut Santiveri","3 pz","15 gramos"));
        foodList.add(new Alimento("Cereal","Obleas Amarea","1 paquete ","60 gramos"));
        foodList.add(new Alimento("Cereal","Ligeritas de maíz","6 pz","18 gramos"));
        foodList.add(new Alimento("Cereal","Tortillas de nopal y linaza Nopalia","2 pz","25 gramos"));
        foodList.add(new Alimento("Cereal","Papel de arroz","2 pz","20 gramos"));
        foodList.add(new Alimento("Cereal","Horneadas baked tostadas Guerrero","1 1/2 pz","18 gramos"));
        foodList.add(new Alimento("Cereal","Joseph's Lavash bread","3/4 pz","48 gramos"));
        foodList.add(new Alimento("Cereal","Chips de camote Cerzana","1 paquete","60 gramos"));

        foodList.add(new Alimento("Cereal","Chips de betabel Cerzana","1 paquete ","60 gramos"));
        foodList.add(new Alimento("Cereal","Chips de jicama Cerzana","1 paquete ","55 gramos"));
        foodList.add(new Alimento("Cereal","Chips de Taro Cerzana","1 paquete","60 gramos"));
        foodList.add(new Alimento("Cereal","Granola sin azúcar En Linea","3 C","30 gramos"));

        foodList.add(new Alimento("Leguminosa","Alubia cocida","1/2 tz","90 gramos"));
        foodList.add(new Alimento("Leguminosa","Chícharo cocido","1/2 tz","100 gramos"));
        foodList.add(new Alimento("Leguminosa","Ejotes","1 1/2 tz","300 gramos"));
        foodList.add(new Alimento("Leguminosa","Edamames","3/4 tz","120 gramos"));
        foodList.add(new Alimento("Leguminosa","Frijoles naturales aplastados","1/3 tz","75 gramos"));
        foodList.add(new Alimento("Leguminosa","Frijol entero cocido","1/2 tz","85 gramos"));
        foodList.add(new Alimento("Leguminosa","Garbanzo cocido","1/2 tz","85 gramos"));
        foodList.add(new Alimento("Leguminosa","Haba cruda","1/4 tz","40 gramos"));
        foodList.add(new Alimento("Leguminosa","Haba cocida","1/2 tz","85 gramos"));
        foodList.add(new Alimento("Leguminosa","Hummus","3 C","75 gramos"));

        foodList.add(new Alimento("Leguminosa","Lenteja cocida","1/2 tz","100 gramos"));
        foodList.add(new Alimento("Leguminosa","Proteína de soya","20 gr","20 gramos"));
        foodList.add(new Alimento("Leguminosa","Soya texturizada","30 gr","30 gramos"));
        foodList.add(new Alimento("Leguminosa","Soya cocida","1/3 tz","60 gramos"));
        foodList.add(new Alimento("Leguminosa","Harina de garbanzo","25 gr","25 gramos"));
        foodList.add(new Alimento("Leguminosa","Porotos enteros cocidos","1/2 tz","85 gramos"));
        foodList.add(new Alimento("Leguminosa","Tempeh","40 gr","40 gramos"));
        foodList.add(new Alimento("Leguminosa","Judías verdes","1 1/2 tz","300 gramos"));

        foodList.add(new Alimento("Verdura","Acelga","Libre","-"));
        foodList.add(new Alimento("Verdura","Ajo","Libre","-"));
        foodList.add(new Alimento("Verdura","Alcachofas","Libre","-"));
        foodList.add(new Alimento("Verdura","Alfalfa","Libre","-"));
        foodList.add(new Alimento("Verdura","Apio","Libre","-"));
        foodList.add(new Alimento("Verdura","Berenjena","Libre","-"));
        foodList.add(new Alimento("Verdura","Brócoli","Libre","-"));
        foodList.add(new Alimento("Verdura","Calabaza italiana","Libre","-"));
        foodList.add(new Alimento("Verdura","Calabaza de Castilla","Libre","-"));
        foodList.add(new Alimento("Verdura","Cebollín","Libre","-"));

        foodList.add(new Alimento("Verdura","Cebolla","Libre","-"));
        foodList.add(new Alimento("Verdura","Champiñon","Libre","-"));
        foodList.add(new Alimento("Verdura","Chayote","Libre","-"));
        foodList.add(new Alimento("Verdura","Cilantro","Libre","-"));
        foodList.add(new Alimento("Verdura","Chile","Libre","-"));
        foodList.add(new Alimento("Verdura","Chile habanero","Libre","-"));
        foodList.add(new Alimento("Verdura","Chile jalapeño","Libre","-"));
        foodList.add(new Alimento("Verdura","Chile poblano","Libre","-"));
        foodList.add(new Alimento("Verdura","Chile de árbol","Libre","-"));
        foodList.add(new Alimento("Verdura","Cilantro","Libre","-"));

        foodList.add(new Alimento("Verdura","Col de bruselas","Libre","-"));
        foodList.add(new Alimento("Verdura","Col rizada","Libre","-"));
        foodList.add(new Alimento("Verdura","Coliflor","Libre","-"));
        foodList.add(new Alimento("Verdura","Escarola","Libre","-"));
        foodList.add(new Alimento("Verdura","Espinacas","Libre","-"));
        foodList.add(new Alimento("Verdura","Espárragos","Libre","-"));
        foodList.add(new Alimento("Verdura","Germinado de alfalfa","Libre","-"));
        foodList.add(new Alimento("Verdura","Hinojo","Libre","-"));
        foodList.add(new Alimento("Verdura","Jitomate","Libre","-"));
        foodList.add(new Alimento("Verdura","Jícama","Libre","-"));

        foodList.add(new Alimento("Verdura","Kale","Libre","-"));
        foodList.add(new Alimento("Verdura","Lechuga orejona","Libre","-"));
        foodList.add(new Alimento("Verdura","Lechuga romana","Libre","-"));
        foodList.add(new Alimento("Verdura","Limón","Libre","-"));
        foodList.add(new Alimento("Verdura","Nopal","Libre","-"));
        foodList.add(new Alimento("Verdura","Palmito","Libre","-"));
        foodList.add(new Alimento("Verdura","Pepinillos","Libre","-"));
        foodList.add(new Alimento("Verdura","Puerros","Libre","-"));
        foodList.add(new Alimento("Verdura","Pimiento morrón","Libre","-"));
        foodList.add(new Alimento("Verdura","Repollo","Libre","-"));

        foodList.add(new Alimento("Verdura","Rúcula","Libre","-"));
        foodList.add(new Alimento("Verdura","Romeritos","Libre","-"));
        foodList.add(new Alimento("Verdura","Rábano","Libre","-"));
        foodList.add(new Alimento("Verdura","Setas","Libre","-"));
        foodList.add(new Alimento("Verdura","Tomatito cherry","Libre","-"));
        foodList.add(new Alimento("Verdura","Tomate","Libre","-"));
        foodList.add(new Alimento("Verdura","Verdolagas","Libre","-"));
        foodList.add(new Alimento("Verdura","Zanahoria","Libre","-"));
        foodList.add(new Alimento("Verdura","Zapallito italiano","Libre","-"));

        foodList.add(new Alimento("Fruta","Agua de coco","1 1/2 tz","360 gramos"));
        foodList.add(new Alimento("Fruta","Arándanos deshidratados","1/5 tz","15 gramos"));
        foodList.add(new Alimento("Fruta","Arándanos frescos","1 tz","110 gramos"));
        foodList.add(new Alimento("Fruta","Betabel","1/2 pz","80 gramos"));
        foodList.add(new Alimento("Fruta","Cereza fresca","20 pz","88 gramos"));
        foodList.add(new Alimento("Fruta","Chabacano","4 pz","130 gramos"));
        foodList.add(new Alimento("Fruta","Chirimoya","1/3 tz","60 gramos"));
        foodList.add(new Alimento("Fruta","Ciruela morada","3 pz","150 gramos"));
        foodList.add(new Alimento("Fruta","Ciruela pasa deshuesada","3 pz","60 gramos"));
        foodList.add(new Alimento("Fruta","Ciruelitas rojas","7 pz","75 gramos"));
        foodList.add(new Alimento("Fruta","Ciruelitas amarillas","7 pz","75 gramos"));

        foodList.add(new Alimento("Fruta","Durazno amarillo","2 pz","150 gramos"));
        foodList.add(new Alimento("Fruta","Dátil","3 pz","25 gramos"));
        foodList.add(new Alimento("Fruta","Frambuesa","1 tz","120 gramos"));
        foodList.add(new Alimento("Fruta","Fresa","1 tz","200 gramos"));
        foodList.add(new Alimento("Fruta","Granada china","2 pz","68 gramos"));
        foodList.add(new Alimento("Fruta","Granada roja","1 tz","88 gramos"));
        foodList.add(new Alimento("Fruta","Guanábana","1 pz","230 gramos"));
        foodList.add(new Alimento("Fruta","Guayaba","3 pz","120 gramos"));
        foodList.add(new Alimento("Fruta","Higo","2 pz","70 gramos"));
        foodList.add(new Alimento("Fruta","Kiwi","2 pz","110 gramos"));

        foodList.add(new Alimento("Fruta","Lichis","1 tz","90 gramos"));
        foodList.add(new Alimento("Fruta","Mamey","1/3 pz","85 gramos"));
        foodList.add(new Alimento("Fruta","Mandarina","2 pz","130 gramos"));
        foodList.add(new Alimento("Fruta","Mango","3/4 pz","140 gramos"));
        foodList.add(new Alimento("Fruta","Manzana roja","1 pz","120 gramos"));
        foodList.add(new Alimento("Fruta","Manzana verde","1 pz","120 gramos"));
        foodList.add(new Alimento("Fruta","Maracuyá","3 pz","60 gramos"));
        foodList.add(new Alimento("Fruta","Melón","3/4 pz","140 gramos"));
        foodList.add(new Alimento("Fruta","Naranja","1 pz","160 gramos"));
        foodList.add(new Alimento("Fruta","Nectarina","3/4 pz","140 gramos"));

        foodList.add(new Alimento("Fruta","Agua de coco","1 pz","124 gramos"));
        foodList.add(new Alimento("Fruta","Níspero","8 pz","140 gramos"));
        foodList.add(new Alimento("Fruta","Papaya","1 tz","140 gramos"));
        foodList.add(new Alimento("Fruta","Pasitas secas","10 pz","20 gramos"));
        foodList.add(new Alimento("Fruta","Pera","1 pz","80 gramos"));
        foodList.add(new Alimento("Fruta","Perón","1 pz","100 gramos"));
        foodList.add(new Alimento("Fruta","Piña","3/4 tz","120 gramos"));
        foodList.add(new Alimento("Fruta","Plátano dominico","3 pz","60 gramos"));
        foodList.add(new Alimento("Fruta","Plátano macho","1/4 pz","50 gramos"));
        foodList.add(new Alimento("Fruta","Pulpa de tamarindo","8 C","100 gramos"));

        foodList.add(new Alimento("Fruta","Sandía","1 tz","160 gramos"));
        foodList.add(new Alimento("Fruta","Tangerina","2 pz","130 gramos"));
        foodList.add(new Alimento("Fruta","Toronja","1 pz","160 gramos"));
        foodList.add(new Alimento("Fruta","Tuna","2 pz","130 gramos"));
        foodList.add(new Alimento("Fruta","Uva con semilla","1 tz","114 gramos"));
        foodList.add(new Alimento("Fruta","Uva sin semilla","1 tz","90 gramos"));
        foodList.add(new Alimento("Fruta","Zapote negro","1/2 tz","90 gramos"));
        foodList.add(new Alimento("Fruta","Zarzamora","1 tz","140 gramos"));
        foodList.add(new Alimento("Fruta","Banana","1/2 pz","60 gramos"));
        foodList.add(new Alimento("Fruta","Banano","1/2 tz","60 gramos"));

        foodList.add(new Alimento("Fruta","Ananá","3/4 tz","120 gramos"));
        foodList.add(new Alimento("Fruta","Caquis","1 pz","100 gramos"));
        foodList.add(new Alimento("Fruta","Moras","1 tz","140 gramos"));
        foodList.add(new Alimento("Fruta","Membrillo","1/2 pz","100 gramos"));
        foodList.add(new Alimento("Fruta","Pitahaya Sonorense","3 pz","110 gramos"));
        foodList.add(new Alimento("Fruta","Pitahaya","1 pz","60 gramos"));
        foodList.add(new Alimento("Fruta","Pomelo","1 pz","160 gramos"));
        foodList.add(new Alimento("Fruta","Tamarindo","50 gr","50 gramos"));
        foodList.add(new Alimento("Fruta","Uchuva","8 pz","120 gramos"));
        foodList.add(new Alimento("Fruta","Mermelada de fresa natural","2 C","25 gramos"));

        foodList.add(new Alimento("Fruta","Mermelada de zarzamora natural","2 C","25 gramos"));
        foodList.add(new Alimento("Fruta","Mermelada de frambuesa natural","2 C","25 gramos"));
        foodList.add(new Alimento("Fruta","Mermelada de durazno natural","2 C","25 gramos"));
        foodList.add(new Alimento("Fruta","Crudo","1 pz","160 gramos"));
        foodList.add(new Alimento("Fruta","Clementina","1 pz","130 gramos"));
        foodList.add(new Alimento("Fruta","Damascos","2 pz","150 gramos"));
        foodList.add(new Alimento("Fruta","Frutilla","1 tz","200 gramos"));
        foodList.add(new Alimento("Fruta","Huesillos","3 tz","24 gramos"));
        foodList.add(new Alimento("Fruta","Lechosa","1 tz","140 gramos"));
        foodList.add(new Alimento("Fruta","Lima","3 pz","140 gramos"));
        foodList.add(new Alimento("Fruta","Lúcuma","1 pz","60 gramos"));

        foodList.add(new Alimento("Otros","Agua natural","Libre","-"));
        foodList.add(new Alimento("Otros","Agua mineral","Libre","-"));
        foodList.add(new Alimento("Otros","Arroz de coliflor","Libre","-"));
        foodList.add(new Alimento("Otros","Café americano","2 tazas al día máximo","-"));
        foodList.add(new Alimento("Otros","Caldo natural de camarón","Libre","-"));
        foodList.add(new Alimento("Otros","Caldo natural de pollo","Libre","-"));
        foodList.add(new Alimento("Otros","Caldo natural de res desgrasado","Libre","-"));
        foodList.add(new Alimento("Otros","Caldo natural de vegetales","Libre","-"));
        foodList.add(new Alimento("Otros","Canela en polvo","Libre","-"));
        foodList.add(new Alimento("Otros","Chicles sin azúcar","Libre","-"));

        foodList.add(new Alimento("Otros","Chile en polvo bajo en sodio","2 cucharadas al día máximo","-"));
        foodList.add(new Alimento("Otros","Cacao en polvo sin azúcar, amargo","2 cucharadas al día máximo","-"));
        foodList.add(new Alimento("Otros","Curry","Libre","-"));
        foodList.add(new Alimento("Otros","Espaguetti de calabacin","Libre","-"));
        foodList.add(new Alimento("Otros","Especias","Libre","-"));
        foodList.add(new Alimento("Otros","Gelatina light","Libre","-"));
        foodList.add(new Alimento("Otros","Hierbas de olor","Libre","-"));
        foodList.add(new Alimento("Otros","Jamaica sin azúcar","Libre","-"));
        foodList.add(new Alimento("Otros","Leche de almendras o coco sin azúcar","2 tazas al día máximo","-"));
        foodList.add(new Alimento("Otros","Licuado de verduras","Libre","-"));

        foodList.add(new Alimento("Otros","Limón","Libre","-"));
        foodList.add(new Alimento("Otros","Limonada sin azúcar","Libre","-"));
        foodList.add(new Alimento("Otros","Miel maple jarabe sin azúcar","3 cucharadas al día máximo","-"));
        foodList.add(new Alimento("Otros","Mostaza","Libre","-"));
        foodList.add(new Alimento("Otros","Orégano","Libre","-"));
        foodList.add(new Alimento("Otros","Pimienta","Libre","-"));
        foodList.add(new Alimento("Otros","Puré de coliflor","Libre","-"));
        foodList.add(new Alimento("Otros","Salsa picante","3 cucharadas al día máximo","-"));
        foodList.add(new Alimento("Otros","Salsa inglesa","2 cucharadas al día máximo","-"));
        foodList.add(new Alimento("Otros","Salsa Tabasco","3 cucharadas al día máximo","-"));

        foodList.add(new Alimento("Otros","Splenda","2 sobres al día máximo","-"));
        foodList.add(new Alimento("Otros","Stevia 100% natural","Libre","-"));
        foodList.add(new Alimento("Otros","Té natural sin azúcar","Libre","-"));
        foodList.add(new Alimento("Otros","Vainilla","Libre","-"));
        foodList.add(new Alimento("Otros","Verduras","Libre","-"));
        foodList.add(new Alimento("Otros","Vinagre de arroz","Libre","-"));
        foodList.add(new Alimento("Otros","Vinagre balsámico","Libre","-"));
        foodList.add(new Alimento("Otros","Vinagre de manzana","Libre","-"));
        foodList.add(new Alimento("Otros","Vinagre","Libre","-"));
        foodList.add(new Alimento("Otros","Hershey’s chocolate sugar free syrup","3 cucharadas al día máximo","-"));

        foodList.add(new Alimento("Otros","Don’t worry merengues","5 piezas al día máximo","-"));
        foodList.add(new Alimento("Otros","Halo top ice cream","1/4 taza al día máximo","-"));
        foodList.add(new Alimento("Otros","Cajeta quemada sin azúcar Tillot","1 cucharada al día máximo","-"));
        foodList.add(new Alimento("Otros","Whipped cream sugar free","2 cucharadas al día máximo","-"));
        foodList.add(new Alimento("Otros","Hot sauce Siete Foods","Libre","-"));
        foodList.add(new Alimento("Otros","Monk endulzante natural","Libre","-"));
        foodList.add(new Alimento("Otros","Paletas de hielo Holistik","1 pieza al día máximo","-"));
        foodList.add(new Alimento("Otros","Chipotle en salsa","3 cucharadas al día máximo","-"));

        foodList.add(new Alimento("Otros","Aderezos del molino Finas hierbas","Libre","-"));
        foodList.add(new Alimento("Otros","Aderezos del molino Chipotle Ranch","2 cucharadas al día máximo","-"));
        foodList.add(new Alimento("Otros","Aderezos del molino Mostaza bajo en calorias","3 cucharadas al día máximo","-"));
        foodList.add(new Alimento("Otros","Aderezos del molino Cilantro bajo en calorias","3 cucharadas al día máximo","-"));
        foodList.add(new Alimento("Otros","Aderezos del molino italiano sin grasa","Libre","-"));
        foodList.add(new Alimento("Otros","Aderezos del molino cilantro sin grasa","Libre","-"));
        foodList.add(new Alimento("Otros","Tagatosa","Libre","-"));

        foodList.add(new Alimento("Grasa","Aceite para cocina","1 c","5 gramos"));
        foodList.add(new Alimento("Grasa","Aceite de girasol","1 c","5 gramos"));
        foodList.add(new Alimento("Grasa","Aceite de canola","1 c","5 gramos"));
        foodList.add(new Alimento("Grasa","Aceite de oliva","1 c","5 gramos"));
        foodList.add(new Alimento("Grasa","Aceite pam en spray","4 sprays","5 gramos"));
        foodList.add(new Alimento("Grasa","Aceitunas  verde o negra","5 pz","25 gramos"));
        foodList.add(new Alimento("Grasa","Aguacate","1/4 pz","25 gramos"));
        foodList.add(new Alimento("Grasa","Ajonjolí","4 c","10 gramos"));
        foodList.add(new Alimento("Grasa","Almendra","10 pz","12 gramos"));
        foodList.add(new Alimento("Grasa","Almendra fileteada","2 C","12 gramos"));

        foodList.add(new Alimento("Grasa","Avellana","10 pz","12 gramos"));
        foodList.add(new Alimento("Grasa","Castañas","10 pz","12 gramos"));
        foodList.add(new Alimento("Grasa","Cacahuate natural","14 pz","12 gramos"));
        foodList.add(new Alimento("Grasa","Cacao nibs","20 gr","20 gramos"));
        foodList.add(new Alimento("Grasa","Chía","3 c","15 gramos"));
        foodList.add(new Alimento("Grasa","Chocolate Turín sin azúcar","1 pz","15 gramos"));
        foodList.add(new Alimento("Grasa","Chocolate Carlos V sin azúcar","1 pz","15 gramos "));
        foodList.add(new Alimento("Grasa","Chocolate Larín sin azúcar","1 pz","15 gramos"));
        foodList.add(new Alimento("Grasa","Coco fresco","12 gr","12 gramos"));
        foodList.add(new Alimento("Grasa","Coco rallado natural","1 1/2 C","15 gramos"));

        foodList.add(new Alimento("Grasa","Crema de almendras natural sin azúcar","1 C","15 gramos"));
        foodList.add(new Alimento("Grasa","Crema de maní natural sin azúcar","1 C","15 gramos"));
        foodList.add(new Alimento("Grasa","Crema de avellanas natural sin azúcar","1 C","15 gramos"));
        foodList.add(new Alimento("Grasa","Linaza","1 C","15 gramos"));
        foodList.add(new Alimento("Grasa","Maní","14 pz","15 gramos"));
        foodList.add(new Alimento("Grasa","Nuez brasileña","4 pz","15 gramos"));
        foodList.add(new Alimento("Grasa","Nuez","3 pz ","15 gramos"));
        foodList.add(new Alimento("Grasa","Nueces mixtas","1 C","15 gramos"));
        foodList.add(new Alimento("Grasa","Nuez de la india","6 pz","15 gramos"));
        foodList.add(new Alimento("Grasa","Palta","1/4 pz","15 gramos"));

        foodList.add(new Alimento("Grasa","´Pepitas tostadas","1 C","15 gramos"));
        foodList.add(new Alimento("Grasa","Piñon","1 c","5 gramos"));
        foodList.add(new Alimento("Grasa","Pistaches","18 px","5 gramos"));
        foodList.add(new Alimento("Grasa","Semillas de girasol","1 C","15 gramos"));
        foodList.add(new Alimento("Grasa","Mantequilla de cajú","1 C","5 gramos"));
        foodList.add(new Alimento("Grasa","Semillas de calabaza","1 C","15 gramos"));
        foodList.add(new Alimento("Grasa","Semillas de cártamo","1 C","15 gramos"));
        foodList.add(new Alimento("Grasa","Semillas de sésamo","1 C","15 gramos"));
        foodList.add(new Alimento("Grasa","Tahini, pasta de sésamo","2 C","15 gramos"));
        foodList.add(new Alimento("Grasa","Guacamole","2 C","15 gramos"));

        foodList.add(new Alimento("Grasa","Mazapan sin azúcar de la Rosa","1 pz","15 gramos"));
        foodList.add(new Alimento("Grasa","Harina de almendras","11 gr","11 gramos"));
        foodList.add(new Alimento("Grasa","Pesto","2 C","15 gramos"));
        foodList.add(new Alimento("Grasa","Chocolate En Linea sin azúcar 85% CACAO","18 gr","18 gramos"));
        foodList.add(new Alimento("Grasa","Choco ZERO sin azúcar","18 gr","18 gramos"));
        foodList.add(new Alimento("Grasa","Semillas de hemp","2 c","11 gramos"));
        foodList.add(new Alimento("Grasa","Semillas de cañamo","2 c","11 gramos"));

        foodList.add(new Alimento("Proteina","Abulón fresco","50 gr","-"));
        foodList.add(new Alimento("Proteina","Almeja fresca","4 pz","50 gramos"));
        foodList.add(new Alimento("Proteina","Arrachera","30 gr","30 gramos"));
        foodList.add(new Alimento("Proteina","Atún fresco","40 gr","40 gramos"));
        foodList.add(new Alimento("Proteina","Atún de lata en agua","40 gr","40 gramos"));
        foodList.add(new Alimento("Proteina","Barbacoa","40 gr","40 gramos"));
        foodList.add(new Alimento("Proteina","Bistec de res","40 gr","40 gramos"));
        foodList.add(new Alimento("Proteina","Cabrito","40 gr","40 gramos"));
        foodList.add(new Alimento("Proteina","Calamar","60 gr","60 gramos"));
        foodList.add(new Alimento("Proteina","Camarón seco","10 gr","10 gramos"));

        foodList.add(new Alimento("Proteina","Camarón cocido","40 gr","40 gramos"));
        foodList.add(new Alimento("Proteina","Carne cuete","40 gr","40 gramos"));
        foodList.add(new Alimento("Proteina","Carne molida negra","40 gr","40 gramos"));
        foodList.add(new Alimento("Proteina","Cecina","25 gr","25 gramos"));
        foodList.add(new Alimento("Proteina","Chamberete","40 gr","40 gramos"));
        foodList.add(new Alimento("Proteina","Chuleta ahumada","25 gr","25 gramos"));
        foodList.add(new Alimento("Proteina","Clara de huevo","2 pz","-"));
        foodList.add(new Alimento("Proteina","Claras en tetra-pack","1/4 tz","-"));
        foodList.add(new Alimento("Proteina","Cuete de res","40 gr","40 gramos"));
        foodList.add(new Alimento("Proteina","Falda de res","40 gr","40 gramos"));

        foodList.add(new Alimento("Proteina","Filete de pescado, mojarra, merluza","40 gr","40 gramos"));
        foodList.add(new Alimento("Proteina","Filete de res","40 gr","40 gramos"));
        foodList.add(new Alimento("Proteina","Filete de sirloin","40 gr","40 gramos"));
        foodList.add(new Alimento("Proteina","Filete de tampiqueña","40 gr","40 gramos"));
        foodList.add(new Alimento("Proteina","Huevo entero","1 pz",".-"));
        foodList.add(new Alimento("Proteina","Jaiba cocida entera","60 gr","60 gramos"));
        foodList.add(new Alimento("Proteina","Jocoque","30 gr","30 gramos"));
        foodList.add(new Alimento("Proteina","Lomo de cerdo","40 gr","40 gramos"));
        foodList.add(new Alimento("Proteina","Machaca","1 C","-"));
        foodList.add(new Alimento("Proteina","Marlin","40 gr","40 gramos"));

        foodList.add(new Alimento("Proteina","Milanesa de pollo/res","40 gr","40 gramos"));
        foodList.add(new Alimento("Proteina","Ostión","70 gr","70 gramos"));
        foodList.add(new Alimento("Proteina","Pechuga de pavo ahumada","40 gr","40 gramos"));
        foodList.add(new Alimento("Proteina","Pechuga de pavo","40 gr","40 gramos"));
        foodList.add(new Alimento("Proteina","Pechuga de pollo ahumada","40 gr","40 gramos"));
        foodList.add(new Alimento("Proteina","Pechuga de pollo sin piel","40 gr","40 gramos"));
        foodList.add(new Alimento("Proteina","Pulpo crudo","45 gr","45 gramos"));
        foodList.add(new Alimento("Proteina","Pulpo cocido","30 gr","30 gramos"));
        foodList.add(new Alimento("Proteina","Queso COLUN light","22 gr","22 gramos"));
        foodList.add(new Alimento("Proteina","Queso Cottage light","40 gr","40 gramos"));

        foodList.add(new Alimento("Proteina","Queso de cabra","20 gr","20 gramos"));
        foodList.add(new Alimento("Proteina","Queso feta","20 gr","20 gramos"));
        foodList.add(new Alimento("Proteina","Queso mozzarella cero grasa","30 gr","30 gramos"));
        foodList.add(new Alimento("Proteina","Queso Oaxaca light","30 gr","30 gramos"));
        foodList.add(new Alimento("Proteina","Queso panela","30 gr","30 gramos"));
        foodList.add(new Alimento("Proteina","Requesón/ricotta","30 gr","30 gramos"));
        foodList.add(new Alimento("Proteina","Salmón ahumado","40 gr","40 gramos"));
        foodList.add(new Alimento("Proteina","Salmón fresco","40 gr","40 gramos"));
        foodList.add(new Alimento("Proteina","Sardinas enlatadas","40 gr","40 gramos"));
        foodList.add(new Alimento("Proteina","Surimi","40 gr","40 gramos"));

        foodList.add(new Alimento("Proteina","Tampiqueña","30 gr","30 gramos"));
        foodList.add(new Alimento("Proteina","Ternera","40 gr","40 gramos"));
        foodList.add(new Alimento("Proteina","Yogurt light sin azúcar","1/2 tz","-"));
        foodList.add(new Alimento("Proteina","Yogurt griego sin azúcar","1/2 tz","-"));
        foodList.add(new Alimento("Proteina","Queso fresco Santa Rosa light","40 gr","40 gramos"));
        foodList.add(new Alimento("Proteina","Quesillo COLUN light","40 gr","40 gramos"));
        foodList.add(new Alimento("Proteina","Ave de pato","40 gr","40 gramos"));
        foodList.add(new Alimento("Proteina","Ave de pavo","40 gr","40 gramos"));
        foodList.add(new Alimento("Proteina","Ave de pollo","40 gr","40 gramos"));
        foodList.add(new Alimento("Proteina","Tofu","80 gr","80 gramos"));

        foodList.add(new Alimento("Proteina","Veneras","40 gr","40 gramos"));
        foodList.add(new Alimento("Proteina","Cangrejo","2 pz","-"));
        foodList.add(new Alimento("Proteina","Carne de res deshidratada","25 gr","25 gramos"));
        foodList.add(new Alimento("Proteina","Carne molida tártaro","40 gr","40 gramos"));
        foodList.add(new Alimento("Proteina","Cerdo magro","40 gr","40 gramos"));
        foodList.add(new Alimento("Proteina","Cerdo pulpa","40 gr","40 gramos"));
        foodList.add(new Alimento("Proteina","Ceviche fresco mixto","40 gr","40 gramos"));
        foodList.add(new Alimento("Proteina","Chuleta de cordero","40 gr","40 gramos"));
        foodList.add(new Alimento("Proteina","Merluza","85 gr","85 gramos"));
        foodList.add(new Alimento("Proteina","Cordero pulpa","40 gr","40 gramos"));

        foodList.add(new Alimento("Proteina","Corvina","40 gr","40 gramos"));
        foodList.add(new Alimento("Proteina","Congrio","40 gr","40 gramos"));
        foodList.add(new Alimento("Proteina","Langosta","40 gr","40 gramos"));
        foodList.add(new Alimento("Proteina","Lomo sin cordón de vacuna","40 gr","40 gramos"));
        foodList.add(new Alimento("Proteina","Ostras frescas","4 pz","-"));
        foodList.add(new Alimento("Proteina","Levadura nutricional","15 gr","15 gramos"));

    }

}
