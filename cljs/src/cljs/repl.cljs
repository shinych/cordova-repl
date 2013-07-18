(ns repl
  (:require
    [clojure.browser.repl :as brepl]))

(defn ^:export connect [ ]
  (brepl/connect "http://10.0.2.2:9001/repl"))

(connect)