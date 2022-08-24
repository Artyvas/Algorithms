def reverse_string(s)
    # i = 0
    # hash_table = {}
    # result_array = []

    # while i <= s.length - 1
    #   temp = s.push()
    #   s.unshift(temp)
    #   i += 1
    # end
    # i = s.length - 1
    # while i >= 0
    #   result_array.push(hash_table[i])
    #   i -= 1
    # end

    i = 0
    m = 1
    original_length = s.length
    while i < original_length
      s.push(s[original_length - m])
      i += 1
      m += 1
    end
    s.slice(0,original_length)
    pp s
end

reverse_string(["h", "e", "l", "l", "o"])