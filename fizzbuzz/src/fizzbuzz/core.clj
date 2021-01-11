 (ns fizzbuzz.core
   (:gen-class))
 
 (defn fzbz [n]
   (cond
     (= 0 (rem n 15)) "FizzBuzz"
     (= 0 (rem n 3)) "Fizz"
     (= 0 (rem n 5)) "Buzz"
     :else n
   ))
 
 (defn -main
   "I don't do a whole lot ... yet."
   [& args]
   (loop [i 0]
     (when (< i 101)
       (print (fzbz i) " ")
       (recur (inc i))))
 )
 
; $ lein run
; OpenJDK 64-Bit Server VM warning: Options -Xverify:none and -noverify were deprecated in JDK 13 and will likely be removed in a future release.
; FizzBuzz  1  2  Fizz  4  Buzz  Fizz  7  8  Fizz  Buzz  11  Fizz  13  14  FizzBuzz  16  17  Fizz  19  Buzz  Fizz  22  23  Fizz  Buzz  26  Fizz  28  29  FizzBuzz  31  32  Fizz  34  Buzz  Fizz  37  38  Fizz  Buzz  41  Fizz  43  44  FizzBuzz  46  47  Fizz  49  Buzz  Fizz  52  53  Fizz  Buzz  56  Fizz  58  59  FizzBuzz  61  62  Fizz  64  Buzz  Fizz  67  68  Fizz  Buzz  71  Fizz  73  74  FizzBuzz  76  77  Fizz  79  Buzz  Fizz  82  83  Fizz  Buzz  86  Fizz  88  89  FizzBuzz  91  92  Fizz  94  Buzz  Fizz  97  98  Fizz  Buzz  