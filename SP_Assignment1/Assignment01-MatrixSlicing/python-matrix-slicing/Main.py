def main():
    rows, cols = map(int, input("Please enter the number of rows and columns for the 2D matrix: ").split())
    
    arr = []
    print("Enter the 2D matrix below:")
    for _ in range(rows):
        row = list(map(int, input().split()))
        arr.append(row)
    
    while True:
        print("Enter index values for slicing the matrix:\n")
        row_start, row_end = map(int, input("Start and end index for rows: ").split())
        col_start, col_end = map(int, input("Enter start and end index for columns: ").split())

        if row_start < 0 or row_end >= rows:
            print("Please enter valid row indices for slicing.")
            continue
        if col_start < 0 or col_end >= cols:
            print("Please enter valid column indices for slicing.")
            continue
        break

    result_matrix = MatrixSlicer.slice_matrix(arr,row_start,row_end,col_start,col_end)

    print("Resulting matrix is:")
    MatrixSlicer.print_matrix(result_matrix)
    MatrixSlicer.display_matrix(arr,row_start,row_end,col_start,col_end)

if __name__ == "__main__":
    main()

