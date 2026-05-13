# angle-apk-ci

## How to Setup

Install Angle apk from release, connect phone to pc via adb and run command

```adb shell settings put global angle_debug_package org.chromium.angle```

and enjoy

## ANGLE for all OpenGL ES apps

Note: This method only works on a device with root access.

Enable:

```adb shell settings put global angle_gl_driver_all_angle 1```

Disable:

```adb shell settings put global angle_gl_driver_all_angle 0```
