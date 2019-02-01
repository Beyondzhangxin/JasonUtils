# coding=utf-8
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