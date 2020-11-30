def f(N,M):
    #1. 가로 회문 찾기
    for i in range(N):
        for j in range(N-M+1):
            for k in range(M//2):
                if s[i][j+k]!=s[i][j+M-1-k]:
                    break
                if k == M//2 -1:
                    return i,j,0
    #2. 세로 회문 찾기
    for j in range(N):
        for i in range(N-M+1):
            for k in range(M//2):
                if s[i+k][j]!=s[i+M-1-k][j]:
                    break
                if k == M//2 -1:
                    return i,j,1


Tc = int(input())
for tc in range(1, Tc+1):

    N,M = map(int, input().split())
    s = [input() for i in range(N)]
    i,j,v = f(N,M)
    print("#{}".format(tc),end=' ')

    if v == 0:
        for h in range(M):
            print(s[i][j+h],end='')
    else:
        for h in range(M):
            print(s[i+h][j],end='')
    print()

