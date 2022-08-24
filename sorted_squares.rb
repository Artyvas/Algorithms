def sorted_squares(nums)
  # iterate through array one by one and square each element. 
  # Create square array - sort it as you insert into it. 
  # Which algorithm to use to insert?
  # Could do linear search - but binary search is certainly better (and would work in this instance since the array is sorted as part of it's creation
  # Need to go over Data Structures & Algorithms notes from last semester to go over the speeds of each type of sort (and maybe try to implement all of them into code)
  i = 0
  result_array = []
  while i <= nums.length - 1
    temp = nums[i] * nums[i]
    result_array.push(temp)
    i += 1
  end
  i = 1
  while i <= result_array.length - 1
    j = i
    while j > 0
      if result_array[j-1] > result_array[j]
        temp = result_array[j-1]
        result_array[j - 1] = result_array[j]
        result_array[j] = temp
      else
        break
      end
      j -= 1
    end
    i += 1
  end
  pp result_array
end

# This ended up being too inefficient of a solution for Leetcode
# - I ended up needing to return result_array.sort in order to pass on time. 
sorted_squares([-4,-1,0,3,10])
