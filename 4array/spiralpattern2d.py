def spiral(n):
    matrix = [[0] * n for _ in range(n)]
    top, bottom, left, right = 0, n - 1, 0, n - 1
    number = 1
    while top <= bottom and left <= right:
        for column in range(left, right + 1):
            matrix[top][column] = number
            number += 1
        top += 1
        for row in range(top, bottom + 1):
            matrix[row][right] = number
            number += 1
        right -= 1
        if top <= bottom:
            for column in range(right, left - 1, -1):
                matrix[bottom][column] = number
                number += 1
            bottom -= 1
        if left <= right:
            for row in range(bottom, top - 1, -1):
                matrix[row][left] = number
                number += 1
            left += 1
    for row in matrix:
        print(*row)


if __name__ == "__main__":
    spiral(int(input()))
