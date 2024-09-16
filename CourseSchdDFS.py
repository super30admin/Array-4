'''
time complexity: O(E+V)
space complexity: O(E+V)
'''
class Solution:
    def canFinish(self, numCourses: int, prerequisites: List[List[int]]) -> bool:
        global visited,path,cDict
        visited = [False for _ in range(numCourses)]
        path = [False for _ in range(numCourses)]
        
        cDict = {}
        for cor in prerequisites:
            if cor[1] not in cDict:
                cDict[cor[1]] = []
            cDict[cor[1]].append(cor[0])
            
        print(cDict)
        for i in range(numCourses):
            if(visited[i]!=True and self.isCycle(i)): return False
        return True
    
    def isCycle(self,k):
        global visited,path,cDict
        if(path[k]): return True
        
        path[k] = True

        t = [] if (k not in cDict) else cDict[k]
        for pres in t:
            if(visited[pres]!=True and self.isCycle(pres)): return True

        path[k]=False
        visited[k] = True
        return False