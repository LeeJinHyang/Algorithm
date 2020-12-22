#핵심 소스코드의 설명을 주석으로 작성하면 평가에 큰 도움이 됩니다.
class Solution:
    def solution(self, goods):
        goods.sort(reverse = True)
        print(goods)
        check = []
        cnt = 0
        idx = 0
        num = 0
        result = 0
        if goods[0] >= 50 :
            result = goods[0] - 10
            if goods[1] >= 50:
                result = result + goods[1] - 10
                if goods[2] >= 50:
                    result = result + goods[2] - 10
                else:
                    result = result + goods[2]
            else:
                if goods[1] + goods[2] >= 50:
                    result = result + goods[1] + goods[2] - 10
                else:
                    result = result + goods[1] + goods[2] 
        else:
            if goods[0] + goods[2] >= 50:
                result = goods[0]+goods[2] - 10
                if goods[1] >= 50:
                    result = result + goods[1] - 10
                else:
                    result = result + goods[1]
            else:
                if goods[0] + goods[1] + goods[2] >= 50:
                    result = sum(goods) - 10
                else :
                    result = sum(goods)
        return result