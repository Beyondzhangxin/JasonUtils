# coding=utf-8
# 如何查询和替换一个文本中的字符串
#最简单的方法使用replace()
tempstr = "hello you hello python are you ok"
print (tempstr.replace("you","python"))
#还可以使用正则,有个sub()
tempstr = "hello you hello python are you ok"
import re
rex = r'(hello|Use)'
print(re.sub(rex,"Bye",tempstr))

# 使用python实现单例模式
#方法二:使用装饰器,建立过实例的就放到instances里面,下次建立的时候先检查里面有没有
def SingleTon(cls,*args,**kwargs):
    instances = {}
    print (instances)
    def _singleton():
        if cls not in instances:
            instances[cls] = cls(*args,**kwargs)
        print(instances)
        return instances[cls]
    return _singleton

@SingleTon
class LastClass(object):
    a = 1
test1 = LastClass()
print(test1.a)
test2 = LastClass()
print (test2.a)

#方法五:使用同一个模版
#写在mysingleton.py中
class My_Singleton(object):
    def foo(self):
        pass

my_singleton = My_Singleton()

#写在要使用这个实例的py文件里面,在不同的引用的地方都引用相同的实例,以此实现单例模式
# from mysingleton import my_singleton
my_singleton.foo()

def rightStrip(tempStr,splitStr):
    endindex = tempStr.rfind(splitStr)
    while endindex != -1 and endindex == len(tempStr) - 1:
         tempStr = tempStr[:endindex]
         endindex = tempStr.rfind(splitStr)
    return tempStr


# 重新实现str.strip()
def leftStrip(tempStr,splitStr):
    startindex = tempStr.find(splitStr)
    while startindex == 0:
        tempStr = tempStr[startindex+1:]
        startindex = tempStr.find(splitStr)
    return tempStr

str = "  H  "
print(str)
print(leftStrip(str,' '))
print(rightStrip(str,' '))

# 给列表中的字典排序
alist = [{"name":"a","age":20},{"name":"b","age":30},{"name":"c","age":25}]
alist.sort(key=lambda:x:-x.get("age"))
print(alist)

# 合并两个列表排除重复元素
alist = ['a','b','c','d','e','f']
blist = ['x','y','z','e','f']
def merge_list(*args):
    s = set()
    for i in args:
        s = s.union(i)
    print(s)
    return s

merge_list(alist,blist)

# 打乱一个排好序的列表
from random import shuffle
alist = range(10)
print(alist)
shuffle(alist)
print(alist)

# 简单的实现一个栈结构 stack
class Stack(object):
    def __init__(self):
        self.value = []

    def push(self,x):
        self.value.append(x)

    def pop(self):
        self.value.pop()

stack = Stack()

# 输入一个日期,返回时一年中的第哪一天
from datetime import datetime
def which_day(year,month,day):
    return (datetime(year,month,day)-datetime(year,1,1)).days+1

print(which_day(2017,1,15))
###12.把字符串”k1:1|k2:2|k3:3”处理成 python 字典的形式:{k1:1,k2:2,k3:3}
def string_to_dict(string):
    d = {}
    for kv in string.split("|"):
        k,v = kv.split(":")
        if v.isdigit():
            v=int(v)
        d[k]=v
    return d

print(string_to_dict("k1:1|k2:2|k3:3"))

# 判断输入的值是否在矩阵之中(杨氏矩阵)
#处理数组矩阵
arr = [[1,4,7,10,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]]
def get_num(num,data=None):
    while data:
        if num > data[0][-1]:
            del data[0]
        elif num<data[0][-1]:
            data = list(zip(*data))
            del data[-1]
            data = list(zip(*data))
        else:
            return True
            data.clear()
    return False
print (get_num(18,arr))

# 获取最大公约数(欧几里得算法)
def max_common(a,b):
    while b:
        a,b=b,a%b
    return a
# 求两个数的最小公倍数(公式法)
def min_common(a,b):
    c= a*b
    while b:
        a,b=b,a%b
    return c//a

# .获取中位数
#计算中位数
def mediannum(num):
    listnum = [num[i] for i in range(len(num))]
    listnum.sort()
    lnum = len(num)
    if lnum % 2 == 1:
        i = int((lnum + 1) / 2)-1
        return listnum[i]
    else:
        i = int(lnum / 2)-1
        return (listnum[i] + listnum[i + 1]) / 2