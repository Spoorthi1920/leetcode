class Solution(object):
    def finalPrices(self, prices):
        n=len(prices)
        for i in range(n):
            for j in range(i+1,n):
                if prices[i]>=prices[j]:
                    prices[i] -=prices[j]
                    break
        return prices
    
    

       
        