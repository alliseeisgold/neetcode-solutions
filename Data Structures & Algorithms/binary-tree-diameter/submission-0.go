func diameterOfBinaryTree(root *TreeNode) int {
    if root == nil {
        return 0
    }
    
    maxHight := make(map[*TreeNode]int)
    diameter := 0  // ← добавляем переменную для диаметра
    
    var findHight func(root *TreeNode)
    findHight = func(root *TreeNode) {
        if root == nil {
            return
        }
        
        // Сначала обрабатываем детей
        findHight(root.Left)
        findHight(root.Right)
        
        // Вычисляем высоту текущего узла
        leftVal := 0
        if root.Left != nil {
            leftVal = maxHight[root.Left] + 1
        }
        
        rightVal := 0
        if root.Right != nil {
            rightVal = maxHight[root.Right] + 1
        }
        
        maxHight[root] = max(leftVal, rightVal)
        
        // ← КЛЮЧЕВОЕ: обновляем диаметр (путь через текущий узел)
        diameter = max(diameter, leftVal + rightVal)
    }
    
    findHight(root)
    return diameter  // ← возвращаем максимальный диаметр, а не только через корень
}

func max(a, b int) int {
    if a > b {
        return a
    }
    return b
}