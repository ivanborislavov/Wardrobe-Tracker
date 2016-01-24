package uofthacks.myapplication.clothesDatabase;

import android.provider.BaseColumns;import java.lang.String;

/**
 * Created by Venkat on 2016-01-23.
 */
public class ClotheData {

    public ClotheData() {

    }

    public static abstract class ClotheInfo implements BaseColumns {
        public static final String CLOTHE_ID = "clothe_id";
        public static final String CLOTHE_TYPE = "clothe_type";
        public static final String CLOTHE_BRAND = "clothe_brand";
        public static final String CLOTHE_COLOUR = "clothe_colour";
        public static final String CLOTHE_SIZE = "clothe_size";
        public static final String DATABASE_NAME = "clothe_info";
        public static final String TABLE_NAME = "clothes";
    }
}
