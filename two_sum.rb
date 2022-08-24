def two_sum(numbers, target)
  result = []
  index_hash = {}  
  i = 0
    while i <= numbers.length - 1
      # j = 0
      # while j <= numbers.length - 1
      #   if numbers[j] + numbers[i] === target && j!=i
      #     result.push(i + 1)
      #     result.push(j + 1)
      #     return result
      #   end
      #   j += 1
      # end
      # This nested loop method timed out on a large data set - need to use a hash map instead
      index_hash[numbers[i]] = i
      # I made a mistake here where I made the indices the keys ands not the values - when I switched it up, it worked.
      i += 1
    end
    numbers.each_with_index do |value, i|
      diff = target - value
      if index_hash[diff]
            ans_one = index_hash[diff] + 1
            ans_two = i + 1
          return[ans_two, ans_one]
      else
        index_hash[value] = i
      end
    end
end

two_sum([2,7,11,15], 9)