__author__ = 'Archer James'

from rand_list import *
from random import *


class TreeNode:
    def __init__(self, item):
        self.key = item
        self.left = None
        self.right = None

    def get_key(self):
        return self.key

    def __str__(self):
        return str(self.key)

    def is_leaf(self):
        return self.left is None and self.right is None


class BinarySearchTree:
    def __init__(self):
        self.root = None

    def find(self, key):
        if self.root is None:  # tree is empty
            return 0
        else:
            return self.search(self.root, key)

    def search(self, current_node, key):
        current_key = current_node.get_key()
        count = 0
        if current_key == key:
            return count + 1
        elif key > current_key and current_node.right:
            return count + 1 + self.search(current_node.right, key)
        elif key < current_key and current_node.left:
            return count + 1 + self.search(current_node.left, key)
        else:
            return 0

    def store(self, key):
        if self.root is None:  # empty BST
            self.root = TreeNode(key)
        else:  # non-empty tree
            self._add_node(self.root, key)

    def _add_node(self, current_node, item):
        if item > current_node.get_key():  # add to right sub-tree
            if current_node.right is None:
                current_node.right = TreeNode(item)
            else:
                self._add_node(current_node.right, item)
        elif item < current_node.get_key():  # add to left sub-tree
            if current_node.left is None:
                current_node.left = TreeNode(item)
            else:
                self._add_node(current_node.left, item)

    def __str__(self):
        if self.root:
            return self._pretty_print(self.root, 0)

    def _pretty_print(self, current_node, offset):
        spacer = 5
        print_string = ""
        if current_node.right:
            print_string += self._pretty_print(current_node.right, offset + spacer)

        if not current_node.is_leaf():
            print_string += "\n" + ' ' * offset + str(current_node) + '-' * spacer
        else:
            print_string += "\n" + ' ' * offset + str(current_node)

        if current_node.left:
            print_string += self._pretty_print(current_node.left, offset + spacer)

        return print_string

    def count_nodes(self, current_node):
        """
        count_nodes method for BST class - gets the number of nodes in the tree
        :param current_node: Current node used for iterating over the tree
        :return: The number of nodes in the tree
        """
        count = 0
        if current_node.left:
            count = self.count_nodes(current_node.left)
        count += 1
        if current_node.right:
            count += self.count_nodes(current_node.right)
        return count

    def get_height(self, current_node):
        """
        get_height method for BST - gets the height of the tree
        :param current_node:Current node used for iterating over the tree
        :return:height of the tree
        """
        if self.root:
            count_left = 0
            count_right = 0
            if current_node.left:
                count_left += self.get_height(current_node.left) + 1
            if current_node.right:
                count_right += self.get_height(current_node.right) + 1
            if count_left > count_right:
                return count_left
            else:
                return count_right
        else:
            return 0


def main():
    t = BinarySearchTree()
    # a = [70, 89, 65, 74, 34, 49, 109, 120, 66, 17, 167]
    a = ["apple", "ball", "cat", "croak", "ant", "aardvark", "duck"]
    for r in a:
        t.store(r)

    print(t)
    print(t.count_nodes(t.root))
    print(t.get_height(t.root))
    print(t.find("ant"))


# main()

def part2(file):
    """
Part 2 function for the experiment
    :param file: name of the file used
    :return:A list of the numbers in the file
    """
    t = BinarySearchTree()
    a = []
    f = open(file)
    for item in f:
        a.append(item)
    for r in a:
        t.store(int(r))
    return t


# UNCOMMENT FOR PART 2 EXPERIMENT
# a = part2("ssn.txt")
# print("part 2")
# print("nodes: "+str(a.count_nodes(a.root)))
# print("height: "+str(a.get_height(a.root)))
# print("search: "+str(a.find(randint(100000000,999999999))))


def experiment(size):
    """
    experiment function for the BST class
    :param size:Size of the list to be tested
    :return:The number of nodes, height, and nodes examined for the tests
    """
    num = 1
    nodes = 0
    height = 0
    examine = 0
    while num <= 10:
        N = []
        for item in range(0, size):
            N.append(random.randint(0, 10000))
        t = BinarySearchTree()
        for number in N:
            t.store(number)
        nodes += t.count_nodes(t.root)
        height += t.get_height(t.root)
        examine += t.find(100)
        examine += t.find(2000)
        examine += t.find(8000)
        num += 1
    nodes = nodes / 10
    height = height / 10
    examine = examine / 30

    final = ('nodes:' + str(nodes) + " , height:" + str(height) + " , examined:" + str(examine))
    return final

# UNCOMMENT FOR EXPERIMENT
# print(experiment(16))
