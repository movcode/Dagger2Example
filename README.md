# Dagger2Example
Exemplo de como usar o subcomponent com AndroidInjection do dagger2 


Gradle:
dependencies {
    implementation fileTree(dir: 'libs', include: ['*.jar'])
    implementation "org.jetbrains.kotlin:kotlin-stdlib-jre7:$kotlin_version"
    implementation 'com.android.support:appcompat-v7:26.1.0'
    implementation 'com.android.support.constraint:constraint-layout:1.1.0'
    implementation 'com.android.support:support-annotations:27.1.1'

    //Dagger2
    kapt 'com.google.dagger:dagger-compiler:2.12'
    implementation 'com.google.dagger:dagger:2.12'
    implementation 'com.google.dagger:dagger-android-support:2.12'
    implementation 'com.google.dagger:dagger-android:2.12'
    annotationProcessor 'com.google.dagger:dagger-android-processor:2.12'

    //Testes
    testImplementation 'junit:junit:4.12'
    androidTestImplementation 'com.android.support.test:runner:1.0.2'
    androidTestImplementation 'com.android.support.test.espresso:espresso-core:3.0.2'
}
