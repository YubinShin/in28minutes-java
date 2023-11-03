function findSecondLargestElement(param){
    const array = param.sort();
    let result = 0;
    array.reduce((a,b)=>{
        if(a < b){
            result = a;
        }
    })
}