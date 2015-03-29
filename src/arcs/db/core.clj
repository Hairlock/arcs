(ns arcs.db.core
  (:require
    [yesql.core :refer [defqueries]]))

(def db-spec
  {:subprotocol "postgresql"
   :subname "//localhost:5433/arcs"
   :user "postgres"
   :password "password"})

(defqueries "sql/users.sql" {:connection db-spec})

