// happy coding 👻
console.log("hello world");
function fibonacci(index) {
    if (index == 0) {
        return index;
    }
    if (index == 1) {
        return index;
    }
    return fibonacci(index - 1) + fibonacci(index - 2);
}
var sum = 0;
var n = 5;
for (var i = 0; i < n; i++) {
    sum += fibonacci(i);
}
console.log(sum);
