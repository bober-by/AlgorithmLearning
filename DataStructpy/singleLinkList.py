class SingleNode(object):

    def __init__(self, data):
        self.data = data
        self.next = None


class SinLinkList(object):
    def __init__(self):
        self._head = None

    def add(self, item):
        node = SingleNode(item)

        node.next = self._head
        self._head = node

    def is_empty(self):
        if self._head == None:
            return True

    def length(self):
        if self.is_empty():
            return 0
        count = 0
        cur = self._head
        while cur != None:
            count += 1
            cur = cur.next

        return count

    def travle(self):
        cur = self._head
        while cur != None:
            print(cur.data)
            cur = cur.next

    def insert(self, item, pos):
        if pos < 0 or pos > self.length():
            return False
        cur = self._head
        count = 0
        node = SingleNode(item)
        while count < pos - 1:
            cur = cur.next
            count += 1

        node.next = cur.next
        cur.next = node

    def append(self, item):
        node = SingleNode(item)
        if self._head == None:
            self._head = node
        else:
            cur = self._head
            while cur.next != None:
                cur = cur.next
            cur.next = node

    def delete(self, item):
        cur = self._head
        pre = None
        while cur != None:
            if cur.data == item:
                if not pre:
                    self._head = cur.next
                else:
                    pre.next = cur.next
            else:
                pre = cur
                cur = cur.next

