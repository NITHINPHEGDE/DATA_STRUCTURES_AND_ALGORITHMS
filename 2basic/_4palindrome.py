def is_palindrome(n):
    value = str(n)
    return value == value[::-1]


if __name__ == "__main__":
    print(is_palindrome(int(input())))
