// happy coding 👻
console.log("hello world");
function fibonacci(index: number): number {
    if (index == 0){
        return index;
    }
    if (index == 1){
        return index;
    }
    return fibonacci(index-1)+fibonacci(index-2);
}
let sum: number = 0;
let n:number = 5;
for (let i=0;i<n;i++){
    sum += fibonacci(i);
}
console.log(sum);