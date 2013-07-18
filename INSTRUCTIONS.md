
download android SDK
install intel image

https://help.ubuntu.com/community/KVM/Installation
add user to kvm, libvirtd
restart

Download Cordova
Unzip android package
install npm

add android SDK to ~/.bashrc
cordova-android/bin/create

go to project folder
cordova/run

had to sudo apt-get install libncurses5:i386

add a device/emulator
Used AVD tool from 'android' command, specified 7" tablet
4.2.2
intel atom
webcam
512 ram
use host GPU

Check to make sure it runs
cordova/run should work now

you get the 'apache cordova' device is ready thing

in res/xml/config.xml, you'll see:
    <!-- <content src="http://mysite.com/myapp.html" /> for external pages -->
    <content src="index.html" />

Uncomment it and put it to the Host IP of the android emulator:

10.0.2.2 and the port of your server.. we'll use ruby's httpd
ruby -run -e httpd assets/www -p 9000

<content src="http://10.0.2.2:9000/index.html" />



