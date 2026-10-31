from collections import Counter


def sum_of_elements(nums):
    counts = Counter(nums)
    most_frequent = min(counts, key=lambda value: (-counts[value], value))
    least_frequent = min(counts, key=lambda value: (counts[value], value))
    return most_frequent + least_frequent


if __name__ == "__main__":
    data = list(map(int, input().split()))
    print(sum_of_elements(data))
