println "<ul>"
(1..100).each{
    if(it%15==0){
        it =  "FizzBuzz"
    }else if(it%3==0){
        it = "Fizz"
    }else if(it%5==0){
        it = "Buzz"
    }
    print "<li>${it}</li> "
}
println "</ul>"
