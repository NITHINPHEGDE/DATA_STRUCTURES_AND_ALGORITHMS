from collections import Counter


def most_frequent_element(nums):
    counts = Counter(nums)
    ordered = sorted(counts, key=lambda value: (-counts[value], value))
    if len(ordered) < 2:
        raise ValueError("at least two distinct elements are required")
    return ordered[1]


if __name__ == "__main__":
    data = list(map(int, input().split()))
    print(most_frequent_element(data))
