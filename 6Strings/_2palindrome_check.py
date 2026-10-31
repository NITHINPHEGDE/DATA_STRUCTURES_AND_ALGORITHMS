def is_palindrome(value):
    return value == value[::-1]


if __name__ == "__main__":
    print(is_palindrome(input()))
