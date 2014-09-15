## r2m-sdk-android

This directory contains the rest2mobile SDK for Android, which includes the library to build your Android app for a Mobile App project.
This SDK leverages code generated by the Magnet rest2mobile CLI (r2m) for:
- Connecting to the server asynchronously
- Marshaling and unmarshaling JSON data
- Building the REST URL and HTTP headers
- Converting JSON data to the correct data typesetting

The Magnet Mobile Server SDK for Android is licensed under the terms of the [Magnet Software License Agreement](http://www.magnet.com/resources/tos.html). See [LICENSE](https://github.com/magnetsystems/magnet-sdk-android/blob/master/LICENSE) file for full details.

### Build Tool Supported:

- [Android Studio](http://developer.android.com/sdk/installing/studio.html) (Version 0.8.6)
- Eclipse
- Apache ANT

### Prerequisites:

[Android SDK](http://developer.android.com/tools/index.html), minimally Android 4.1.2, API Level 16.

### Build Android Apps with the SDK using Android Studio

Inside your Android Studio project, open app/build.grade, add the following lines, and the sdk will be downloaded automatically. 
```
repositories {

    maven {
    
        url “http://prod-af01.magnet.com:8081/artifactory/public”
        
    }
    
    mavenLocal()
    
    mavenCentral()
    
}

dependencies {

    compile fileTree(dir: 'libs', include: ['*.jar'])
    
    compile("com.magnet:r2m-sdk-android:1.0.0@aar") {
    
        transitive = true
        
    }
}
```

### Build Android Apps with the SDK using Eclipse

You need to add the SDK as a library to your Android project by:

1. Choose File\Import from the menu bar.
2. Select Android\Existing Android Code Into Workspace
3. Press the Next button.
4. Press the Browse button.
5. Select the magnetlib-1.0.0 folder (which is inside the r2m-sdk-android) that you have cloned or downloaded from Github.
6. Press the Finish button.
7. Inside the Package Explorer, right-click at the magnetlib-1.0.0 project folder.
8. Choose Properties.
9. In the Properties for magnetlib-1.0.0 dialog box, select “Android” from the left pane.
10. On the right pane under Library, make sure that “Is Library” is checked.
11. Close the Properties dialog box.
12. Inside the Package Explorer, right-click at your project.
13. In the Properties for your app dialog box, select Android from the left pane.
14. On the right pane under library, press the Add button.
15. Select “magnetlib-1.0.0”.
16. Press the OK button to close the Project Selection dialog box.
17. Press the Ok button to close the Properties for your app dialog box. 


### Build Android Apps with the SDK using ANT

Add the Magnet library as a dependent library to the ANT xml file, project.properties of your Android project by following the instructions below. Assuming the library is at the same level as your Android app project directory, run this from your Android project directory using relative path to the library directory:

    $ android update project --path . --library ../magnetlib-1.0.0 --target <target-id>

For Windows:

    $ android.bat update project --path . --library ..\magnetlib-1.0.0 --target <target-id>

Note: "--target" option is required for "android" command for new projects. For more details, refer to Android Developer Guide, [Managing Project from Command Line] (http://developer.android.com/tools/projects/projects-cmdline.html).

Build your app with ANT:

    $ ant clean debug
    
### [Javadoc]:(https://magnetsystems.github.io/r2m-sdk-android/reference/com/magnet/android/mms/MagnetMobileClient.html)
