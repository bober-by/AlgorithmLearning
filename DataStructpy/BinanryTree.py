class Node(object):
    def __init__(self, data=None, lchild=None, rchild=None):
        self.data = data
        self.lchild = lchild
        self.rchild = rchild


class BinanryTree(object):
    def __init__(self, root=None):
        self.root = root

    def add(self, item):
        node = None(item)

        if self.root == None:
            self.root = node

        else:

            queue = []
            queue.append(self.root)

            while queue:
                cur = queue.pop(0)
                if cur.lchild == None:
                    cur.lchild = node
                elif cur.rchild == None:
                    cur.rchild == node

                else:
                    queue.append(cur.lchild)
                    queue.append(cur.rchild)


# 先序遍历---非递归
def preorder(self, root):
    if root == None:
        return
    stack = []
    stack.append(root)
    while stack:
        cur = len(stack) - 1
        if stack[cur].lchild:
            stack.append(root.lchild)
        else:
            node = Node(stack[cur])
            print(stack.pop())
            if node.rchild:
                stack.append(node.rchild)
             

# 中序遍历
def inorder(self, root):
    pass


# 后序遍历
def postorder(self, root):
    pass
