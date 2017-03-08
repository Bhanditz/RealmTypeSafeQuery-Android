package com.quarkworks.android.tests;

import com.quarkworks.android.realmtypesafequery.annotations.GenerateRealmFieldNames;
import com.quarkworks.android.realmtypesafequery.annotations.GenerateRealmFields;

import io.realm.RealmModel;
import io.realm.annotations.RealmClass;

@RealmClass
@GenerateRealmFieldNames
@GenerateRealmFields
public class StatData implements RealmModel {
    static final int SUM_DATA_INDEX;
    static final int AVG_DATA_INDEX;
    static final int MAX_DATA_INDEX;
    static final int MIN_DATA_INDEX;
    static Object [] SUM_DATA = {395, 3.95666666666667d};
    static Object [] AVG_DATA = {13057, 130.57f};
    static Object [] MAX_DATA = {1089, 10.89f};
    static Object [] MIN_DATA = {33, 0.33f};



    static Object[][] DATA = new Object[][]
            {
                    {33, 0.33f},
                    {35, 0.35f},
                    {39, 0.39f},
                    {45, 0.45f},
                    {53, 0.53f},
                    {63, 0.63f},
                    {75, 0.75f},
                    {89, 0.89f},
                    {105, 1.05f},
                    {123, 1.23f},
                    {143, 1.43f},
                    {165, 1.65f},
                    {189, 1.89f},
                    {215, 2.15f},
                    {243, 2.43f},
                    {273, 2.73f},
                    {305, 3.05f},
                    {339, 3.39f},
                    {375, 3.75f},
                    {413, 4.13f},
                    {453, 4.53f},
                    {495, 4.95f},
                    {539, 5.39f},
                    {585, 5.85f},
                    {633, 6.33f},
                    {683, 6.83f},
                    {735, 7.35f},
                    {789, 7.89f},
                    {845, 8.45f},
                    {903, 9.03f},
                    {963, 9.63f},
                    {1025, 10.25f},
                    {1089, 10.89f},

                    {395, 3.95666666666667d},
                    {13057, 130.57f},
                    {1089, 10.89f},
                    {33, 0.33f},
            };

    static {
        AVG_DATA_INDEX = DATA.length - 4;
        SUM_DATA_INDEX = DATA.length - 3;
        MAX_DATA_INDEX = DATA.length - 2;
        MIN_DATA_INDEX = DATA.length - 1;
    }

//    @PrimaryKey
//    public String primaryKey;

    public Integer integerField;
    public Float floatField;
}