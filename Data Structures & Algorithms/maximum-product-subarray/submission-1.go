func maxProduct(nums []int) int {
  maxMult, minMult := 1, 1
    answer := nums[0]
    for i := 0; i < len(nums); i++ {
        val1, val2 := maxMult * nums[i], minMult * nums[i]
        maxMult = max(val1, val2)
        maxMult = max(maxMult, nums[i])
        
        minMult = min(val1, val2)
        minMult = min(minMult, nums[i])
        
        
        answer = max(answer, maxMult)
    }
    
    return answer
}

func max(a, b int) int {
    if a > b {
        return a
    }
    
    return b
}

func min(a, b int) int {
    if a < b {
        return a
    }
    
    return b
}