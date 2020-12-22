#핵심 소스코드의 설명을 주석으로 작성하면 평가에 큰 도움이 됩니다.
class Solution:
    def solution(self, s, n):
        slist = list(s)
        factorlist = []
        result = 0
        #dict을 만들어서 count를 보관하고 그 값들을 바탕으로 -하며 최소값을 구한다
        dict = {}
        min = 100
        max = 0
        for s in slist:
            if s not in factorlist:
                factorlist.append(s)
                dict[s] = 0
        
        for num in factorlist:
            dict[num] = slist.count(num)
            
        #dict의 값을 조절
        #1. max와 min 해당 값을 줄여서 한개의 자리수로 만들 수 있는지 확인한다 -> 0
        
        #2. max값을 하나씩 줄이며 min과 값의 차이가 얼마나 나는지 살핀다
        #만약에 max의 값의 index가 바뀌는 경우에는 다시 확인하며 얼마나 줄일 수  있는지 확인
        for num in factorlist:
            
        return result