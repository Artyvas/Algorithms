def rotate (nums,k)
    k.times do
      n = nums.pop
      nums.unshift(n)
    end
    return nums
end

# array = [1,2,3,4,5,6]

# pp array.unshift(2)

rotate([1,2,3,4,5],3)