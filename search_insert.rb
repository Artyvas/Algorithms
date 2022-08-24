def search_insert(nums, target)
  upper_bound = nums.length - 1
  lower_bound = 0
  i = 0  
    if nums.length === 1
        if target < nums[0]
            return 0
        else
            return nums.length]
        end
    end
  while i <= nums.length
    midpoint = (lower_bound + upper_bound) / 2
      if nums[midpoint] === target
        return midpoint
      elsif nums[midpoint] > target && nums[midpoint - 1] < target
        return midpoint
      elsif nums[midpoint] > target
        upper_bound = midpoint - 1
      elsif nums[midpoint] < target
        lower_bound = midpoint + 1
      end
    i = i + 1
  end 
if target < nums[0]
    return 0
else
return nums.length
end
end
