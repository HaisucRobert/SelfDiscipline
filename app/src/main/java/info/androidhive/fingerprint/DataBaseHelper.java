package info.androidhive.fingerprint;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class DataBaseHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "selfdiscipline.db";
    private static final String TABLE_NAME = "food";
    private static final String COL_1 = "FOOD_ID";
    private static final String COL_2 = "NAME";
    private static final String COL_3 = "KCALORII";
    private static final String COL_4 = "PROTEINE";
    private static final String COL_5 = "LIPIDE";
    private static final String COL_6 = "GLUCIDE";
    private static final String allColumns[] = {COL_1, COL_2, COL_3, COL_4, COL_5, COL_6};



    public DataBaseHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, 4);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " +TABLE_NAME);
        onCreate(db);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        SQLiteDatabase writableDatabase = this.getWritableDatabase();
        writableDatabase.execSQL("create table " + TABLE_NAME + " (FOOD_ID INTEGER PRIMARY KEY ,NAME TEXT,KCALORII INTEGER,PROTEINE DOUBLE,LIPIDE DOUBLE,GLUCIDE DOUBLE)");
    }


    public void insertDummy() {
        SQLiteDatabase writableDatabase = this.getWritableDatabase();
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Paine de grau alba\" ,282  ,10.3 ,2 ,54);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Paine de grau intermediara\" ,255 ,8.3 ,0.8 ,52.2);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Paine de grau neagra\" ,245 ,8.4 ,1.2 ,48.5);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Paine de secara\" ,239 ,7.8 ,1.3 ,47.5);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Paine de graham\" ,256 ,9.1 ,1 ,51);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Cornuri, chifle\" ,269 ,10.5 ,0.6 ,53.5);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Orez decortificat\" ,355 ,5.6 ,1 ,75.8);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Gris\" ,354 ,11.2 ,0.8 ,73.3);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Fulgi de ovaz\" ,382 ,13.6 ,6.3 ,65.3);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Paste fainoase obisnuite\" ,360 ,5.6 ,1 ,75.9);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Paste fainoase cu ou\" ,366 ,10.2 ,2.2 ,79.1);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Biscuiti\" ,337 ,8.2 ,9.5 ,74);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Lapte de vaca integral\" ,67 ,3.5 ,3.6 ,4.8);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Lapte de vaca partial degresat II\" ,53 ,3.5 ,2 ,4.9);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Lapte de vaca batut integral\" ,64 ,3.5 ,3.6 ,3.9);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Iaurt gras\" ,55 ,3.2 ,3.2 ,3);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Iaurt slab\" ,30 ,3.3 ,0.1 ,3.9);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Branza grasa de vaci\" ,156 ,13 ,9 ,4.5);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Branza slaba de vaci\" ,97 ,17 ,1.2 ,4);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Branza de burduf\" ,337 ,28 ,28 ,0.5);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Branza telemea de oaie\" ,270 ,17 ,20 ,1);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Branza telemea de vaca\" ,243 ,17 ,17.2 ,1);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Cascaval\" ,283 ,25 ,19 ,1);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Branza topita grasa\" ,271 ,20 ,20.3 ,1);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Carne de vaca slaba\" ,118 ,21 ,3 ,0);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Carne de vitel slaba\" ,226 ,18.3 ,16.3 ,0);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Carne de vaca grasa\" ,401 ,22 ,35 ,0);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Carne de porc slaba\" ,143 ,20.4 ,6.3 ,0);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Carne de porc semigrasa\" ,268 ,16.5 ,21.5 ,0);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Carne de porc grasa\" ,388 ,15 ,35 ,0);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Carne de oaie slaba\" ,144 ,20 ,6.5 ,0);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Carne de oaie semigrasa\" ,331 ,17 ,28 ,0);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Carne de miel\" ,260 ,18 ,20 ,0);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Carne de gaina slaba\" ,128 ,20 ,5 ,0);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Carne de gaina grasa\" ,167 ,19 ,9.5 ,0);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Carne de curca slaba\" ,179 ,24.5 ,8.5 ,0);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Carne de rata\" ,136 ,19.6 ,6 ,0);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Carne de caprioara\" ,100 ,20 ,1.9 ,0);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Carne de iepure\" ,98 ,22 ,1 ,0);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Carne de mistret\" ,114 ,22 ,2.4 ,0);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Ficat de bovine\" ,146 ,20 ,5 ,4);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Ficat de porc\" ,146 ,19 ,6 ,3);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Limba de bovine\" ,207 ,16 ,15 ,0.4);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Rinichi de bovine, de porc\" ,122 ,18 ,3 ,0);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Sunca presata\" ,324 ,18.4 ,26.7 ,0);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Parizer, crenvurst, polonez\" ,289 ,10.1 ,26.6 ,0);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Pate de ficat\" ,160 ,8.7 ,12 ,3.2);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Crap\" ,104 ,18.9 ,2.8 ,0);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Salau\" ,83 ,19.4 ,0.4 ,0);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Stiuca\" ,82 ,19.1 ,0.4 ,0);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Conserve de stavrizi in ulei (numai pestele)\" ,207 ,22.5 ,12.3 ,0);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Ou de gaina integral\" ,171 ,14 ,12 ,0.6);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Galbenus (ou de gaina)\" ,364 ,16 ,32 ,0.3);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Albus (ou de gaina)\" ,57 ,13 ,0.2 ,0.5);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Ardei gras rosu\" ,39 ,1.3 ,0.4 ,7.3);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Ardei gras verde\" ,25 ,1.1 ,0.2 ,4.6);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Ardei umplutI cu orez\" ,114 ,1.4 ,8 ,8.2);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Bulion de tomate\" ,60 ,3.6 ,0 ,11.56);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Cartofi noi\" ,80 ,1.7 ,0.2 ,17.4);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Castraveti\" ,19 ,1.3 ,0.2 ,2.9);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Castraveti murati in otet\" ,15 ,0 ,0 ,3.6);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Ceapa uscata\" ,51 ,1.5 ,0.2 ,10.5);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Ceapa verde\" ,20 ,1 ,0.2 ,8.5);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Ciuperci\" ,35 ,5 ,0.5 ,2.5);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Ciuperci deshidratate\" ,313 ,41.7 ,1.7 ,30.8);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Conopida\" ,30 ,2.8 ,0.3 ,3.9);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Conopida in apa\" ,10 ,0.9 ,0 ,1.5);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Dovlecei\" ,18 ,0.9 ,0.1 ,3.2);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Fasole verde\" ,33 ,2 ,0.2 ,5.7);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Fasole verde in apa\" ,20 ,1.5 ,0.4 ,2.4);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Ghiveci in bulion\" ,25 ,1.2 ,0.5 ,3.8);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Mazare in apa\" ,48 ,2.4 ,0.5 ,8.1);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Mazare verde boabe\" ,96 ,8.4 ,0.5 ,14);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Morcov\" ,45 ,1.5 ,0.3 ,8.8);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Morcovi deshidratati\" ,3.4 ,9.3 ,1.5 ,61.4);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Pasta de tomate\" ,92 ,4.7 ,0 ,17.6);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Patlagele rosii\" ,25 ,1.1 ,0.3 ,4.3);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Patlagele vinete\" ,27 ,1.3 ,0.2 ,4.8);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Ridichi\" ,22 ,1.9 ,0.3 ,2.9);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Ridichi de luna\" ,11 ,0.6 ,0.1 ,3.8);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Rosii in bulion\" ,30 ,1.7 ,0.4 ,4.7);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Spanac\" ,25 ,3.5 ,0.3 ,2);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Sparanghel in apa\" ,15 ,0.8 ,0.1 ,2.7);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Suc de tomate\" ,23 ,1.1 ,0 ,4.6);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Tocana de legume\" ,94 ,1.4 ,6 ,5.5);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Usturoi\" ,137 ,7.2 ,0.2 ,26);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Varza acra\" ,25 ,1.2 ,0 ,3.3);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Varza alba\" ,33 ,1.8 ,0.2 ,5.8);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Varza rosi\" ,33 ,1.9 ,0.2 ,5.6);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Afine\" ,66 ,0.7 ,0.6 ,13.9);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Ananas\" ,52 ,0.4 ,0.2 ,11.9);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Banane\" ,66 ,1.3 ,0.6 ,13.4);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Caise\" ,58 ,1.1 ,0.1 ,12.9);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Capsune\" ,43 ,0.8 ,0.6 ,8.2);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Cirese\" ,82 ,1.1 ,0.3 ,18.3);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Cirese amare\" ,80 ,1 ,0.4 ,17.8);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Corcoduse\" ,45 ,0.6 ,0.1 ,10.2);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Dude\" ,81 ,1.3 ,0.6 ,14.5);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Grepfuri\" ,38 ,0.5 ,0.2 ,6.5);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Gutui\" ,66 ,0.5 ,0.5 ,14.2);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Lamai\" ,30 ,0.9 ,0.7 ,6.2);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Mandarine\" ,40 ,0.8 ,0.1 ,8.7);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Mere\" ,74 ,0.3 ,0.4 ,16.9);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Nectarine\" ,56 ,0.6 ,0.1 ,13.8);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Pepeni galbeni\" ,23 ,0.5 ,0.1 ,5);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Pepeni verzi\" ,29 ,0.5 ,0.1 ,5.4);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Pere\" ,73 ,0.6 ,0.6 ,16);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Piersici\" ,56 ,0.9 ,0.1 ,12.4);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Portocale\" ,47 ,0.8 ,0.2 ,10.1);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Prune\" ,74 ,0.6 ,0.1 ,17.2);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Struguri\" ,100 ,2.1 ,1.7 ,18.5);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Visine\" ,65 ,1.2 ,0.5 ,13.6);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Zmeura\" ,67 ,1.4 ,0.6 ,13.6);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Caise (fara samburi)\" ,304 ,5.2 ,0.4 ,68);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Curmale (cu samburi)\" ,326 ,1.9 ,0.6 ,74);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Fasole boabe\" ,303 ,23 ,1.7 ,47);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Mazare boabe\" ,323 ,21.5 ,1.9 ,53);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Prune (cu samburi)\" ,306 ,2.5 ,0.5 ,71);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Smochine\" ,267 ,4.3 ,1.3 ,58);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"stafide\" ,304 ,2.5 ,0.5 ,71.2);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Alune in coaja\" ,408 ,8.7 ,33.8 ,11.7);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Arahide\" ,584 ,9.3 ,44.5 ,15.7);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Castane\" ,400 ,10.7 ,7 ,69.5);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Fistic\" ,650 ,22.3 ,54 ,13.8);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Masline grecesti\" ,372 ,2 ,35 ,7.2);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Masline verzi\" ,664 ,24 ,55 ,13.2);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Nuci\" ,654 ,19.8 ,60 ,3.7);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Nuci de cocos\" ,598 ,8.4 ,48.8 ,29.9);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Dovleac (seminte)\" ,572 ,28 ,47.4 ,5.1);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Floarea 0 soarelui (seminte)\" ,420 ,14.7 ,32.3 ,14.5);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Amidon\" ,340 ,0 ,0 ,83);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Bomboane cu ciocolata\" ,574 ,7 ,33.8 ,56.3);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Bomboane fondante\" ,420 ,3.1 ,9.1 ,78.7);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Cacao praf\" ,449 ,23.4 ,20.2 ,40.2);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Caramele cu lapte\" ,398 ,0 ,0 ,96);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Ciocolata cu lapte\" ,603 ,6.9 ,29.9 ,49.8);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Ciocolata cu vanilie\" ,570 ,5.1 ,33.1 ,58.9);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Ciocolata menaj\" ,536 ,6.5 ,27.5 ,61.6);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Dulceata de nuci verzi\" ,312 ,0 ,0 ,76.1);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Dulceata de trandafiri\" ,328 ,0 ,0 ,80.3);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Fructe confiate\" ,309 ,0.3 ,0 ,75);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Gem de caise\" ,302 ,0.65 ,0 ,73);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Gem de capsuni\" ,304 ,0.34 ,0 ,74);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Gem de gutui\" ,308 ,0.35 ,0 ,75);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Gem de piersici\" ,308 ,0.64 ,0 ,74.5);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Gem de prune\" ,300 ,0.62 ,0 ,72.5);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Gem de visine\" ,399 ,0.88 ,0 ,69.5);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Gem de zmeura\" ,304 ,0 ,0 ,74.3);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Glucoza\" ,319 ,0 ,0 ,77.7);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Halva din floarea 0 soarelui\" ,546 ,18.8 ,31.5 ,43);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Halva din susan\" ,554 ,13.9 ,32.9 ,47.4);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Jeleu de afine\" ,314 ,0.6 ,0 ,76);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Jeleu de mure\" ,269 ,0.5 ,0 ,65);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Lactoza\" ,407 ,0.2 ,0 ,99);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Magiun de prune\" ,245 ,1.5 ,0 ,55);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Marmelada amestec\" ,289 ,0.46 ,0 ,72.5);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Marmelada extra\" ,292 ,0.42 ,0 ,71);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Martipan\" ,495 ,9.3 ,28.5 ,46.7);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Miere de albine\" ,335 ,0.4 ,0 ,81.3);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Nuga\" ,575 ,9 ,35 ,53);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Praline\" ,450 ,3 ,15 ,73);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Sirop de fructe (visine, zmeura)\" ,288 ,0.09 ,0 ,70);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Zahar\" ,410 ,0 ,0 ,99.9);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Margarina\" ,786 ,0.5 ,82 ,0);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Seu de bovine si ovine\" ,927 ,0.3 ,99.4 ,0);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Smantana 20%\" ,213 ,3.5 ,20 ,3.1);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Smantana 30%\" ,299 ,2.5 ,30 ,2.3);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Ulei de soia\" ,928 ,0 ,99.8 ,0);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Unt\" ,806 ,8 ,80 ,2.5);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Untdelemn de floarea 0 soarelui\" ,929 ,0 ,99.9 ,0);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Untura de gasca\" ,923 ,0.5 ,99 ,0);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Untura de porc\" ,928 ,0.2 ,99.6 ,0);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Bere\" ,50 ,0.6 ,4.4 ,4);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Rom\" ,312 ,0 ,43.9 ,0);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Tuica\" ,250 ,0 ,40 ,0);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Vin Mediu\" ,53 ,0 ,7.5 ,0.1);");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (null ,\"Whisky\" ,301 ,0 ,42.2 ,0);");

    }


    public List<Food> getAllData() {
        //this.getReadableDatabase().query(TABLE_NAME, allColumns, COL_1+ ":= ?",new String[]{"1"},null,null,null)
        Cursor cursor =this.getReadableDatabase().query(TABLE_NAME, allColumns, null, null,null,null,null);
        List<Food> returnFoodValues = new ArrayList();

        if(0<cursor.getCount()) {
            //Daca intrii aici inseaman ca in baza de date ai macar o inregistrare
            if (cursor.moveToFirst()){
                do {
                    Food newFood =  new Food();
                    // Passing values
                    int column1 = cursor.getInt(cursor.getColumnIndex(COL_1));
                    String column2 = cursor.getString(cursor.getColumnIndex(COL_2));
                    double column3 = cursor.getDouble(cursor.getColumnIndex(COL_3));
                    double column4 = cursor.getDouble(cursor.getColumnIndex(COL_4));
                    double column5 = cursor.getDouble(cursor.getColumnIndex(COL_5));
                    double column6 = cursor.getDouble(cursor.getColumnIndex(COL_6));
                    // Do something Here with values
                    newFood.setFOOD_ID(column1);
                    newFood.setNAME(column2);
                    newFood.setKCALORII(column3);
                    newFood.setPROTEINE(column4);
                    newFood.setLIPIDE(column5);
                    newFood.setGLUCIDE(column6);

                    returnFoodValues.add(newFood);
                } while(cursor.moveToNext());
                cursor.close();
            }
        }

        return returnFoodValues;
    }
}
