(ns core.async-issue
  (:require-macros [cljs.core.async.macros :as a :refer [go]])
  (:require [cljs.core.async :refer [timeout <!]]
            [cljs.nodejs :as node]))

(defn -main []
  (go
   (let [t (timeout 1000)] (<! t))
   (.log js/console "Hello world!")))

(set! *main-cli-fn* -main)
