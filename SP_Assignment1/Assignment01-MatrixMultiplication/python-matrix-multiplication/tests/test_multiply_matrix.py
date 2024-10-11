import pytest
import numpy as np
import json

from main_code.matrix_multiplication import multiply_matrix

def generate_test_cases(file_name='test_cases.json'):
    test_cases = []
    for _ in range(5):
        rows1, cols1 = np.random.randint(1, 5, size=2)  
        rows2, cols2 = cols1, np.random.randint(1, 5)    
        
        mat1 = np.random.randint(1, 10, size=(rows1, cols1)).tolist()
        mat2 = np.random.randint(1, 10, size=(rows2, cols2)).tolist()
        test_cases.append({"mat1": mat1, "mat2": mat2})

    with open(file_name, 'w') as file:
        json.dump(test_cases, file, indent=4)

generate_test_cases('test_cases.json')

def read_test_cases(file_name='test_cases.json'):
    with open(file_name, 'r') as file:
        test_cases = json.load(file)
    return test_cases
            
@pytest.mark.parametrize("test_case", read_test_cases())

def test_multiply_matrix(test_case):
    mat1 = test_case["mat1"]
    mat2 = test_case["mat2"]
    
    result = multiply_matrix(mat1, mat2) 
    
    assert len(result) == len(mat1)  
    assert len(result[0]) == len(mat2[0])  

    expected_result = np.dot(np.array(mat1), np.array(mat2)).tolist()  
    
    with open('expected_results.json', 'a') as result_file:
        json.dump({"mat1": mat1, "mat2": mat2, "expected_result": expected_result}, result_file, indent=4)
        result_file.write('\n')  
        
    assert result == expected_result 