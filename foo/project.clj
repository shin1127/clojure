(defproject foo "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.10.0-beta1"]
                 [duct/core "0.7.0-alpha8"]
                 [duct/module.logging "0.4.0-alpha1"]
                 [duct/module.web "0.7.0-alpha4"]
                 [duct/module.ataraxy "0.3.0-alpha3"]]
  :plugins [[duct/lein-duct "0.11.0-alpha6"]]
  :main ^:skip-aot foo.main
  :resource-paths ["resources" "target/resources"]
  :prep-tasks     ["javac" "compile" ["run" ":duct/compiler"]]
  :profiles
  {:dev  [:project/dev :profiles/dev]
   :repl {:prep-tasks   ^:replace ["javac" "compile"]
          :repl-options {:init-ns user}}
   :uberjar {:aot :all}
   :profiles/dev {}
   :project/dev  {:source-paths   ["dev/src"]
                  :resource-paths ["dev/resources"]
                  :dependencies   [[integrant/repl "0.3.1"]
                                   [eftest "0.5.3"]
                                   [kerodon "0.9.0"]]}})
