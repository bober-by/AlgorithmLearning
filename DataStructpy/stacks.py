class Stack(object):
    def __init__(self):
        self.itmes = []

    def push(self,item):
        self.itmes.append(item)

    def pop(self):
        self.itmes.pop()

    def length(self):
        return len(self.itmes)

    def peek(self):
        return self.itmes[self.length()-1]

