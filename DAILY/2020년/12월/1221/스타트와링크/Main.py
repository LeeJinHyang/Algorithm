
visited = []
#comb 함수 만들기
def comb(idx, s_idx):
    if s_idx == result.count:
        team1=[]
        team2=[]
        for i in range(0,result.count):
            team1.append(i)
        for i in range(0,N):
            if i not in team1:
                team2.append(i)
        for team in team1:
            print(team," ")
        print("\n")

        for team in team2:
            print(team," ")
        print("\n")
        return
    
    if idx == N:
        return
    
    result[s_idx] = idx
    comb(idx+1,s_idx+1)
    comb(idx+1, s_idx)

if __name__ == '__main__':
    #입력 부분
    N = int(input())

    map = []
    for i in range(0,N) :
        list = []
        for j in range(0,N) :
            list.append(int(input())
    result = [0 for j in range(N//2)]

    comb(0,0)






#같은 팀 별로 계산하기
