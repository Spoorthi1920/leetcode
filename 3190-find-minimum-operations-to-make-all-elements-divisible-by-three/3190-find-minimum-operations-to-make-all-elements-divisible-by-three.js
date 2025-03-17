/**
 * @param {number[]} nums
 * @return {number}
 */
var minimumOperations = function(nums) {
    let cnt=0;
    for(const i of nums){
        if(i%3!=0) cnt++;
    }
    return cnt;
};