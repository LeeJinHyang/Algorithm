#
#2
#banana bana
#asakusa sa

T = int(input())
for tc in range(1, T+1):
    s,frame = input().split(" ")
    #s안에 frame 이 몇개나 존재하는지 확인
    cnt = s.count(frame)
    ans = len(s) - cnt*len(frame) + cnt
    print("#{} {}".format(tc,ans))    
