var factorial = function fac(n){
    return n<2 ? 1:n* fac(n-1);
}
console.log("Factorial of 3: ",factorial(3));
 