# RealmTypeSafeQuery-Android
[![](https://jitpack.io/v/QuarkWorks/RealmTypeSafeQuery-Android.svg)](https://jitpack.io/#QuarkWorks/RealmTypeSafeQuery-Android)

A type safe way to handle realm queries in Android

Top level build file:

    // Top-level build file where you can add configuration options common to all sub-projects/modules.
    buildscript {
        repositories {
            jcenter()
        }
        dependencies {
            classpath 'com.android.tools.build:gradle:2.1.0'
            classpath "io.realm:realm-gradle-plugin:1.1.1"
            // NOTE: Do not place your application dependencies here; they belong
            // in the individual module build.gradle files
        }
    }
    
    allprojects {
        repositories {
            jcenter()
            maven { url "https://jitpack.io" }
        }
    }
    
    task clean(type: Delete) {
        delete rootProject.buildDir
    }

app build file dependencies:

    provided 'com.github.quarkworks.RealmTypeSafeQuery-Android:annotationprocessor:version-number'
    compile  'com.github.quarkworks.RealmTypeSafeQuery-Android:query:version-number'

