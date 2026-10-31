from collections import Counter


def is_anagram(first, second):
    return Counter(first) == Counter(second)


if __name__ == "__main__":
    print(is_anagram(input(), input()))
