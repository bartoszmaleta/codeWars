function howManySmaller(arr, n) {

    let count = 0;
    for (let i = 0; i < arr.length; i++) {
        let num = arr[i].toFixed(2);
        console.log(num);
        num = +num;
        console.log(num);
        if (num < n) {
            count++;
            console.log(count);
        }
    }
    return count;
}


function howManySmaller(arr,n){
    return arr.filter(x => +x.toFixed(2) < n).length;

}

// WHY WRONG???
function howManySmaller(arr,n){
    return arr.filter(x => {
        +x.toFixed(2) < n
    }).length;
}