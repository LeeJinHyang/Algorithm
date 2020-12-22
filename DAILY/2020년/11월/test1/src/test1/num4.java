#핵심 소스코드의 설명을 주석으로 작성하면 평가에 큰 도움이 됩니다.
class Solution:
    def solution(self, cardNumber):
        strnum = str(cardNumber)
        result = 0
        if len(strnum) % 2 == 1: #홀수인 경우
            #0을 1로 계산하기 때문에 홀수 위치를 계산
            for i in range(0,len(strnum)) :
                ch = strnum[i]
                if i%2 == 0:
                    result = result + int(ch)
                else:
                    num = 2 * int(ch)
                    result =result + sum([int(i) for i in str(num)])
                        
        else: #짝수인 경우
            #0을 1로 계산하기 때문에 짝수 위치를 계산
            for i in range(0,len(strnum)) :
                ch = strnum[i]
                if i%2 == 1:
                    result = result + int(ch)
                else:
                    num = 2 * int(ch)
                    result =result + sum([int(i) for i in str(num)])
            
        if result % 10 == 0:
            return "VALID"
        else:
            return "INVALID"
    