def multiply_matrix(matrix1, matrix2):
    matrix1_row = len(matrix1)
    matrix1_col = len(matrix1[0])
    matrix2_col = len(matrix2[0])

    result = [[0 for i in range(matrix2_col)] for i in range(matrix1_row)]

    for i in range(matrix1_row):
        for j in range(matrix2_col):
            for k in range(matrix1_col):
                result[i][j] += matrix1[i][k] * matrix2[k][j]

    return result