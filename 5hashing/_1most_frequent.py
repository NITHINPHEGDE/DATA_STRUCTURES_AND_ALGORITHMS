from collections import Counter


def most_frequent_element(nums):
    counts = Counter(nums)
    return min(counts, key=lambda value: (-counts[value], value))


if __name__ == "__main__":
    data = list(map(int, input().split()))
    print(most_frequent_element(data))
