####
# Develop recursive implementations for each function below
# You may use the following list and string functions: len, the slice operator, + operator
# Otherwise you may not use any other list or string functions or operators
# Test your implementations
# Submit the file when complete
####
from testing import test


def list_sum(a_list):
    """list_sum function - return sum of list
    Returns the sum of all the numbers in a_list
    :param a_list: list to be used in function
    :returns: final sum of list
    """
    if not a_list:
        return 0
    else:
        return a_list[0] + list_sum(a_list[1:])


def length(a_list):
    """length function - returns length of list
    Returns the number of items in, i.e. length of, a_list
    :param a_list: list to be used in function
    :returns: length of the list

    """
    if not a_list:
        return 0
    else:
        return 1 + length(a_list[1:])


def reverse(s):
    """reverse function - reverses string
    Returns the reverse of string s
    :param s: string to be reversed
    :returns : reverse of s
    """
    if s == "":
        return ""
    else:
        return str(reverse(s[1:])) + s[0]


def is_palindrome(s):
    """is_palindrome function - checks string for being a palindrome
    Returns True if s is a palindrome, False otherwise
    :param s: string to be checked for being a palindrome
    :returns: True if s is a palindrome, False if not
    """
    if len(s) == 1:
        return True
    elif s == "":
        return True
    elif s[0] == s[-1]:
        return is_palindrome(s[1:-1])
    else:
        return False


def contains(a_list, a_value):
    """contains - returns True or False if value is in list
    Returns True if a_list contains a_value, False otherwise
    :param a_list: list to be used in function
    :param a_value: value to be searched for in a_list
    :returns: True if a_value is in a_list, False if not
    """
    if not a_list:
        return False
    elif a_list[0] == a_value:
        return True
    else:
        return contains(a_list[1:], a_value)


def count(a_list, a_value):
    """count function - counts occurrences of value in list
    Return count of how many times a_value appears in a_list
    :param a_list: list to be checked for containing value
    :param a_value: value to be searched for in list
    :returns: count of times a_value appears in list
    """
    if not a_list:
        return 0
    elif a_list[0] == a_value:
        return 1 + count(a_list[1:], a_value)
    else:
        return count(a_list[1:], a_value)


def my_max(a_list):
    """my_max - returns larges value in list
    Return the largest value in a_list, a non-empty list of integers.
    :param a_list: list containing values to be checked
    :returns: largest value in a_list
    """
    if len(a_list) == 1:
        return a_list[0]
    elif a_list[0] > a_list[1]:
        return my_max(a_list[0:1] + a_list[2:])
    else:
        return my_max(a_list[1:])


def index(value, a_list):
    """index function - returns index of value in a_list
    Return index of first occurrence of value in a_list, -1 if value is not in a_list
    Examples:
        index(10, [1,2,33,10,4]) returns 3
        index(10, [10,22,3,4]) returns 0
        index(10, [1,22,3,4,10]) returns 4
        index(10, [11,2,33,44]) returns -1
    :param: value: value to be found in list
    :param: a_list: list to be used in function
    :returns: index of first occurrence of item in list
    """
    if not a_list:
        return -1
    else:
        if value == a_list[0]:
            return 0
        elif index(value, a_list[1:]) == -1:
            return -1
        else:
            return 1 + index(value, a_list[1:])


def range_list(num):
    """range_list function - creates a list from 0 to number
    Returns a list containing values 0...num, both inclusive
    Examples:
        range_list(10) returns [0,1,2,3,4,5,6,7,8,9,10]
        range_list(5) returns [0,1,2,3,4,5]
    :param num: number to be used to determine numbers in list
    :returns: list from 0 to num
    """
    if num == 0:
        return [0]
    else:
        return range_list(num - 1) + [num]


def remove(value, a_list):
    """remove function - removes value from a_list
    Removes first occurrence of value in a_list and returns the rest of a_list
    If value is not present in a_list, returns a_list
    Examples:
        remove(10, [1,2,3,10,4]) returns [1,2,3,4]
        remove(10, [10,2,3,4]) returns [2,3,4]
        remove(10, [1,2,3,4,10]) returns [1,2,3,4]
        remove(10, [1,2,3,4]) returns [1,2,3,4]
    :param value: value to be removed from list
    :param a_list: list to be used in function
    :returns: a_list with value removed
    """
    if not a_list:
        return []
    else:
        if value == a_list[0]:
            return a_list[1:]
        else:
            return [a_list[0]] + remove(value, a_list[1:])


