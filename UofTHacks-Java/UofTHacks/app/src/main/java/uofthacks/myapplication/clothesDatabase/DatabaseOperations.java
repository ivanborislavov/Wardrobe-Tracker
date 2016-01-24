package uofthacks.myapplication.clothesDatabase;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.content.Context;
import uofthacks.myapplication.clothesDatabase.ClotheData.ClotheInfo;
import android.util.Log;import java.lang.String;

/**
 * Created by Venkat on 2016-01-23.
 */
public class DatabaseOperations extends SQLiteOpenHelper {
    public static final int DATABASE_VERSION = 1;
    public String CREATE_QUERY = "CREATE TABLE " + ClotheInfo.TABLE_NAME + "("
            + ClotheInfo.CLOTHE_ID + " INT, " + ClotheInfo.CLOTHE_BRAND + " TEXT, "
            + ClotheInfo.CLOTHE_COLOUR + " TEXT, " + ClotheInfo.CLOTHE_TYPE + " TEXT, "
            + ClotheInfo.CLOTHE_SIZE + " INT);";

    public DatabaseOperations(Context context) {
        super(context, ClotheInfo.DATABASE_NAME, null, DATABASE_VERSION);
        Log.d("Database operations", "Database created");
    }

    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_QUERY);
        Log.d("Database Operations", "Table created");
    }

    public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {

    }

    public void insert(DatabaseOperations dop, int ID, String brand, String colour, String type,
                       int size) {
        SQLiteDatabase sqlDB = dop.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(ClotheInfo.CLOTHE_ID, ID);
        cv.put(ClotheInfo.CLOTHE_BRAND, brand);
        cv.put(ClotheInfo.CLOTHE_COLOUR, colour);
        cv.put(ClotheInfo.CLOTHE_TYPE, type);
        cv.put(ClotheInfo.CLOTHE_SIZE, size);
        long k = sqlDB.insert(ClotheInfo.TABLE_NAME, null, cv);
        Log.d("Database operations", "One row inserted");
    }

    public Cursor getData(DatabaseOperations dop, String where, String[] whereArgs, String group, String having, String order){
        SQLiteDatabase sqlDB = dop.getReadableDatabase();
        String[] columns = {ClotheInfo.CLOTHE_ID, ClotheInfo.CLOTHE_BRAND, ClotheInfo.CLOTHE_COLOUR
                , ClotheInfo.CLOTHE_TYPE, ClotheInfo.CLOTHE_SIZE};
        Cursor cur = sqlDB.query(ClotheInfo.TABLE_NAME, columns, where, whereArgs, group, having, order);
        return cur;
    }

    public void delete(DatabaseOperations dop, int ID) {
        String selection = ClotheInfo.CLOTHE_ID + " LIKE ?";
        String[] args = {Integer.toString(ID)};
        SQLiteDatabase sqlDB = dop.getWritableDatabase();
        sqlDB.delete(ClotheInfo.TABLE_NAME, selection, args);
    }

    public void updateUserInfo(DatabaseOperations dop, int ID, String brand, String type,
                               String colour, int size) {
        SQLiteDatabase sqlDB = dop.getWritableDatabase();
        String selection = ClotheInfo.CLOTHE_ID + " LIKE ?";
        String[] args = {Integer.toString(ID)};
        ContentValues cv = new ContentValues();
        cv.put(ClotheInfo.CLOTHE_BRAND, brand);
        cv.put(ClotheInfo.CLOTHE_TYPE, type);
        cv.put(ClotheInfo.CLOTHE_COLOUR, colour);
        cv.put(ClotheInfo.CLOTHE_SIZE, size);
        sqlDB.update(ClotheInfo.TABLE_NAME, cv, selection, args);
    }
}