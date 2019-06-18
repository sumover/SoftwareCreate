组合模式

模式定义
========

允许将对象组合成树形结构来表现整体-部分层次结构. 组合能让客户以一致的方式处理个别对象以及对象组合

问题描述
========

用组合模式模拟一个组合的菜单, 菜单下可能会有菜单或者是点的菜

此处用Python3.7实现, `yield`方法实现next方法

Code
====

```python
class Food(object):
    def __init__(self, arg):
        self.__name = arg

    def get_name(self):
        return self.__name


class Menu(object):
    def __init__(self):
        self.content = list()

    def add(self, node):
        self.content.append(node)

    def traverse(self):
        for iter in self.content:
            if isinstance(iter, Menu):
                for _ in iter.traverse():
                    yield _
            elif isinstance(iter, Food):
                yield iter


if __name__ == '__main__':
    hotFood = Menu()
    hotFood.add(Food("土豆丝"))
    hotFood.add(Food("宫保鸡丁"))
    soup = Menu()
    soup.add(Food("疙瘩汤"))
    hotFood.add(soup)
    coldFood = Menu()
    coldFood.add(Food("凉拌茄子"))
    food = Menu()
    food.add(coldFood)
    food.add(hotFood)
    for n in food.traverse():
        print(n.get_name())

```

运行结果
========

out

```
凉拌茄子
土豆丝
宫保鸡丁
疙瘩汤
```
