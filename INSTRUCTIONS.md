
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
don't use host GPU (caused weirdness on my box)

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

verify it's using your server

change the html file

lein new cljsbuild-template cljs
in cljs/project.clj:
   update to lein-cljsbuild 0.3.2
   repl-listen-port 9001
   get rid of repl-launch-commands and test-commands
   change :output-to to ../assets/www/js/cljs-app.js
   remove test profile

in index.html
   Add script tag pointing to cljs-app.js

src/cljs already has the repl built-in:
(ns repl
  (:require
    [clojure.browser.repl :as brepl]))

(defn ^:export connect [ ]
  (brepl/connect "http://localhost:9000/repl"))


do lein trampoline cljsbuild repl-listen

update your outdated cljsbuild settings like it says
update your clojure to 1.5.1
remove the clojurescript dependency

try it again... success

in another terminal, run 'lein cljsbuild auto'
update the repl.cljs to port 10.0.2.2:9001
add (connect) at the end


restart your emulator, repl should work