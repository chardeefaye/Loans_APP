package com.applications.roleosala.loans;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DB_Loan extends SQLiteOpenHelper {
    public static final String DB_NAME_LOANS = "DIRECTORY";

    //tbl_credentials
    public static final String T_CRD = "credentials";
    public static final String CRD_ID = "crd_id";
    public static final String CRD_USRNM = "crd_usrnm";
    public static final String CRD_PSWRD = "crd_pswd";
    public static final String FK_T_PPL = "ppl_id";

    //tbl_People for users
    public static  final  String T_PPL = "ppl_tbl";
    public  static final String PPL_ID = "ppl_id";
    public static final String PPL_NAME = "ppl_name";
    public static final String PPL_AGE = "ppl_age";
    public static final String PPL_GEN = "ppl_gen";
    public static final String PPL_ADD = "ppl_add";
    public static final String PPL_TYPE = "ppl_type";

    //tbl_loans table for said loans
    public static final String T_LOANS = "loans_tbl";
    public static final String LN_ID = "ln_id";
    public static final String LN_AMNT = "ln_amnt";
    public static final String LN_INT = "ln_int";
    public static final String LN_DATE = "ln_date";
    public static final String LN_BAL = "ln_bal";

    public DB_Loan(Context context){
        super(context, DB_NAME_LOANS, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
