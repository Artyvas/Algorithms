def move_zeroes(nums)
   i = 0
   k = 0
   while i < nums.length - 1
    if nums[i] === 0
      k += 1
    end
    i += 1
   end
   nums.delete(0)
   k.times do
    nums.push(0)
    end 
   return nums
end

move_zeroes([0,0,1])