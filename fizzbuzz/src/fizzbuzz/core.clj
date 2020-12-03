(ns fizzbuzz.core
  (:gen-class))

  (defn greet [name] (println (str "Hello!!" name)) )
  ;strは"Hello!"にかかってて、nameは変数なのでいらない・・いらない？
  (defn greet2 [name] (println name))
  (defn yeah [] (println "yeah"));引数なくても[]が必要っぽい
  (defn fizzbuzz [n]
    (cond ; if-if-..みたいな感じではないらしい 上で条件一致したら下は省略される？
      (= (rem n 15) 0) (println (str "FizzBuzz"))
      (= (rem n 3) 0) (println (str "Fizz"))
      (= (rem n 5) 0) (println (str "Buzz"))
      :else (println n)
    )
  )
  (defn inc [n] (+ n 1))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!")
  (println "Hello, Nekochan!")
  (yeah)
  (greet "Inutaro")
  (greet2 "Inujiro")
  (fizzbuzz 15)
  (fizzbuzz 5)
  (fizzbuzz 7)
  (println (inc 2))

  (loop [i 0]
    (when (< i 101)
    (fizzbuzz(i))
    (recur (+ i 1))))
  (loop [x 10]
    (when (> x 1)
      (println x)
      (recur (- x 2))))
)

; $ lein run
; OpenJDK 64-Bit Server VM warning: Options -Xverify:none and -noverify were deprecated in JDK 13 and will likely be removed in a future release.
; Hello, World!
; Hello, Nekochan!
; yeah
; Hello!!Inutaro
; Inujiro
