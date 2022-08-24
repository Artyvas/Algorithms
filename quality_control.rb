# def first_bad_version(n)
#   temp = n
#   while true
#     if is_bad_version(temp) && !is_bad_version(temp - 1)
#       return temp
#     elsif temp < 1
#       break
#     else 
#       temp = temp - 1
#       # What is the case that gives me the n that I want?
#       # Where is_bad_version(n-1) === false AND is_bad_version(n) === true
#     end    
#   end
# end

# ^^^ This solution only works when n is small and bad is close to that n, relatively speaking. Otherwise it can be slow. Time for a binary search implementation. 

def first_bad_version(n)
  upper_bound = n
  lower_bound = 1
  midpoint = (upper_bound + lower_bound) / 2
  if is_bad_version(n) && !is_bad_version(n)
    return n
  end
  while true
    if is_bad_version(midpoint) && !is_bad_version(midpoint - 1)
      return midpoint
    elsif midpoint < 1
      break
    elsif !is_bad_version(midpoint)
      lower_bound = midpoint + 1
      midpoint = (upper_bound + lower_bound) / 2
    else
      upper_bound = midpoint - 1
      midpoint = (upper_bound + lower_bound) / 2
    end    
  end
end
first_bad_version(5)