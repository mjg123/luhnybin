(ns luhny.core
  (:gen-class))


(defn work 
  "Do all your work in here."
  [input]
  input)

(defn work-loop []
  (loop [line (read-line)]
    (when (not= line nil) 
      (println (work line)) 
      (recur (read-line)))))

(defn -main []
  (work-loop))
