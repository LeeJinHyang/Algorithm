#핵심 소스코드의 설명을 주석으로 작성하면 평가에 큰 도움이 됩니다.
class Solution:
    def solution(self, votes):
        cnt = 0
        while True:
            if votes[0] == max(votes):
                if  votes.count(max(votes)) > 1:
                    cnt = cnt +1
                break
            else : 
                idx = votes.index(max(votes))
                votes[idx] = votes[idx] - 1
                votes[0] = votes[0] + 1
                cnt = cnt + 1
        return cnt