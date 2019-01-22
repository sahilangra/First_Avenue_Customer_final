package thebetadeveloper.app.first_avenue_customer;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.content.Context;
import android.util.Log;

public class DatabaseHelper extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION=1;
    private static final String DATABASE_NAME="fifth_avenue";
    private static final String TABLE_WAITOR="waitor";
    private static final String KEY_USERNAME_WAITOR="name";
    private static final String KEY_PASSWORD_WAITOR="password";
    private static final String TABLE_FOOD_MENU="food_menu";
    private static final String KEY_FOOD_ID="food_id";
    private static final String KEY_FOOD_NAME="food_name";
    private static final String KEY_FOOD_PRICE="food_price";


    public DatabaseHelper(Context context)
    {
        super(context,DATABASE_NAME,null,DATABASE_VERSION);

    }


    @Override
    public void onCreate(SQLiteDatabase db) {


        String CREATE_WAITOR_TABLE="CREATE TABLE "+TABLE_WAITOR+"("+KEY_USERNAME_WAITOR+"TEXT,"+KEY_PASSWORD_WAITOR+"TEXT"+")";
        db.execSQL(CREATE_WAITOR_TABLE);
        String CREATE_FOOD_MENU_TABLE="CREATE TABLE "+TABLE_FOOD_MENU+"("+KEY_FOOD_ID+" TEXT PRIMARY KEY ," + KEY_FOOD_NAME + " TEXT,"+KEY_FOOD_PRICE+" INTEGER )";
        db.execSQL(CREATE_FOOD_MENU_TABLE);
        Log.v("ppppp","working");



    }

    @Override
    public void onUpgrade(SQLiteDatabase db,int i,int i1) {
        db.execSQL("DROP TABLE IF EXISTS waitor");
        onCreate(db);
        db.execSQL("DROP TABLE IF EXISTS food_menu");
        onCreate(db);
    }
    void addWaitor(Waitor wait)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues values= new ContentValues();
        values.put(KEY_USERNAME_WAITOR,wait.getUsername());
        values.put(KEY_PASSWORD_WAITOR,wait.getPassword());
        db.insert(TABLE_WAITOR,null,values);

        db.close();
    }
    void addFoodItem(FoodMenu fm)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues values= new ContentValues();
        values.put(KEY_FOOD_ID,fm.getFood_id());
        values.put(KEY_FOOD_NAME,fm.getFood_name());
        values.put(KEY_FOOD_PRICE,fm.getFood_price());
        db.insert(TABLE_FOOD_MENU,null,values);

        db.close();
    }
}
