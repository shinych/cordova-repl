(defproject cljs "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]]
  :source-paths ["src/cljs"]
  :plugins [[lein-cljsbuild "0.3.2"]]
  :hooks [leiningen.cljsbuild]
  :min-lein-version "2.0.0"
  :cljsbuild
  {:builds
   [{:source-paths ["src/cljs"],
     :id "dev",
     :compiler {:pretty-print true,
                :output-to "../assets/www/js/cljs-app.js",
                :optimizations :simple}}
    {:source-paths ["src/cljs"],
     :id "prod",
     :compiler {:pretty-print false,
                :output-to "../assets/www/js/cljs-app.js",
                :optimizations :advanced}}],
   :repl-listen-port 9001}
  
  )
