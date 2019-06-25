(ns luminus-template-444.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[luminus-template-444 started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[luminus-template-444 has shut down successfully]=-"))
   :middleware identity})