def deep_sum(a_list):
    """deep_sum function - adds the items of a list
    Returns sum of items in a_list even if a_list contains lists which contain
    other lists which contain other lists....
    
    Note: This might be useful: type(item) == list returns True if item is a list. 
    Examples:
        deep_sum([1,2,[3,4,[5,6,7]],8]) returns 36
        deep_sum([1,2,[3,4],5]) returns 15
        deep_sum([1,2,3,4]) returns 10
    :param a_list: list to be used in function
    :returns: total sum of all items in list
    """
    if not a_list:
        return 0
    elif type(a_list[0]) == list:
        return deep_sum(a_list[0]) + deep_sum(a_list[1:])
    else:
        return a_list[0] + deep_sum(a_list[1:])


def equals(s1, s2):
    """equals function - compares two strings
    Returns True if strings s1 and s2 contain exactly the same characters in the same order, False otherwise
    :param s1: string to be used in function
    :param s2: second string to be used in function
    :returns:True if s1 and s2 are exactly the same, False if not
    """
    if s1 == "" and s2 == "":
        return True
    else:
        if s1 == "" or s2 == "":
            return False
        elif s1[0] != s2[0]:
            return False
        else:
            return equals(s1[1:], s2[1:])


def prefix(s1, s2):
    """prefix function - compares two strings
    Returns true if s2 is a prefix for s1, i.e. s1 starts with s2, False otherwise
    Examples:
        prefix("apple", "app") returns True
        prefix("python", "py") returns True
        prefix("python", "pytx") returns False
    :param s2: string to be checked if it is a prefix of s2
    :param s1: string to be used in function
    :returns: True if s2 is a prefix, False if not
    """
    if s2 == "":
        return True
    else:
        if s1[0] == s2[0]:
            return prefix(s1[1:], s2[1:])
        else:
            return False


def substring(s1, s2):
    """substring function - compares two strings
    Returns True if string s1 contains string s2, False otherwise
    Examples:
        substring("photograph", "photo") returns True
        substring("photograph", "graph") returns True
        substring("photographer", "graph") returns True
        substring("photograph", "hot") returns True
        substring("photograph", "gruph") returns False
    :param s1: String to be used in function
    :param s2: string to be checked if it is in s1
    :returns: True if s2 is in s1, False if not
    """
    if s2 == "":
        return True
    elif s1 == "":
        return False
    else:
        if s1[0] == s2[0]:
            return substring(s1[1:], s2[1:])
        else:
            return substring(s1[1:], s2)


#
# Place all your tests in the main function
# 
def main():
    test(15, list_sum, [1, 2, 3, 4, 5])
    test(0, list_sum, [])
    test(20, list_sum, [5, 3, 2, 4, 6])

    test(4, length, [1, 2, 3, 4])
    test(0, length, [])
    test(5, length, [1, 1, 2, 2, 3])

    test("bat", reverse, "tab")
    test("", reverse, "")
    test("ball", reverse, "llab")

    test(True, is_palindrome, "racecar")
    test(False, is_palindrome, "jimmy")
    test(True, is_palindrome, "a")
    test(True, is_palindrome, "")

    test(True, contains, [11, 2, 5], 2)
    test(False, contains, [1, 2, 4, 8], 3)
    test(True, contains, [1, 3, 11], 11)
    test(True, contains, [11, 2, 3, 4], 11)
    test(False, contains, [], 9)

    test(2, count, [1, 2, 3, 1], 1)
    test(4, count, [1, 1, 1, 1, 2, 3, 4, 2, 2, 3, 4, 4, 4], 1)
    test(0, count, [], 78)
    test(0, count, [2, 3, 44, 6, 7, 7, 5, 54], 1)

    test(30, my_max, [2, 30, 23, 12, 23])
    test(11, my_max, [11])
    test(23, my_max, [3, 8, 1, 23])

    test(3, index, 3, [0, 1, 2, 3, 4, 5])
    test(5, index, 2, [1, 5, 7, 4, 5, 2])
    test(-1, index, 4, [1, 2, 7, 5, 3, 9])

    test([0, 1, 2, 3, 4, 5], range_list, 5)
    test([0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10], range_list, 10)
    test([0], range_list, 0)

    test([1, 2, 3, 4], remove, 10, [1, 2, 3, 10, 4])
    test([2, 3, 4], remove, 10, [10, 2, 3, 4])
    test([1, 2, 3, 4], remove, 10, [1, 2, 3, 4])

    test(15, deep_sum, [1, 2, [3, 4], 5])
    test(36, deep_sum, [1, 2, [3, 4, [5, 6, 7]], 8])
    test(10, deep_sum, [2, 3, 5])

    test(True, equals, "apple", "apple")
    test(False, equals, "orange", "apple")
    test(False, equals, "", "red")

    test(True, prefix, "apple", "app")
    test(True, prefix, "python", "py")
    test(False, prefix, "python", "pytx")

    test(True, substring, "photograph", "photo")
    test(True, substring, "photograph", "graph")
    test(False, substring, "photograph", "griph")


if __name__ == "__main__":
    main()
