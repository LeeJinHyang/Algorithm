#핵심 소스코드의 설명을 주석으로 작성하면 평가에 큰 도움이 됩니다.
class Solution:
    def solution(self, page, broken):
        def avail(num, button):
            nlist = list(str(num))
            for n in nlist:
                n = int(n)
                if n not in button:
                    return False
            return True
        psPage = 100
        button = [0,1,2,3,4,5,6,7,8,9]
        for brk in broken : 
            if(brk in button) :
                button.remove(brk)
        
        if psPage == page:
            return 0
        cnt = abs(page - 100)
        minus = page
        plus = page
        #현재 page부터 시작해 해당 값을 찾는게 빠를거 같다
        while True:
            #minus
            if avail(minus, button) : 
                if cnt > page - minus + len(str(minus)):
                    cnt = page - minus + len(str(minus))
                return cnt
            else: 
                minus = minus -1
            
            #plus
            
            if avail(plus, button) : 
                if cnt > plus - page + len(str(plus)):
                    cnt = plus - page + len(str(plus))
                return cnt
            else: 
                plus = plus +1
            
        return cnt