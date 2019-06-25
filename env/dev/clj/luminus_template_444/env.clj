(ns luminus-template-444.env
  (:require
    [selmer.parser :as parser]
    [clojure.tools.logging :as log]
    [luminus-template-444.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[luminus-template-444 started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[luminus-template-444 has shut down successfully]=-"))
   :middleware wrap-dev})
