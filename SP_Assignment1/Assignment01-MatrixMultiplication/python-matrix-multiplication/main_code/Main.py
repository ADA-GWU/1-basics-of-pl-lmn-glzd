def input_matrix(rows, cols, matrix_name):
    matrix = []
    print(f"Enter the {matrix_name} matrix with {rows} x {cols} size:")

    for i in range(rows):
        while True:
            row = input(f"Enter row {i+1} (space-separated {cols} elements): ").split()
            
            if len(row) != cols:
                print(f"You entered wrong number of elements. Please enter {cols} elements. Re-enter row {i+1}.")
            else:
                matrix.append([int(x) for x in row])
                break

    return matrix

def main():
    while True:
        n, m = map(int, input("Enter the dimensions for the first matrix (n m): ").split())

        l, k = map(int, input("Enter the dimensions for the second matrix (l k): ").split())

        if m != l:
            print("These matrices cannot be multiplied due to incompatible dimensions. Please re-enter the dimensions.")
        else:
            break

    mat1 = input_matrix(n, m, "first")
    mat2 = input_matrix(l, k, "second")

    multiply_matrix(mat1, mat2)

if __name__ == "__main__":
    main()
