# angle-apk-ci

## How to Setup

download and install 2 apk files

```aria2c "https://github.com/Lobanokivan11/angle-apk-ci/releases/download/build-gui/app-debug.apk" && adb install app-debug.apk``` (settings)

```aria2c "https://github.com/Lobanokivan11/angle-apk-ci/releases/download/build-lib/AngleLibraries.apk" && adb install AngleLibraries.apk``` (base libraries)

run these commands to configure angle

```adb shell settings put global angle_debug_package org.chromium.angle``` (to set-up angle)

```adb shell pm grant com.android.angle android.permission.WRITE_SECURE_SETTINGS``` (to grant settings' permission to configure angle)

and enjoy

## ANGLE for all OpenGL ES apps

Note: This method only works on a device with root access.

Enable:

```adb shell settings put global angle_gl_driver_all_angle 1```

Disable:

```adb shell settings put global angle_gl_driver_all_angle 0```
