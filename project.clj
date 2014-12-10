(defproject core.async-issue "0.1.0-SNAPSHOT"
  :description "Is there an issue in compiling cljs.core.async for NodeJS?"
  :url "http://github.com/stepugnetti/core.async-issue"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0-alpha4"]
                 [org.clojure/core.async "0.1.346.0-17112a-alpha"]
                 [org.clojure/clojurescript "0.0-2411"]]
  :plugins [[lein-cljsbuild "1.0.4-SNAPSHOT"]]
  :cljsbuild {:builds [{:id "simple"
                        :source-paths ["src"]
                        :compiler {:output-to "simple-issue.js"
                                   :output-dir "target/classes/simple"
                                   :optimizations :simple
                                   :target :nodejs}}
                       {:id "advanced"
                        :source-paths ["src"]
                        :compiler {:output-to "advanced-issue.js"
                                   :output-dir "target/classes/advanced"
                                   :optimizations :advanced
                                   :target :nodejs}}]})
