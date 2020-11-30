Tc = int(input())
for tc in range(1,Tc+1):
    s = input()
    N = len(s)

    i = 0
    if N == 1:
        ans = "Exist"
    else: 
        while i < N//2 and (s[i] == s[N-1-i] or s[i] == '?' or s[N-1-i] == '?'):
            i += 1

        if i == N//2 :
            ans ="Exist"
        else:
            ans="Not exist"
    print("#{} {}".format(tc,ans))