class BreakState{
    static void main(String[] args){
        int[] arr = [1,2,3,4,5,6,7,8,0,10]
        for (i in arr){
            println(i)
            if (i == 2)
                break
            
        }
    }

}

op - 
1
2

class ContiState{
    static void main(String[] args){
        int[] arr = [1,2,3,4,5,6,7,8,9,10]
        for (i in arr){
            if (i == 2)
                continue
                println(i)

        }
        
    }
}
op - 
1
2
3
4
5
6
7
8
9
10