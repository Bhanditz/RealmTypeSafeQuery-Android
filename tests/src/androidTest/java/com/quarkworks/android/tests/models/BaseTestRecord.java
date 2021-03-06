package com.quarkworks.android.tests.models;


import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.quarkworks.android.realmtypesafequery.constants.RealmDefaults;
import com.quarkworks.android.realmtypesafequery.annotations.GenerateRealmFieldNames;
import com.quarkworks.android.realmtypesafequery.annotations.GenerateRealmFields;

import java.util.Date;

import io.realm.RealmList;
import io.realm.RealmModel;
import io.realm.annotations.Ignore;
import io.realm.annotations.Index;
import io.realm.annotations.PrimaryKey;
import io.realm.annotations.RealmClass;
import io.realm.annotations.Required;

@SuppressWarnings("WeakerAccess")
@RealmClass
@GenerateRealmFieldNames
@GenerateRealmFields
public class BaseTestRecord implements RealmModel {

    @Nullable
    public Boolean booleanField;

    @Nullable
    public byte[] byteArrayField;

    @Nullable
    public Byte byteField;

    @Nullable
    public Date dateField;

    @Nullable
    public Double doubleField;

    @Nullable
    public Float floatField;

    @Nullable
    public Integer integerField;

    @Nullable
    public Long longField;

    @Nullable
    public Short shortField;

    @Nullable
    public String stringField;

    @Ignore @Nullable
    public Object ignoredField;

    @Index
    public String indexedField;

    @PrimaryKey
    public String primaryKey;

    @Required @NonNull
    public String requiredField = "";

    @Nullable
    public BaseTestRecord parent = null;

    @NonNull
    public RealmList<BaseTestRecord> children = new RealmList<>();
}
