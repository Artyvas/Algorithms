
 var removeDuplicates = function(nums) {
  let hashIndex = {};
  
  for (let i = nums.length - 1; i >= 0; i--) {
      if (nums[i] in hashIndex) {
          nums.splice(i,1);
        
      }
      hashIndex[nums[i]] = i;
  }
console.log(nums);
};