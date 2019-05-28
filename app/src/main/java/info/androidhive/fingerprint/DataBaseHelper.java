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
        db.execSQL("create table " + TABLE_NAME + " (FOOD_ID INTEGER PRIMARY KEY ,NAME TEXT,KCALORII INTEGER,PROTEINE DOUBLE,LIPIDE DOUBLE,GLUCIDE DOUBLE)");
    }

    public void insertDummy() {
        SQLiteDatabase writableDatabase = this.getWritableDatabase();
        writableDatabase.execSQL("DROP TABLE IF EXISTS " +TABLE_NAME);
        writableDatabase.beginTransaction();
        writableDatabase.execSQL("create table " + TABLE_NAME + " (FOOD_ID INTEGER PRIMARY KEY ,NAME TEXT,KCALORII INTEGER,PROTEINE DOUBLE,LIPIDE DOUBLE,GLUCIDE DOUBLE)");
        writableDatabase.execSQL("INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (1 , \"Paine de grau alba\" ,282  ,10.3 ,2 ,54);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (2 , \"Paine de grau intermediara\" ,255 ,8.3 ,0.8 ,52.2);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (3 , \"Paine de grau neagra\" ,245 ,8.4 ,1.2 ,48.5);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (4 , \"Paine de secara\" ,239 ,7.8 ,1.3 ,47.5);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (5 , \"Paine de graham\" ,256 ,9.1 ,1 ,51);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (6 , \"Cornuri, chifle\" ,269 ,10.5 ,0.6 ,53.5);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (7 , \"Orez decortificat\" ,355 ,5.6 ,1 ,75.8);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (8 , \"Gris\" ,354 ,11.2 ,0.8 ,73.3);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (9 , \"Fulgi de ovaz\" ,382 ,13.6 ,6.3 ,65.3);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (10 , \"Paste fainoase obisnuite\" ,360 ,5.6 ,1 ,75.9);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (11 , \"Paste fainoase cu ou\" ,366 ,10.2 ,2.2 ,79.1);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (12 , \"Biscuiti\" ,337 ,8.2 ,9.5 ,74);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (13 , \"Lapte de vaca integral\" ,67 ,3.5 ,3.6 ,4.8);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (14 , \"Lapte de vaca partial degresat II\" ,53 ,3.5 ,2 ,4.9);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (15 , \"Lapte de vaca batut integral\" ,64 ,3.5 ,3.6 ,3.9);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (16 , \"Iaurt gras\" ,55 ,3.2 ,3.2 ,3);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (17 , \"Iaurt slab\" ,30 ,3.3 ,0.1 ,3.9);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (18 , \"Branza grasa de vaci\" ,156 ,13 ,9 ,4.5);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (19 , \"Branza slaba de vaci\" ,97 ,17 ,1.2 ,4);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (20 , \"Branza de burduf\" ,337 ,28 ,28 ,0.5);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (21 , \"Branza telemea de oaie\" ,270 ,17 ,20 ,1);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (22 , \"Branza telemea de vaca\" ,243 ,17 ,17.2 ,1);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (23 , \"Cascaval\" ,283 ,25 ,19 ,1);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (24 , \"Branza topita grasa\" ,271 ,20 ,20.3 ,1);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (25 , \"Carne de vaca slaba\" ,118 ,21 ,3 ,0);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (26 , \"Carne de vitel slaba\" ,226 ,18.3 ,16.3 ,0);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (27 , \"Carne de vaca grasa\" ,401 ,22 ,35 ,0);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (28 , \"Carne de porc slaba\" ,143 ,20.4 ,6.3 ,0);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (29 , \"Carne de porc semigrasa\" ,268 ,16.5 ,21.5 ,0);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (30 , \"Carne de porc grasa\" ,388 ,15 ,35 ,0);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (31 , \"Carne de oaie slaba\" ,144 ,20 ,6.5 ,0);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (32 , \"Carne de oaie semigrasa\" ,331 ,17 ,28 ,0);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (33 , \"Carne de miel\" ,260 ,18 ,20 ,0);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (34 , \"Carne de gaina slaba\" ,128 ,20 ,5 ,0);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (35 , \"Carne de gaina grasa\" ,167 ,19 ,9.5 ,0);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (36 , \"Carne de curca slaba\" ,179 ,24.5 ,8.5 ,0);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (37 , \"Carne de rata\" ,136 ,19.6 ,6 ,0);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (38 , \"Carne de caprioara\" ,100 ,20 ,1.9 ,0);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (39 , \"Carne de iepure\" ,98 ,22 ,1 ,0);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (40 , \"Carne de mistret\" ,114 ,22 ,2.4 ,0);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (41 , \"Ficat de bovine\" ,146 ,20 ,5 ,4);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (42 , \"Ficat de porc\" ,146 ,19 ,6 ,3);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (43 , \"Limba de bovine\" ,207 ,16 ,15 ,0.4);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (44 , \"Rinichi de bovine, de porc\" ,122 ,18 ,3 ,0);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (45 , \"Sunca presata\" ,324 ,18.4 ,26.7 ,0);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (46 , \"Parizer, crenvurst, polonez\" ,289 ,10.1 ,26.6 ,0);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (47 , \"Pate de ficat\" ,160 ,8.7 ,12 ,3.2);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (48 , \"Crap\" ,104 ,18.9 ,2.8 ,0);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (49 , \"Salau\" ,83 ,19.4 ,0.4 ,0);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (50 , \"Stiuca\" ,82 ,19.1 ,0.4 ,0);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (51 , \"Conserve de stavrizi in ulei (numai pestele)\" ,207 ,22.5 ,12.3 ,0);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (52 , \"Ou de gaina integral\" ,171 ,14 ,12 ,0.6);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (53 , \"Galbenus (ou de gaina)\" ,364 ,16 ,32 ,0.3);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (54 , \"Albus (ou de gaina)\" ,57 ,13 ,0.2 ,0.5);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (55 , \"Ardei gras rosu\" ,39 ,1.3 ,0.4 ,7.3);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (56 , \"Ardei gras verde\" ,25 ,1.1 ,0.2 ,4.6);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (57 , \"Ardei umplutI cu orez\" ,114 ,1.4 ,8 ,8.2);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (58 , \"Bulion de tomate\" ,60 ,3.6 ,0 ,11.56);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (59 , \"Cartofi noi\" ,80 ,1.7 ,0.2 ,17.4);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (60 , \"Castraveti\" ,19 ,1.3 ,0.2 ,2.9);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (61 , \"Castraveti murati in otet\" ,15 ,0 ,0 ,3.6);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (62 , \"Ceapa uscata\" ,51 ,1.5 ,0.2 ,10.5);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (63 , \"Ceapa verde\" ,20 ,1 ,0.2 ,8.5);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (64 , \"Ciuperci\" ,35 ,5 ,0.5 ,2.5);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (65 , \"Ciuperci deshidratate\" ,313 ,41.7 ,1.7 ,30.8);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (66 , \"Conopida\" ,30 ,2.8 ,0.3 ,3.9);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (67 , \"Conopida in apa\" ,10 ,0.9 ,0 ,1.5);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (68 , \"Dovlecei\" ,18 ,0.9 ,0.1 ,3.2);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (69 , \"Fasole verde\" ,33 ,2 ,0.2 ,5.7);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (70 , \"Fasole verde in apa\" ,20 ,1.5 ,0.4 ,2.4);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (71 , \"Ghiveci in bulion\" ,25 ,1.2 ,0.5 ,3.8);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (72 , \"Mazare in apa\" ,48 ,2.4 ,0.5 ,8.1);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (73 , \"Mazare verde boabe\" ,96 ,8.4 ,0.5 ,14);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (74 , \"Morcov\" ,45 ,1.5 ,0.3 ,8.8);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (75 , \"Morcovi deshidratati\" ,3,4 ,9.3 ,1.5 ,61.4);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (76 , \"Pasta de tomate\" ,92 ,4.7 ,0 ,17.6);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (77 , \"Patlagele rosii\" ,25 ,1.1 ,0.3 ,4.3);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (78 , \"Patlagele vinete\" ,27 ,1.3 ,0.2 ,4.8);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (79 , \"Ridichi\" ,22 ,1.9 ,0.3 ,2.9);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (80 , \"Ridichi de luna\" ,11 ,0.6 ,0.1 ,3.8);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (81 , \"Rosii in bulion\" ,30 ,1.7 ,0.4 ,4.7);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (82 , \"Spanac\" ,25 ,3.5 ,0.3 ,2);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (83 , \"Sparanghel in apa\" ,15 ,0.8 ,0.1 ,2.7);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (84 , \"Suc de tomate\" ,23 ,1.1 ,0 ,4.6);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (85 , \"Tocana de legume\" ,94 ,1.4 ,6 ,5.5);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (86 , \"Usturoi\" ,137 ,7.2 ,0.2 ,26);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (87 , \"Varza acra\" ,25 ,1.2 ,0 ,3.3);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (88 , \"Varza alba\" ,33 ,1.8 ,0.2 ,5.8);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (89 , \"Varza rosi\" ,33 ,1.9 ,0.2 ,5.6);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (90 , \"Afine\" ,66 ,0.7 ,0.6 ,13.9);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (91 , \"Ananas\" ,52 ,0.4 ,0.2 ,11.9);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (92 , \"Banane\" ,66 ,1.3 ,0.6 ,13.4);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (93 , \"Caise\" ,58 ,1.1 ,0.1 ,12.9);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (94 , \"Capsune\" ,43 ,0.8 ,0.6 ,8.2);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (95 , \"Cirese\" ,82 ,1.1 ,0.3 ,18.3);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (96 , \"Cirese amare\" ,80 ,1 ,0.4 ,17.8);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (97 , \"Corcoduse\" ,45 ,0.6 ,0.1 ,10.2);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (98 , \"Dude\" ,81 ,1.3 ,0.6 ,14.5);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (99 , \"Grepfuri\" ,38 ,0.5 ,0.2 ,6.5);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (100 , \"Gutui\" ,66 ,0.5 ,0.5 ,14.2);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (101 , \"Lamai\" ,30 ,0.9 ,0.7 ,6.2);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (102 , \"Mandarine\" ,40 ,0.8 ,0.1 ,8.7);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (103 , \"Mere\" ,74 ,0.3 ,0.4 ,16.9);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (104 , \"Nectarine\" ,56 ,0.6 ,0.1 ,13.8);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (105 , \"Pepeni galbeni\" ,23 ,0.5 ,0.1 ,5);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (106 , \"Pepeni verzi\" ,29 ,0.5 ,0.1 ,5.4);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (107 , \"Pere\" ,73 ,0.6 ,0.6 ,16);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (108 , \"Piersici\" ,56 ,0.9 ,0.1 ,12.4);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (109 , \"Portocale\" ,47 ,0.8 ,0.2 ,10.1);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (110 , \"Prune\" ,74 ,0.6 ,0.1 ,17.2);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (111 , \"Struguri\" ,100 ,2.1 ,1.7 ,18.5);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (112 , \"Visine\" ,65 ,1.2 ,0.5 ,13.6);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (113 , \"Zmeura\" ,67 ,1.4 ,0.6 ,13.6);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (114 , \"Caise (fara samburi)\" ,304 ,5.2 ,0.4 ,68);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (115 , \"Curmale (cu samburi)\" ,326 ,1.9 ,0.6 ,74);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (116 , \"Fasole boabe\" ,303 ,23 ,1.7 ,47);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (117 , \"Mazare boabe\" ,323 ,21.5 ,1.9 ,53);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (118 , \"Prune (cu samburi)\" ,306 ,2.5 ,0.5 ,71);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (119 , \"Smochine\" ,267 ,4.3 ,1.3 ,58);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (120 , \"stafide\" ,304 ,2.5 ,0.5 ,71.2);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (121 , \"Alune in coaja\" ,408 ,8.7 ,33.8 ,11.7);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (122 , \"Arahide\" ,584 ,9.3 ,44.5 ,15.7);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (123 , \"Castane\" ,400 ,10.7 ,7 ,69.5);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (124 , \"Fistic\" ,650 ,22.3 ,54 ,13.8);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (125 , \"Masline grecesti\" ,372 ,2 ,35 ,7.2);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (126 , \"Masline verzi\" ,664 ,24 ,55 ,13.2);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (127 , \"Nuci\" ,654 ,19.8 ,60 ,3.7);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (128 , \"Nuci de cocos\" ,598 ,8.4 ,48.8 ,29.9);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (129 , \"Dovleac (seminte)\" ,572 ,28 ,47.4 ,5.1);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (130 , \"Floarea 0 soarelui (seminte)\" ,420 ,14.7 ,32.3 ,14.5);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (131 , \"Amidon\" ,340 ,0 ,0 ,83);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (132 , \"Bomboane cu ciocolata\" ,574 ,7 ,33.8 ,56.3);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (133 , \"Bomboane fondante\" ,420 ,3.1 ,9.1 ,78.7);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (134 , \"Cacao praf\" ,449 ,23.4 ,20.2 ,40.2);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (135 , \"Caramele cu lapte\" ,398 ,0 ,0 ,96);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (136 , \"Ciocolata cu lapte\" ,603 ,6.9 ,29.9 ,49.8);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (137 , \"Ciocolata cu vanilie\" ,570 ,5.1 ,33.1 ,58.9);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (138 , \"Ciocolata menaj\" ,536 ,6.5 ,27.5 ,61.6);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (139 , \"Dulceata de nuci verzi\" ,312 ,0 ,0 ,76.1);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (140 , \"Dulceata de trandafiri\" ,328 ,0 ,0 ,80.3);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (141 , \"Fructe confiate\" ,309 ,0.3 ,0 ,75);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (142 , \"Gem de caise\" ,302 ,0.65 ,0 ,73);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (143 , \"Gem de capsuni\" ,304 ,0.34 ,0 ,74);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (144 , \"Gem de gutui\" ,308 ,0.35 ,0 ,75);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (145 , \"Gem de piersici\" ,308 ,0.64 ,0 ,74.5);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (146 , \"Gem de prune\" ,300 ,0.62 ,0 ,72.5);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (147 , \"Gem de visine\" ,399 ,0.88 ,0 ,69.5);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (148 , \"Gem de zmeura\" ,304 ,0 ,0 ,74.3);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (149 , \"Glucoza\" ,319 ,0 ,0 ,77.7);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (150 , \"Halva din floarea 0 soarelui\" ,546 ,18.8 ,31.5 ,43);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (151 , \"Halva din susan\" ,554 ,13.9 ,32.9 ,47.4);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (152 , \"Jeleu de afine\" ,314 ,0.6 ,0 ,76);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (153 , \"Jeleu de mure\" ,269 ,0.5 ,0 ,65);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (154 , \"Lactoza\" ,407 ,0.2 ,0 ,99);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (155 , \"Magiun de prune\" ,245 ,1.5 ,0 ,55);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (156 , \"Marmelada amestec\" ,289 ,0.46 ,0 ,72.5);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (157 , \"Marmelada extra\" ,292 ,0.42 ,0 ,71);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (158 , \"Martipan\" ,495 ,9.3 ,28.5 ,46.7);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (159 , \"Miere de albine\" ,335 ,0.4 ,0 ,81.3);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (160 , \"Nuga\" ,575 ,9 ,35 ,53);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (161 , \"Praline\" ,450 ,3 ,15 ,73);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (162 , \"Sirop de fructe (visine, zmeura)\" ,288 ,0.09 ,0 ,70);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (163 , \"Zahar\" ,410 ,0 ,0 ,99.9);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (164 , \"Margarina\" ,786 ,0.5 ,82 ,0);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (165 , \"Seu de bovine si ovine\" ,927 ,0.3 ,99.4 ,0);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (166 , \"Smantana 20%\" ,213 ,3.5 ,20 ,3.1);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (167 , \"Smantana 30%\" ,299 ,2.5 ,30 ,2.3);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (168 , \"Ulei de soia\" ,928 ,0 ,99.8 ,0);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (169 , \"Unt\" ,806 ,8 ,80 ,2.5);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (170 , \"Untdelemn de floarea 0 soarelui\" ,929 ,0 ,99.9 ,0);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (171 , \"Untura de gasca\" ,923 ,0.5 ,99 ,0);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (172 , \"Untura de porc\" ,928 ,0.2 ,99.6 ,0);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (173 , \"Bere\" ,50 ,0.6 ,4.4 ,4);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (174 , \"Rom\" ,312 ,0 ,43.9 ,0);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (175 , \"Tuica\" ,250 ,0 ,40 ,0);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (176 , \"Vin Mediu\" ,53 ,0 ,7.5 ,0.1);\n" +
                "INSERT INTO food (food_id, name, kcalorii, proteine, lipide, glucide) VALUES (177 , \"Whisky\" ,301 ,0 ,42.2 ,0);\n");

        writableDatabase.setTransactionSuccessful();
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
