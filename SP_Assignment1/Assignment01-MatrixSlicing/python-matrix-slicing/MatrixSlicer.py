class MatrixSlicer:

    def slice_matrix(array, row_start, row_end, col_start, col_end):
        return [row[col_start:col_end + 1] for row in array[row_start:row_end + 1]]

    def print_matrix(matrix):
        for row in matrix:
            print(row)
            
    def display_matrix(matrix, row_start, row_end, col_start, col_end):
        root = tk.Tk()
        root.title("Sliced Matrix")

        for i in range(len(matrix)):
            for j in range(len(matrix[i])):
                value = matrix[i][j]
                label = tk.Label(root, text=str(value), borderwidth=2, relief="solid", width=6, height=3)
                
                if row_start <= i <= row_end and col_start <= j <= col_end:
                    label.config(bg="yellow", fg="red")  

                label.grid(row=i, column=j, padx=5, pady=5)

        root.mainloop()

